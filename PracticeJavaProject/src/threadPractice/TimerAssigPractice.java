package threadPractice;

public class TimerAssigPractice extends Thread
{
	int j=00;
	public void run()
	{
		for(int j=0;j<60;j++)
		{
		for(int i=1;i<=60;i++)
		{
			
			try 
			{
				System.out.println(j+":"+i);
				Thread.sleep(1000);
			 } 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		System.out.println(j);
		
		}
		
	}

	public static void main(String[] args)
	{
		TimerAssigPractice t= new TimerAssigPractice();
		t.start();

	}

}
