package pages;

import org.openqa.selenium.support.FindBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class HomePage extends PageBase {

	public HomePage(AppiumDriver<MobileElement> driver) {
		super(driver);
		// this.driver = driver;
	}

	// Elements
	

	@FindBy(xpath = "//*[@resource-id='com.mydoctor.axa.debug:id/img_manage_item_dots']") // com.mydoctor.axa.debug:id/img_manage_item_dots
	MobileElement addNewReadingICON;

	@FindBy(id = "com.mydoctor.axa.debug:id/recycle_reading_home")//com.mydoctor.axa.debug:id/recycle_reading_home
	MobileElement readingsSection;
	
	@FindBy(xpath = "//*[@resource-id='com.mydoctor.axa.debug:id/img_manage_item_dots']/../*[2]")//com.mydoctor.axa.debug:id/img_manage_item_dots']/../*[2]
	MobileElement addNewReadingLabel;

	@FindBy(xpath = "//*[@resource-id='com.mydoctor.axa.debug:id/img_manage_item_dots']/../..")//com.mydoctor.axa.debug:id/img_manage_item_dots']/../..
	MobileElement addNewReadingCard;

	@FindBy(xpath = "//*[@resource-id='com.mydoctor.axa.debug:id/recycle_reading_home']/*[2]/*[1]/*[1]") //com.mydoctor.axa.debug:id/recycle_reading_home']/*[2]/*[1]/*[1]
	MobileElement firstReadingValue;

	@FindBy(xpath = "//*[@resource-id='com.mydoctor.axa.debug:id/recycle_reading_home']/*[2]/*[1]") //com.mydoctor.axa.debug:id/recycle_reading_home']/*[2]/*[1]
	MobileElement firstReadingCard;

	@FindBy(id = "More")//com.mydoctor.axa.debug:id/recycle_reading_home
	MobileElement MoreIcon;
	
	@FindBy(id = "view_readings")
	MobileElement ReadingView;
	
	@FindBy(id ="action_add_reading")
	MobileElement AddReadingIcon;

	//////////////// Calling Methods ////////////////

//	public boolean Readings_isDisplayed(String appLanguage) {
//		AddNewReadingPage allReadingPage = new AddNewReadingPage(driver);
//		boolean flag = false;
//
//		try {
//			 waitForElement(MoreIcon);
//			if (isDisplayedElement(MoreIcon)){
//			flag = true;
//			printValueOf(" Pass , HomePage is displayed properly");
//			waitUntilElementClickableAndClick(MoreIcon);
//			waitUntilElementClickableAndClick(ReadingView);
//			allReadingPage.manageReadingdsType(appLanguage);
//			waitUntilElementClickableAndClick(AddReadingIcon);
//
//		} else {
//			flag = false;
//			printValueOf(" Fail , HomePage is not displayed properly");
//		}
//	} catch (Exception e) {
//		printValueOf("Exception Readings_isDisplayed: " + e);
//	}
//
//	return flag;
//			/*
//			  try {
//			waitForElement(readingsSection);
//
//			if (isDisplayedElement(readingsSection)) {
//				flag = true;
//				printValueOf(" Pass , HomePage is displayed properly");
//			} else {
//				flag = false;
//				printValueOf(" Fail , HomePage is not displayed properly");
//			}
//		} catch (Exception e) {
//			printValueOf("Exception Readings_isDisplayed: " + e);
//		}
//
//		return flag;
//		*/
//	}

	public void AddNewReading() {
		waitForElement(readingsSection);
		clickOn(addNewReadingCard);
	}
//
	
	public void clickmore() {
		
		waitUntilElementClickableAndClick(MoreIcon);
}
	
//	public boolean NewAddedReading(String NewAddedValue) {
//		waitForElement(addNewReadingICON);
//
//		boolean flag = false;
//		if (getTextOf(firstReadingValue).equals(NewAddedValue)) {
//			flag = true;
//			printValueOf(" Pass , HomePage is displayed with the new added value of STEPS");
//		} else {
//			flag = false;
//			printValueOf(" Fail , HomePage is NOT displayed with the value of STEPS");
//		}
//		return flag;
//	}
//
//	protected void ReadingDetailsCard(String ReadingType) {
//
//		clickOn(firstReadingCard);
//	}
//
//	protected boolean homeScreenIsDisplayed() throws InterruptedException {
//		// waitForElement(passwordPage.oldDataAlert);
//		waitForElement(addNewReadingCard);
//		Thread.sleep(3000);
//
//		/*
//		 * if (passwordPage.AlertDisplayReturnedValue() == true) {
//		 * driver.findElement(passwordPage.noDelete).click();
//		 * System.out.println("No Delete for Merge Data"); } else {
//		 * System.out.println("Pass, Alert for Merge Data not displayed");
//		 * waitForElement(addNewReadingCard);
//		 * 
//		 * }
//		 */
//		return isDisplayedElement(addNewReadingCard);
//	}

}

