package oopsPractice;


class Member
{
	String name;
	int age;
	long pNo;
	String address;
	double salary;
	
	public void printSalary(double salary)
	{
		
		System.out.println("salary is : "+salary);
	}
}

class Employee extends Member
{
	String specialization;
	
}

class Manager extends Member
{
	
	String depatment;
}

public class InharitancePrac2 
{

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		System.out.println(e1.name="Amit tiyagi");
		System.out.println(e1.age=26);
		System.out.println(e1.pNo=6575676867l);
		System.out.println(e1.address="mawana meeruty");
		//System.out.println(e1.salary=38000);
		System.out.println(e1.specialization="Java");
		e1.printSalary(38000);
		System.out.println("************************************************");
		
		Manager m1= new Manager();
		System.out.println(m1.name="Arun gupta");
		System.out.println(m1.age=30);
		System.out.println(m1.pNo=6575677677l);
		System.out.println(m1.address="partapur meeruty");
		//System.out.println(m1.salary=80000);
		System.out.println(m1.depatment="manager");
		m1.printSalary(80000);
		

	}

}
