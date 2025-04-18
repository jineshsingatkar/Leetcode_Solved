import java.util.ArrayList;
import java.util.List;

public class minimumPairRemovalToSortArray {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) list.add(num);

        int operations = 0;

        while (!isNonDecreasing(list)){
            int minSum = Integer.MAX_VALUE;
            int minIndex = -1;

            //find leftmost minimum sum pair
            for (int i = 0; i< list.size() - 1; i++){
                int sum = list.get(i) + list.get(i + 1);
                if (sum < minSum){
                    minSum = sum;
                    minIndex = i;
                }
            }
            int newVal = list.get(minIndex) + list.get(minIndex + 1);
            list.set(minIndex, newVal);
            list.remove(minIndex + 1);

            operations++;
        }
        return operations;
    }
    private boolean isNonDecreasing(List<Integer> list){
        for (int i = 1; i < list.size(); i++){
            if (list.get(i) < list.get(i - 1)){
                return false;
            }
        }
        return true;
    }
}
