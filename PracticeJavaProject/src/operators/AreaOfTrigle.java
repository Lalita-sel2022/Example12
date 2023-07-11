package operators;

import java.util.Scanner;

public class AreaOfTrigle {

	public static void main(String[] args) 
	{
		float area;
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter base of trigle");
		 float base=sc.nextFloat();
		 System.out.println("Enter hieght of trigle");
		 float height=sc.nextFloat();
		 //not good way
		 //area=1f/2f*(base*height);
		 
		 area=(base*height)/2;
		 System.out.println(area);
		 

	}

}
