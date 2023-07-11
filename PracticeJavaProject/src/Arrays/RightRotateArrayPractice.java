package Arrays;

public class RightRotateArrayPractice 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8};
		int b[]=new int[a.length];
		int temp=a[a.length-1];
		int rotate;
		//System.out.println(temp);
		
		System.out.println(a.length-1);
		for(int x:a)
		{
			System.out.print(x);
		}
		System.out.println("");
	    
		 b[0]=temp;
			for(int i=1;i<=a.length-2;i++) {
			    
			     b[i]=a[i];
			     
					
			}
			b[a.length-1]=a[0];
		
		
		
		
		  for(int x:b) { System.out.print(x); } System.out.println("");
		 
		

	}

}
