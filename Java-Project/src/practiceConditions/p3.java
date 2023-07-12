package practiceConditions;

import java.util.Scanner;

public class p3 {

	public static void main(String[] args) 
	{
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter a day");
	   int no =sc.nextInt();
	   
	   switch(no)
	   {
	    case 1:
		   System.out.println("Monday");
		   break;
	   
	   case 2:
		   System.out.println("Tuesday");
		   break;
	   
       case 3:
	   System.out.println("Wednesday");
	   break;

     case 4:
	   System.out.println("Thrusday");
	   break;

     case 5:
	   System.out.println("Friday");
	   break;

     case 6:
	   System.out.println("Satruday");
	   break;

     case 7:
	   System.out.println("Sunday");
	   break;
	   
	   default:
		   System.out.println("Not match a day");
}
	   
		

	}

}
