package Arrays;

public class FindLargestElement 
{

	public static void main(String[] args) 
	{
		
		int a[]= {3,9,7,8,12,6,15,5,4,10};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
