package practicing;

import java.util.Scanner;

public class ArrayPractic3 
{

	public static void main(Strings[] args) 
	{
		System.out.println("Hello java");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size= sc.nextInt();
		
		int [] arr= new int[size];
		
		int pos=0;
		int neg=0;
		int odd=0;
		int even=0;
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		    if(arr[i]>0)

			{
				pos++;
			}
			else if(arr[i]<0)
			{
				neg++;
			}	
			if (arr[i]%2==0)
			{
				even++;
			}
			else if(!(arr[i]%2==0))
			{
				odd++;
			}
			
			
		}
		System.out.println("postive :" + pos + "\nnegative :" + neg + "\nodd :" + odd + "\neven :"+ even);
		
	
		

	}

}
