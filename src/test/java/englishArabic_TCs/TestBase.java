package englishArabic_TCs;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import utilities.Helper;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import TestData.configInputData;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {

	public static AppiumDriver<MobileElement> driver = null;
	public static final String testDataExcelFileName = "";
	public static ExtentReports report ; 
	public static ExtentTest logger;
	
	

	@BeforeSuite
	public void setup () {
		
		ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(System.getProperty("user.dir") + "/src/test/java/TestData/Ios-Automation"+Helper.GetCurrentTime()+".html"));
		report=new ExtentReports();
		report.attachReporter(extent);
	}
	
	// @BeforeMethod(alwaysRun = true)
	@BeforeClass
	protected static void launchApp() {
		//androidCapabilities();
		iOSCapabilities();

	}

	// Take Screen-shot when test case fails and add it to the screen-shot folder
//	 @AfterMethod(alwaysRun = true)
//	protected static void screenshotOnFailure(ITestResult result) throws IOException {
//		if (result.getStatus() == ITestResult.FAILURE) {
//			//System.out.println("Failed");
//			//System.out.println("taking Fail Screenshot...");
//		//	Helper.captureFAIL_Screenshot(driver, result.getName());
//		//	logger.fail("FAILED " , MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
//			
//		}
//		else if (result.getStatus() == ITestResult.SUCCESS) {
//			//System.out.println("Failed");
//			//System.out.println("taking Fail Screenshot...");
//		//	Helper.captureFAIL_Screenshot(driver, result.getName());
//			//logger.pass("Success " , MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
//			
//		}
//	 report.flush();
//	}
	
//	  @AfterMethod
//	    public void getResult(ITestResult result) {
//	        if(result.getStatus() == ITestResult.FAILURE) {
//	            logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
//	            logger.fail(result.getThrowable());
//	        }
//	        else if(result.getStatus() == ITestResult.SUCCESS) {
//	        	logger.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED " , ExtentColor.GREEN));
//	        }
//	        else {
//	        	logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
//	        	logger.skip(result.getThrowable());
//	        }
//	        report.flush();  
//	        
//	    }
	
	

	  @AfterMethod
	    public void getResult(ITestResult result) {
	        if(result.getStatus() == ITestResult.FAILURE) {
	            logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
	            logger.fail(result.getThrowable());
	           
	        }
	        else if(result.getStatus() == ITestResult.SUCCESS) {
	        	logger.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED " , ExtentColor.GREEN));
	        }
	        else {
	        	logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
	        	logger.skip(result.getThrowable());
	        }
	        report.flush();  
	        
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
		String deviceName = "520321c9eca5644d"; // HUAWEI TAG-L21 , Galaxy A5 // Galaxy S8 , Galaxy J7 Prime
		String platformName = "Android";
		String platformVersion = "8.1.0"; // 5.1 , 7.0 , 9 , 8.1.0
		String appPackage = "com.mydoctor.axa.debug"; // com.youclick.wecare.debug // com.android.calculator2 //com.mydoctor.axa.debug
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


	
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", configInputData.DeviceName_iOS);
		caps.setCapability("platformName", configInputData.PlatformName_iOS);
		caps.setCapability("platformVersion", configInputData.PlatformVersion_iOS);
		caps.setCapability("bundleId", configInputData.BundleID_iOS);
		caps.setCapability("automationName", configInputData.AutomationName);
		caps.setCapability("udid", configInputData.Udid ); // 93db06c3d6dc84dbdf80438b7460d1d9404e0ab4
		caps.setCapability("noReset", false);
	//	caps.setCapability("full-reset", true); // Don't install the app for each time script executed.
        caps.setCapability("usePrebuiltWDA", true);
		caps.setCapability("unicodeKeyboard", true);
	//	caps.setCapability("resetKeyboard", true);
		
		
		
		try {
			driver = new IOSDriver<MobileElement>(new URL(configInputData.AppiumURL_iOS), caps);

		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
		// return driver;
	}

}
