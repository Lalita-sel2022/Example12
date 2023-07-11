package oopsPractice;

public class ThisConstructorPra2 
{
	//Calling parameterized constructor from default constructor
	/*
	 * ThisConstructorPra2 (int x)
	 *  {
	 * System.out.println("parameterized constructor :"+x); 
	 * }
	 * 
	 * ThisConstructorPra2 (int a,int b) 
	 * {
	 * this(10);
	 * System.out.println("Default constructor"+a+" " +b);
	 *  }
	 */
     
	void m()
	{
		System.out.println(this);
	}

	public static void main(String[] args) 
	{
		ThisConstructorPra2 c= new ThisConstructorPra2 ();
		System.out.println(c);
		c.m();
		

	}

}
