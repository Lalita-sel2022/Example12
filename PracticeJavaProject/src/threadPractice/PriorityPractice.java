package threadPractice;

class TestB extends Thread
{
    public void run()
    {
    	System.out.println("Child Thread");
    	System.out.println(Thread.currentThread().getPriority());
    }
}

public class PriorityPractice 
{

	public static void main(String[] args) 
	{
	    Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority());
		TestB b= new TestB();
		b.start();
		//b.setPriority(10);
		

	}

}
