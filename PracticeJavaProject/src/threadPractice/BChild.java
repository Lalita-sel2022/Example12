package threadPractice;

public class BChild  extends Thread
{
	
	  @Override 
	  public void run() 
	  {
	 for(int j=1;j<=5;j++) 
	 {
	  System.out.println("From thread BChild is"+j);
	  }
	  
	  System.out.println("exit from thread BChild");
	  }
	 
	
	
	/*
	 * public void show() { for(int j=1;j<=5;j++) {
	 * System.out.println("From thread BChild is"+j); } }
	 */
}

