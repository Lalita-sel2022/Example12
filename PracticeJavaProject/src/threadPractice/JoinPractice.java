package threadPractice;

public class JoinPractice extends Thread
{
	
	  public void run() 
	  { 
	  System.out.println(Thread.currentThread().getName());
	  for(int i=1;i<=5;i++) 
	  {
	  
	  System.out.println("Child thfread :"+i);
	  
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
	 
	
public static void main(String[] args) throws InterruptedException 
	{
	JoinPractice j=new JoinPractice();
	j.start();
	
	j.join();//
	
	
	System.out.println(Thread.currentThread().getName());
	for(int i=1;i<=5;i++) 
	  {
		
	  System.out.println("Main thfread :"+i);
	  Thread.sleep(1000);
	 
	  }
	

	}

}
