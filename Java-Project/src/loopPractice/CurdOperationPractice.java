package loopPractice;

import java.util.Scanner;

public class CurdOperationPractice {
	

	/*
	 * public CurdOperationPractice(String name,int age, int rollNo ) { this.name=
	 * name; this.age=age; this.rollNo=rollNo; }
	 * 
	 * public void setValue(String name,int age, int rollNo ) { this.name= name;
	 * this.age=age; this.rollNo=rollNo;
	 * 
	 * }
	 * 
	 * public String getName() {return name;} public int getAge() {return age;}
	 * public int getRollNo() {return rollNo;}
	 * 
	 */

	public static void main(String[] args) {
		String input = "";
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter number");
		 int n=sc.nextInt();
		 
		
		
		    
		    //do
		 while(n==1){
			 System.out.println("Enter the name");
		        input = sc.nextLine();
		        
		        System.out.println(input);
		      } 
		
		
		
		
		/*
		 * String name; int age; int rollNo;
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter the number");
		 * int n = sc.nextInt();
		 * 
		 * switch (n) { case 1:
		 * 
		 * 
		 * System.out.println("Enter the age of student"); age = sc.nextInt();
		 * System.out.println(age); System.out.println("Enter the roll no"); rollNo =
		 * sc.nextInt();
		 * 
		 * System.out.println(rollNo);
		 * 
		 * System.out.println("Enter name of student"); name = sc.nextLine();
		 * System.out.println(name); break;
		 * 
		 * case 2:
		 * 
		 * System.out.println("Hello java"); break; default:
		 * 
		 * System.out.println("Number not match"); }
		 */
		/*
		 * if(n==1) { System.out.println("Enter student age"); age=sc.nextInt(); //
		 * System.out.println(age);
		 * 
		 * System.out.println("Enter student name"); name=sc.nextLine();
		 * System.out.println(name);
		 * 
		 * 
		 * 
		 * 
		 * } else { System.out.println("Number not match"); }
		 */

	}

}
