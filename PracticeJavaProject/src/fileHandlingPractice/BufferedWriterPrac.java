package fileHandlingPractice;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class BufferedWriterPrac

{

	public static void main(String[] args) throws Throwable 
	{
		BufferedWriter wri=new BufferedWriter(new FileWriter("lalita.txt"));
		wri.write("Hello guys");
		wri.close();
		System.out.println("Finished");

	}

}
