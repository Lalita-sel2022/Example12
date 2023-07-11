package loopPractice;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int no=sc.nextInt();
		int sum=0;
		for(int i=1;i<=no;i++)
		{
			sum=sum+i;
		}
		
		System.out.println("Sum of "+no+" number : "+sum);

	}

}
