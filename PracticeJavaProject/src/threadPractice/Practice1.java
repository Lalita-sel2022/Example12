package threadPractice;

public class Practice1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Run :"+i);
		}
	}

	public static void main(String[] args) 
	{
		for(int j=0;j<5;j++)
		{
			System.out.println("Main method :"+j);
		}
		Thread p= new Practice1();
		p.run();
		
		
	}

}
