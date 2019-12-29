//package pages;
//
//import org.openqa.selenium.support.FindBy;
//
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
//
//public class policiesTerms extends PageBase {
//	HomePage homePageObj = null;
//
//	public policiesTerms(AppiumDriver<MobileElement> driver) {
//		super(driver);
//		// this.driver = driver;
//	}
//
//	//////////////// Elements ////////////////
//
//	@FindBy(xpath = "//*[@resource-id='com.youclick.wecare.debug:id/trudoctoolbar']/*[1]")
//	MobileElement policiesTermsLabel;
//
//	@FindBy(id = "btn_agree")
//	MobileElement TermsAgreeBTN;
//
//	public boolean termsDisplayed() throws InterruptedException {
//		homePageObj = new HomePage(driver);
//		// Thread.sleep(3000);
//		boolean flag = false;
//		try {
//			try {
//				waitForElement(TermsAgreeBTN);
//				if (isDisplayedElement(TermsAgreeBTN)) {
//					flag = true;
//					printValueOf("Policies & Terms displayed");
//					clickOn(TermsAgreeBTN);
//				} else {
//					flag = false;
//					printValueOf("Policies & Terms NOT displayed");
//				}
//
//			} catch (Exception e) {
//				waitForElement(homePageObj.readingsSection);
//				//Thread.sleep(2000);
//				if (isDisplayedElement(homePageObj.readingsSection)) {
//					flag = true;
//					printValueOf("Policies & Terms Skipped and home page displayed");
//				} else {
//					flag = false;
//					printValueOf("Policies & Terms NOT displayed");
//				}
//			}
//
//		} catch (Exception e) {
//			flag = false;
//			printValueOf("Error with Terms ! with expection: " + e);
//		}
//
//		return flag;
//
//	}
//
//}
