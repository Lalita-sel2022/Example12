package practice;

import java.util.Arrays;

public class ShortArray {

	public static void main(String[] args) 
	{
		int[] a= {20, 30, 25,70,3,1,34};
		//int[]b=a;
		
		String[] s= {"Lalita","Sonam","Dainy","Rupal","Anu"};
		Arrays.sort(s);
		System.out.println(s.length);
		System.out.println(Arrays.toString(s));
	    
		for(String s1:s)
		{
			System.out.println(s1);
		}
		
		
		
		//System.out.println(b.length);
//		//find the index of an array element.
//		for(int i=0;i<a.length;i++)
//		{
//		  a[i]=i;
//		  System.out.println(a[i]);
//		}
		
		
		//calculate the average value of array elements
//		System.out.println("Array sum is "+total);
//		double avg=total/a.length;
//		System.out.println("Array average is :"+avg);
		
		//Array short
		
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]>a[j])
//				{
//					int temp=0;
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//				
//				//System.out.println(a[j]);
//				}
//			System.out.println(a[i]);
//		}

	}

}
