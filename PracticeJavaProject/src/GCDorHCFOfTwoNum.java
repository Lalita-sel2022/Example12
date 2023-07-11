
public class GCDorHCFOfTwoNum 
{
	static int GCD(int n1,int n2)
	{
		while(n1!=n2)
		{
			if(n1>n2)
			{
				n1=n1-n2;
			}
			else
			{
				n2=n2-n1;
			}
		}
		return n1;
		
	}

	public static void main(String[] args) 
	{
		System.out.println(GCD(35,56));

	}

}
