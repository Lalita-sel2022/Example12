package oopsPractice;


class ParentSupperConst
{
	ParentSupperConst()
	{
		System.out.println("child default constructor");
	}
	
	ParentSupperConst(int a)
	{
		System.out.println("parent paramerterize constructor :" +a);
	}
	
}
public class SupperConst extends ParentSupperConst
{
	SupperConst()
	{
		super(10);
		System.out.println("child constructor");
	}
	
	SupperConst(int x)
	{
		super();
		System.out.println("child constructor :"+x);
	}
	
	
   
	public static void main(String[] args) 
	{
		SupperConst c= new SupperConst(10);
		SupperConst c1= new SupperConst();
		
	}

	
}


