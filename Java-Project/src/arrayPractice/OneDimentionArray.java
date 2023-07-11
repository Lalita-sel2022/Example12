package arrayPractice;

public class OneDimentionArray {

	public static void main(String[] args)
	{
		int a[]= {3,4,15,6,7,8,9};
		
		//Find sum of array
		/*
		 * int sum=0; for(int x:a) { sum=sum+x; } System.out.println(sum);
		 */
		//Search an elelement
		/*
		 * int key=10; for(int x:a) { if(key==x) {
		 * System.out.println("Match element is :"+x); }
		 * 
		 * } System.out.println("Element not found");
		 */
		
		//Find maximum element
		int max=a[0];
		
		System.out.println(a.length);
		for(int i=0;i<=a.length;i++)
		{
			
        
        if(a[i]>max)
        {
        	max=a[i];
        
        }
		
		}
		
		System.out.println("Maximum number is :"+max);
		
	}

}
