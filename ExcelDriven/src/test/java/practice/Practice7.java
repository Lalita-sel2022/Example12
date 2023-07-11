package practice;


class Test12
{
	Test12()
	{
		System.out.println("Super");
	}
}
public class Practice7 extends Test12
{

String s="child";


	

	public Practice7(int i) 
	{
	  System.out.println("Hiii");
}


	public void testing()
	{
		System.out.println(s);
		System.out.println(this.s);
	
	}

	public static void main(String[] args) 
	{
		int a=10, b=0;
		try {
		System.out.println(a/b);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("Hello java");
		//System.out.println("Hello");
       //Practice7 c= new Practice7();
		//c.testing();
//		String s="abcdef";
//		System.out.println(s.substring(1));
//		String s= new String("Lalita");
//		String s1= new String("Lalita");
//		System.out.println(s==s1);
//		System.out.println(s.equals(s1));
//		s.concat("xyz");
//		System.out.println(s);
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the first number");
//		double no1=sc.nextDouble();
//		System.out.println("Enter the second number");
//		double no2=sc.nextDouble();
//		System.out.println("Enter the third number");
//		int no3=sc.nextInt();
//		System.out.println("Enter the fourth number");
//		int no4=sc.nextInt();
		
		 //System.out.println(no1 > 0 && no1 < 1 && no2 > 0 && no2 < 1);
//		if(no1>=0 && no1<=1)
//		{
//			System.out.println("true");
//		}
//		else
//		{
//			System.out.println("False");
//		}

	}

}
