package fileHandlingPractice;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInpStreamPractice 
{

	public static void main(String[] args) throws Exception
	{
		FileInputStream f=new FileInputStream("lalita.txt");
		//Read data from file as one byte
		
		//int str=f.read();
		//int str1=f.read();
		//int str2=f.read();
		//It will print byte data
		
	     //int sum =f.available();
	     //System.out.println(sum);
	     
	   int i=0;
	   while ((i=f.read())!=-1)
	   {
		   System.out.print((char)i);
	   }
		   
	   
	   
		   
		
			/*
			 * System.out.print("Data :"+str); System.out.println(" "+(char)str);
			 * 
			 * System.out.print("Data :"+str1); System.out.println(" "+(char)str1);
			 * 
			 * System.out.print("Data :"+str2); System.out.println(" "+(char)str2);
			 */
		
		//To print string use typecasting
		
		
		
		
		
		f.close();
		System.out.println("Finished");
		

	}

}
