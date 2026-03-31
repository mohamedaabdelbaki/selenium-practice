package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage extends Basepage {


    public Homepage(WebDriver driver) {
        super(driver);
    }

    //locator

    private final By testCaseBtnLocator=By.xpath("//a[@href=\"/test_cases\"]//i");
    private final By testCaseTitleLocator=By.xpath("//h2[@class=\"title text-center\"]");

    public  void  clickOnTestCase()
    {
        Click(testCaseBtnLocator);
    }

    public String testCasePageTitle()
    {
        return getText(testCaseTitleLocator);

    }





}
