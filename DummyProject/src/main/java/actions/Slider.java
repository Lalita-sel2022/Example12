package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		Actions action= new Actions(driver);
		action.dragAndDropBy(driver.findElement(By.id("slider")), 200, 0).perform();
		
		//
		//WebElement element = driver.findElement(By.linkText("Resizable"));
		//action.contextClick(element).perform();
		driver.switchTo().defaultContent();
		
		//Right click on Element
		//action.contextClick(driver.findElement(By.xpath("//a[text()='Resizable']"))).perform();
		//Hold and click
		
		action.keyDown(Keys.CONTROL).click(driver.findElement(By.linkText("Selectable"))).keyUp(Keys.CONTROL).build().perform();

	}

}
