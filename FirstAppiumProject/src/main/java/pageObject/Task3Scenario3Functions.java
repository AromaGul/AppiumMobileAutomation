package pageObject;

import general.BaseTest;
import general.CommonAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.concurrent.TimeUnit;

public class Task3Scenario3Functions extends BaseTest {

    public static By progressBarVisibility = By.xpath("//android.widget.ProgressBar[@resource-id=\"android:id/progress\"]");
    private ExpectedConditions WebDriverWaits;

    public Task3Scenario3Functions() {
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
    public void clickOnProgressBarButton()
    {
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"waitingButtonTestCD\"]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void progressBarVisibility()
    {
        driver.findElement(By.xpath("//android.widget.ProgressBar[@resource-id=\"android:id/progress\"]")).isDisplayed();
    }

    public void waitForProgressBarVisibility()
    {
        CommonAssertions.logInfo("Checking visibility of progress bar and assert");
        ExpectedConditions.visibilityOfElementLocated(progressBarVisibility);
        WebElement web = driver.findElement(progressBarVisibility);
        if(web != null){
            boolean bar = true;
            CommonAssertions.logVerifyTrue("Bar is displayed ",bar);
        }
        else {
            boolean bar = false;
            CommonAssertions.logVerifyFalse("Bar is not displayed", bar);
        }
    }



}
