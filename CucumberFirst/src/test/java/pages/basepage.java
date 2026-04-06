package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.file.WatchEvent;
import java.time.Duration;

public class basepage {

    public WebDriver driver;

    public WebDriverWait wait;

    public  basepage(WebDriver driver)
    {
        this.driver=driver;
        wait =new WebDriverWait(driver,Duration.ofSeconds(20));

    }

    public  void mClick(By locator)
    {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        WebElement element=driver.findElement(locator);
        element.click();

    }

    public void Write(By Locator ,String input)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
        driver.findElement(Locator).sendKeys(input);
    }



}
