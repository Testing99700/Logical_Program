package Reverse_Sentence;

public class String1 
{
	public static void main(String[] args)
	{
		String org="I am playing";
		String s1=returnsentence(org);
		System.out.println(s1);
		
	}
	public static String returnsentence(String Sentence)
	{												//0    1        2
		String text[]=Sentence.split(" ");         //I     am      playing
		
		String rev="";                            //playing    am    I
		
		for (int i=text.length-1; i>=0; i--)
		{
			rev=rev + text[i] + " ";             //playing    am    I
		}
		return rev ;						//playing    am    I
	}

}
