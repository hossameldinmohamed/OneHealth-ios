//package pages;
//
//import org.openqa.selenium.support.FindBy;
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
//
//public class passwordPage extends PageBase {
//
//	HomePage homePageObj;
//
//	public passwordPage(AppiumDriver<MobileElement> driver) {
//		super(driver);
//		// this.driver = driver;
//	}
//
//	@FindBy(id = "et_password")
//	MobileElement passwordField;
//
//	@FindBy(id = "btn_login")
//	MobileElement loginBtn;
//
//	@FindBy(id = "android:id/button1")
//	MobileElement yesKeep;
//
//	@FindBy(id = "android:id/button2")
//	MobileElement noDelete;
//
//	@FindBy(id = "android:id/alertTitle")
//	MobileElement oldDataAlert;
//
//	public void loginToTheApp(String password, String YesOrNo) throws InterruptedException {
//		try {
//
//			waitForElement(passwordField);
//			typeOnElement(passwordField, password);
//			//hideKeyboard();
//			clickOn(loginBtn);
//			Thread.sleep(4000);
//			//waitForElement(noDelete);
//			boolean result = isDisplayedElement(noDelete);
//			if (result == true) {
//				MergeGuestData(YesOrNo);
//			} else {
//				printValueOf("(Yes) or (No) POP UP not displayed");
//			}
//		} catch (Exception e) {
//			printValueOf("Exception while logging in with YES OR NO");
//		}
//	}
//
//	public void MergeGuestData(String YesOrNo) {
//		// Thread.sleep(3000);
//		try {
//			waitForElement(oldDataAlert);
//			if (YesOrNo.equals("Yes")) {
//				alertDisplayedWith_Merge();
//			} else if (YesOrNo.equals("No")) {
//				alertDisplayedWith_NoMerge();
//			} else {
//				printValueOf("You Enterend a wrong format, please enter (Yes) or (No) ");
//			}
//		} catch (Exception e) {
//			printValueOf("Something wrong for Yes or No in merging data !");
//		}
//
//	}
//
//	protected void alertDisplayedWith_NoMerge() {
//		// Thread.sleep(1000);
//
//		try {
//			waitForElement(oldDataAlert);
//			if (isDisplayedElement(oldDataAlert)) {
//				clickOn(noDelete);
//				printValueOf("No Delete for Merge Data");
//			} else {
//				printValueOf("Something went wrong while displaying the pop up for Merging data ");
//			}
//		} catch (Exception e) {
//			printValueOf("Exception while pop up of  mering data " + e);
//			// HomePage.homeScreenIsDisplayed();
//		}
//
//	}
//
//	protected void alertDisplayedWith_Merge() throws InterruptedException {
//		// Thread.sleep(1000);
//		homePageObj = new HomePage(driver);
//
//		try {
//			if (isDisplayedElement(oldDataAlert)) {
//				clickOn(yesKeep);
//				printValueOf("Yes Keep for Merge Data");
//			} else {
//				printValueOf("Something went wrong while displaying the pop up for Merging data ");
//			}
//		} catch (Exception e) {
//			printValueOf("Exception while pop up of  mering data " + e);
//			homePageObj.homeScreenIsDisplayed();
//		}
//	}
//
//}
