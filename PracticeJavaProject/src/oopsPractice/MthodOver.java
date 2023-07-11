package oopsPractice;

class p
{
	public void print()
	{
		System.out.println("parent method"+10);
	}
}
class C extends p
{
	
		public void print()
		{
			System.out.println("Child method"+20);
		}
		public void show()
		{
			print();
			this.print();
		}
	}


public class MthodOver 
{

	public static void main(String[] args) 
	{
		C c=new C();
		//c.print();
		c.show();

	}
}


