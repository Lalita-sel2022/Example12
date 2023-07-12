package loopPractice;

import java.util.Scanner;

public class DigitsOfNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int i = 0;
		while(n>0)
		{
			 int rem=n%10;
			 n =n/10;
			 System.out.print(rem);
			 i++;
		}
		System.out.println( );
		
		System.out.println(i);

		//System.out.println("The sum of digits is :"+sum);
		
	}

}
