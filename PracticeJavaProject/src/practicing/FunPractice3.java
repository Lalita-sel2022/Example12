package practicing;

import java.util.Scanner;

public class FunPractice3 
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age =sc.nextInt();
		if(age>18)
		{
			System.out.println("Person is eligible for vote :"+age);
		}
		else
		{
			System.out.println("person is not eligible :"+age);
		}
		
		
		
		

	}

}
