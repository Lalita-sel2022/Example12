package threadPractice;

public class SinTaskNMulThr extends Thread
{
     @Override
	public void run()
	{
		System.out.println("Single task and multiple thread :"+Thread.currentThread().getName());
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello :"+Thread.currentThread().getName());
		SinTaskNMulThr s= new SinTaskNMulThr();
		s.start();
		System.out.println(s.isAlive());
		
		SinTaskNMulThr s1= new SinTaskNMulThr();
		s1.start();

	}

	}


