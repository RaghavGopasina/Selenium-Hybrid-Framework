package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass
{
	public WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		driver = new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	
	public String randomAccount()
	{
		String account = RandomStringUtils.randomAlphabetic(5);
		
		return account;
	}
	
	public String randomNumber()
	{
		String number = RandomStringUtils.randomNumeric(10);
		
		return number;
	}
	
	public String alphaNumeric()
	{
		String text = RandomStringUtils.randomNumeric(3);
		String num = RandomStringUtils.randomNumeric(3);
		
		String alphanum = text+num;
		return alphanum;
	}
}
