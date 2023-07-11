package oopsPractice;

public class ThisPractice1
{
	public void m()
	{
		System.out.println("I am m method");
	}
	
	public void n()
	{
		this.m();
		System.out.println("I am n method");
	}

	public static void main(String[] args)
	{
		ThisPractice1 s= new ThisPractice1();
		s.n();

	}

}
