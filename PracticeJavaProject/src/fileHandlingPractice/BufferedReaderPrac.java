package fileHandlingPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderPrac
{

	public static void main(String[] args) throws Throwable 
	{
		BufferedReader red=new BufferedReader(new FileReader("lalita.txt"));
		String data =red.readLine();
		System.out.println(data);
		

	}

}
