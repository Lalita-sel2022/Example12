package practice;

import java.util.Scanner;

public class ForLoopPractice {
	

	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the integer number");
		int no =sc.nextInt();
		
		boolean flag=true;
		
		
		for(int i=2;i<no;i++)
		{
			if(no%2==0)
			{
				flag=false;
				break;
			}
		}

		
	}

}
