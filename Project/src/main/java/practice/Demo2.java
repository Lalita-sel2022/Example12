package practice;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the integer value");
		int number=s.nextInt();
		int mul = 0;
		for(int i=1;i<=10;i++)
		{
			 mul = number*i;
			 System.out.println(mul);
			
		}
		
		
		

	}

}
