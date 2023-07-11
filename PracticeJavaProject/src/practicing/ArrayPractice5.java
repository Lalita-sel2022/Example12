package practicing;

import java.util.Scanner;

public class ArrayPractice5 
{

	public static void main(Strings[] args)
	{
          Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the size of array");
		
		  int size= sc.nextInt();
	      int[] arr= new int[size];
	      
	      for(int i=0;i<size;i++)
	      {
	    	  arr[i]=sc.nextInt();
	      }
	      
	      int sum=0;
	      int pro=1;
	      
	      for(int i=0;i<arr.length;i++)
	      {
	    	  sum=sum+arr[i];
	    	  pro=pro*arr[i];
	    	  
	    	
	      }
	      
	     System.out.println("Sum of all elements ::"+sum);
	     System.out.println("Product of all elements ::"+pro);

	}

}
