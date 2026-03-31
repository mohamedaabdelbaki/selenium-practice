package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.element.Element;
import java.time.Duration;

public class Basepage {

    protected WebDriver driver;
    protected WebDriverWait wait;


    public Basepage(WebDriver driver) {
        this.driver = driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(30));

    }

    public void Click(By Locator)
    {


        wait.until(ExpectedConditions.elementToBeClickable(Locator));
        driver.findElement(Locator).click();
    }

    public void Write(By Locator ,String input)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
        driver.findElement(Locator).sendKeys(input);
    }

    public String getText(By locator)
    {
        WebElement element=driver.findElement(locator);
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.getText();


    }
    public  void hover(By locator)
    {
        WebElement element= driver.findElement(locator);
        Actions actions=new Actions(driver);
        actions.click(element).perform();

    }





}
