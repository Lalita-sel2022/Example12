package threadPractice;

class Medical extends Thread
{
	
	public void run()
	{
		for(int i=1;i<=4;i++)
		{
		System.out.println("Give the medical :"+i);
		}
	}
}

class TestDrive extends Thread
{
	public void run()
	{
		for(int i=1;i<=4;i++)
		{
		System.out.println("Give the drive test :"+i);
		}
	}
}

class Office extends Thread
{
	public void run()
	{
		for(int i=1;i<=4;i++)
		{
		System.out.println("Take the signature :"+i);
		}
	}
}
public class LicenceUseJoin 
{

	public static void main(String[] args) throws Throwable 
	{
		Medical m=new Medical();
		m.start();
		m.join();
         
		TestDrive d=new TestDrive();
		d.start();
		d.join();
		
		Office o=new Office();
		o.start();
		
		
		
	}

}
