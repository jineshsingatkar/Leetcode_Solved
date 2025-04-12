class reversString 
{
	public static void main(String[] args) 
	{
		String str = "Testing";
		String reversed = "";
		
		for ((int i = str.length() - 1; i > =0; i--)
		{
			reversed += str.charAT(i);
		}
		System.out.println("Reversed String: " + reversed);
	}
}
