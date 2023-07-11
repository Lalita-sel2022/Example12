package methodPractice;

import java.util.Scanner;

public class PrimeNumberMethod 
{
	public static boolean isPrime(int num)
	{
		int n=num/2;
		//System.out.println(n);
		for(int i=2;i>n;i++)
		{
			if(num%i==0)
			return false;
		}
		return true;
	}

	public static void main(String[] args)
	{
		
		  Scanner sc= new Scanner(System.in); 
		  System.out.println("Enter a number"); 
		  int n=sc.nextInt();
		 // System.out.println(n);
		 
		  System.out.println(isPrime(n));
		  
		

	}

}
