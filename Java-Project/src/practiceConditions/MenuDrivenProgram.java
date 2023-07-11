package practiceConditions;

import java.util.Scanner;

public class MenuDrivenProgram {

	public static void main(String[] args) 
	{
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Menu...");
		 System.out.println("Add");
		 System.out.println("Multiple");
		 System.out.println("Sub");
		 System.out.println("Div");
		
		 System.out.println("Enter number one");
		 int x=sc.nextInt();
		 
		 System.out.println("Enter number two");
		 int y=sc.nextInt();
		 sc.nextLine();
		 System.out.println("Enter option in words");
		 String option = sc.nextLine();
		 
		 switch(option)
		 {
		 case "add":
			 
			 System.out.println(x+y);
			 break;
			 
         case "sub":
			 
			 System.out.println(x-y);
			 break;	
         case "multiple":
			 
			 System.out.println(x*y);
			 break;
         case "div":
			 
			 System.out.println(x/y);
			 break;
			 
		 default:
			 System.out.println("Not match");
			 
		 }

	}

}
