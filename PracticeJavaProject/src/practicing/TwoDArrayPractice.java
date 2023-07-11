package practicing;

import java.util.Scanner;

public class TwoDArrayPractice 
{

	public static void main(Strings[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size");
		
		int rows= sc.nextInt();
		int cols= sc.nextInt();
		
		int[][] arr= new int[3][5];
		// input
		//Rows
		for(int i=0;i<rows;i++)
		{
			//Columns
			
			for(int j=0;j<cols;j++)
			{
			  arr[i][j]=sc.nextInt();
			}
			
		}
		
		//output
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}

	}

}

