
public class MethodPractice 
{
	
	  static int max(int a, int b)
	  { a++; 
	  if(a>b) 
		  return a; 
	  else return b;
	  
	  }
	 
	
	/*
	 * static int max(int a) { a++; return a; }
	 */

	public static void main(String[] args) 
	{
		int a=20,b=30,c;
		//System.out.println(max(a));
		
		//System.out.println(a);
		c=max(a,b);
		System.out.println(c);
		
		

	}

}
