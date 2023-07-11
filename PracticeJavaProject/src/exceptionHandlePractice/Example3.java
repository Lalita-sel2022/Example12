package exceptionHandlePractice;

public class Example3 
{

	public static void main(String[] args) 
	{
		String s= null;
		try
		{
		System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception :"+e.getMessage());
		}
		finally
		{
			System.out.println("Code end");
		}

	}

}
