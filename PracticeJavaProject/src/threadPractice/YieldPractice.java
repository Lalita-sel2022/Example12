package threadPractice;

public class YieldPractice extends Thread
{
	public void run()
	{
    for(int i=1;i<=5;i++)
    {
    	
    	System.out.println("Child Thread :"+i);
    	 Thread.yield();
    }
    	
    }
	public static void main(String[] args)
	{
		YieldPractice y= new YieldPractice();
		y.start();
		
		  for(int i=1;i<=5;i++)
		    {
			 
		    	System.out.println("Main  Thread :"+i);
		    }

	}

}
