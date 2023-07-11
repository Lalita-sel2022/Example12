package operators;

public class IncrementAndDecrement 
{

	public static void main(String[] args)
	{
		/*
		 * int x=5,y; y=++x; //before using x, x increase by one System.out.println(y);
		 * System.out.println(x);
		 */
		
		int a=4, y=3;
		int z=2* a++ + 3* ++a;
		//2*4=8+3*6=18==26
		System.out.println(z);
		
		float f=2.5f;
		float f1=f++;
		System.out.println(f1);
		
		char c='A';
		c++;
		System.out.println(c);

	}

}
