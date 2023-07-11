package practicing;

import java.util.Scanner;

public class FunPractice2
{

	public static void main(String[] args) 
	{
		//System.out.println("Enter the n umber");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		System.out.println("Enter the value of b");
		int b=sc.nextInt();
		
		if(a>b)
		{
			System.out.println("a is greatest one :"+a);
		}
		else
		{
			System.out.println("b is greatest one :"+b);
		}

	}

}
