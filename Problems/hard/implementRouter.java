package Problems.hard;

public class implementRouter {
    private static class Packet {
        int source, destination, timestamp;
        Packet(int s, int d, int t) {
            source = s;
            destination = d;
            timestamp = t;
        }
        String getKey() {
            return source + "_" + destination + "_" + timestamp;
        }
        int[] toArray() {
            return new int[]{source, destination, timestamp};
        }
    }
    private int memoryLimit;
    private Queue<Packet> queue;
    private Set<String> packetSet;

    public Router(int memoryLimit) {
        this.memoryLimit = memoryLimit;
        this.queue = new LinkedList<>();
        this.packetSet = new HashSet<>();
    }

    public boolean addPacket(int source, int destination, int timestamp) {
        Packet newPacket = new Packet(source, destination, timestamp);
        String key = newPacket.getKey();

        if (packetSet.contains(key)) {
            return false;
        }

        if (queue.size() >= memoryLimit) {
            Packet removed = queue.poll();
            packetSet.remove(removed.getKey());
        }

        queue.offer(newPacket);
        packetSet.add(key);
        return true;
    }

    public int[] forwardPacket() {
        if (queue.isEmpty()) {
            return new int[]{};
        }

        Packet pkt = queue.poll();
        packetSet.remove(pkt.getKey());
        return pkt.toArray();
    }

    public int getCount(int destination, int startTime, int endTime) {
        int count = 0;
        for (Packet pkt : queue) {
            if (pkt.destination == destination &&
                pkt.timestamp >= startTime &&
                pkt.timestamp <= endTime) {
                count++;
            }
        }
        return count;
    }
}


/**
 * Your Router object will be instantiated and called as such:
 * Router obj = new Router(memoryLimit);
 * boolean param_1 = obj.addPacket(source,destination,timestamp);
 * int[] param_2 = obj.forwardPacket();
 * int param_3 = obj.getCount(destination,startTime,endTime);
 */