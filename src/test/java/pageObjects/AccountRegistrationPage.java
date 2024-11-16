package pageObjects;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage
{
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id = 'input-firstname']")
	WebElement txtFirstname;
	
	@FindBy(xpath = "//input[@id = 'input-lastname']")
	WebElement txtLastname;
	
	@FindBy(xpath = "//input[@id = 'input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath = "//input[@id = 'input-telephone']")
	WebElement txtTelephone;
	
	@FindBy(xpath = "//input[@id = 'input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@id = 'input-confirm']")
	WebElement txtConfirmPassword;
	
	@FindBy(xpath = "//input[@name = 'agree']")
	WebElement chkPolicy;
	
	@FindBy(xpath = "//input[@value ='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath = "//h1[normalize-space() ='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	@FindBy(xpath = "//div[text()='Warning: E-Mail Address is already registered!']")
	WebElement msgWarning;
	
	public void setFirstname (String fName)
	{
		txtFirstname.sendKeys(fName);
	}
	
	public void setLastname (String lName)
	{
		txtLastname.sendKeys(lName);
	}
	
	public void setEmail (String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void setTelephone (String telephone)
	{
		txtTelephone.sendKeys(telephone);
	}
	
	public void setPassword (String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void setCnfPassword (String password)
	{
		txtConfirmPassword.sendKeys(password);
	}
	
	public void setPrivacyPolicy ()
	{
		chkPolicy.click();
	}
	
	public void clickContinue ()
	{
		// Solution 1
		btnContinue.click();
		
		// Solution 2
		//btnContinue.submit();
		
		// Solution 3
		//Actions act = new Actions(driver);
		//act.moveToElement(btnContinue).click().perform();
		
		// Solution 4
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click();", btnContinue);
		
		// Solution 5
		//btnContinue.sendKeys(Keys.RETURN);	
	}
	
	public String getCnfMessage ()
	{
		try
		{
			return (msgConfirmation.getText());
		}
		catch (Exception e)
		{
			return(e.getMessage());
		}
	}
	
	public String getWarnMessage ()
	{
		try
		{
			return (msgWarning.getText());
		}
		catch (Exception e)
		{
			return(e.getMessage());
		}
	}
}
