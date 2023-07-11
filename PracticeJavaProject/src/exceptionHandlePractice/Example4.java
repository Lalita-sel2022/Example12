package exceptionHandlePractice;

public class Example4 
{

	public static void main(String[] args) 
	{
		int balance =5000;
		int withdrowl=6000;
		
	        try
	        {
		    if(balance<withdrowl)
		
			throw new ArithmeticException("unsufficient balance");
		
		
			balance=balance-withdrowl;
			System.out.println("Transaction complete successfully");
	        }
	        catch(ArithmeticException e)
	        {
	        	System.out.println("Exception :" + e.getMessage());
	        }
			System.out.println("Program continue");
		
		
		
		
		

	}

}
