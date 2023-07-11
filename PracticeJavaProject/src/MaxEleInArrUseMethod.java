
public class MaxEleInArrUseMethod 
{

	public static void main(String[] args) 
	{
		int a[]= {5,15,8,23,1};
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
