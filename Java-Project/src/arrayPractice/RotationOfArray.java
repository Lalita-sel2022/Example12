package arrayPractice;

public class RotationOfArray {

	public static void main(String[] args) 
	{
		int n[]= {2,5,6,8};
		for(int x:n)
		{
			System.out.print(x);
		}
		
		int temp = n[0];
		try {
		for(int i=1;i<n.length;i++)
		{
			
			n[i-1]=n[i];
			
		}
		
		n[n.length-1]=temp;
		System.out.println( );
		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	
		for(int x:n)
		{
			System.out.print(x);
		}
		
		System.out.println( );
		
		System.out.println("Hello java");

	}

}
