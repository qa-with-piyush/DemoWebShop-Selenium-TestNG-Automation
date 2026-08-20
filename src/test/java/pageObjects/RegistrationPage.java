package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage 
{

	WebDriver driver;
	WebDriverWait wait;
	
	public RegistrationPage(WebDriver driver)
	{
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	// Locators
	
	@FindBy(xpath="//a[normalize-space()='Register']") 
	WebElement registeration_link;
	
	@FindBy(xpath="//input[@id='gender-male']") 
	WebElement male_btn;
	
	@FindBy(xpath="//input[@id='gender-female']") 
	WebElement female_btn;
	
	@FindBy(xpath="//input[@id='FirstName']") 
	WebElement txt_firstname;
	
	@FindBy(xpath="//input[@id='LastName']") 
	WebElement txt_lastname;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement txt_email;
	
	@FindBy(xpath="//input[@id='Password']") 
	WebElement txt_password;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']") 
	WebElement txt_confirmpassword;
	
	@FindBy(xpath="//input[@id='register-button']")
	WebElement registeration_btn;
	
	@FindBy(xpath="//div/input[@value='Continue']") 
	WebElement continue_btn;
	
	@FindBy(xpath="//div[@class='result']")
	WebElement registerationSuccessfullMessage;
	
	public void clickRegisterationLink()
	{
		registeration_link.click();
	}
	
	public void clickMaleBtn()
	{
		male_btn.click();
	}
	
	public void clickFemaleBtn()
	{
		female_btn.click();
	}
	
	public void firstName(String fn)
	{
		txt_firstname.sendKeys(fn);
	}
	
	public void lastName(String ln)
	{
		txt_lastname.sendKeys(ln);
	}
	
	public void email(String email)
	{
		txt_email.sendKeys(email);
	}
	
	public void password(String pwd)
	{
		txt_password.sendKeys(pwd);
	}
	
	public void confirmPassword(String cpwd)
	{
		txt_confirmpassword.sendKeys(cpwd);
	}
	
	public void clickRegisterationButton()
	{
		registeration_btn.click();
	}
	
	public boolean registerationMessage()
	{
	    return wait.until(
	        ExpectedConditions.visibilityOf(registerationSuccessfullMessage)
	    ).isDisplayed();
	}
	
	public void clickContinueButton()
	{
		continue_btn.click();
	}
}
