package loopPractice;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		long mul=1;
		for(int i=n;i>=1;i--)
		{
			mul=mul*i;
		}
		
		System.out.println(mul);

	}

}
