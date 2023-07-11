package practicing;

import java.util.Scanner;

public class ArrayPractice 
{

	public static void main(Strings[] args) 
	{
		//one way to define array
		
		/*
		 * int[] arr= new int[4]; arr[0]=10; arr[1]=20; arr[2]=30; arr[3]=40;
		 */
		
		//second way to define array
		/*
		 * int arr1[]= {10,20,30,40};
		 * 
		 * for(int i=0;i<4;i++) { System.out.println(arr1[i]); }
		 */
		
		// take array size from user
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter array size");
		int size= sc.nextInt();
		
		int[] numbers=new int[size];
		
		for(int i=0;i<size;i++)
		{
			numbers[i]=sc.nextInt();
		}
		
		System.out.println("Enter finding value");
		int x=sc.nextInt();
		
			
		
		  for(int i=0;i<size;i++) 
		  {
				
				  if(numbers[i]==x) { System.out.println(i); }
				 
		      System.out.println(i);
		      
		  }
		 
		
		
	}

}
