package methodPractice;

import java.util.Scanner;

public class GCDPractice 
{
	
	
	public static int gcd(int x, int y)
	{
		while(x!=y)
		{
			System.out.println(x+"...."+y);
			if(x>y)
			x=x-y;
			
			else
			y=y-x;
	    }
		return y;	
		}

	public static void main(String[] args) 
	{
		  Scanner sc= new Scanner(System.in); 
		  System.out.println("Enter two numbers"); 
		  int m=sc.nextInt();
		  int n=sc.nextInt();
		  System.out.println(gcd(m,n));
		  
		  

	}

}
