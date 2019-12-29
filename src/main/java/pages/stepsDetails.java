package pages;

import org.openqa.selenium.support.FindBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class stepsDetails extends PageBase {

	public stepsDetails(AppiumDriver<MobileElement> driver) {
		super(driver);
		// this.driver = driver;
	}
	//////////////// Elements ////////////////

	@FindBy(xpath = "//*[@resource-id='com.youclick.wecare.debug:id/rv_reading_history']/*[1]//*[@resource-id='com.youclick.wecare.debug:id/tv_value")
	MobileElement lastAddedValue;

	@FindBy(xpath = "//*[@resource-id='com.youclick.wecare.debug:id/rv_reading_history']/*[1]//*[@resource-id='com.youclick.wecare.debug:id/img_can_delete']")
	MobileElement deleteLastAddedValue;

	@FindBy(id = "tabs")
	MobileElement detailsArea;

	@FindBy(xpath = "//*[@resource-id='android:id/button1']")
	MobileElement okBTN;

	public boolean lastAddedValue(String lastValue) {

		waitForElement(detailsArea);

		boolean flag = false;
		if (getTextOf(lastAddedValue).equals(lastValue)) {
			flag = true;
			printValueOf(" Pass , HomePage is displayed with the new added value of STEPS");
		} else {
			flag = false;
			printValueOf(" Fail , HomePage is NOT displayed with the value of STEPS");

		}
		return flag;

	}

	public boolean deleteLastAddedReading() {
		waitForElement(detailsArea);
		clickOn(deleteLastAddedValue);
		waitForElement(okBTN);
		boolean flag = false;
		if (getTextOf(okBTN).equals("OK")) {
			flag = true;
			printValueOf(" Pass , You are about to delete last reading of STEPS ");
		} else {
			flag = false;
			printValueOf(" Fail , Something wrong while deleting the last added value of Steps");

		}
		return flag;

	}

}
