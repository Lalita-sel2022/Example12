package threadPractice;

public class JoinPractice2 extends Thread
{
	static Thread t;
	public void run()
	{
	
	    try 
	    {
			t.join();
		} 
	    catch (InterruptedException e1)
	    {
			e1.printStackTrace();
		}
		for(int i=1;i<=5;i++)
		{
			System.out.println("Child thread :"+i);
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) 
	{
		JoinPractice2 j=new JoinPractice2();
		j.start();
		
		//get current thread referance
		 t=Thread.currentThread();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main thread :"+i);
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				
				e.printStackTrace();
			}

	}

}
}