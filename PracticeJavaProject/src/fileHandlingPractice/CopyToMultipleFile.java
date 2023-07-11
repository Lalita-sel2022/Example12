package fileHandlingPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class CopyToMultipleFile 
{

	public static void main(String[] args) throws Throwable 
	{
		//hardcode src and dest file objects
		/*
	    FileInputStream red= new FileInputStream("lalita.txt");
		
		FileOutputStream wri= new FileOutputStream("xyz.txt");
		FileOutputStream wri1= new FileOutputStream("prachi.txt");
		FileOutputStream wri3= new FileOutputStream("abc.txt");

		int data;
		while((data=red.read())!=-1)
		{
			wri.write(data);
			wri1.write(data);
			wri3.write(data);
		}
		red.close();
		wri.close();
		wri1.close();
		wri3.close();
		System.out.println("Successfully done");
		*/
		
		//! hardcode ,read src and dest file from keyboard
	     
		Scanner sc = new Scanner(System.in);
		//Enter sourse file name
		System.out.println("Enter sourse file");
		//Enter sourse file name
		String read=sc.nextLine();
		
		//Enter destination file name
		
		System.out.println("Enter destination file");
		String write=sc.nextLine();
		
		 FileInputStream red= new FileInputStream(read);
		 FileOutputStream wri= new FileOutputStream(write,true);
		 
		 int data;
			while((data=red.read())!=-1)
			{
				wri.write(data);
				
			}
			
			System.out.println("Successfully done");
		 
	
		
	}

}
