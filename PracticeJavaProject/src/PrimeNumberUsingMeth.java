
public class PrimeNumberUsingMeth 
{
	static boolean isPrimeNum(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
			return false;
			}
		}
		return true;
	}
		
	   
	public static void main(String[] args) 
	{
		boolean b=isPrimeNum(91);
		System.out.println(b);
		

	}

}
