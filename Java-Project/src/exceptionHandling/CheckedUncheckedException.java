package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedUncheckedException 
{
	//Checked exception
	public static void show()
	{
		try {
		FileInputStream file= new FileInputStream("Text.txt");
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
	}
	
	public static void display()
	{
		
	   System.out.println(12/0);
	}
	
	

	public static void main(String[] args) 
	{
		 show();
		
		display();
	}

}
