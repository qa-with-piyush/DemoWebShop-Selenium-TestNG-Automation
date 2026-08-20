package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CheckoutPage
{
	WebDriver driver;
	WebDriverWait wait;

	public CheckoutPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@FindBy(xpath="//input[@id='termsofservice']")
	WebElement termsAndCondition;

	@FindBy(xpath="//button[@id='checkout']")
	WebElement checkout_btn;

	@FindBy(xpath="//input[@id='BillingNewAddress_Company']")
	WebElement companyname_txt;

	@FindBy(xpath="//select[@id='BillingNewAddress_CountryId']")
	WebElement country_dropdown;

	@FindBy(xpath="//option[@value='41']")
	WebElement india;

	@FindBy(xpath="//input[@id='BillingNewAddress_City']")
	WebElement city_txt;

	@FindBy(xpath="//input[@id='BillingNewAddress_Address1']")
	WebElement address1_txt;

	@FindBy(xpath="//input[@id='BillingNewAddress_ZipPostalCode']")
	WebElement zipCode_txt;

	@FindBy(xpath="//input[@id='BillingNewAddress_PhoneNumber']")
	WebElement phoneNo_Txt;

	@FindBy(xpath="//input[@title='Continue']")
	WebElement continue_btn;

	@FindBy(xpath="//input[@class='button-1 payment-method-next-step-button']")
	WebElement continue_COD_Payment;

	@FindBy(xpath="//input[@class='button-1 payment-info-next-step-button']")
	WebElement continuePaymentInfo;

	@FindBy(xpath="//div[@class='order-review-data']")
	WebElement confirmOrderDetails;

	@FindBy(xpath="//input[@value='Confirm']")
	WebElement finalContinue;

	@FindBy(xpath="//strong[normalize-space()='Your order has been successfully processed!']")
	WebElement yourOrderLine;

	@FindBy(xpath="//li[contains(normalize-space(),'Order number:')]")
	WebElement ordernumber;

	@FindBy(xpath="//input[@value='Continue']")
	WebElement closingContinue_btn;

	public void selectTermsAndCondition()
	{
		termsAndCondition.click();
	}

	public void clickCheckoutButton()
	{
		checkout_btn.click();
	}

	public void sendCompanyName(String companyName)
	{
		companyname_txt.sendKeys(companyName);
	}

	public void countryDropdown()
	{
		country_dropdown.click();
		india.click();
	}

	public void cityName(String city)
	{
		city_txt.sendKeys(city);
	}

	public void address(String address1)
	{
		address1_txt.sendKeys(address1);
	}

	public void zipcode(String zip)
	{
		zipCode_txt.sendKeys(zip);
	}

	public void phoneNumber(String phoneno)
	{
		phoneNo_Txt.sendKeys(phoneno);
	}

	public void continueButton()
	{
		wait.until(ExpectedConditions.elementToBeClickable(continue_btn)).click();
	}

	public void continuePaymentCOD()
	{
		wait.until(ExpectedConditions.elementToBeClickable(continue_COD_Payment)).click();
	}

	public void continuePaymentInfo()
	{
		wait.until(ExpectedConditions.elementToBeClickable(continuePaymentInfo)).click();
	}

	public void confirmOrder()
	{
		String confirmOrder = wait.until(
				ExpectedConditions.visibilityOf(confirmOrderDetails)
				).getText();

		System.out.println("========== ORDER CONFIRMATION ==========");
		System.out.println(confirmOrder);
		System.out.println("========================================");

		wait.until(ExpectedConditions.elementToBeClickable(finalContinue)).click();
	}

	public void successfulOrder()
	{
	    wait.until(ExpectedConditions.visibilityOf(yourOrderLine));
	    wait.until(ExpectedConditions.visibilityOf(ordernumber));
	}
	
	public void clickContinue()
	{
	    wait.until(
	        ExpectedConditions.elementToBeClickable(closingContinue_btn)
	    ).click();
	}
	public String getSuccessMessage()
	{
	    return wait.until(
	            ExpectedConditions.visibilityOf(yourOrderLine)
	            ).getText();
	}

	public String getOrderNumber()
	{
	    return wait.until(
	            ExpectedConditions.visibilityOf(ordernumber)
	            ).getText();
	}
}