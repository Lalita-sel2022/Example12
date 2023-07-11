package practice;

import java.util.Scanner;

public class StudentAttendence {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter year");
		int year=s.nextInt();
		if(year%4==0)
		{
			System.out.println("leap year");
		}
//		//System.out.println("Enter number of classes held");
//		//int held = s.nextInt();
//		System.out.println("Enter number of classes attended");
//		int atten = s.nextInt();
//		if(atten*100/100>=75)
//		{
//			System.out.println("Allowed to sit in exam");
//		}
//		else
//		{
//			System.out.println("Not allowed to sit in exam");
//		}
		

	}

}
