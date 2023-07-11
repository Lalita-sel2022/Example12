package exceptionHandling;

public class TryCatchPractice 
{
	int a,b;
	
	public static float display(int x,int y)
	{
		float z = 0;
		try 
		{
		
		
		z=x/y;
		}catch(ArithmeticException e)
		{	System.out.println("Arithmetic exception :"+e);
		}
		return z;
		
	}
	
	
	
	public static void main(String[] args) 
	{
		System.out.println(display(10,2));
		System.out.println("Hello java");

	}

}
