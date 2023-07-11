package Arrays;

public class RotationPractice
{

	public static void main(String[] args) 
	{
		int a[]= {4,8,10,12,9};
		
		for(int x:a)
		{
			System.out.print(x);
			
		}System.out.println("");
		
		/*
		 * int temp=a[0];
		 * 
		 * //Left rotation //a[a.length-2]=30; //System.out.println(temp);
		 * 
		 * for(int i=1;i<a.length;i++) { //System.out.println(a[i]); a[i-1]=a[i];
		 * //System.out.println(a[i]);
		 * 
		 * } a[a.length-1]=temp;
		 * 
		 * for(int x:a) { System.out.print(x);
		 * 
		 * }System.out.println("");
		 */
		 
	   
	    //System.out.println(a.length-1);
	   
	    //Right rotation
	    
		//System.out.println(a.length);
		/*
		 * int temp1=a[0]; //System.out.println(temp1); int temp=a[a.length-1];
		 * 
		 * //System.out.println(a.length-2); System.out.println(temp1); for(int
		 * i=a.length-2;i>0;i--) {
		 * 
		 * 
		 * } System.out.println(temp);
		 */
		
		//int a[]= {4,8,10,12,9};
		
		int temp=a[a.length-1];
		//System.out.println(temp);
		for(int i=a.length-1;i>0;i--)
		{
			//System.out.println(a[i-1]);
			a[i]=a[i-1];
			a[0]=temp;
			//System.out.println(a[i]);
		}
	    //System.out.println(a.length-1);
		
		  for(int x:a) { System.out.print(x);
		  
		  }
		  System.out.println("");
		 
		
	}

}
