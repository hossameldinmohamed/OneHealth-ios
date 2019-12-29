package pages;

import org.openqa.selenium.support.FindBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LanguageFirstPage extends PageBase {

	public LanguageFirstPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		// this.driver = driver;
	}
	////////////////
	/*
	 * static By TruDocLogo = By.id("img_logo"); static By ChooseLanugageLabel =
	 * By.id("tv_choose_language_label"); static By LanguageEN =
	 * By.id("btn_english"); static By LanguageAR = By.id("btn_arabic"); static By
	 * allowBTN = By.xpath("//*[@text='Allow']");
	 */
	//////////////// Elements ////////////////


	@FindBy(id = "ChooseLanguageChooseEnglishbutton")
	MobileElement LanguageEN;

	@FindBy(id = "btn_arabic")
	MobileElement LanguageAR;

	

	/*
	 * By TruDocLogo = By.id("img_logo"); By ChooseLanugageLabel =
	 * By.id("tv_choose_language_label"); By LanguageEN = By.id("btn_english"); By
	 * LanguageAR = By.id("btn_arabic"); By allowBTN =
	 * By.xpath("//*[@text='ALLOW']");
	 */

	//////////////// Calling Methods ////////////////



	// Click on English Button of the First page of the application
	public void choose_EN_BTN() {
		//waitForElement(TruDocLogo);
		clickOn(LanguageEN);
		System.out.println("English Language selected");
	}

	// Click on Arabic Button of the First page of the application
	public void choose_AR_BTN() {
		//waitForElement(TruDocLogo);
		clickOn(LanguageAR);
		System.out.println("Arabic Language selected");
	}


}
