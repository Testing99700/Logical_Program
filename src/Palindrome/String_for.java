package Palindrome;

public class String_for 
{
	public static void main(String[] args)
	{
		String s1="mom";
		String rev="";
		// m  o  m
		// 0  1  2
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			rev=rev+s1.charAt(i);
		}
		if(s1.equals(rev))
		{
			System.out.println("Given String is a Paliendrome");
		}
		else
		{
			System.out.println("Given String is not a Paliendrome");
		}
	}

}
