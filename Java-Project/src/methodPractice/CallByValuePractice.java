package methodPractice;

public class CallByValuePractice 
{
	public static int addNumber(int a, int b)
	{
		a++;
		System.out.println(a);
		int c=a+b;
		return c;
		
	}
	

	public static void main(String[] args)
	{
		int x=10, y=20, z;
		System.out.println(x);
		
		z=addNumber(x,y);
		System.out.println(z);

	}

}
