package oopsPractice;

public class Mobike
{
	String bno;
	String cName;
	int days;
	int charge=0;
	
	public void input(String bno,String cName)
	{
		this.bno=bno;
		this.cName=cName;
		
	}
	
	public void compute(int days)
	{
		if(days>=1&&days<=5)
		{
			charge=days*500;
			System.out.println(charge);
		}
		else if(days>=5&&days<=10)
		{
			charge=days*400;
			System.out.println(charge);
		}
		else
		{
			charge= days*200;
			System.out.println(charge);
		}
	}
	
	public void display()
	{
		System.out.println("Bike number is :"+bno);
		System.out.println("Customer name is :"+cName);
		
		
	}

	public static void main(String[] args)
	{
		Mobike splendor=new Mobike();
		splendor.input("UP65AB1234", "Rahul");
		splendor.display();
		splendor.compute(6);
		
		

	}

}
