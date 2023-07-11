package TestCases;

import java.io.IOException;
import java.time.Duration;
import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTest 
{
	
	public WebDriver driver;
	
    @BeforeTest
    public void beforeTest()
    {
    	WebDriverManager.firefoxdriver().setup();
    	driver= new FirefoxDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    
    @Test(dataProvider = "loginData")
  // public void login(String user, String pwd, String exp) throws InterruptedException
    public void login(Hashtable<String, String> h) throws InterruptedException
    {
    	driver.get("https://admin-demo.nopcommerce.com/login");
    	driver.findElement(By.id("Email")).clear();
    	driver.findElement(By.id("Email")).sendKeys(h.get("UserName"));
    	
    	driver.findElement(By.id("Password")).clear();
    	driver.findElement(By.id("Password")).sendKeys(h.get("Password"));
    	
    	driver.findElement(By.xpath("//div[@class='buttons']/button")).click();
    	String expTitle="Dashboard / nopCommerce administration";
    	String actualTitle = driver.getTitle();
    	//System.out.println(actualTitle);
    	
    	if(h.get("Result").equals("valid"))
    	{
    		if(expTitle.equals(actualTitle))
    		{
    			Thread.sleep(2000);
    			driver.findElement(By.xpath("//div[@id='navbarText']/ul/li[3]")).click();
    			Assert.assertTrue(true);
    		}
    		else
    		{
    			Assert.assertTrue(false);
    		}
    	}else if(h.get("Result").equals("Invalid"))
    	{
    		if(expTitle.equals(actualTitle))
    		{
    			Thread.sleep(2000);
    			driver.findElement(By.xpath("//div[@id='navbarText']/ul/li[3]")).click();
    			Assert.assertTrue(false);
    		}
    		else
    		{
    			Assert.assertTrue(true);
    		}
    		
    	}
    }
    
    @DataProvider(name="loginData")
    public Object[][] getData() throws IOException
    {
     	String sheetName="login";
     	int rowNo=0;
//    	String testCaseName="LoginTest";
//    	
//    	ExcelUtility a=new ExcelUtility("C:\\Users\\DELL\\Desktop\\TestCases.xlsx");
//    	return DataUtil.getData(a, sheetName, testCaseName);
////    	
////    	String loginDAta[][] = {
////    			{"admin@yourstore.com","admin","valid"},
////    			{"admin@yourstore.com","adm","Invalid"},
////    			{"adm@yourstore.com","admin","Invalid"},
////    			{"adm@yourstore.com","adm","Invalid"}
////    	        };
//    	
     	ExcelUtility e= new ExcelUtility("C:\\Users\\DELL\\Desktop\\TestCases.xlsx");
     	int totalRow = e.getRowCount(sheetName);
     	int totalCols = e.getColCount(sheetName);
     	
     	System.out.println("Total row are : "+totalRow +"..........."+"Total cols are : "+totalCols);
     	
     	Object data[][]= new Object[totalRow][1];
     	Hashtable<String, String> table=null;
     	for(int row=1;row<=totalRow;row++)
     	{
     		table= new Hashtable<String, String>();
     		for(int col=0;col<totalCols;col++)
     		{
     			//data[rowNo][col]=e.getCellData(sheetName, col, row);
     			String keys=e.getCellData(sheetName, col, 0);
     			String values = e.getCellData(sheetName, col, row);
     			//System.out.println("Keys : "+keys +"..........."+"Vlues : "+values);
     			table.put(keys, values);
     			
     		}
     		data[rowNo][0]=table;
     		rowNo++;
     	}
     	System.out.println(data.toString());
     	
		return data;
		}

}
