package practice;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter first number");
		int base=s.nextInt();
		System.out.println("Enter second number");
		int power=s.nextInt();
		
		int result=base;
		
		
		for(int i=1;i<power;i++)
		{
			result=result*base;
		}
		
		System.out.println(result);
		

	}

}
