package pageObject;

import general.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;


public class Task2Scenario1Functions extends BaseTest {

    public AndroidTouchAction actions;

    public Task2Scenario1Functions() {
        super();
    }

    public void clickContinueButton() {
        driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
    }

    public void clickOkButton() {
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
    }

    public void clickWarpOption() {
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.mobeta.android.demodslv:id/activity_title\" and @text=\"Warp\"]")).click();
    }

    public void scrollAndSelectCountry() {
        //ScrollDown
        scrollDown();
        AndroidElement bahrain = (AndroidElement) driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.mobeta.android.demodslv:id/text\" and @text=\"Argentina\"]"));
        actions.tap(ElementOption.element(bahrain)).perform();
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

   public void dragDrop()
   {
       AndroidElement drag = (AndroidElement) driver.findElement(By.id("//android.widget.TextView[@resource-id=\"com.mobeta.android.demodslv:id/drag_handle\" and @text=\"Argentina\"]"));
       AndroidElement drop = (AndroidElement) driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.mobeta.android.demodslv:id/text\" and @text=\"Afghanistan\"]"));

       actions.longPress(ElementOption.element(drag))
               .waitAction().moveTo(ElementOption.element(drop))
               .release().perform();

   }


}
