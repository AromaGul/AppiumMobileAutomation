package pageObject;

import general.BaseTest;
import general.CommonAssertions;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Task3Scenario2Functions extends BaseTest {

    public AndroidTouchAction actions;

    public Task3Scenario2Functions() {
        super();
    }
    public void clickContinue()
    {
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/continue_button\"]")).click();
    }
    public void clickOk()
    {
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void clickBrowser() {
        driver.findElement(By.id("io.selendroid.testapp:id/buttonStartWebview")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void clickLongContentPage()
    {
        driver.findElement(By.id("io.selendroid.testapp:id/tableRowButtons")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"Long Content Page\"]")).click();
    }
    public void scrollToMiddleScreen() {
        //ScrollDown
        scrollDown();
        AndroidElement middle = (AndroidElement) driver.findElement(By.xpath("//android.widget.TextView[@text=\"Middle of the screen \"]"));
        actions = new AndroidTouchAction(driver);
        actions.tap(ElementOption.element(middle)).perform();
    }
    public void clickMiddleScreen() {
        driver.findElement(By.xpath("//android.widget.TextView[@text=\"Middle of the screen \"]")).click();
        }
    public void clickFormPage()
    {
        driver.findElement(By.id("io.selendroid.testapp:id/tableRowButtons")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"formPage\"]")).click();
    }
    private void scrollDown() {
        Dimension dimension = driver.manage().window().getSize();
        int scrollStart = (int) (dimension.getHeight()*0.8);
        int scrollEnd = (int) (dimension.getHeight()*0.2);
        this.actions = new AndroidTouchAction(driver)
                .press(PointOption.point(0, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(PointOption.point(0, scrollEnd)).release().perform();
    }
    public void formPage()
    {
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"email\"]")).sendKeys("abc@yahoo.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id=\"checky\"]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("(//android.view.View[@text=\"One\"])[1]")).click();
        driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Two\"]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//android.view.View[@resource-id=\"multi\"]")).click();
        driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Ham\"]")).click();
        driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Eggs\"]")).click();
        driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Sausages\"]")).click();
        driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Onion gravy\"]")).click();
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]\n")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("(//android.view.View[@text=\"0 selected\"])[1]")).click();
        driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"select_1\"]")).click();
        driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"select_2\"]")).click();
        driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"select_3\"]")).click();
        driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"select_4\"]")).click();
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("(//android.view.View[@text=\"0 selected\"])[2]")).click();
        driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"select_1\"]")).click();
        driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"select_2\"]")).click();
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//        driver.findElement(By.xpath("(//android.view.View[@text=\"0 selected\"])[3]")).click();
//        driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"select_1\"]")).click();
//        driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"select_2\"]")).click();
//        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("(//android.view.View[@text=\"One\"])[2]")).click();
        driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Four\"]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        driver.findElement(By.xpath("(//android.view.View[@text=\"One\"])[3]")).click();
//        driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Two\"]")).click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        driver.findElement(By.xpath("//android.webkit.WebView[@text=\"We Leave From Here\"]/android.view.View[3]/android.view.View[10]")).click();
//        driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"nothing\"]")).click();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id=\"cheese\"]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"working\"]/android.widget.TextView")).sendKeys("text1");
        //driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"inputWithText\"]")).sendKeys("text2");
        //driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"inputWithText\"]")).sendKeys("text3");
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"withText\"]")).sendKeys("text4");
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"inputWithText\"]")).sendKeys("text5");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("(//android.widget.EditText[@text=\"name\"])[1]")).sendKeys("Aroma");
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"id-name1\"]")).sendKeys("ID-1");
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"id-name2\"]")).sendKeys("ID-2");
        //driver.findElement(By.xpath("(//android.widget.EditText[@text=\"name\"])[2]")).clear();
        driver.findElement(By.xpath("(//android.widget.EditText[@text=\"name\"])[2]")).sendKeys("Gul");

        // driver.findElement(By.xpath("/android.webkit.WebView[@text=\"We Leave From Here\"]/android.view.View[6]/android.widget.EditText[5]")).sendKeys("Yes");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//android.widget.Button[@text=\"Submit\"]")).click();


    }

    public void verifyFormSubmission()
    {
        CommonAssertions.logActualResult("");
        String text = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"greeting\"]")).getText();
        Assert.assertEquals(text,"Success!");
        CommonAssertions.logExpectedResult("Form submitted successfully");
    }
}
