package Armstrong_No;

public class For_Int 
{
	public static void main(String[] args)
	{
		int org=153;   //1*2 + 5*3 + 3*3 = 153
		
		int sum=0; //153
		
		//i=153   153>0  i=153/10=15.3
		        //15>0   i=15/10 =1.5
		        //1>0    i=15/10=0.1
		        //0>0
		
		for(int i=org; i>0;  i=i/10)
		{
			int rem = i % 10;
			
			sum = sum + (rem*rem*rem);  //153
		}
		//153 = 153
		if(org==sum)
		{
			System.out.println("Given no is an armstrong no.");
		}
		else
		{
			System.out.println("Given no is not an armstrong no.");
		}
	}

}
