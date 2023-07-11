package reporting;


import java.io.File;
import java.io.IOException;
import java.util.Date;



import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager 
{
	   public static ExtentReports extent;
	   public static String screensotFolderPath;
		 
	    public static ExtentReports getReports() throws IOException
	    {
	    	 
	    	if(extent== null)
	    	{
	    		extent= new ExtentReports(); 
	    		//init the reportfolder
	    		Date d= new Date();
	    		String reportFolder=d.toString().replace(":", "-")+"//screenshots";
	    		
	    		screensotFolderPath= System.getProperty("user.dir")+"//reports//"+reportFolder;
	    		String reportFolderPath = System.getProperty("user.dir")+"//reports//"+d.toString().replace(":", "-")+"//screenshots";
	    	    File file= new File(screensotFolderPath);
	    	    file.mkdir();
		       
	    	    ExtentSparkReporter path= new ExtentSparkReporter("report.html");
	            extent.attachReporter(path);
			/*
			 * ExtentTest test = extent.createTest("test 1"); test.pass("Test pass");
			 * 
			 * ExtentTest test1 = extent.createTest("test 1"); test1.log(Status.FAIL,
			 * "Test Fail");
			 */
		 
		 //extent.flush();
		 //Desktop.getDesktop().browse(new File("report.html").toURI());
		
		 
	    	}
	    	return extent;
	    }
	
	   
}
		
	
		 
		  
		 
	

	

