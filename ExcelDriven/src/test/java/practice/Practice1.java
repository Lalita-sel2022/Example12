package practice;

import java.util.Scanner;

public class Practice1 
{
	public static int temp;
	public static void min(int[] x)
	{
		int min=x[0];
	    for(int i=0;i<x.length;i++)
		{
			if(min>x[i])
			{
				min=x[i];
			}
		
		}
		
	    System.out.println("Mini value is : "+min);
//		for(int j=0;j<x.length;j++)
//		{
//			for(int i=j+1;i<x.length;i++)
//			{
//				if(x[j]>x[i])
//				temp=x[j];
//				x[j]=x[i];
//				x[i]=temp;
//			}
//			
//		}
	}

	public static void main(String[] args) 
	{
//		int[] a= {10,20,6,87,1};
//		min(a);
		//System.out.println(a.getClass().getName());
		
//		do while(true)
//			System.out.println("Hello")
//		    while(false);
//		 int a=10,b=20;
//		while(a>b)
//		{
//			System.out.println("Hello");
//		}
//		System.out.println("Hiii");

//		Scanner s= new Scanner(System.in);
//		System.out.println("Enter the Number");
//		int no=s.nextInt();
//		
//		if(no%5==0 && no%11==0)
//		{
//			System.out.println("This Number is Divisible by 5 and 11 : "+no);
//		}
//		else
//		{
//			System.out.println("This Number is no Divisible by 5 and 11 : "  +no);
//		}
		
//		if(no<0)
//			System.out.println("Negative");
//		else if(no==0)
//			System.out.println("Zero");
//		else
//			System.out.println("Positive");
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(2*i);
		}
		
	

	}

}
