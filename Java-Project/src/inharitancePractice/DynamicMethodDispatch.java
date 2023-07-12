package inharitancePractice;


class SuperClass
{
	public void method1() {System.out.println("Super method1");}
	public void method2() {System.out.println("Super method2");}
	
}
class SubClass extends SuperClass
{
	public void method2() { System.out.println("Sub method2");}
	public void method3() {System.out.println("Sub method3");}
}
public class DynamicMethodDispatch 
{

	public static void main(String[] args)
	{
		SuperClass super1 = new SubClass();
		
		super1.method2();
		
		

	}

}
