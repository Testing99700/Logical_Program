package Prime_No;

public class Class_prime 
{
	public static void main(String[] args)
	{
		int org=2;
		int count=0;
		
		for (int i=2; i<org; i++)
		{
			if(org % i==0)
			{
				count++;
				break;
			}
		}
		if (count==1)
		{
			System.out.println("Given no.is not prime no.");
		}
		else
		{
			System.out.println("Given no.is prime no.");
		}
	}

}
