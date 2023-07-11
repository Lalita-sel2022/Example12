package oopsPractice;


class Parent
{
	protected void p()
	{
		System.out.println("Method of parent class");
	}
}
public class InharitancePractic extends Parent
{
	public void i()
	{
		
		System.out.println("method of child class");
	}

	public static void main(String[] args) 
	{
		Parent p= new Parent();
		InharitancePractic c= new InharitancePractic();
		p.p();
		c.i();
		
		

	}

}
