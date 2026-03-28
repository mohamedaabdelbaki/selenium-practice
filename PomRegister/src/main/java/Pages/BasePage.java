package Pages;

import org.apache.commons.lang3.NumberRange;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class BasePage {
   protected WebDriver driver;
   protected Random random ;
   protected Select select;
   protected List<WebElement> options;

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

    public int randomSelection(int range)
    {
     random = new Random();
        int num= random.nextInt(range);
        return num;
    }

    public void menuSelection(By Locator)
    {


        select=new Select(driver.findElement(Locator));
        options=select.getOptions();
        int range=randomSelection(options.size());
        String Voption = options.get(range).getAttribute("value");
        select.selectByValue(Voption);

    }
}
