package practicing;

public class StaticPratice 
{
	int x;
    static int y;
	
	public void fun1()
	{
		System.out.println(y=300);
		
	}
	
	public static void fun2()
	{
	  System.out.println("Fun2 method");
	}
	static class Test
	{
		 //private static String country ="India";
	}


	public static void main(Strings[] args) 
	{
		
		StaticPratice ob1= new StaticPratice();
		StaticPratice ob2=new StaticPratice();
		ob2.fun1();
		ob2.fun2();
		System.out.println(StaticPratice.y=20);
		
		
	}

}
