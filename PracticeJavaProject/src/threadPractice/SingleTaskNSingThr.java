package threadPractice;

public class SingleTaskNSingThr extends Thread
{
	public void run()
	{
		System.out.println("Single task and single thread");
	}

	public static void main(String[] args) 
	{
		SingleTaskNSingThr s= new SingleTaskNSingThr();
		s.start();

	}

}
