package testcase;

import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest{

    @Test
    public void t1()
    {
        LoginPage login=new LoginPage(driver);
        login.fillEmailAddress("xamuti@mailinator.com");
        login.fillPassword("Pa$$w0rd!");
        login.clickAction();

    }
}
