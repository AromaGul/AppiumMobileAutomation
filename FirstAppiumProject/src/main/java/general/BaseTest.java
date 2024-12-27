package general;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class BaseTest {

    public static AppiumDriver driver;
    static ArrayList<String> expectedResults = new ArrayList<>();
    static ArrayList<String> automationSteps = new ArrayList<>();

  //  @BeforeTest
    public void setUp() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "Android Emulator");
        caps.setCapability("platformVersion", "14.0");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("app",System.getProperty("user.dir")+"/apps/appiumdemoapp.apk");
        caps.setCapability("appPackage", "com.mobeta.android.demodslv");
        caps.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher");
        caps.setCapability("noReset", false);
        caps.setCapability("fullReset", false);
        caps.setCapability("autoGrantPermissions", true);
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);

    }

    public void setUp2() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "Android Emulator");
        caps.setCapability("platformVersion", "14.0");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("app",System.getProperty("user.dir")+"/apps/selendroid-test-app.apk");
        caps.setCapability("appPackage", "io.selendroid.testapp");
        caps.setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");
        caps.setCapability("fullReset", false);
        caps.setCapability("autoGrantPermissions", true);
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
    }

//    @AfterTest
//    public void tearDown() throws Exception {
//        if (null != driver) {
//            driver.quit();
//        }
    }

