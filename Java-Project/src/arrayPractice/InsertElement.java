package arrayPractice;

public class InsertElement {

	public static void main(String[] args)
	{
		int n[]= new int[5];
		n[0]=2;
		n[1]=3;
		n[2]=4;
		n[3]=5;
		
		int num=9;
		
		
	   for(int x:n)
		{
			System.out.println(x);
		}
		
		  for(int i=0;i<n.length;i++) {
		  
		  //n[i-1]=n[i];
			  System.out.println(n[i+1]);
			  
		  
		  }
		  
		 // n[n.length-1]=num;
		  
		  for(int x:n) { System.out.println(x); }
		 
	}

}
