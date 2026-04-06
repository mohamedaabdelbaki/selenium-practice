package stepDefs;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.loginpage;

public class LoginSteps {

    loginpage login =new loginpage(Hooks.driver);
    public  SoftAssert soft=new SoftAssert();


    @Given("user logedin")
    public void user_logedin() {
        login.logedin();

    }
    @When("user enter valid email,password,login")
    public void user_enter_valid_email_password_login() {
        login.information("tikyzude@mailinator.com","Pa$$w0rd!");

    }
    @Then("user should  see logout Btn")
    public void user_should_see_logout_btn() {

        soft.assertTrue(login.logoutBtn().isDisplayed());
        soft.assertAll();

    }


}
