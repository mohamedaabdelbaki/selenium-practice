package Tests;

import Pages.Homepage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomeTest extends BaseTest{
protected  Homepage home;
;

    @Test

    public void VerifyTestCasesPage ()
    {

       home=new Homepage(driver);

       // Click on 'Test Cases' button
        home.clickOnTestCase();
        // Verify user is navigated to test cases page successfully
        soft.assertEquals(home.testCasePageTitle().toLowerCase(),"test cases");

        soft.assertAll();

    };

}
