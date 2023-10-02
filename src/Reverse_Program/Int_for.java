package Reverse_Program;

public class Int_for
{
	public static void main(String[] args)
	{
		int s1=12345;
		int rev=0;
		int rem=0;
		
		for(int i=1; i<=5; i++)
		{
			rem=s1%10;
			rev=rev*10+rem;
			s1=s1/10;
		}
		System.out.println(rev);
	}


}
