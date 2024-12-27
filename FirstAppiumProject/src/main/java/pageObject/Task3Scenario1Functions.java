package pageObject;

import general.BaseTest;
import general.CommonAssertions;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

public class Task3Scenario1Functions extends BaseTest {

    String nameOfCarToSelect = "Mercedes";
    String nameOfUser = "Aroma";


    public Task3Scenario1Functions() {
        super();
    }
    public void clickContinue()
    {
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/continue_button\"]")).click();
    }
    public void clickOk()
    {
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
    }
    public void clickDirectory()
    {
        driver.findElement(By.id("io.selendroid.testapp:id/startUserRegistration")).click();
    }
    public void registerForm() throws InterruptedException {

        driver.findElement(By.id("io.selendroid.testapp:id/inputUsername")).sendKeys("aroma");
        driver.findElement(By.id("io.selendroid.testapp:id/inputEmail")).sendKeys("aroma.gul@yahoo.com");
        driver.findElement(By.id("io.selendroid.testapp:id/inputPassword")).sendKeys("Aroma123@");
        driver.findElement(By.id("io.selendroid.testapp:id/inputName")).sendKeys("Aroma");
        driver.findElement(By.id("io.selendroid.testapp:id/input_preferedProgrammingLanguage")).click();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Python\"]")).click();
        driver.hideKeyboard();
        driver.findElement(By.id("io.selendroid.testapp:id/input_adds")).click();
        driver.findElement(By.id("io.selendroid.testapp:id/btnRegisterUser")).click();
        driver.findElement(By.id("io.selendroid.testapp:id/buttonRegisterUser")).click();
        //driver.navigate().back();

    }
    public void clickBrowser() {
        driver.findElement(By.id("io.selendroid.testapp:id/buttonStartWebview")).click();
    }
    public void fillCarForm() {

        driver.findElement(By.xpath("//android.widget.EditText")).sendKeys(nameOfUser);
        driver.findElement(By.xpath("//android.view.View[@text='Volvo']")).click();
        driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='" + nameOfCarToSelect + "']")).click();
        driver.findElement(By.xpath("//android.widget.Button[@text='Send me your name!']")).click();
    }
    public void assertingName(){
        String text = nameOfUser;
        text = '"' + nameOfUser + '"';
        By getNameOfUser = By.xpath("//android.widget.TextView[@text='"+ text +"']");
        WebElement web =  driver.findElement(getNameOfUser);
        String getName = web.getText();
        CommonAssertions.logVerifyStringNotEqual(getName,nameOfUser,"Asserting the name");
    }
    public void assertingCarName(){
        String text = nameOfCarToSelect.toLowerCase();
        text = '"' + nameOfCarToSelect.toLowerCase() + '"';
        By getNameOfCar = By.xpath("//android.widget.TextView[@text='"+ text +"']");
        WebElement web =  driver.findElement(getNameOfCar);
        String getCarName = web.getText();
        CommonAssertions.logVerifyStringNotEqual(getCarName,nameOfCarToSelect,"Asserting the car name");
    }
}
