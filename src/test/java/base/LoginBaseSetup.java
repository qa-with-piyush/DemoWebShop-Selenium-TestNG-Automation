package base;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegistrationPage;
import utilities.RandomDataUtils;


public class LoginBaseSetup extends EcommerceBase
{
	 public String firstname = RandomDataUtils.firstName();
	 public String lastname = RandomDataUtils.lastName();
	 public String email = RandomDataUtils.email();
	 public String password = RandomDataUtils.pass();
	 public String confirmPass = password;
	 
	 @BeforeMethod
		public void loginSetup()
		{
			
			// First Registeration before Login
			
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
			
		}
}
