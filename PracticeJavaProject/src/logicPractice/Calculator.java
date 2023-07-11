package logicPractice;

import java.util.Scanner;

public class Calculator 
{

	public static void main(String[] args) 
	{
     
		String yn;
		//int no1=20, no2=30, res;
		//String symbol="%";
		do
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter first number");
			int no1=sc.nextInt();
			System.out.println("Enter second number");
			int no2=sc.nextInt();
			System.out.println("Select symbol(+,-,*,/,%)");
			String symbol=sc.next();
			
			
			switch(symbol)
			{
			
			case "+": 
			          System.out.println(no1+no2);
			          break;
			case "-": 
	                  System.out.println(no1-no2);
	                  break;   
			case "*": 
	                  System.out.println(no1*no2);
	                  break;
			case "/": 
	                  System.out.println(no1/no2);
	                  break; 
			case "%":
	                  System.out.println(no1%no2);
	                  break;
	               default :
	               {
	            	   System.out.println("Invalid Symbol");
	               }
			}
			
			System.out.println("Do you want to continue (Press y for Yes and Press n for No )");
			 yn=sc.next();
			
			
		}while((yn.equals("Y"))||(yn.equals("y")));
	
	}
}
