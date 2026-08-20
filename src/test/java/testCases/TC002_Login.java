package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.EcommerceBase;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegistrationPage;
import utilities.RandomDataUtils;


public class TC002_Login extends EcommerceBase
{
	
	 String firstname = RandomDataUtils.firstName();
	 String lastname = RandomDataUtils.lastName();
	 String email = RandomDataUtils.email();
	 String password = RandomDataUtils.pass();
	 String confirmPass = password;
	
	
	@Test
	void TC002_login()
	{
		
		logger.info("********TC002_Login Started*************");

		// First registeration before Login
		logger.info("==========First need to register before Login==========");

		RegistrationPage rp = new RegistrationPage(driver);
		rp.clickRegisterationLink();
		rp.clickMaleBtn();
		rp.firstName(firstname);
		rp.lastName(lastname);
		rp.email(email);
		rp.password(password);
		rp.confirmPassword(confirmPass);
		rp.clickRegisterationButton();
		
		Assert.assertEquals(rp.registerationMessage(), true);
		rp.clickContinueButton();
		
		// now Logout to login again 
		
		HomePage hp = new HomePage(driver);
		hp.clickLogout();
		
		// Now Start Login
		
		LoginPage lp = new LoginPage(driver);
		lp.clickLoginLink();
		lp.email(email);
		lp.password(password);
		lp.loginButton();
		
		logger.info("Login attempted with: " + email);
		logger.info("********TC002_Login Ended*************");
	}
	
	
	
}
