package practicing;

import java.util.Scanner;

public class PatternPractice
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the value");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=1;j--)
			{
				System.out.print(" ");
			}
			System.out.println("*");
		}

	}

}
