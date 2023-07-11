package keywords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.asserts.SoftAssert;

public class ApplicationKeywords extends ValidationKeywords
{
	public ApplicationKeywords() throws IOException
	{
		
		fil= new FileInputStream(projectPath+"\\src\\test\\resources\\enviornment.properties");
		mainPro= new Properties();
		mainPro.load(fil);
		String e=mainPro.getProperty("env");
		//System.out.println(e);
		fil= new FileInputStream(projectPath+"\\src\\test\\resources\\"+e+".properties");
		childPro= new Properties();
		childPro.load(fil);
		System.out.println(childPro.getProperty("chromebrowser"));
		fil = new FileInputStream(projectPath+"\\src\\test\\resources\\or.properties");
		orPro = new Properties();
		orPro.load(fil);
		
		softAssert = new SoftAssert();
		
	}
	
	public void login() 
	{
		
	}
	
	public void datePicker()
	{
		
	}

}
