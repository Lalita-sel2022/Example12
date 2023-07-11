package practicing;

import java.util.Scanner;

public class FunPratice 
{
	
	public static void avg(double x, double y, double z)
	{
		//int avga=0;
		System.out.println((x+y+z)/3);
		//System.out.println("The average is :"+avga);
	}

	public static void main(String[] args) 
	{
		System.out.println("Enter 3 value");
		Scanner sc = new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
        
		avg(a,b,c);
	}

}
