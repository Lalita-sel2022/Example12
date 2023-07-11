package logicPractice;

public class FibonacciSerise 
{

	public static void main(String[] args) 
	{
		//Using swap
		int a=0;
		int b=1;
		int c=0;
		
		for(int i=0;i<7;i++)
		{

            
            	
			/*
			 * if(a==0) { System.out.print(a); } if(b==1) { System.out.print(b); }
			 */
             
			 c=a+b;
			 System.out.println(c);
			 a=b;
			 b=c;
		
		}
		
		

	}

}
