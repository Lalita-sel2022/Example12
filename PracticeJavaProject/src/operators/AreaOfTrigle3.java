package operators;

import java.util.Scanner;

public class AreaOfTrigle3 
{

	public static void main(String[] args) 
	{
		double area;
		float s;
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter base of trigle");
		 int base=sc.nextInt();
		 System.out.println("Enter hieght of trigle");
		 int height=sc.nextInt();
		 System.out.println("Enter lambvat of trigle");
		 int lamb=sc.nextInt();
		 
		 s=(base+height+lamb)/2;
		 System.out.println(s);
		 area=Math.sqrt(s*(s-base)*(s-height)*(s-lamb));
		 System.out.println(area);
		 
		
		 

	}

}
