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

    private final By titleLocator=By.xpath("//input[@id=\"id_gender1\"]");
    private final By passwordLocator=By.xpath("//input[@data-qa=\"password\"]");
    //Date of Birth Locator
    private  final By dayLocator=By.xpath("//select[@data-qa=\"days\"]");
    private final By monthLocator=By.xpath("//select[@data-qa=\"months\"]");
    private final By yearLocator=By.xpath("//select[@data-qa=\"years\"]");
    //Two check boxs
    private  final By firstCheckboxLocator=By.xpath("//input[@name=\"newsletter\"]");
    private  final By secondCheckboxLocator=By.xpath("//input[@id=\"optin\"]");
    //Address Information
    private final By firstNameLocator=By.xpath("//input[@data-qa=\"first_name\"]");
    private final By lastNameLocator=By.xpath("//input[@data-qa=\"last_name\"]");
    private final By companyLocator=By.xpath("//input[@data-qa=\"company\"]");
    private final By addressLocator=By.xpath("//input[@data-qa=\"address\"]");
    private final By secondAddressLocator=By.xpath("//input[@data-qa=\"address2\"]");
    private final By countryLocator=By.xpath("//select[@data-qa=\"country\"]");
    private final By stateLocator=By.xpath("//input[@data-qa=\"state\"]");
    private final By cityLocator=By.xpath("//input[@data-qa=\"city\"]");
    private final By zipCodeLocator=By.xpath("//input[@data-qa=\"zipcode\"]");
    private final By numberLocator=By.xpath("//input[@data-qa=\"mobile_number\"]");
    private final By createAcountBtnLocator=By.xpath("//button[@data-qa=\"create-account\"]");


    //methods
    public void fillName(String name)
    {
        fWrite(nameLocator,name);
    }

    public void fillEmailAddress(String email)
    {
        fWrite(emailAddressLocator,email);
    }

    public void signupClick()
    {
        fClick(signUpBtnLocator);
    }

    //methods Enter Account Information

    public void titleClick()
    {
        fClick(titleLocator);
    }

    public void setPassword(String password)
    {
        fWrite(passwordLocator,password);

    }
    public void dayRandomSelection()
    {
        menuSelection(dayLocator);
    }
    public void monthRandomSelection()
    {
        menuSelection(monthLocator);
    }

    public void yearRandomSelection()
    {
        menuSelection(yearLocator);
    }

    public void Checkbox1()
    {
        fClick(firstCheckboxLocator);
    }
    public  void Checkbox2()
    {
        fClick(secondCheckboxLocator);
    }

    public  void firstNamefiller(String firstName)
    {
        fWrite(firstNameLocator,firstName);
    }

    public  void secondNamefiller(String lastName)
    {
        fWrite(lastNameLocator,lastName);
    }

    public  void companyFiller(String company)
    {
        fWrite(companyLocator,company);
    }

    public  void addressFiller(String address)
    {
        fWrite(addressLocator,address);
    }

    public  void secondAddressFiller(String address)
    {
        fWrite(secondAddressLocator,address);
    }


    public void countrySelector()
    {
        menuSelection(countryLocator);
    }

    public void stateFiller(String state)
    {
        fWrite(stateLocator,state);
    }
    public void cityFiller(String city)
    {
        fWrite(cityLocator,city);
    }

    public void zipcode(String zipcode)
    {
        fWrite(zipCodeLocator,zipcode);
    }

    public void numberFiller(String number)
    {
        fWrite(numberLocator,number);
    }
    public void createAccountClick()
    {
        fClick(createAcountBtnLocator);
    }


}
