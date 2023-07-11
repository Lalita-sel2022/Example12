package fileHandlingPractice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStreamPractice 
{

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream obj= new FileOutputStream("lalita.txt", true);
		
		//Write bytes
		
		obj.write(65);
		obj.close();
		System.out.println("Successful");
		
		
		//Write String
		/*
		String s="hello lalita";
		byte[] b=s.getBytes();
	    obj.write(b);
	    obj.close();
		System.out.println("Successfull");
		*/
	
		

	}

}
