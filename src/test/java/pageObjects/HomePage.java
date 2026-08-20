package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{

    WebDriver driver;

    public HomePage(WebDriver driver) 
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath="//a[normalize-space()='Log out']")
    WebElement logout_link;


    public void clickLogout() 
    {
        logout_link.click();
    }
}