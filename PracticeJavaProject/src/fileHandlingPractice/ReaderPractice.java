package fileHandlingPractice;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReaderPractice 
{
     
	public static void main(String[] args) throws Throwable 
	{
		FileReader red= new FileReader("lalita.txt");
		int data =red.read();
		System.out.println(data);
		/*
        int data;
        while((data=red.read())!=-1)
        {
        	System.out.println(data+ " : "+(char)data);
        }
        */
		
	}
	

}
