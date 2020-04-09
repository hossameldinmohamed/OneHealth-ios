package pages;

import org.openqa.selenium.Point;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class sideMenu extends PageBase {

	myProfileEditPage myProfileEditPageObj;
	LoginPage loginPageEN_AR_Obj;
	settingsPage settingsPageObj;

	// Objects initialization
	@BeforeMethod
	public void initializeObjects() {
		// myProfileEditPageObj = new myProfileEditPage(driver);
		loginPageEN_AR_Obj = new LoginPage(driver);
		settingsPageObj = new settingsPage(driver);
	}

	public sideMenu(AppiumDriver<MobileElement> driver) {
		super(driver);
		// this.driver = driver;
	}
	//////////////// Elements ////////////////

	@FindBy(id = "action_more")
	MobileElement sideMenu;
//
//	@FindBy(id = "tv_user_name")
//	MobileElement guestLabel;
//
//	@FindBy(xpath = "//*[@resource-id='com.mydoctor.axa.debug:id/view_settings']")
//	MobileElement setting;
//
//	@FindBy(xpath = "//*[@resource-id='com.mydoctor.axa.debug:id/viewpager'/*[1]")
//	MobileElement scrollView;
//
//	@FindBy(xpath = "//*[@resource-id='com.mydoctor.axa.debug:id/view_user_name]")
//	MobileElement UserNameContainer;
//
//	@FindBy(xpath = "//*[@resource-id='com.mydoctor.axa.debug:id/trudoctoolbar']/*[1]")
//	MobileElement editProfileBTN;
//
//	@FindBy(xpath = "//*[@class='android.widget.ScrollView']/*[1]//*[@resource-id='com.mydoctor.axa.debug:id/edt_first_name']")
//	MobileElement firstName;

	@FindBy(id = "ReadingsMoretitleLabel")
	MobileElement readings;
	
	@FindBy(id = "SettingsMoretitleLabel")
	MobileElement settings;
	

	@FindBy(id = "view_reminders")
	MobileElement reminders;

	@FindBy(id = "view_appointments")
	MobileElement appointments;

	@FindBy(id = "view_digests")
	MobileElement digest;

	@FindBy(id = "view_messages")
	MobileElement messages;

	@FindBy(id = "view_providers")
	MobileElement providers;

	@FindBy(id = "view_about_us")
	MobileElement about;

	@FindBy(id = "view_feedback")
	MobileElement feedback;

	@FindBy(id = "view_rate_app")
	MobileElement rate;
	//////////////// Calling Methods ////////////////

	////////////////////////////////////////////////

//	public void clickOnEditProfile() {
//		// waitForElement(editProfileBTN);
//		try {
//			// Actions action = new Actions(driver);
//			// action.click(getElementOf(editProfileBTN)).build().perform();
//			Thread.sleep(2000);
//			TouchAction action = new TouchAction(driver);
//			action.press(PointOption.point(1000, 155)).release().perform();
//			// driver.switchTo().activeElement();
//			// clickOn(editProfileBTN);
//		} catch (Exception e) {
//			printValueOf("exeption: " + e);
//		}
//
//	}
//
//	public boolean LogoutFromApp(String language) {
//		settingsPageObj = new settingsPage(driver);
//		loginPageEN_AR_Obj = new LoginPageEN_AR(driver);
//		// Logout from the application
//
//		waitForElement(sideMenu);
//		clickOn(sideMenu);
//		waitForElement(guestLabel);
//		scrollDown(setting);
//		waitForElement(setting);
//		clickOn(setting);
//
//		waitForElement(settingsPageObj.notificationItem);
//		try {
//			if (settingsPageObj.settingsDisplayed() == true) {
//				settingsPageObj.signOut();
//				printValueOf(" Pass, App logged out properly");
//			} else {
//				printValueOf(" Fail , Something went wrong while Logging out from settings");
//
//			}
//		} catch (Exception e) {
//			printValueOf(" Fail Exception , Something went wrong while Logging out from settings with Expection: " + e);
//		}
//		boolean result = loginPageEN_AR_Obj.ContentDisplayedProperly(language);
//
//		return result;
//
//	}
//
//	public void editMyProfileWith(String FirstName, String LastName, String Gender, String BirthDate)
//			throws InterruptedException {
//		myProfileEditPageObj = new myProfileEditPage(driver);
//
//		printValueOf("Edit My PROFILE");
//		clickOn(sideMenu);
//		waitForElement(UserNameContainer);
//		clickOn(UserNameContainer);
//		clickOnEditProfile();
//		focusAndClickOn(firstName);
//		// clickOn(firstName);
//
//		myProfileEditPageObj.EditProfileDataWith(FirstName, LastName, Gender, BirthDate);
//	}

	public void clickOnReadings() {
//		waitForElement(sideMenu);
//		clickOn(readings);
		waitUntilElementClickableAndClick(readings);
		  
	}
	
	
	
	public void clickonsettings(){
		waitUntilElementClickableAndClick(settings);
		
	}

	public void clickOnReminders() {
		waitForElement(sideMenu);
		clickOn(reminders);
	}

	public void clickOnAppointments() {
		waitForElement(sideMenu);
		clickOn(appointments);
	}

	public void clickOnDigest() {
		waitForElement(sideMenu);
		clickOn(digest);
	}

	public void clickOnMessages() {
		waitForElement(sideMenu);
		clickOn(messages);
	}

	public void clickOnProviders() {
		waitForElement(sideMenu);
		clickOn(providers);
	}

	public void clickOnAboutUS() {
		waitForElement(sideMenu);
		scrollDown(about);
		clickOn(about);
	}

	public void clickOnFeedback() {
		waitForElement(sideMenu);
		scrollDown(feedback);
		clickOn(feedback);
	}

	public void clickOnRate() {
		waitForElement(sideMenu);
		scrollDown(rate);
		clickOn(rate);
	}
	//////////////// Actions ////////////////

	private void focusAndClickOn(MobileElement element) {
		// action.press(PointOption.point(1000, 155)).release().perform();
		TouchAction action = new TouchAction(driver);

		Point point = element.getLocation();
		int elementCenterX = point.getX() + 80;
		int elementCenterY = point.getY() + 100;
		System.out.println("value of x = " + elementCenterX + "   value of y = " + elementCenterY);
		action.press(PointOption.point(elementCenterX, elementCenterY)).release().perform();

	}

//	protected void scrollDown(MobileElement element) {
//
//		try {
//			waitForElement(UserNameContainer);
//
//			TouchAction action = new TouchAction(driver);
//			action.press(PointOption.point(0, 1500)).waitAction().moveTo(PointOption.point(0, 500)).release().perform();
//
//			/*
//			 * driver.findElement(MobileBy.
//			 * AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)" +
//			 * ".instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + "Settings" +
//			 * "\").instance(0))"));
//			 */
//			waitForElement(element);
//
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//
//	}

}
