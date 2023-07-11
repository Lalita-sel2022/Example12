package fileHandlingPractice;

import java.io.File;

public class CreateDirPractice 
{
	static int count =0;

	public static void main(String[] args) 
	{
		//File object is used to make directory also
		
		File f= new File("c:\\PracticeJavaProject");
		System.out.println(f.exists());
		
		//Create directory
		f.mkdir();
		
		/*
		 * System.out.println(f.exists()); System.out.println(f.getName());
		 * 
		 * System.out.println(f.getAbsolutePath()); System.out.println(f.isFile());
		 * System.out.println(f.isDirectory());
		 */
		
		//list all file and directory
	    String[] s=f.list();
		
		  for(String s1:s) 
		  
		  { count++; System.out.println(s1); }
		  System.out.println("The total number is :"+count);
		 
	  
	    
		
		

	}

}
