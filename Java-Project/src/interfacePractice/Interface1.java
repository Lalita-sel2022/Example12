package interfacePractice;

interface Test
{
	void method1();
	void method2();
	
}

public class Interface1 implements Test
{

	public void show()
	{
		System.out.println("class own method");
	}

	@Override
	public void method1()
	{
		System.out.println("Method1");
		
		
	}

	@Override
	public void method2() 
	{
		System.out.println("Method2");
		
	}
	
	public static void main(String[] args) 
	{
		Test i= new Interface1();
		i.method1();
		i.method2();
		//i.show();

	}

}
