package testcases;

import general.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidTouchAction;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.Task2Scenario1Functions;
import java.net.MalformedURLException;

public class Task2Scenario1 extends BaseTest{

    AppiumDriver driver;
   // public AndroidTouchAction actions;
    BaseTest baseTest;
    Task2Scenario1Functions task2Scenario1Functions;

@BeforeTest
public void setUp() throws MalformedURLException {
    baseTest = new BaseTest();
    task2Scenario1Functions = new Task2Scenario1Functions();
    baseTest.setUp();

}
@Test
    public void task2Scenario1() throws InterruptedException {
    task2Scenario1Functions.clickContinueButton();
    task2Scenario1Functions.clickOkButton();
    task2Scenario1Functions.clickWarpOption();
    Thread.sleep(5000);
    task2Scenario1Functions.scrollAndSelectCountry();
    Thread.sleep(5000);
    task2Scenario1Functions.dragDrop();


}




}