package oopsPractice;

class xyz
{
	
	/*
	 * xyz() { this(10); System.out.println("Default constructor"); }
	 */
		
		xyz(int a)
		{
			System.out.println("parameterized constructor ::"+ a);
		}
	}

public class ConstPractice extends xyz
{
	/*
	 * ConstPractice() { super(10);
	 * System.out.println("child class default constructor"); }
	 */
	
	ConstPractice(int b)
	{
		super(b);
		System.out.println("child class parameterized constructor ::"+b);
	}

    public static void main(String[] args)
	{
		
    	ConstPractice c= new ConstPractice(10);
	}

}
