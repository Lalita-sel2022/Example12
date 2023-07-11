package keywords;

import org.testng.Assert;

public class ValidationKeyword extends GenericKeywords
{
    
	
	public void validateTitle()
	{
		String expectedTitle=" Guru99 Bank Home Page ";
		String actualTitle= driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
		
	}
	
	public void ValidateText()
	{
		
	}
	
	public void validateElementVisible()
	{
		
	}
}
