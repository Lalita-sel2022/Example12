package practice;

import java.util.Scanner;

import org.apache.poi.util.SystemOutLogger;

public class Practice2 {

	public static void main(String[] args) 
	{
       int sum=1;
//		for(int i=1;i<=10;i++)
//		{
//			sum+=i;
//		}
//		
//		System.out.println("10 natural number sum is : "+sum);
        int even=0;
        int odd=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the integer number");
		int no=s.nextInt();
		
		while(no>0)
		{
	     System.out.println("Inside for loop");
		 if(no%2==0)
		 {
			 even+=no;
		 }
		 else
		 {
			 odd+=no;
		 }
		}
		
		System.out.println("Total of even no is : "+even);
		System.out.println("Total of odd no is : "+odd);
//		while(no>0)
//		{
//			reminder=no%10;
//			reverse=reverse*10+reminder;
//			no/= 10;
//		}
		
		//System.out.println("Reverse is : "+reverse);
		
//		System.out.println("Enter the power number");
//		int power=s.nextInt();
//		int result=1;
//		//one number raised to the power of another
//		for(int i=1;i<=power;i++)
//		{
//			result*=base;
//		}
//		System.out.println("Result is : "+result);
		//Multiplication table
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println(no*i);
//		}
		//Find the factorial value of any number 
		
//		for(int i=1;i<=no;i++)
//		{
//			sum=sum*i;
//			
//		}
//		
//		
	}

}
