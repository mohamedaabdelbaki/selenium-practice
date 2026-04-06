package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage extends basepage {

    public loginpage(WebDriver driver) {
        super(driver);
    }

    //locator

    private final By loginPageLocator=By.xpath("//a[@href=\"/login\"]");
    private final By emailLocator=By.xpath("//input[@id=\"Email\"]");
    private final By passwordLocator=By.xpath("//input[@id=\"Password\"]");
    private final By checkBoxLocator=By.xpath("//input[@id=\"RememberMe\"]");
    private final By loginBtnLocator=By.xpath("//input[@class=\"button-1 login-button\"]");
    private final By logoutLocator=By.xpath("//a[@href=\"/logout\"]");


    public  void logedin()
    {
      mClick(loginPageLocator);

    }

    public  void information(String email,String pass)
    {
        Write(emailLocator,email);
        Write(passwordLocator,pass);
        mClick(checkBoxLocator);
        mClick(loginBtnLocator);

    }

    public WebElement logoutBtn()
    {
        return driver.findElement(logoutLocator);
    }




}
