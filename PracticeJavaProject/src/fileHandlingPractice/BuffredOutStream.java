package fileHandlingPractice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BuffredOutStream 
{

	public static void main(String[] args) throws Throwable 
	{
		//FileOutputStream fil=new FileOutputStream("htp.txt",true);
		BufferedOutputStream bo=new BufferedOutputStream(new FileOutputStream("htp.txt",true));
		
		 String s="Hello guys";    
	     byte b[]=s.getBytes(); 
	     System.out.println(b);
	     bo.write(b);
	     bo.flush();    
	     bo.close();    
	     //fil.close(); 
	     
		//byte b[]= {'l','a','l','i','t','a'};
		//bo.write(b);
		
		//String s="Lalita saini";
		//byte[] b=s.getBytes();
		//bo.write(b);
		System.out.println("Sucessfully");
		
		//BufferedInputStream bo1=new BufferedInputStream(new FileInputStream("htp.txt"));
		//int data =bo1.read();
		//System.out.println(data);
		}
}
