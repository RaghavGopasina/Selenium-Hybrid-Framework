package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass
{	
	@Test (priority = 1)
	public void Registration_Page() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		
		hp.clickMyAccount();
		hp.clickRegister();
		
		String regTitle = hp.getRegTitle();
		Assert.assertEquals(regTitle, "Register Account");
	}
	
	@Test (priority = 2, dependsOnMethods = {"Registration_Page"})
	public void verify_Account_Registration()
	{
		AccountRegistrationPage accReg = new AccountRegistrationPage(driver);
		
		accReg.setFirstname("Raghav");
		
		String account = randomAccount().toUpperCase();
		System.out.println(account);
		
		accReg.setLastname(account);
		
		accReg.setEmail(account+"@gmail.com");
		
		String number = randomNumber();
		System.out.println(number);
		
		accReg.setTelephone(number);
		
		String password = alphaNumeric();
		System.out.println(password);
		
		accReg.setPassword(password);
		accReg.setCnfPassword(password);
		
		accReg.setPrivacyPolicy();
		
		accReg.clickContinue();
		
		String cnfMessage = accReg.getCnfMessage();
		Assert.assertEquals(cnfMessage, "Your Account Has Been Created!");
		
//		String warningMessage = accReg.getWarnMessage();
//		Assert.assertEquals(warningMessage, "Warning: E-Mail Address is already registered!");
	}
}
