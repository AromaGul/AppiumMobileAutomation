# AppiumMobileAutomation
Appium Test Automation Framework
Introduction: Appium is a popular open-source mobile test automation framework that allows developers and testers to automate testing of native, hybrid, and mobile web applications on iOS and Android platforms. This is the step-by-step guide of the process of creating an Appium test automation framework from scratch.

Pre-requisites :
Java Development Kit (JDK) installed on your machine.
Android SDK installed on your machine.
Appium installed globally on your machine. Install it using npm (Node Package Manager) with the command: npm install -g appium.
Download and install IntelliJ IDEA

Step 1: Set Up a New Java Project
Launch IntelliJ IDEA and create a new Java project.
Configure the project with the necessary build tools (e.g. Maven).

Step 2: Add Dependencies
Open the project’s pom.xml file (for Maven)
Add the Appium Java client dependency to your project’s dependencies section. For Maven, add the following:
< dependency>
< groupId>io.appium< /groupId>
< artifactId>java-client< /artifactId>
< version>7.5.1< /version>
< /dependency>
Save the changes and let the IDE resolve and download the dependency.

Step 3: Set Up Appium Desired Capabilities
Create a new Java class (e.g., AppiumTestBase.java) to set up the Appium desired capabilities.

Import the necessary Appium Java client classes:
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

Set up the desired capabilities for the target device and application:

public class AppiumTestBase {
protected static AppiumDriver driver;

 public static void setup() throws MalformedURLException {  
     DesiredCapabilities capabilities = new DesiredCapabilities();  
     capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");  
     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "device_name");  
     capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "app_package");  
     capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "app_activity");  

     // Set other desired capabilities like automationName, appium version, etc.  

     // Initialize the Appium driver with the desired capabilities for Android  
     driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);  
 }  

 public static void tearDown() {  
     // Quit the Appium driver  
     if (driver != null) {  
         driver.quit();  
     }  
 }      }
Note: Appium driver is being intitialized here for Android App. Similar way we can do with iOSDriver class. Update the device_name, app_package, and app_activity values with your specific device details and application information.

Step 4: Create Test Cases
Create new Java classes for your test cases.
Import the necessary Appium Java client classes:

import io.appium.java_client.MobileElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

3.Extend the test classes with the AppiumTestBase class:

public class MyTest extends AppiumTestBase {  
    @BeforeMethod  
    public void setUp() throws MalformedURLException {  
        setup();  
    }  
  
    @AfterMethod  
    public void tearDown() {  
        tearDown();  
    }  
  
    @Test  
    public void myTest() {  
        // Write your test steps using Appium APIs  
        MobileElement element = driver.findElementById("element_id");  
        element.click();  
        // Perform assertions, interactions, and validations as required  
    }  
}
Customize test cases with the necessary test logic, assertions, and validations.

Step 5: Run the Test Cases
Open a terminal or command prompt.
Navigate to your project directory.
Execute the command mvn test (for Maven) to run the test cases.
