package Arrays;

public class LeftRotateArrayPractice1 
{

	public static void main(String[] args) 
	{
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		int temp=a[0];
		
		
		for(int x:a)
		{
		System.out.print(x);
		}
		System.out.println("");
		
		for(int i=1;i<a.length;i++)
		{
	    //System.out.println(a[i]);
		//System.out.println(a[i-1]);
		a[i-1]=a[i];
		}
		System.out.println("");
		
		a[a.length-1]=temp;
		
		for(int x:a)
		{
		System.out.print(x);
		}
		System.out.println("");
	

	}

}
