
public class MaxNoUsingVarArgs 
{
	static int maxNo(int...x)
	{
		if(x.length==0)
			return Integer.MIN_VALUE;
		
		int max=x[0];
		for(int i=0;i<x.length;i++)
		{
			
			if(x[i]>max)
			{
				max=x[i];
			}
		}
		return max;
	}

	public static void main(String[] args)
	{
		System.out.println(maxNo(30,40,50,1,78));
		//System.out.println(maxNo());

	}

}
