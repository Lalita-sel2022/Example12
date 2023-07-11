package fileHandlingPractice;

import java.io.File;
import java.io.IOException;

public class DirAndFile
{

	public static void main(String[] args) throws IOException 
	{
		File f= new File("Lalita121","Demo.txt");
		f.createNewFile();
		System.out.println(f.exists());
		System.out.println(f.getAbsolutePath());

	}

}
