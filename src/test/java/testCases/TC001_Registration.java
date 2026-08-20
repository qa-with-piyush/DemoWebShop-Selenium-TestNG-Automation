package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import base.EcommerceBase;
import pageObjects.RegistrationPage;

import utilities.RandomDataUtils;

public class TC001_Registration extends EcommerceBase
{

	
	
	public String firstname = RandomDataUtils.firstName();
	public String lastname = RandomDataUtils.lastName();
	public String email = RandomDataUtils.email();
	public String pass = RandomDataUtils.pass();
	public String confirmPass = pass;
	

	
	@Test
	void TC001_registration()
	{
		
		logger.info("*******TC001_Registration Started*******");

		RegistrationPage rp = new RegistrationPage(driver);
		
		rp.clickRegisterationLink();
		rp.clickMaleBtn();
		rp.firstName(firstname);
		rp.lastName(lastname);
		rp.email(email);
		rp.password(pass);
		rp.confirmPassword(confirmPass);
		rp.clickRegisterationButton();
		
		Assert.assertEquals(rp.registerationMessage(), true);
		rp.clickContinueButton();
		
		logger.info(firstname +" " + lastname + " " + email);
		
		logger.info("*******TC001_Registration Ended*******");

	}
	
	
	
	
}
