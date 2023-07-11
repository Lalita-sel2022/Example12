package practicing;

import java.util.Scanner;

public class FunPracti1 
{
	
	public void display()
	{
		System.out.println("Hello ");
	}
		

	public static void main(String[] args) 
	{
		System.out.println("Enter the n umber");
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		
		  int sum=0;
			
			  for(int i=1;i<=size;i++)
			  {
				 // System.out.println(i);
				  if(i%2==1)
				  {
					  sum =sum+i;
				  }
			  }
			  
			  System.out.println("Total sum of odd number is : "+sum);
			  
	}
			 
		 
	}


