package threadPractice;


class Practice implements Runnable
{

	@Override
	public void run()
	{
		for(int j=1;j<=5;j++)
		{
			System.out.println("From Practice is :"+j);
		}
		System.out.println("Exit from runnable interface Practice ");
		
	}
	

}
public class RunnablePractice implements Runnable
{
	@Override
	public void run() 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("From runnablePractice is :"+i);
		}
		System.out.println("Exit from runnable interface RunnablePractice");
		
	}

	public static void main(String[] args) 
	{
		
		Practice p= new Practice();
		RunnablePractice obj= new RunnablePractice();
		Thread t1= new Thread(obj);
		Thread t2=new Thread(p);
		t2.setPriority(4);
		System.out.println(t2.getPriority());
		System.out.println(t2.getName());
		t2.start();
		System.out.println(t2.isDaemon());
		t1.start();
		System.out.println(t1.getName());
		int pcount=t1.getPriority();
		System.out.println(pcount);
		

	}



}
