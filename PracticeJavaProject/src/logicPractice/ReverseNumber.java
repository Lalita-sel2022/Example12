package logicPractice;

public class ReverseNumber 
{

	public static void main(String[] args) 
	{
		/*
		 * int num=2345; int rem;
		 * 
		 * int rev1=0;
		 * 
		 * while(num!=0) { rem=num%10; rev1=rev1*10+rem; num=num/10; }
		 * System.out.println(rev1);
		 */
		
		int num =1234;
		int rem;
		int rev=0;
		for(;num!=0;num=num/10)
		{
			rem=num%10;
			rev=0*10+rem;
			//num=num/10;
		}
		System.out.println(rev);

	}

}
