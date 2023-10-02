package Reverse_Program;

public class String_for 
{
	public static void main(String[] args)
	{
		String s1="good";  
		String rev="";
		
		//h e l l o
		//0 1 2 3 4
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
	}

}
