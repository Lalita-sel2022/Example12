package Arrays;

public class SelectionSortPratice 
{

	public static void main(String[] args) 
	{
		int a[]= {10,5,8,3,15,4};
		int temp=0;
		
		for(int x:a)
		{
			System.out.print(x+" ");
		}
		System.out.println("");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[j]<a[i])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
		}
		
		for(int x:a)
		{
			System.out.print(x+" ");
		}
		System.out.println("");

	}

}
