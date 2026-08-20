package base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class EcommerceBase {

    public WebDriver driver;
    public Logger logger;

    @BeforeClass
    public void setup() {

        logger = LogManager.getLogger("EcommerceWebShop");

        driver = new EdgeDriver();

        driver.get("https://demowebshop.tricentis.com/");

        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}