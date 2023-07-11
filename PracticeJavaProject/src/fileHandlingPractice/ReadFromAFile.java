package fileHandlingPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromAFile 
{

	public static void main(String[] args) throws Exception 
	{
		File f=new File("abc.txt");
		Scanner read=new Scanner(f);
		
		while(read.hasNextLine())
		{
			String s=read.nextLine();
			System.out.println(s);
		}

	
		

	}

}
