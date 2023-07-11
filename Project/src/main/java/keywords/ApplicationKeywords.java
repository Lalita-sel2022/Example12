package keywords;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.asserts.SoftAssert;


public class ApplicationKeywords extends ValidationKeyword
{
	
	public FileInputStream file;
	
	  public ApplicationKeywords() throws IOException
	  {
		  //System.out.println("HELLO SELENIUM");
		
		  file= new FileInputStream(projectPath+"\\src\\test\\resources\\environment.properties");
		  mainpro = new Properties();
		  mainpro.load(file);
		  String e = mainpro.getProperty("env");
		  
		  file = new FileInputStream(projectPath+"\\src\\test\\resources\\"+e+".properties");
		  childpro = new Properties();
		  childpro.load(file);
		  childpro.getProperty("prod");
		  
		  file = new FileInputStream(projectPath+"\\src\\test\\resources\\or.properties");
		  orProp = new Properties();
		  orProp.load(file);
		 
		  softAssert =new SoftAssert();
     }
	  
	  

	public void open(String browser) {
	  
	  }
	 
	/*
	 * public void validateTitle() {
	 * 
	 * }
	 */
	
	public void loginapp() 
	{
		
	}
	
	public void selectDate()
	{
		
	}

}
