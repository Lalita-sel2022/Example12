package inharitancePractice;


class Parent
{
	public Parent()
	{
		System.out.println("Non param Parent constructer");
	}
	
	public Parent(int x)
	{
		System.out.println("Parent param constructer "+x);
	}
	
}	
class Child extends Parent
	{
		public Child()
		{
			
			System.out.println("Non param Child constructer");
		}
		
		public Child(int y)
		{
			super(20);
			System.out.println("Child param constructer "+y);
		}
		
		public Child(int x, int y)
		{
			super(x);
			System.out.println("Child param constructer "+y);
		}
	
}
public class ConstructInInhar
{

	public static void main(String[] args) 
	{
		
		Child p= new Child(10,20);
	}

}

