package threadPractice;

public class BlinkBulbPractice extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			
			try 
			{
				System.out.println(i);
				Thread.sleep(1000);
				if(i%2==0)
				{
					System.out.println("Bulb off ");
				}
				else
				{
					System.out.println("Bulb On");
				}
				
				
			} 
			catch (InterruptedException e)
			{
			e.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args)
	{
		BlinkBulbPractice b=new BlinkBulbPractice();
		b.start();

	}

}
