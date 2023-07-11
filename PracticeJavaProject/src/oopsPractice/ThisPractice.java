package oopsPractice;

public class ThisPractice 
{
	// Invoke current class instance variable
	int a;
	int b;
	int sum;
	
	public  void sumTotal(int a, int b)
	{
		this.a=a;
		this.b=b;
		sum=a+b;
	}
	
	public void display()
	{
		System.out.println("The total sum is :"+sum);
	}
	

	public static void main(String[] args)
	{
		ThisPractice s= new ThisPractice ();
		s.sumTotal(30, 40);
		s.display();
		
		

	}

}
