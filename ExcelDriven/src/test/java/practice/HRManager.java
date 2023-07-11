package practice;

class Employee
{
	int salary;
	public Employee(int salary)
	{
		this.salary=salary;
		
	}
	public void work()
	{
		System.out.println("Employee works");
	}
	
	public int getSalary()
	{
		return salary;
		
	}
}
public class HRManager extends Employee
{
	public HRManager(int salary) {
		super(salary);
		
		//System.out.println(salary);
		
	}

	@Override
	public void work()
	{
		System.out.println("HR works");
		
	}
	
	public void addEmployee()
	{
		System.out.println("Employees adding by HR manager");
	}
	

	public static void main(String[] args) 
	{
		HRManager hr= new HRManager(20000);
		Employee emp= new Employee(50000);
		
		System.out.println("Employee salary is "+emp.getSalary());
		System.out.println("HR salary is "+hr.getSalary());
		hr.work();
		hr.addEmployee();
		

	}

}
