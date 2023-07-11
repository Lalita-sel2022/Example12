package fileHandlingPractice;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferedInpSteamEx
{

	public static void main(String[] args) throws Throwable
	{
		FileInputStream file= new FileInputStream("lalita.txt");
		BufferedInputStream s= new BufferedInputStream(file);
		
		//Read data from file statically
	    int data= s.read();
	    
	    System.out.println(data);
	    

	}

}
