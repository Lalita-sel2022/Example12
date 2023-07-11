package Arrays;

public class SumOfArray 
{

	public static void main(String[] args) 
	{
		int a[]= {12,2,1,4,5,15,7,3,9};
		//a[3]=20;
		
		//Sum of array
		/*
		 * int sum=0; 
		 * 
		 * 
		 * for(int i=0;i<a.length;i++) { sum=sum+a[i]; }
		 * System.out.println("Total is :"+sum);
		 */
		
		//Searching an element
		/*
		 * int key=20; for(int i=0;i<a.length;i++) { if(a[i]==key) {
		 * System.out.println("Found key is :"+a[i]); System.exit(0); } }
		 * System.out.println("Key is not found");
		 */
		 
		//Finding maximum element
		
		/*
		 * int max=a[0]; for(int i=0;i<a.length;i++) { if(a[i]>max) { max=a[i]; } }
		 * 
		 * System.out.println(max);
		 */
		 
		//Finding second largest element
		
		/*
		 * int max1,max2; max1 =max2=a[0];
		 * 
		 * for(int i=0;i<a.length;i++) { if(a[i]>max1) { max2=max1; max1=a[i]; } else
		 * if(a[i]>max2) { max2=a[i]; } } System.out.println(max2);
		 */
		
		// Finding smallest value
		
		//int a[]= {12,2,1,4,5,15,7,3,9};
		/*
		 * int min=a[0]; //System.out.println(min);
		 * 
		 * for(int i=0;i<a.length;i++) { if(a[i]<min) { min=a[i]; } }
		 * System.out.println(min);
		 */
		
		//Finding second smallest element
		int min1,min2;
		min1=min2=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min1)
			{
				min2=min1;
				min1=a[i];
			}
			else if(a[i]<min2)
			{
				min2=a[i];
			}
		}
		System.out.println(min2);
		
		

	}

}
