package pages;

import org.openqa.selenium.support.FindBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class mobileNumberPage extends PageBase {

	public mobileNumberPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		// this.driver = driver;
	}
	//////////////// Elements ////////////////

	@FindBy(xpath = "view_city_selector")
	MobileElement city;
}
