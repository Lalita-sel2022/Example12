package keywords;

public class ValidationKeywords extends GenericKeywords
{


	public String validateTitle()
	{
		
		String title=driver.getTitle();
		return title;
	}
	
	public String validateUrl()
	{
		String url= driver.getCurrentUrl();
		return url;
		
	}
	
	
	public void ValidateText()
	{
		
	}
	
	public void validateElementVisible()
	{
		
	}
}
