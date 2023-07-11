package threadPractice;

public class InterruptPratice extends Thread
{
    public void run()
    {
    	
    		
    		try
    		{
    			for(int i=1;i<=5;i++)
    	    	{
    			System.out.println("Child thread :"+i);
				//Thread.sleep(2000);
			} 
    		}
    		catch (Exception e) 
    		{
				System.out.println("Thread is interrupted :"+e);
			}
    	}
    	
    
	public static void main(String[] args)
	{
		InterruptPratice i=new InterruptPratice();
		i.start();
		i.interrupt();

	}

}
