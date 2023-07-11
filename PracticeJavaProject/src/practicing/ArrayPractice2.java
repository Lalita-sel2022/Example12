package practicing;

import java.util.Scanner;

public class ArrayPractice2 
{

	public static void main(Strings[] args) 
	{
		
		//System.out.println("Hello world");
		    Scanner sc = new Scanner(System.in) ;
		
			System.out.println("Enter the size of array");
			int size= sc.nextInt();
			
			
	        int[] num=new int[size];
			for(int i=0;i<size;i++)
			{
			num[i] = sc.nextInt();
			}
			
			System.out.println("Enter a number");
			int z= sc.nextInt();
			boolean flag=false;
			for(int i=0;i<size;i++)
			{
				if(num[i]==z)
				{
					flag=true;
					System.out.println("Number is present in array  :: "+ num[i]);
					break;
				}
				
				
				
				
			}
			if(!flag)
			{
				System.out.println("number is not presant in array");
			}
		}
		
		
	

	}


