package practice;

class Pop
{
	public void m1()
	{
		System.out.println("Parent class method");
	}
}
public class ChildClass extends Pop
{
	public void m1()
	{
		System.out.println("Child class method");
	}
	public void m2()
	{
		System.out.println("Child class second method");
	}

	public static void main(String[] args) 
	{
//		int sumOfTwoNum = add(10, 30);
//		System.out.println("Sum Of Two Num is : "+sumOfTwoNum);
		ChildClass p= new ChildClass();
		p.m1();
		p.m2();
		
		
		
		

	}

}
