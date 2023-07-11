package fileHandlingPractice;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile 
{

	public static void main(String[] args) throws IOException 
	{/*
		 * FileWriter writer= new FileWriter("abc.txt"); writer.write(10);
		 * writer.close();
		 */
		FileWriter writer= new FileWriter("File f", true);
		writer.write(100);//Adding single character
        //string
		writer.write("urga\n software");
		char[] ch= {'l','a','l','i','t','a'};
		writer.write("\n");
		writer.write(ch);
		
		writer.flush();
		writer.close();
	}

}
