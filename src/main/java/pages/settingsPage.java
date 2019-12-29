package pages;

import org.openqa.selenium.support.FindBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class settingsPage extends PageBase {

	public settingsPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		// this.driver = driver;
	}

	//////////////// Elements ////////////////

	@FindBy(id = "view_notification")
	MobileElement notificationItem;

	@FindBy(id = "tv_sign_out")
	MobileElement signOutBTN;

	@FindBy(xpath = "//*[@resource-id='android:id/button1']")
	MobileElement okBTN;

	protected boolean settingsDisplayed() {
		boolean flag = false;
		waitForElement(notificationItem);
		if (isDisplayedElement(notificationItem) == true) {
			flag = true;
			printValueOf(" Pass , Settings Page is displayed properly");
		} else {
			flag = false;
			printValueOf(" Fail , Settings Page is NOT displayed");
		}
		return flag;
	}

	protected void signOut() {
		scrollDown(signOutBTN);
		waitForElement(signOutBTN);
		clickOn(signOutBTN);
		waitForElement(okBTN);
		clickOn(okBTN);
	}
}
