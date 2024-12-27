package testcases;

import general.BaseTest;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.Task3Scenario1Functions;
import pageObject.Task3Scenario2Functions;

import java.net.MalformedURLException;

public class Task3Scenario2 extends BaseTest {

   // AppiumDriver driver;
    BaseTest baseTest;
    Task3Scenario2Functions task3Scenario2Functions;

    @BeforeTest
    public void setUp2() throws MalformedURLException {
        baseTest = new BaseTest();
        task3Scenario2Functions = new Task3Scenario2Functions();
        baseTest.setUp2();
    }
    @Test
    public void task3Scenario2() throws InterruptedException {

        task3Scenario2Functions.clickContinue();
        Thread.sleep(2000);
        task3Scenario2Functions.clickOk();
        Thread.sleep(2000);
        task3Scenario2Functions.clickBrowser();
        Thread.sleep(2000);
        task3Scenario2Functions.clickLongContentPage();
        task3Scenario2Functions.scrollToMiddleScreen();
        Thread.sleep(2000);
        task3Scenario2Functions.clickMiddleScreen();
        Thread.sleep(2000);
        task3Scenario2Functions.clickFormPage();
        Thread.sleep(2000);
        task3Scenario2Functions.formPage();
        Thread.sleep(2000);
        task3Scenario2Functions.verifyFormSubmission();
    }
}