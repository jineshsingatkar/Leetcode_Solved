class findDuplicates 
{
	public static void main(String[] args) 
	{
		HashSet<integer> seen = new HashSet<>();
		boolen hasDuplicates = false;
		
		for (int num: arr )
		{
			if(!seen.add(num)){
				System.out.println("Duplicate Found: " + num);
				hasDuplicate = true;
			}
		}
		if(!hasDuplicates){
			System.out.println("No Duplicates Found");
		}
	}
	public static void main(String[] arg){
		int[] arr = {1, 2, 3, 4, 5, 2, 6, 3};
		findDuplicates(arr);
	}
}
