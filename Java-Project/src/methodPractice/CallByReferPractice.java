package methodPractice;

public class CallByReferPractice 
{
	public static void changeValue(int a[], int index, int value)
	{
		a[index]=value;
	}

	public static void change(int x, int value)
	{
		x=value;
		System.out.println(x);
	}
	public static void main(String[] args) 
	{
		int a[]= {2,5,6,7,9};
		
		changeValue(a,3,60);
		for(int x:a)
		{
			System.out.println(x);
		}
		
		int n=10,value=20;
		System.out.println(n);
		change(10,20);
		

	}

}
