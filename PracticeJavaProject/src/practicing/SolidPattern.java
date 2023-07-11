package practicing;

import java.util.Scanner;

public class SolidPattern 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the value");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------------------------");
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		

	}

}
