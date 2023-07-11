package keywords;

import org.openqa.selenium.support.ui.Select;

public class ValidationKeywords extends GenericKeywords
{
	public void validateTitle()
	{
		
	}
	public void validateText()
	{
		
	}
	

	
	public void validateSelectedValueInDropdown(String locatorKey, String option)
	{
		Select s= new Select(getElement(locatorKey));
		String text = s.getFirstSelectedOption().getText();
		if(!text.equals(option))
		{
			reportFailure("option"+option+"is not present in dropdown "+locatorKey, true);
		}
		
	}
	
	public void validateSelectedValueNotInDropdown(String locatorKey, String option)
	{
		Select s= new Select(getElement(locatorKey));
		String text = s.getFirstSelectedOption().getText();
		if(text.equals(option))
		{
			reportFailure("option"+option+"is not present in dropdown "+locatorKey, true);
		}
		
	}

}
