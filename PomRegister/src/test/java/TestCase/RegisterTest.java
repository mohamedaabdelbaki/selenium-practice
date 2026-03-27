package TestCase;


import Pages.RegisterPage;
import org.testng.annotations.Test;

public class RegisterTest  extends BaseTest{

    @Test

    public void RegisterWithValidDAta()
    {
        RegisterPage register=new RegisterPage(driver);
        register.fillName("samy");
        register.fillEmailAddress("samy@yahoo.com");
        register.click();
    }



}
