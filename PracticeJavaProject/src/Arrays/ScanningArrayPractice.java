package Arrays;

import java.util.Scanner;

public class ScanningArrayPractice 
{

	public static void main(String[] args) 
	{
		int sum=0;
		int key=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int a[]= new int[size];
		System.out.println("Enter the key");
		
		key=sc.nextInt();
		System.out.println("Intialize the array");
		
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
			//Find the sum 
			//sum=sum+a[i];
			//System.out.println(a[3]);
			
			//Search an element
			if(a[i]==key)
			{
				System.out.println("Key found :"+i);
				System.exit(0);
			}
		
			
		}
		System.out.println("Not found");
		
	}

}
