package backUp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {

	public static AppiumDriver<MobileElement> driver = null;
	public static final String testDataExcelFileName = "";

	// @BeforeMethod(alwaysRun = true)

	// @BeforeMethod(alwaysRun = true)
	@BeforeClass
	protected static void launchApp() {
		androidCapabilities();
		// iOSCapabilities();

	}

	// Take Screen-shot when test case fails and add it to the screen-shot folder
	// @AfterMethod(alwaysRun = true)
	protected static void screenshotOnFailure(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println("Failed");
			System.out.println("taking Fail Screenshot...");
			utilities.Helper.captureFAIL_Screenshot(driver, result.getName());
		}
	}
	/*
	 * @BeforeSuite(alwaysRun = true)
	 * 
	 * @Parameters({ "platform" }) public void startDriver(String platformName) { if
	 * (platformName.equalsIgnoreCase("Android")) { androidCapabilities(); } else if
	 * (platformName.equalsIgnoreCase("iOS")) { iOSCapabilities(); } else {
	 * System.out.
	 * println("Something went worng in the platform name (Android,IOS) ! "); } }
	 */

	// @AfterClass
	// @AfterMethod(alwaysRun = true)
	// @AfterMethod(dependsOnMethods = "screenshotOnFailure", alwaysRun = true)
	// @AfterSuite

	// @AfterMethod(alwaysRun = true)
	@AfterClass
	public void CloseApp() {

		driver.quit();
	}

	private static void androidCapabilities() {
		String deviceName = "Galaxy J7 Prime"; // HUAWEI TAG-L21 , Galaxy A5 // Galaxy S8 , Galaxy J7 Prime
		String platformName = "Android";
		String platformVersion = "8.1.0"; // 5.1 , 7.0 , 9 , 8.1.0
		String appPackage = "com.youclick.wecare.debug"; // com.youclick.wecare.debug // com.android.calculator2
		String appActivity = "com.trudoc.signup.splash.SplashActivity"; // com.trudoc.signup.mobilelogin.MobileLoginActivity
																		// // com.android.calculator2.Calculator
		String appiumURL_Android = "http://0.0.0.0:4723/wd/hub";
		// String automationName = "UiAutomator2";
		// Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", deviceName);
		caps.setCapability("platformName", platformName);
		caps.setCapability("platformVersion", platformVersion);
		caps.setCapability("appPackage", appPackage);
		caps.setCapability("appActivity", appActivity);
		caps.setCapability("noReset", false);
		caps.setCapability("full-reset", true); // Don't install the app for each
		caps.setCapability("unicodeKeyboard", "true");

		// caps.setCapability("automationName", automationName);

		// caps.setCapability("full-reset", false); // Don't install the app for each
		// time script executed.

		// caps.setCapability("udid", "ENUL6303030010"); //Give Device ID of your mobile
		// caps.setCapability("browserName", "Chrome");

		// Set android appActivity desired capability. It is
		// File path = new File(System.getProperty("user.dir") + "/Apk/TruDoc.apk");
		// caps.setCapability("app", path.getAbsolutePath());

		// Instantiate Appium Driver
		try {
			driver = new AppiumDriver<MobileElement>(new URL(appiumURL_Android), caps);

		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
		// return driver;

	}

	private static void iOSCapabilities() {

		String deviceName = "iPhone";
		String platformName = "iOS";
		String platformVersion = "12.3.1";
		String appPackage = "com.mobiledoctors.YCWC";
		String bundleID = "com.mobiledoctors.YCWC";
		String appiumURL_iOS = "http://0.0.0.0:4723/wd/hub";

		// Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", deviceName);
		caps.setCapability("platformName", platformName);
		caps.setCapability("platformVersion", platformVersion);
		caps.setCapability("appPackage", appPackage);
		caps.setCapability("bundleId", bundleID);
		caps.setCapability("automationName", "XCUITest");
		caps.setCapability("udid", "93db06c3d6dc84dbdf80438b7460d1d9404e0ab4"); // 93db06c3d6dc84dbdf80438b7460d1d9404e0ab4
		caps.setCapability("noReset", false);
		caps.setCapability("full-reset", true); // Don't install the app for each time script executed.

		// Set android appActivity desired capability. It is

		// File path = new File(System.getProperty("user.dir") + "/Apk/TruDoc.apk");
		// caps.setCapability("app", path.getAbsolutePath());

		// Instantiate Appium Driver
		try {
			driver = new IOSDriver<MobileElement>(new URL(appiumURL_iOS), caps);

		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
		// return driver;
	}

}
