package exceptionHandlePractice;

import java.io.IOException;

public class Example6 
{

	public static void main(String[] args) 
	{
		try
		{
		throw new ArithmeticException();
		}catch(ArithmeticException e)
		{
			System.out.println("Exception" + e);
		}
		

	}

}
