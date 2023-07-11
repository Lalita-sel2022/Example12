package practice;

import java.util.Arrays;

public class DeleteSpecificArray {

	public static void main(String[] args) 
	{
		int no=20;
		int[] n= {10,20,30,5,40};
		
		//System.out.println(Arrays.toString(n));
		
		for(int i=0;i<n.length;i++)
		{
			if(no==n[i])
			{
				n[i]=n[i+1];
			}
			//System.out.println(n[i]);
		}
		
		System.out.println(Arrays.toString(n));
		
		//System.out.println(n[0]);
		//System.out.println(Arrays.toString(n));
		
//		System.out.println("Original Array :"+Arrays.toString(n));
//		int removeIndex=0;
//		
//		for(int i=removeIndex; i<n.length-1; i++)
//		{
//			 n[i] = n[i +1];
//			
//		}
//		
//		
//		System.out.println("After removing the second element: "+Arrays.toString(n));
//		

	}

}
