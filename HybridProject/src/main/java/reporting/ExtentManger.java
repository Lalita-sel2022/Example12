package reporting;

import java.io.File;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManger 
{
	
	public static ExtentReports report;
	public static String screenshotFolderPath;
	
	public static ExtentReports getReport()
	{
	if(report==null)
	{
	  report= new ExtentReports();
	  //Init the report folder
	  
	   Date d= new Date();
	  //System.out.println("Date is :"+ d);
	  System.out.println(d.toString().replace(":", "-"));
	  String reportFolder = d.toString().replace(":", "-")+"//screenshots";
	  
	  screenshotFolderPath=System.getProperty("user.dir")+"//reports//"+reportFolder;
	  String reportFolderPath = System.getProperty("user.dir")+"//reports//"+d.toString().replace(":", "-");
	  System.out.println("screensot folder path :"+screenshotFolderPath);
	  System.out.println("Report folder path :"+reportFolderPath);
	  
	  File f= new File(screenshotFolderPath);
	  f.mkdirs(); //create dynamic report folder name + Screenshot
	  
	  ExtentSparkReporter spark= new ExtentSparkReporter(reportFolderPath);
	  spark.config().setReportName("production regression test");
	  spark.config().setDocumentTitle("Automation Report");
	  spark.config().setTheme(Theme.STANDARD);
	  
	  report.attachReporter(spark);
	  
		
	}
	return report;
	}

	
}
