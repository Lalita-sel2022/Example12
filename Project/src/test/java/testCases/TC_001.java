package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_001 extends BaseClass

{
  public TC_001() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

@Test
  public void f() throws InterruptedException 
  {
	app.openBrowser("chromebrowser");
	app.navigate("radiffurl");
    driver.findElement(By.xpath("(//span[@id='signin_info']/a)[1]")).click();
  
  
  }
	  
  }

