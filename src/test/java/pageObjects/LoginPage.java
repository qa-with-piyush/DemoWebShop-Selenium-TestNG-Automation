package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
			
	WebDriver driver;

	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[normalize-space()='Log in']")
	WebElement login_link;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement txt_Email;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement txt_pass;
	
	@FindBy(xpath="//input[@value='Log in']")
	WebElement login_btn;
	
	public void clickLoginLink()
	{
		login_link.click();
	}
	
	public void email(String email)
	{
		txt_Email.sendKeys(email);
	}
	
	public void password(String password)
	{
		txt_pass.sendKeys(password);
	}
	
	public void loginButton()
	{
		login_btn.click();
	}
}
	
	

