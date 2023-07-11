package threadPractice;

class Super1 extends Thread
{
	
	public void run()
	{
		System.out.println("Supar thread");
	}
}
public class DaemonThread extends Thread
{

	public void run()
	{
		System.out.println("Child thread");
	}
	public static void main(String[] args)
	{
		//System.out.println("Main thread");
		
		
		//Daemon Run in other thread background
		DaemonThread t=new DaemonThread();
		        t.setDaemon(true);
				t.start();
		
				Super1 t1= new Super1();
				t1.start();		
				

	}

}
