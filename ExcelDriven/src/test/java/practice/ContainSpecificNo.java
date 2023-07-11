package practice;

public class ContainSpecificNo
{
//	public static boolean numberExistance(int[] x, int no)
//	{
//		
//		for(int i=0;i<x.length;i++)
//		{
//		 if(x[i]==no)
//		{
//			return true;
//		}
//		}
//	    return false;
//}
	

	public static void main(String[] args) 
	{
		int no=5;
		int[] x= {10,24,36,25,6};
		
		//System.out.println(numberExistance(x,5));
		for(int i=0;i<x.length;i++)
		{
		 if(x[i]==no)
		{
			System.out.println("Exist "+no);
		}
		
		}
	   
		

	}

}
