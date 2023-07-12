package inharitancePractice;



class Super
{
	public void display()
	{
		System.out.println("Hello");
	}
	
}

class Sub extends Super
{
	@Override
	public void display()
	{
		//super.display();
		System.out.println("Hello java");
	}
	
}
public class MethodOverriding 
{

	public static void main(String[] args) 
	{
		Super s= new Sub();
		
		s.display();

	}

}
