package fileHandlingPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadingDataFromFile 
{

	public static void main(String[] args) throws Throwable 
	{
		//FileInputStream f= new FileInputStream("lalita.txt");
		
		FileInputStream red= new FileInputStream("xyz.txt");
		
		int data=red.read();
		
		System.out.println(data);
		
		//Read data from file statically
		/*
		int data =f.read();
		int data1 =f.read();
		int data2 =f.read();
		
		System.out.println(data+" : "+(char)data);
		System.out.println(data1+" : "+(char)data1);
		System.out.println(data2+" : "+(char)data2);
		*/
		
		//Read data from file Dynamically
	    /*
		int data;
		
		while((data=f.read())!=-1)
		{
			System.out.println(data+"  :  "+(char)data);
		}
		*/
		
		
		

	}

}
