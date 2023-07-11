package Arrays;

public class BubbleSortPractice
{

	public static void main(String[] args) 
	{
		//bubble sort
		int a[]= {10,5,8,3,15,4};
		int temp=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
		
			
		}
		for(int x:a)
		{
			System.out.println(x);
		}
		
	}

}
