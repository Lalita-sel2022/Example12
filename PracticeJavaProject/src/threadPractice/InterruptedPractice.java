package threadPractice;

public class InterruptedPractice extends Thread
{
    public void run()
    {
    	
    	System.out.println(Thread.interrupted());
    	//System.out.println(Thread.currentThread().isInterrupted());
    	
    		
    		try
    		{
    			for(int i=1;i<=5;i++)
    	    	{
    			System.out.println("Child thread :"+i);
				Thread.sleep(1000);
				
			} 
    			System.out.println(Thread.interrupted());
    		}
    		catch (Exception e) 
    		{
				System.out.println("Thread is interrupted :"+e);
			}
    	}

	public static void main(String[] args) 
	{
		InterruptedPractice i= new InterruptedPractice();
		i.start();
		i.interrupt();

	}

}
