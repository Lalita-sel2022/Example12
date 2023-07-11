package logicPractice;

public class FactorialNumber 
{

	public static void main(String[] args)
	{
		int num=5;
		int sum=1;
		for(int i=num;i>=1;i--)
		{
			
			sum=sum*i;
			System.out.println(i);
			
		}System.out.println("Total sum of factorial number is: "+sum);

	}

}
