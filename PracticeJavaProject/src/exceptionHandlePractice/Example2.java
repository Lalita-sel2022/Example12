package exceptionHandlePractice;

public class Example2
{

	public static void main(String[] args) 
	{
		/*
		 * try { System.out.println(3/0); System.out.println("in try");
		 * }catch(ArithmeticException e) {
		 * 
		 * System.out.println("Exception" +e.getMessage()); }
		 * 
		 * 
		 * 
		 * System.out.println("Hello");
		 */
		
		//Try to enclose exception code in catch block
		
		try
		{
			//try not throw the exception
			System.out.println(3/0);
			System.out.println("In try");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			
			
		}
		

	}

}
