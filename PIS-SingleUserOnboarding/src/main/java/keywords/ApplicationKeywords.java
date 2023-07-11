package keywords;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ApplicationKeywords extends ValidationKeywords
{
	public ApplicationKeywords() throws IOException
	{
		 file= new FileInputStream(projectpath+"\\src\\test\\resources\\enviornment.properties");
		 mainPro= new Properties();
		 mainPro.load(file);
		 String e=mainPro.getProperty("env");
		 
		 file= new FileInputStream(projectpath+"\\src\\test\\resources\\"+e+".properties");
		 childPro= new Properties();
		 childPro.load(file);
		 System.out.println(childPro.getProperty("firefoxbrowser"));
		 System.out.println(childPro.getProperty("pisurl"));
		
		 file= new FileInputStream(projectpath+"\\src\\test\\resources\\or.properties");
		 orPro= new Properties();
		 orPro.load(file);
		 //System.out.println(orPro.getProperty("signin_id"));
	}
	
	public void login()
	{
		
	}
	
	

}
