package exceptionHandling;


class InvalidAgeException extends Exception
{
	public InvalidAgeException(String mes)
	{
		super(mes);
	}
}
public class customException 
{
	public static void valid(int age) throws InvalidAgeException
	{
		if(age<=18)
		{
			throw new InvalidAgeException("Age not valid for vote");
		}
		else
		{
			System.out.println("Welcom for vote");
		}
	}

	public static void main(String[] args) 
	{
		    try {
			valid(17);
			
			  } catch (InvalidAgeException e) {
			  
			  System.out.println(e); }
			 
	}

}
