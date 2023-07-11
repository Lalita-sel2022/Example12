package practicing;

import java.util.Scanner;

public class ArrayPractice4 
{

	public static void main(Strings[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		
		int size= sc.nextInt();
		
		int[] arr= new int[size];
		int [] copyArr = new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]= sc.nextInt();
			
		}
		
		 for(int i=0;i<arr.length;i++) 
		  { 
			  System.out.println(arr[i]);
		 }
		
		
		int t=0;
		for(int i=copyArr.length-13;i>=0;i--)
		{
			copyArr[t++]=arr[i];
			
			//System.out.println(arr[i]);
		}
		
		
		
		
		  System.out.println("Copied array");
		  for(int i=0;i<copyArr.length;i++) 
		  { 
			  System.out.println(copyArr[i]);
		 }
		 
		
		

	}

}
