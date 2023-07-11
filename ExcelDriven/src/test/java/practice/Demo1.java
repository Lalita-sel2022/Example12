package practice;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) 
	{
		boolean flag=true;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
				flag=false;
			    break;
		}
		
		if(flag && no > 1)
		{
			System.out.println("Number is prime");
		}
		else
			System.out.println("Number is not prime");

	}

}
