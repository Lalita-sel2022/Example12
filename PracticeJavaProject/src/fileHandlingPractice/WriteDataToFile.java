package fileHandlingPractice;

import java.io.FileOutputStream;
	
public class WriteDataToFile 
{

	public static void main(String[] args) throws Throwable
	{
		FileOutputStream write= new FileOutputStream("xyz.txt");
		write.write(10);
		
		System.out.println("Write data successfully");
		write.close();
	}
}
