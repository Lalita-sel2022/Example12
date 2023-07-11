package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceCheckout {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(3000);
		String val = driver.findElement(By.id("user-name")).getAttribute("value");
		System.out.println("Attribute value is "+val);

//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
//		boolean b = driver.findElement(By.id("inventory_container")).isDisplayed();
//		System.out.println(b);
//		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
//		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		
//		String checkSummery = driver.findElement(By.xpath("//div[@class='cart_item_label']")).getText();
//		System.out.println("Product check validation "+ checkSummery);
//		driver.findElement(By.id("checkout")).click();
//		driver.findElement(By.id("first-name")).sendKeys("Lalita");
//		driver.findElement(By.id("last-name")).sendKeys("Saini");
//		driver.findElement(By.id("postal-code")).sendKeys("201301");
//		driver.findElement(By.id("continue")).click();
//		Thread.sleep(2000);
//		String info = driver.findElement(By.xpath("//div[@class='summary_info']")).getText();
//		System.out.println("Checkout summery info "+info);
//		driver.findElement(By.id("finish")).click();
//        Thread.sleep(2000);
//		System.out.println(driver.findElement(By.xpath("//img[@class='pony_express']")).isDisplayed());
//		System.out.println("Successfully");
//		
//		driver.findElement(By.id("back-to-products")).click();
//		boolean bb = driver.findElement(By.id("inventory_container")).isDisplayed();
//		System.out.println(bb);
//		
//		Thread.sleep(2000);
//		driver.findElement(By.id("react-burger-menu-btn")).click();
//		driver.findElement(By.linkText("Logout")).click();
		
//		List<WebElement> linkElement = driver.findElements(By.tagName("a"));
//		System.out.println(linkElement.size());
//		for(WebElement link:linkElement)
//		{
//			System.out.println(link.getText());
//		}
		
	}

}
