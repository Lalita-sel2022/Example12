package exceptionHandling;

class NegativeDimentionException extends Exception
{
	@Override
	public String toString()
	{
		return "Negative dimention not valid";
	}
	
}

public class ThrowAndThrows 
{
	public static int area(int l,int b) throws NegativeDimentionException
	{
		if(l<0||b<0)
		{
			throw new NegativeDimentionException();
		}
		int a= l*b;
		return a;
	}
	public static void method() throws NegativeDimentionException
	{
		int result =area(-10,5);
		System.out.println("area is :"+result);
	}

	public static void main(String[] args) 
	{
		try {
			method();
		} catch (NegativeDimentionException e) {
			System.out.println(e);
		}

	}

}
