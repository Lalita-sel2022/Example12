package practice;

import java.util.Scanner;

public class DiscountPractice {

	public static void main(String[] args) 
	{
		float bonus=0;
		int year=5;
		Scanner s= new Scanner(System.in);
		System.out.println("Please enter Year of Service");
		int yos=s.nextInt();
		System.out.println("Please enter Salary");
		int salary=s.nextInt();
		
		if(yos>year)
		{
			bonus=(salary*5)/100;
			System.out.println("Bonus amount is : "+bonus);
			System.out.println("Total salary after applied bonus is : "+(salary+bonus));
			
		}
		else
		{
			System.out.println("No bonus apply");
		}

	}

}
