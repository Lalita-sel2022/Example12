package methodPractice;

public class MaxArrayElement 
{
	
	static int maxElement(int a[])
	{
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		return max;
		
	}

	public static void main(String[] args) 
	{
		int a[]= {3,40,6,8,9,100};
		int maxNumber=maxElement(a);
		System.out.println(maxNumber);
		

	}

}
