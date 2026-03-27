package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage{

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    //locator
    private final By nameLocator = By.xpath("//input[@data-qa=\"signup-name\"]");
    private final By emailAddressLocator =By.xpath("//input[@data-qa=\"signup-email\"]");
    private final By signUpBtnLocator =By.xpath("//button[@data-qa=\"signup-button\"]");


    //methods
    public void fillName(String name)
    {
        fWrite(nameLocator,name);
    }

    public void fillEmailAddress(String email)
    {
        fWrite(emailAddressLocator,email);
    }

    public void click()
    {
        fClick(signUpBtnLocator);
    }
}
