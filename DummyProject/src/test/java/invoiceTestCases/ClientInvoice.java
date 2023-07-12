package invoiceTestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClientInvoice {
	public WebDriver driver;

	//kjhjhfjbj jbsjhbjh fbjhbjhs
	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://192.168.1.17:8082/");

		driver.findElement(By.name("username")).sendKeys("rohini");
		driver.findElement(By.name("password")).sendKeys("rohini@123");
		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']")).click();

	}

	@Test
	public void createClient() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("navbarDropdown")).click();
		driver.findElement(By.linkText("CLIENTS")).click();

		driver.findElement(By.xpath("//a[@class='btn btn-primary client_btn float-right']")).click();
		driver.findElement(By.id("name")).sendKeys("WebitUp");

		driver.findElement(By.id("businessName")).sendKeys("WebitUp LLC");
		driver.findElement(By.id("companyType")).sendKeys("PVT. LTD.");
		driver.findElement(By.id("primaryBusiness")).sendKeys("IT Service");
		driver.findElement(By.id("address1")).sendKeys("H-104");
		driver.findElement(By.id("address2")).sendKeys("Main Road");
		driver.findElement(By.id("addressType")).sendKeys("Office");
		driver.findElement(By.id("city")).sendKeys("Noida");
		driver.findElement(By.id("state")).sendKeys("UP");
		driver.findElement(By.id("email")).sendKeys("patelpk@gmail.com");
		driver.findElement(By.id("pincode")).sendKeys("77006");
		driver.findElement(By.id("phone")).sendKeys("001 7134936304");
		driver.findElement(By.id("country")).sendKeys("US");
		driver.findElement(By.id("website")).sendKeys("http://www.webitup.com");
		driver.findElement(By.id("contactFirstName")).sendKeys("Bikram");
		driver.findElement(By.id("contactLastName")).sendKeys("Nayak");
		driver.findElement(By.id("contactPhone")).sendKeys("001 7134936304");
		driver.findElement(By.id("contactExtension")).sendKeys("912");
		driver.findElement(By.id("contactMobile")).sendKeys("001 7134936304");
		driver.findElement(By.id("contactDeg")).sendKeys("Manger");
		driver.findElement(By.id("contactprofile")).sendKeys("Facebook");
		driver.findElement(By.id("contactEmail")).sendKeys("nayak@gmail.com");
		driver.findElement(By.id("channel")).sendKeys("Promotional Emails");
		driver.findElement(By.id("taxDocNo1 ")).sendKeys("91AAZP001Z5AZPH");
		boolean tru = driver.findElement(By.id("taxDocNo12")).isDisplayed();
		System.out.println(tru);
		((RemoteWebDriver) driver).executeScript("window.scrollBy(0,1000)");

		driver.findElement(By.xpath("//input[@id='taxDocNo12']")).sendKeys("91AAZP001Z5AZPH");
		driver.findElement(By.xpath("//input[@class='form-check-input input-field '][1]")).click();
		driver.findElement(By.xpath("//input[@id='file']")).sendKeys("C:\\Users\\DELL\\Downloads\\newmaster1.xlsx");
		driver.findElement(By.id("submit_button")).click();
		Thread.sleep(3000);

	}

	@Test
	public void clientPO() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("INVOICING")).click();
		driver.findElement(By.linkText("PURCHASE ORDER")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		driver.findElement(By.id("clientName")).sendKeys("WebitUp");
		driver.findElement(By.id("ponumber")).sendKeys("TH/WEBIT/LR-SUP(22-23)/001");
		WebElement dt = driver.findElement(By.id("podate"));
		dt.sendKeys("2023-05-02");

		driver.findElement(By.id("receivedate")).sendKeys("2023-05-02");
		driver.findElement(By.id("deliverydate")).sendKeys("2023-05-02");

		driver.findElement(By.id("poTitle")).sendKeys("PO Tital");
		driver.findElement(By.id("currency")).sendKeys("INR");
		driver.findElement(By.id("billingtype")).sendKeys("T & M");
		driver.findElement(By.id("billingcycle")).sendKeys("Monthly");
		driver.findElement(By.id("hsn")).sendKeys("546545");
		driver.findElement(By.id("sow1")).click();
		driver.findElement(By.id("paymentTerm")).sendKeys("30 Days");
		driver.findElement(By.id("clientPurchaseOrderItem0.name")).sendKeys("Project");
		driver.findElement(By.id("clientPurchaseOrderItem0.description")).sendKeys("Project");
		driver.findElement(By.id("qty")).sendKeys("1");
		driver.findElement(By.id("price")).sendKeys("208000");
		driver.findElement(By.id("comments")).sendKeys("Testing");
		driver.findElement(By.id("comments")).sendKeys("Testing");
		driver.findElement(By.id("terms")).sendKeys("Testing");
		driver.findElement(By.id("file")).sendKeys("C:\\Users\\DELL\\Downloads\\use_case_template.doc");
		Thread.sleep(1000);
		driver.findElement(By.id("submitbtn")).click();
		Thread.sleep(3000);
	}

	@Test
	public void clientInvoiceWithoutAdvance() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(By.linkText("INVOICING")).click();
		driver.findElement(By.linkText("CLIENT INVOICES")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("client")).sendKeys("WebitUp");
		Thread.sleep(2000);
		driver.findElement(By.id("purchase-order")).sendKeys("PO Tital");
		Thread.sleep(2000);
		driver.findElement(By.id("invoice-date")).sendKeys("2023-05-02");
		Thread.sleep(2000);
		driver.findElement(By.id("currency")).sendKeys("INR");
		Thread.sleep(2000);
		driver.findElement(By.id("purchase-order-item")).sendKeys("Project");
		driver.findElement(By.id("instructions")).sendKeys("Testing");
		driver.findElement(By.id("message")).sendKeys("Testing");
		Thread.sleep(2000);
		//driver.findElement(By.id("invoice-advance-paid")).sendKeys("20000");
		driver.findElement(By.id("submitbtn")).click();
		Thread.sleep(5000);
	}
	
	@Test
	public void clientInvoiceWithAdvance() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(By.linkText("INVOICING")).click();
		driver.findElement(By.linkText("CLIENT INVOICES")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("client")).sendKeys("WebitUp");
		Thread.sleep(2000);
		driver.findElement(By.id("purchase-order")).sendKeys("PO Tital");
		Thread.sleep(2000);
		driver.findElement(By.id("invoice-date")).sendKeys("2023-05-02");
		Thread.sleep(2000);
		driver.findElement(By.id("currency")).sendKeys("INR");
		Thread.sleep(2000);
		driver.findElement(By.id("purchase-order-item")).sendKeys("Project");
		driver.findElement(By.id("instructions")).sendKeys("Testing");
		driver.findElement(By.id("message")).sendKeys("Testing");
		Thread.sleep(2000);
		driver.findElement(By.id("invoice-advance-paid")).sendKeys("4000");
		driver.findElement(By.id("submitbtn")).click();
		Thread.sleep(5000);
	}

	@AfterTest
	public void closeAction() {
		//driver.quit();
	}

}
