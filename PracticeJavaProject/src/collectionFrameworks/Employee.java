package collectionFrameworks;

import java.util.ArrayList;

public class Employee
{
	String name;
	int eNo;
	
	Employee(int eno,String name)
	{
		this.eNo=eno;
		this.name=name;
	}
	
	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", eNo=" + eNo + "]";
	}



	public static void main(String[] args) 
	
	{
		
	    Employee e1=new Employee(1,"Lalita");
	    Employee e2=new Employee(2,"Sonam");
	    Employee e3=new Employee(3,"Preeti");
	    Employee e4=new Employee(4,"Lalita");
	   
		
	    ArrayList<Employee> al=new ArrayList<Employee>();
	    al.add(e1);
	    al.add(e2);
	    al.add(e4);
	    al.add(e3);
	    
		
		for(Employee e:al)
		{
			System.out.println(e);
		}
		
       
	}

}
