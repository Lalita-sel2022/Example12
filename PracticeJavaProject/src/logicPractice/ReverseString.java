package logicPractice;

public class ReverseString 
{

	public static void main(String[] args) 
	{
		//length()
		//charAt(2)=l
		String s= "lalita";
		//System.out.println(s.charAt(0));
		char rev = 0;
		for(int i=s.length();i>=0;i--)
		{
			rev=s.charAt(i);
		}
		System.out.println(rev);

	}

}
