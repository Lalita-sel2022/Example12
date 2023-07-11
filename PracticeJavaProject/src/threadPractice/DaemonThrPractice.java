package threadPractice;

class TestA extends Thread
{
	public void run()
	{
		System.out.println("Parent thread");
	}
}
public class DaemonThrPractice extends Thread 
{
	public void run()
	{
		System.out.println("Child thread");
	}

	public static void main(String[] args) 
	{
		//System.out.println("Main thread");
		
		TestA t2=new TestA();
		t2.start();
		DaemonThrPractice t1= new DaemonThrPractice();

		t1.setDaemon(true);
		t1.start();
		
		
	}

}
