package practice;

import java.util.Scanner;

public class CheckCharacters {

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number");
		int a=s.nextInt();
		if(a>97)
			System.out.println("lowercase");
		else
			System.out.println("Uppercase");
		
		

	}

}
