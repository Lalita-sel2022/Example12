package oopsPractice;

class A
{
	public static void display()
	{
		System.out.println("i am static method");
		
	}
	
	public void display1()
	{
		System.out.println("i am instance method");
	}
}
public class StaticInharPract extends A
{
	
	public static void display()
	{
		System.out.println("Hiding parent class method");
	}
	

	public static void main(String[] args) 
	{
		
		
		StaticInharPract s= new StaticInharPract();
		s.display();
		s.display1();
		
	}

}
