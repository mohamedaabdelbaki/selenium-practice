package Tests;

import Utilites.ExtendManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;
import java.sql.Driver;

public class BaseTest {

    protected WebDriver driver;
    // protected ChromeOptions options;
    protected SoftAssert soft = new SoftAssert();
    protected ExtentReports extent;
    protected ExtentTest test;

    @BeforeSuite
    public void startReport()
    {
        extent= ExtendManager.getInstance();

    }

    @BeforeMethod
    void setUp(Method method) throws InterruptedException {
        //options=new ChromeOptions();
        //options.addArguments("--incognito");

        driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://automationexercise.com/");
        //Verify that home page is visible successfully

        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");
        test= extent.createTest(method.getName());


    }

    @AfterMethod
    void endBrowser(ITestResult result) throws InterruptedException {


        if(result.getStatus()==ITestResult.SUCCESS)
        {
            test.pass("Testpass ");

        } else if (result.getStatus()==ITestResult.FAILURE) {
            test.fail( "TestFail");
            test.fail(result.getThrowable());
        }
        else
        {
            test.skip("Blocled ");
        }
          Thread.sleep(3000);
         driver.quit();

    }

    @AfterSuite
public  void  endReport()
    {
        extent.flush();
    }
}
