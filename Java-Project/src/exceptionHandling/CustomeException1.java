package exceptionHandling;

class LowBalanceException extends Exception
{
	@Override
	public String toString()
	{
		return "Balance should not be more then 5000";
		
	}
	
}
public class CustomeException1 
{
	public static void withdrow(int amount) //throws LowBalanceException
	{
		if(amount>=4000)
		{
			try {
			throw new LowBalanceException();
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else
		{
			System.out.println("Balance is available");
		}
	}
	

	public static void main(String[] args) 
	{
		//try {
			withdrow(6000);
			/*
			 * } catch (LowBalanceException e) { System.out.println(e); }
			 */

	}

}
