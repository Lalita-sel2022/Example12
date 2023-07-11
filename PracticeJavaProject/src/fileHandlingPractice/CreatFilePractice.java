package fileHandlingPractice;

import java.io.File;
import java.io.IOException;

public class CreatFilePractice 
{

	public static void main(String[] args) throws IOException
	{
		//create a file
		File f=new File("abc.txt");
		//This line not create physical file
		//Just create file object to represent the name abc.txt
		System.out.println(f.exists());
		//create a file
		f.createNewFile();
		System.out.println(f.exists());
		
	    System.out.println(f.getName());
		
		System.out.println(f.getAbsolutePath());
		
		//how many character present into file
		Long l=f.length();
		System.out.println(l);
		
		//System.out.println(f.createNewFile());

	}

}
