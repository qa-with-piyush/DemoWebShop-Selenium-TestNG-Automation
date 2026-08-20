package testCases;

import org.testng.annotations.Test;

import base.LoginBaseSetup;
import pageObjects.CheckoutPage;
import pageObjects.ProductPage;
import utilities.RandomDataUtils;

public class TC003_Product extends LoginBaseSetup
{
	
	String companyName = "Piyush QA";
	String city = "Indore";
	String zipcode = RandomDataUtils.zipCode();
	String phoneNumber = RandomDataUtils.phoneNo();
	String address1 = "Indore, Madhya Pradesh";
	
	@Test()
	public void TC003_product() throws InterruptedException
	{
		logger.info("========== TC003 STARTED ==========");
		
		String itemName = "Gift Card";
		
		ProductPage pp = new ProductPage(driver);
		pp.search(itemName);
		pp.searchButton();
		
		pp.clicklowestPricedProduct();
		
		pp.recipientName(firstname);
		pp.recipientEmail(email);
		pp.clickAddToCartButton();
		pp.clickShoppingCartlink();
		
		CheckoutPage cp = new CheckoutPage(driver);
		cp.selectTermsAndCondition();
		cp.clickCheckoutButton();
		cp.sendCompanyName(companyName);
		cp.countryDropdown();
		
		cp.cityName(city);
		cp.address(address1);
		cp.zipcode(zipcode);
		cp.phoneNumber(phoneNumber);
		cp.continueButton();
		cp.continuePaymentCOD();
		cp.continuePaymentInfo();
		cp.confirmOrder();
		cp.successfulOrder();

		logger.info("========== ORDER SUCCESSFUL ==========");
		logger.info(cp.getSuccessMessage());
		logger.info(cp.getOrderNumber());

		cp.clickContinue();

		logger.info("========== TC003 ENDED ==========");
		
	}
}
