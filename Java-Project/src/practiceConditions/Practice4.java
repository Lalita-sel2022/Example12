package practiceConditions;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) 
	{
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter a website");
		  String website =sc.nextLine();
		  
		  String ext = website.substring(website.lastIndexOf(".")+1);
		  
		  switch(ext)
		  {
		  case "com":
			  System.out.println("Commercial");
			  break;
			  
		  case "net":
			  System.out.println("network");
			  break;
		  case "in":
			  System.out.println("india");	
			  break;
			  
		  default:
		  	  System.out.println("Not match");
			  
		 }

	}

}
