package threadPractice;

public class SleepPractice1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try 
			{
				Thread.sleep(1000);
				System.out.println(i);
			}
			catch (InterruptedException e)
			{
				
				e.printStackTrace();
			}
			
			
		}
	}

	public static void main(String[] args) 
	{
		SleepPractice1 s= new SleepPractice1();
		s.start();
		//s.sleep(1000);

	}

}
