package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage 
{

	WebDriver driver;

	public ProductPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='small-searchterms']")
	WebElement txt_search;
	
	@FindBy(xpath="//input[@value='Search']")
	WebElement search_btn;
	
	@FindBy(xpath="//div/span[@class='price actual-price']")
	List<WebElement> prices;
	
	@FindBy(xpath="//div//h2[@class='product-title']/a")
	List<WebElement> itemLinks;
	
	@FindBy(xpath="//input[@class='recipient-name']")
	WebElement recipientName_txt;
	
	@FindBy(xpath="//input[@class='recipient-email']")
	WebElement recipientEmail_txt;
	
	@FindBy(xpath="//input[@id='add-to-cart-button-1']")
	WebElement addtocart_btn;
	
	@FindBy(xpath="//span[normalize-space()='Shopping cart']")
	WebElement shoppingCartlink;
	
	public void search(String search)
	{
		txt_search.sendKeys(search);
	}
	
	public void searchButton()
	{
		search_btn.click();
	}
	
	public int getLowestPriceIndex()
	{
		double lowestprice = Double.MAX_VALUE;
		int lowestpriceindex = -1;
		
		for(int i=0;i<prices.size();i++)
		{
			String pricetext = prices.get(i).getText();
			double pricevalue = Double.parseDouble(pricetext);
			
			if(pricevalue<lowestprice)
			{
				lowestprice=pricevalue;
				lowestpriceindex = i;
			}
		}
		
		System.out.println("lowest price = " + lowestprice);
		System.out.println(("Lowest price index is = " +  lowestpriceindex));
		return lowestpriceindex;
	}
	
	public void clicklowestPricedProduct()
	{
		int lowestpriceindex= getLowestPriceIndex();
		itemLinks.get(lowestpriceindex).click();
	}
	
	public void recipientName(String recipientname)
	{
		recipientName_txt.sendKeys(recipientname);
	}
	
	public void recipientEmail(String recipientemail)
	{
		recipientEmail_txt.sendKeys(recipientemail);
	}
	
	public void clickAddToCartButton()
	{
		addtocart_btn.click();
	}
	
	public void clickShoppingCartlink()
	{
		shoppingCartlink.click();
	}
	
}
