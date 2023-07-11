package conditionalStatement;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) 
	{
		  Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter the string number");
		    String num= sc.nextLine();
		    
		    if(num.matches("[01]+"))
		    {
		    	System.out.println("Banary Radix=2");
		    }
		    else if(num.matches("[0-7]+"))
		    {
		    	System.out.println("Octal Radix=8");
		    }
		    else
		    {
		    	System.out.println("Not Match");
		    }

	}

}
