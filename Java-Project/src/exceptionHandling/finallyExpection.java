package exceptionHandling;

public class finallyExpection 
{
	static void method1() throws Exception  {
		try {
		throw new Exception();
		}
		
		finally
		{
			System.out.println("Finally message");
		}
	}

	public static void main(String[] args) throws Exception 
	{
		/*
		 * try { System.out.println(10/0); }catch(Exception e) {
		 * System.out.println(e.getMessage()); } finally {
		 * System.out.println("Final message"); }
		 */
		
		method1();

	}

}
