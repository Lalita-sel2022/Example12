package abstrationPractice;

abstract class Supper
{
	public Supper()
	{
		System.out.println("Supper class constraction");
	}
	
	public void meth1()
	{
		System.out.println("Supper class method1");
	}
	abstract public  void meth2();
	
}

class subb extends Supper
{
	public void meth1()
	{
		System.out.println("Sub class method1");
	}
	
	public void method3()
	{
		System.out.println("Sub class method3");
	}

	@Override
	public void meth2() {
		
	System.out.println("Abstract method of supper class");
		
	}
	
}
public class Abstraction 
{

	public static void main(String[] args) 
	{
		Supper subb = new subb();
		subb.meth1();
		subb.meth2();
		
		
		
		

	}

}
