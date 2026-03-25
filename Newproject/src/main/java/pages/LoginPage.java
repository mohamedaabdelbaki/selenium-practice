package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //Locator

    private final By emailAddressLocator = By.xpath("//input[@data-qa=\"login-email\"]");
    private final By passwordLocator = By.xpath("//input[@data-qa=\"login-password\"]");
    private final By loginBtnLocator = By.xpath("//button[@data-qa=\"login-button\"]");

    //methods

    public void fillEmailAddress(String email) {
        driver.findElement(emailAddressLocator).sendKeys(email);
    }

    public void fillPassword(String password) {
        driver.findElement(passwordLocator).sendKeys(password);
    }

    public void clickAction()
    {
        driver.findElement(loginBtnLocator).click();
    }


}
