package conditionalStatement;

public class Practice3 {

	public static void main(String[] args) 
	{
		int m1 = 36, m2 = 30, m3 = 45;
		
		float total = m1+m2+m3;
		System.out.println(total);
		
		float avg=total/3;
		System.out.println(avg);
		
		if(avg>=70)
		{
			System.out.println("A");
		}
		else if(avg>=60 && avg<=70)
		{
			System.out.println("B");
		}
		else if(avg>=50 && avg<=60)
		{
			System.out.println("c");
		}
		else
		{
			System.out.println("D");
		}

	}

}
