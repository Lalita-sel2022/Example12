package exceptionHandlePractice;

public class Example5
{

	public static void main(String[] args) 
	{
		int age=10;
		try
		{
		if (age<18)
		{
			throw new ArithmeticException("Access denied - you must be at least 18 year old");
		}
		else
		{
			System.out.println("Access granted - you are old enough");
		}
		}catch(ArithmeticException e)
		{
			System.out.println("Exception :"+ e.getMessage());
		}

	}

}
