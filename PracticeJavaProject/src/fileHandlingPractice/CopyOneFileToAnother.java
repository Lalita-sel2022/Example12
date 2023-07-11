package fileHandlingPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CopyOneFileToAnother 
{

	public static void main(String[] args) throws Throwable
	{
		FileInputStream red= new FileInputStream("lalita.txt");
		
		FileOutputStream wri= new FileOutputStream("xyz.txt");
		
		int data;
		while((data=red.read())!=-1)
		{
			wri.write(data);
			
		}
		
	
		red.close();
		
		//wri.write(data);
		wri.close();
		//System.out.println("Successfully done");
		System.out.println("File copied");

	}

}
