package fileHandlingPractice;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterPractice 
{

	public static void main(String[] args) throws Throwable 
	{
		FileWriter wri= new FileWriter("lalita.txt");
		//String s="Hello Lalita";
		//wri.write(s);
		wri.write("Hello lalita");
		wri.close();
		System.out.println("Finished");
			
		
	}

}
