package launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoForChrome {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		//WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.guru99.com/");

	}

}
