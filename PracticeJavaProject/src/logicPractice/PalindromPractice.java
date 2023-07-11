package logicPractice;

public class PalindromPractice 
{

	public static void main(String[] args) 
	{
		//Using reverse concept
		int num =1234;
		int rem;
		int rev=0;
		for(int i=1;i<=4;i++)
		{
			 rem=num%10;
			 rev=rev*10+rem;
			 num=num/10;
		}
		
		System.out.println(rev);

	}

}
