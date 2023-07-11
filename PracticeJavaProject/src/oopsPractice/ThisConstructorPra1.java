package oopsPractice;

public class ThisConstructorPra1 
{
	// Calling default constructor from parameterized const
	
	ThisConstructorPra1()
	{
		System.out.println("default constructor");
	}
	ThisConstructorPra1(int x)
	{
		this();
		System.out.println("parameterizes constructor :"+x);
	}

	public static void main(String[] args)
	{
		ThisConstructorPra1 c= new ThisConstructorPra1(10);

	}

}
