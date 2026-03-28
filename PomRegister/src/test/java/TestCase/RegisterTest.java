package TestCase;


import Pages.RegisterPage;
import org.testng.annotations.Test;

public class RegisterTest  extends BaseTest{

    @Test

    public void RegisterWithValidDAta()
    {
        RegisterPage register =new RegisterPage(driver);
        register.fillName("samy");
        register.fillEmailAddress("T"+register.randomSelection(100)+"@yahoo.com");
        register.signupClick();

        register.titleClick();
        register.setPassword("this is me");

        //day of birth
        register.dayRandomSelection();
        register.monthRandomSelection();
        register.yearRandomSelection();

        //check boxs
        register.Checkbox1();
        register.Checkbox2();
        //Address Information
        register.firstNamefiller("mo");
        register.secondNamefiller("h");
        register.companyFiller("WW3");
        register.addressFiller("st2");
        register.secondAddressFiller("st3");
        register.countrySelector();
        register.stateFiller("mk");
        register.cityFiller("arlg");
        register.zipcode("2323");
        register.numberFiller("012345678910");
        register.createAccountClick();




    }



}
