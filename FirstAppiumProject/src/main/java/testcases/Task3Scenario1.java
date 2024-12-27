package testcases;

import general.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidTouchAction;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.Task2Scenario1Functions;
import pageObject.Task3Scenario1Functions;

import java.net.MalformedURLException;

public class Task3Scenario1 extends BaseTest {

    AppiumDriver driver;
    BaseTest baseTest;
    Task3Scenario1Functions task3Scenario1Functions;

    @BeforeTest
    public void setUp2() throws MalformedURLException {
        baseTest = new BaseTest();
        task3Scenario1Functions = new Task3Scenario1Functions();
        baseTest.setUp2();
    }
    @Test
    public void task3Scenario1() throws InterruptedException {

        task3Scenario1Functions.clickContinue();
        Thread.sleep(2000);
        task3Scenario1Functions.clickOk();
        task3Scenario1Functions.clickDirectory();
        Thread.sleep(2000);
        task3Scenario1Functions.registerForm();
        Thread.sleep(3000);
        task3Scenario1Functions.clickBrowser();
        Thread.sleep(2000);
        task3Scenario1Functions.fillCarForm();
        Thread.sleep(2000);
        task3Scenario1Functions.assertingName();
        task3Scenario1Functions.assertingCarName();
    }

    }
