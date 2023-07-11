package threadPractice;

public class AParent extends Thread
{
	
	//@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("From thread AParent is"+i);
		}
		
		System.out.println("exit from thread AParent");
	}
	
	
	
	/*public void display()
	{
	for(int i=1;i<=5;i++)
	{
		System.out.println("From thread AParent is"+i);
	}*/

}

	

