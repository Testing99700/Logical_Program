package Scanner;

import java.util.Scanner;

public class Even_Odd_no
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter No:");
		int num=scan.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("Given Num. is an Even No");
		}
		else
		{
			System.out.println("Given Num. is an Odd No");
		}
	}

}
