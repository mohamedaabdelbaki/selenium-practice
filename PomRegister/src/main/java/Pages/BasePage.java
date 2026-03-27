package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
   protected WebDriver driver;

    public BasePage(WebDriver driver) {

        this.driver=driver;
    }


    public  void fWrite(By locator ,String value)
    {
        driver.findElement(locator).sendKeys(value);
    }

    public void fClick(By locator)
    {
        driver.findElement(locator).click();
    }
}
