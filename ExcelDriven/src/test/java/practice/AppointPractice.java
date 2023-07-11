package practice;

import java.util.Scanner;

public class AppointPractice {

	public static void main(String[] args) 
	{
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the age");
		int age=s.nextInt();
		
		System.out.println("Please enter gender");
		String gender=s.nextLine();
		
		System.out.println("Gender is : "+gender);
		
		
		//char mari=s.next().charAt(0);
	
		//System.out.println("Gender is :"+gender);
		if(gender.equalsIgnoreCase("female"))
		{
			
			System.out.println("She will work only in urban areas.");
		}
		else if(gender.equalsIgnoreCase("male") && (age>=20 && age<=40))
		{
			
			System.out.println("He may work in anywhere.");
		}
		else if(gender.equalsIgnoreCase("male") && (age>=40 && age<=60))
		{
		
			System.out.println("He will work in urban areas only.");
		}
		else
			System.out.println("Error");
		
		
		

	}

}
