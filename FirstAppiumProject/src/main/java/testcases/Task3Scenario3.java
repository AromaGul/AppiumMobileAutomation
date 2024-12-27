package testcases;

import general.BaseTest;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.Task3Scenario2Functions;
import pageObject.Task3Scenario3Functions;

import java.net.MalformedURLException;

public class Task3Scenario3 {

    AppiumDriver driver;
    BaseTest baseTest;
    Task3Scenario3Functions task3Scenario3Functions;

    @BeforeTest
    public void setUp2() throws MalformedURLException {
        baseTest = new BaseTest();
        task3Scenario3Functions = new Task3Scenario3Functions();
        baseTest.setUp2();
    }
    @Test
    public void task3Scenario3() throws InterruptedException {

        task3Scenario3Functions.clickContinue();
        Thread.sleep(2000);
        task3Scenario3Functions.clickOk();
        Thread.sleep(2000);
        task3Scenario3Functions.clickOnProgressBarButton();
       // task3Scenario3Functions.progressBarVisibility();
        task3Scenario3Functions.waitForProgressBarVisibility();


    }
}
