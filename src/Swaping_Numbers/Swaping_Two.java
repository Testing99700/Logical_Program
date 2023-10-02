package Swaping_Numbers;

public class Swaping_Two 
{
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		
		a=a+b;  //10+20=30
		b=a-b;  //10-20=10  ok
		a=a-b;  //30-10=20  ok
		
		System.out.println("a:"+a);  //20
		System.out.println("b:"+b);  //10
	}

}
