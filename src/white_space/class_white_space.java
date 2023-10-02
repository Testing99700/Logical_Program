package white_space;

public class class_white_space
{
	public static void main(String[] args)
	{
		String org="ab c d";
		int count =0;
		
	   for (int i=0; i<org.length()-1; i++)
	   {
		   char charvalue=org.charAt(i);
		   
		   if(charvalue==' ')
		   {
			   count++;
		   }
	   }
	   System.out.println("White spaces:"+count);

	}

}
