package pages;

import org.openqa.selenium.support.FindBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class myProfileViewPage extends PageBase {

	public myProfileViewPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		//this.driver = driver;
	}
	//////////////// Elements ////////////////

	@FindBy(xpath = "//*[@resource-id='com.youclick.wecare.debug:id/trudoctoolbar']/*[1]")
	MobileElement editProfileBTN;

	// static By editProfileBTN = By.xpath("//*[@text='Edit']");

	protected void clickOnEditProfile() {
		// wait(editProfileBTN);
		try {
			clickOn(editProfileBTN);
		} catch (Exception e) {
			System.out.println("exeption: " + e);
		}

	}

}
