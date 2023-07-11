package oopsPractice;
//import practicing;

public class PolyPratice 
{
	public void printInfo(int age)
	{
		System.out.println("Student age is :"+age);
	}
	
	public void printInfo(int age, String name)
	{
		System.out.println("name and age of student :"+age+ " "+name);
	}
	public static void main(String[] args) 
	{
		PolyPratice s1=new PolyPratice();
		s1.printInfo(25 ,"lalita");
		
		//use another package public class
		practicing.FunPracti1 c= new practicing.FunPracti1();
		c.display();

	}
	

}
