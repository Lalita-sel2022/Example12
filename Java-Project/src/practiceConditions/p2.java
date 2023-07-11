package practiceConditions;

import java.util.Scanner;

public class p2 {

	public static void main(String[] args) 
	{
         Scanner sc= new Scanner(System.in);
		 System.out.println("Enter a URL");
		 String url=sc.nextLine();
		 
		
		
		
		String protocal = url.substring(0, url.indexOf(":"));
		
	      if(protocal.equals("http")) {
		  System.out.println("Hypertext Transfer Protocal");
		  
		  }
		  
		  else if(protocal.equals("https")) {
		  System.out.println("Hypertext Transfer Protocal sucure");
		  
		  } else if(protocal.equals("ftp")) {
		  System.out.println("File Transfer Protocal");
		  
		  } else { System.out.println("Not match protocal"); }
	      
	       
	      String ext = url.substring(url.lastIndexOf(".")+1);
	       
	       if(ext.equals("com"))
	       {
	    	   System.out.println("Comercial");
	       }
	       else if(ext.equals("net"))
	       {
	    	   System.out.println("Network");
	       }
	       else if(ext.equals("org"))
	       {
	    	   System.out.println("Organization");
	       }
	       else
	       {
	    	   System.out.println("not match extension");
	       }
		 

	}

}
