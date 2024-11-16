package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[@title = 'My Account']")
	WebElement lnkMyAccount;
	
	@FindBy(xpath="//a[text() = 'Register']")
	WebElement lnkRegister;
	
	@FindBy(xpath="//h1[text() = 'Register Account']")
	WebElement titleRegistration;
	
	public void clickMyAccount()
	{
		// Solution 1
		lnkMyAccount.click();
		
		// Solution 2
		//lnkMyAccount.submit();
	}
	
	public void clickRegister()
	{
		lnkRegister.click();
	}
	
	public String getRegTitle ()
	{
		try
		{
			return (titleRegistration.getText());
		}
		catch (Exception e)
		{
			return(e.getMessage());
		}
	}
}
