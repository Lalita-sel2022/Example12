package keywords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class ApplicationKeywords extends ValidationKeywords
{
	
	public ApplicationKeywords() throws IOException 
	{
		fil =new FileInputStream(projectPath+"\\src\\test\\resources\\enviornment.properties");
		mainPro = new Properties();
		mainPro.load(fil);
		String e = mainPro.getProperty("env");
		System.out.println(e);
		fil= new FileInputStream(projectPath+"\\src\\test\\resources\\"+e+".properties");
		childPro = new Properties();
		childPro.load(fil);
	    fil= new FileInputStream(projectPath+"\\src\\test\\resources\\or.properties");
		orPro = new Properties();
		orPro.load(fil);
		String val = orPro.getProperty("signin_linktext");
		System.out.println(val);
		
		softAssert= new SoftAssert();
		
	}

	public void selectDateFromCalendar(String date) 
	{
		log("Selecting Date "+date);
		
		try 
		{
			Date currentDate = new Date();
			Date dateToSel=new SimpleDateFormat("d-MM-yyyy").parse(date);
			String day=new SimpleDateFormat("d").format(dateToSel);
			String month=new SimpleDateFormat("MMMM").format(dateToSel);
			String year=new SimpleDateFormat("yyyy").format(dateToSel);
			String monthYearToBeSelected=month+" "+year;
			String monthYearDisplayed=getElement("monthyear_css").getText();
			
			while(!monthYearToBeSelected.equals(monthYearDisplayed)) {
				click("datebackButoon_xpath");
				monthYearDisplayed=getElement("monthyear_css").getText();
			}
			driver.findElement(By.xpath("//td[text()='"+day+"']")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public void defaultLogin() throws InterruptedException 
	{
		navigateURL("rediffurl");
		type("username_css", "rediffuser");
		type("password_xpath", "rediffpassword");
		click("login_submit_id");
		waitForPageToLoad();
		wait(5);
		
	}
	
	public int findCurrentStockQuantity(String companyName) 
	{
		log("Finding current stock quantity for "+ companyName);
		int row = getRowNumWithCellData("stocktable_css",companyName);
		if(row==-1) {
			log("Current Stock Quantity is 0 as Stock not present in list");
			return 0;
		}
		// table#stock > tbody > tr:nth-child(2) >td:nth-child(4)
		String quantity = driver.findElement(By.cssSelector(mainPro.getProperty("stocktable_css")+" > tr:nth-child("+row+") >td:nth-child(4)")).getText();
		log("Current stock Quantity "+quantity);
		return Integer.parseInt(quantity);
	}

	public void goToBuySell(String companyName) 
	{
		log("Selecting the company row "+companyName );
		int row = getRowNumWithCellData("stocktable_css", companyName);
		if(row==-1) {
			log("Stock not present in list");
		}
		driver.findElement(By.cssSelector(mainPro.getProperty("stocktable_css")+" > tr:nth-child("+row+") >td:nth-child(1)")).click();
		driver.findElement(By.cssSelector(mainPro.getProperty("stocktable_css")+"  tr:nth-child("+row+") input.buySell" )).click();
		
	}

	public void goToTransactionHistory(String companyName) 
	{
	    log("Selecting the company row "+companyName );
		int row = getRowNumWithCellData("stocktable_css", companyName);
		if(row==-1) {
			log("Stock not present in list");
			// report failure
		}
		driver.findElement(By.cssSelector(mainPro.getProperty("stocktable_css")+" > tr:nth-child("+row+") >td:nth-child(1)")).click();
		driver.findElement(By.cssSelector(mainPro.getProperty("stocktable_css")+"  tr:nth-child("+row+") input.equityTransaction" )).click();
		
	}

}
