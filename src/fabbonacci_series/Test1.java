package fabbonacci_series;

public class Test1 
{
	// 0  1  1  2  3  5 
	//  +  +  +  +  +
	//  1  2  3  5  8      //fabbonacci_series
	public static void main(String[] args)
	{
		int a=0;
		int b=1;
		int c;
		
		//i=1    1<=5    2
		       //2<=5    3
		       //3<=5    4
		       //4<=5    5
		       //5<=5    6
		       //6<=5    fail
		
		for(int i=1;  i<=5;  i++)
		{
			c=a+b;
			System.out.println(c);
			
			a=b;
			b=c;
		}
	}

}
