package practice;

import java.util.Scanner;

public class QuantityPractice {

	public static void main(String[] args)
	{
		float discount=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Please enter quantity");
		
		int qty=s.nextInt();
		if(qty>=1000)
		{
			discount=(qty*10)/100;
			System.out.println("10% discount is : "+discount);
		}
		else
		{
			System.out.println("Total quantity is : "+qty);
		}
		

	}

}
