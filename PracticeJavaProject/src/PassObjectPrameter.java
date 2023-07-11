
public class PassObjectPrameter 
{
	 /*
	 * static void update(int a[]) { a[0]=50; }
	 */
	  
	  // Returning Object
	 
	  static String getString(String mail)
	  {
		  String s1=mail.substring(0, 6);
		return s1;
		  
	  }
	  
	  

	public static void main(String[] args) 
	{
		/*
		 * int a[]= {2,4,3,10,15}; for(int x:a) { System.out.print(x); }
		 * System.out.println(""); update(a);
		 * 
		 * for(int x:a) { System.out.print(x);
		 * 
		 * } System.out.println("");
		 *
		 */
		
		String email="lalita@gmail.com";
		 
		String s=getString(email);
		System.out.println(s);
		

	}

}
