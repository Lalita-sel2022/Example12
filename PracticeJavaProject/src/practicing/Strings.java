package practicing;

import java.util.Scanner;

public class Strings 
{

	public static void main(java.lang.String[] args) 
	{
		//Declare string
		//String name= "Lalita";
		//Take string from user
		
		/*
		 * System.out.println("Enter the string"); Scanner sc= new Scanner(System.in);
		 * //Use of next when take input as single word String name=sc.next(); //use
		 * nextLing when take input next word also //String name=sc.nextLine();
		 * System.out.println("My name is ::"+ name);
		 */
		
		//concatenation
		/*
		 * String firstName="Lalita"; String lastName="Saini"; String
		 * fullName="lalita"+" "+"Saini"; System.out.println(fullName.length());
		 * 
		 * //charAt for(int i=0;i<fullName.length();i++) {
		 * System.out.println(fullName.charAt(i)); }
		 */
		
		//Comparison string
		
		String a="Lalita";
		String b="Saini";
		//CompareTo check three things
		//1.a>b   : +ve value
		//2.a==b : 0
		//3.a<b  : -Ve value
		
		System.out.println("String is compare"+ a.compareTo(b));
		
		//String is immutable
		

	}

}
