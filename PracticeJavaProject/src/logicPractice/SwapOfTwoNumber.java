package logicPractice;

public class SwapOfTwoNumber 
{

	public static void main(String[] args)
	{
		//using third variable
		int a=10;
		int b=20;
		
		System.out.println("Before swap :"+a +" "+b);
		/*
		 * int temp=0; System.out.println("Before swap :"+a +" "+b);
		 * 
		 * temp =a; a=b; b=temp; System.out.println("After swap :"+a +" "+b);
		 */
		
		//Without using third variable
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap :"+a +" "+b);
		
		
		
		

	}

}
