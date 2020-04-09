package pages;

import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.*;
import io.appium.java_client.pagefactory.iOSFindBy;
public class LoginPage extends PageBase {

	LanguageFirstPage LanguageFirstPageObj=null;
//	HomePage HomePageObj=null;
//	passwordPage passwordPageObj=null;
	//policiesTerms policiesTermsObj=null;

	// Objects initialization
	@BeforeMethod(dependsOnMethods = "setup")
	public void initializeObjects() {
		// LanguageFirstPageObj = new LanguageFirstPage(driver);
		// passwordPageObj = new passwordPage(driver);
		// HomePageObj = new HomePage(driver);
		// policiesTermsObj = new policiesTerms(driver);
	}

	public LoginPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		// this.driver = driver;
	}

	


	@FindBy(id  = "LogincommonContinuebutton") //com.mydoctor.axa.debug:id/btn_login
	MobileElement btn_continue;
	
	@FindBy(id  = "LoginEnterMobileNumberTextField") 
	MobileElement xt_phonenumber;
	
	@FindBy(id = "EnterUserPasswordTextField")//com.mydoctor.axa.debug:id/et_password
	MobileElement et_password;

	@FindBy(id  = "EnterUserPasswordloginbutton") //com.mydoctor.axa.debug:id/btn_login
	MobileElement btn_login;
	
	

//	@FindBy(id = "et_country_search")//com.mydoctor.axa.debug:id/et_country_search
//	MobileElement editTxtCountry;
//
//	@FindBy(id = "tv_country")
//	MobileElement tvCountry;

//	//////////////// Calling Methods ////////////////
//
//	public boolean LoginAsGuest(String Language) throws InterruptedException {
//		// Allow location Permissions
//		// LanguageFirstPageObj.allowPermission();
//		HomePageObj = new HomePage(driver);
//
//		selectLanguage(Language);
//		clickOn_GuestBTN();
//		return HomePageObj.Readings_isDisplayed(Language);
//	}

	public void loginWithRegisteredUser(String number , String Password) {
		clearAndSetText(xt_phonenumber,number);	
		waitUntilElementClickableAndClick(btn_continue);
		waitForElement(et_password);
		clearAndSetText(et_password, Password);
		waitUntilElementClickableAndClick(btn_login);

//   try {
//	Thread.sleep(10000);
//} catch (InterruptedException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
	}

//	public void mergingDataValidation(String YesOrNoMerge, String old_New_ReadingValue) {
//		passwordPageObj = new passwordPage(driver);
//		HomePageObj = new HomePage(driver);
//
//		// Merge previous guest data
//		passwordPageObj.MergeGuestData(YesOrNoMerge);
//
//		if (YesOrNoMerge.equalsIgnoreCase("yes")) {
//			// Validate data is displayed
//			Assert.assertEquals(HomePageObj.NewAddedReading(old_New_ReadingValue), true);
//			System.out.println("New data added due to Yes Merge");
//		} else {
//			// Validate old data is displayed not the new data
//			Assert.assertEquals(HomePageObj.NewAddedReading(old_New_ReadingValue), true);
//			System.out.println("Old Data should be displayed due to No Merge");
//		}
//
//	}
//	////////////////////////////////////////////////
//
//	private void selectLanguage(String Language) {
//		LanguageFirstPageObj = new LanguageFirstPage(driver);
//
//		try {
//			if (Language.equalsIgnoreCase("EN") || Language.equalsIgnoreCase("ENGLISH")) {
//				// Allow location Permissions
//				LanguageFirstPageObj.allowPermission();
//
//				// Choose English Language
//				LanguageFirstPageObj.choose_EN_BTN();
//			} else if (Language.equalsIgnoreCase("AR") || Language.equalsIgnoreCase("ARABIC")) {
//				// Allow location Permissions
//				LanguageFirstPageObj.allowPermission();
//
//				// Choose English Language
//				LanguageFirstPageObj.choose_AR_BTN();
//			}
//		} catch (Exception e) {
//			System.out.println("Exception in typing language appreviation: " + e);
//		}
//
//	}
//
//	private void loginWithCredentials(String MobileNumber, String Password, String MergeOldData_YesNo)
//			throws InterruptedException {
//		passwordPageObj = new passwordPage(driver);
//
//		// Login with registered user
//
//		ContinueWith(MobileNumber);
//		passwordPageObj.loginToTheApp(Password, MergeOldData_YesNo);
//
//	}
//
//	////////////////////////////////////////////////
//	public boolean ContentDisplayedProperly(String language) {
//
//		waitForElement(TruDoc_Logo);
//
//		boolean flag = false;
//		if (language.equalsIgnoreCase("EN") || language.equalsIgnoreCase("ENGLISH")) {
//			if (allElementsFlags(language) == true) {
//				flag = true;
//				printValueOf("PASS ^_^ , Everything is OKAY in the [English] Login Screen");
//			} else {
//				flag = false;
//				printValueOf(" FAIL !!! , Something wrong in the [English] Login Screen");
//			}
//		} else if (language.equalsIgnoreCase("AR") || language.equalsIgnoreCase("ARABIC")) {
//			if (allElementsFlags(language) == true) {
//				flag = true;
//				printValueOf("PASS ^_^ , Everything is OKAY in the [Arabic] Login Screen");
//			} else {
//				flag = false;
//				printValueOf(" FAIL !!! , Something wrong in the [Arabic] Login Screen");
//			}
//		} else {
//			flag = false;
//			printValueOf(" FAIL !!! , Something wrong in the [English] or [Arabic] Login Screen");
//		}
//		/*
//		 * if (allElementsFlags(language) == true && (language.equalsIgnoreCase("EN") ||
//		 * language.equalsIgnoreCase("ENGLISH"))) { flag = true;
//		 * printValueOf("PASS ^_^ , Everything is OKAY in the [English] Login Screen");
//		 * 
//		 * } else if (allElementsFlags(language) == true &&
//		 * (language.equalsIgnoreCase("AR") || language.equalsIgnoreCase("ARABIC"))) {
//		 * flag = true;
//		 * printValueOf("PASS ^_^ , Everything is OKAY in the [Arabic] Login Screen");
//		 * 
//		 * } else { flag = false;
//		 * printValueOf(" FAIL !!! , Something wrong in the [English] or [Arabic] Login Screen"
//		 * ); }
//		 */
//		return flag;
//	}
//
//	private void clickOn_GuestBTN() {
//		policiesTermsObj = new policiesTerms(driver);
//		try {
//			waitForElement(guest_BTN);
//			clickOn(guest_BTN);
//			printValueOf("Waiting Terms and policies or the homepage to be displayed ");
//			// if terms displayed click accept else if home displayed just do nothing
//			try {
//				if (policiesTermsObj.termsDisplayed()) {
//					printValueOf("Accepting or skipping terms");
//				} else {
//					printValueOf("Terms not displayed");
//				}
//
//			} catch (Exception e) {
//				printValueOf("Exception while accepting terms,," + e);
//			}
//		} catch (Exception e) {
//			printValueOf("Exception while clicking on guest btn,," + e);
//		}
//		/*
//		 * try {
//		 * printValueOf("Waiting Terms and policies or the homepage to be displayed ");
//		 * waitForElement(guest_BTN); clickOn(guest_BTN); try { if
//		 * (policiesTermsObj.termsDisplayed()) {
//		 * printValueOf("Accepting or skipping terms"); } else {
//		 * printValueOf("Terms not displayed"); }
//		 * 
//		 * } catch (Exception e) { printValueOf("Exception while accepting terms"); }
//		 * 
//		 * } catch (Exception e) { printValueOf("Exception while logging as guest"); }
//		 * // if terms displayed click accept else if home displayed just do nothing
//		 */
//	}
//
//	public void clickOn_helpBTN() {
//		waitForElement(help_BTN);
//		clickOn(help_BTN);
//	}
//
//	private void ContinueWith(String MobileNumber) {
//		waitForElement(phone_Field);
//		typeOnElement(phone_Field, MobileNumber);
//		driver.hideKeyboard();
//		clickOn(continue_BTN);
//	}
//
//	public void login(String countryEN, String countryAR, String phoneNumber, String password, String AppLanguage) {
//		LanguageFirstPageObj = new LanguageFirstPage(driver);
//
//		waitForElement(btnAllow);
//		clickButton(btnAllow);
//
//		if (AppLanguage.equalsIgnoreCase("EN") || AppLanguage.equalsIgnoreCase("ENGLISH")) {
//			// Choose English Language
//			LanguageFirstPageObj.choose_EN_BTN();
//			waitUntilVisible(phoneCountryArea);
//			clickButton(phoneCountryArea);
//			waitUntilVisible(editTxtCountry);
//			clearAndSetText(editTxtCountry, countryEN);
//
//		} else if (AppLanguage.equalsIgnoreCase("AR") || AppLanguage.equalsIgnoreCase("ARABIC")) {
//			// Choose Arabic Language
//			LanguageFirstPageObj.choose_AR_BTN();
//			waitUntilVisible(phoneCountryArea);
//			clickButton(phoneCountryArea);
//			waitUntilVisible(editTxtCountry);
//			clearAndSetText(editTxtCountry, countryAR);
//		}
//
//		waitUntilVisible(tvCountry);
//		clickButton(tvCountry);
//		waitUntilVisible(phone_Field);
//		clearAndSetText(phone_Field, phoneNumber);
//		clickButton(continue_BTN);
//		waitUntilElementClickableAndClick(et_password);
//		clearAndSetText(et_password, password);
//
//		clickButton(btn_login);
//
//	}
//
//	//////////////// Elements Implementation ////////////////
//
//	private boolean allElementsFlags(String language) {
//		boolean allFlags = false;
//		try {
//			boolean result1 = TruDoc_Logo_Displayed();
//			boolean result2 = play_Icon_Displayed();
//			boolean result3 = whatWeDo_BTN_Displayed(language);
//			boolean result4 = mobileNum_Label_Displayed(language);
//			boolean result5 = phoneContainer_Displayed();
//			boolean result6 = phoneCountryArea_Displayed();
//			boolean result7 = phoneCountryFlag_Displayed();
//			boolean result8 = phoneCountryCode_Displayed();
//			boolean result9 = phone_Field_Displayed(language);
//			boolean result10 = continue_BTN_Displayed(language);
//			boolean result11 = guest_BTN_Displayed(language);
//			boolean result12 = help_BTN_Displayed(language);
//
//			if (result1 == false || result2 == false || result3 == false || result4 == false || result5 == false
//					|| result6 == false || result7 == false || result8 == false || result9 == false || result10 == false
//					|| result11 == false || result12 == false) {
//				allFlags = false;
//
//			} else {
//				allFlags = true;
//			}
//		} catch (Exception e) {
//			allFlags = false;
//			printValueOf(" FAIL , some of allFlags is not displayed properly!" + e);
//		}
//		return allFlags;
//	}
//
//	private boolean TruDoc_Logo_Displayed() {
//		boolean flag = false;
//		try {
//			waitForElement(TruDoc_Logo);
//
//			if (isDisplayedElement(TruDoc_Logo) == true) {
//				flag = true;
//				printValueOf(" PASS, TruDoc Logo is displayed properly");
//			} else {
//				flag = false;
//				printValueOf(" FAIL , TruDoc Logo is not displayed properly");
//			}
//		} catch (Exception e) {
//			flag = false;
//			printValueOf(" FAIL , TruDoc_Logo is not displayed properly!" + e);
//		}
//		return flag;
//	}
//
//	private boolean play_Icon_Displayed() {
//		boolean flag = false;
//		try {
//			waitForElement(TruDoc_Logo);
//
//			if (isDisplayedElement(play_Icon) == true && isEnabledElement(play_Icon) == true) {
//				flag = true;
//				printValueOf(" PASS, play Icon is displayed properly");
//			} else {
//				flag = false;
//				printValueOf(" FAIL , play Icon is not displayed properly");
//			}
//		} catch (Exception e) {
//			flag = false;
//			printValueOf(" FAIL , play_Icon is not displayed properly!" + e);
//		}
//		return flag;
//	}
//
//	private boolean whatWeDo_BTN_Displayed(String Language) {
//		boolean flag = false;
//		try {
//			waitForElement(TruDoc_Logo);
//			if (Language.equalsIgnoreCase("EN") || Language.equalsIgnoreCase("ENGLISH")) {
//				String Expected = "What we do?";
//
//				if (isDisplayedElement(whatWeDo_BTN) == true && isEnabledElement(whatWeDo_BTN) == true
//						&& getTextOf(whatWeDo_BTN).equals(Expected)) {
//					flag = true;
//					printValueOf(" PASS, whatWeDo_BTN is displayed properly");
//				} else {
//					flag = false;
//					printValueOf(" FAIL , whatWeDo_BTN is not displayed properly, [Actual]: " + getTextOf(whatWeDo_BTN)
//							+ " [Expected]: " + Expected);
//				}
//			} else if (Language.equalsIgnoreCase("AR") || Language.equalsIgnoreCase("ARABIC")) {
//				String Expected = "ماذا نفعل؟";
//
//				if (isDisplayedElement(whatWeDo_BTN) == true && isDisplayedElement(whatWeDo_BTN) == true
//						&& getTextOf(whatWeDo_BTN).equals(Expected)) {
//					flag = true;
//					printValueOf(" PASS, whatWeDo_BTN is displayed properly");
//				} else {
//					flag = false;
//					printValueOf(" FAIL , whatWeDo_BTN is not displayed properly, [Actual]: " + getTextOf(whatWeDo_BTN)
//							+ " [Expected]: " + Expected);
//				}
//			} else {
//				flag = false;
//				printValueOf("error, not defined language EN or AR");
//			}
//		} catch (Exception e) {
//			flag = false;
//			printValueOf(" FAIL , whatWeDo_BTN is not displayed properly!" + e);
//		}
//		return flag;
//	}
//
//	private boolean mobileNum_Label_Displayed(String Language) {
//		boolean flag = false;
//		try {
//			waitForElement(TruDoc_Logo);
//
//			if (Language.equalsIgnoreCase("EN") || Language.equalsIgnoreCase("ENGLISH")) {
//				String Expected = "Please Enter Your Mobile Number";
//
//				if (isDisplayedElement(mobileNum_Label) == true && getTextOf(mobileNum_Label).equals(Expected)) {
//					flag = true;
//					printValueOf(" PASS, mobileNum_Label is displayed properly");
//				} else {
//					flag = false;
//					printValueOf(" FAIL , mobileNum_Label is not displayed properly, [Actual]: "
//							+ getTextOf(mobileNum_Label) + " [Expected]: " + Expected);
//				}
//			} else if (Language.equalsIgnoreCase("AR") || Language.equalsIgnoreCase("ARABIC")) {
//				String Expected = "أدخل رقم هاتفك الجوال";
//				if (isDisplayedElement(mobileNum_Label) == true && getTextOf(mobileNum_Label).equals(Expected)) {
//					flag = true;
//					printValueOf(" PASS, mobileNum_Label is displayed properly");
//				} else {
//					flag = false;
//					printValueOf(" FAIL , mobileNum_Label is not displayed properly, [Actual]: "
//							+ getTextOf(mobileNum_Label) + " [Expected]: " + Expected);
//				}
//			} else {
//				flag = false;
//				printValueOf("error, not defined language EN or AR");
//			}
//		} catch (Exception e) {
//			flag = false;
//			printValueOf(" FAIL , mobileNum_Label is not displayed properly!" + e);
//		}
//		return flag;
//	}
//
//	private boolean phoneContainer_Displayed() {
//
//		boolean flag = false;
//		try {
//			waitForElement(TruDoc_Logo);
//
//			if (isDisplayedElement(phoneContainer) == true) {
//				flag = true;
//				printValueOf(" PASS, phoneContainer is displayed properly");
//			} else {
//				flag = false;
//				printValueOf(" FAIL , phoneContainer is not displayed properly");
//			}
//		} catch (Exception e) {
//			flag = false;
//			printValueOf(" FAIL , phoneContainer is not displayed properly!" + e);
//		}
//		return flag;
//	}
//
//	private boolean phoneCountryArea_Displayed() {
//
//		boolean flag = false;
//		try {
//			waitForElement(TruDoc_Logo);
//
//			if (isDisplayedElement(phoneCountryArea) == true) {
//				flag = true;
//				printValueOf(" PASS, phoneCountryArea is displayed properly");
//			} else {
//				flag = false;
//				printValueOf(" FAIL , phoneCountryArea is not displayed properly");
//			}
//		} catch (Exception e) {
//			flag = false;
//			printValueOf(" FAIL , phoneCountryArea is not displayed properly!" + e);
//		}
//		return flag;
//	}
//
//	private boolean phoneCountryFlag_Displayed() {
//
//		boolean flag = false;
//		try {
//			waitForElement(TruDoc_Logo);
//
//			if (isDisplayedElement(phoneCountryFlag) == true) {
//				flag = true;
//				printValueOf(" PASS, phoneCountryFlag is displayed properly");
//			} else {
//				flag = false;
//				printValueOf(" FAIL , phoneCountryFlag is not displayed properly");
//			}
//		} catch (Exception e) {
//			flag = false;
//			printValueOf(" FAIL , phoneCountryFlag is not displayed properly!" + e);
//		}
//		return flag;
//	}
//
//	private boolean phoneCountryCode_Displayed() {
//		boolean flag = false;
//		String Expected = "+";
//
//		try {
//
//			waitForElement(TruDoc_Logo);
//
//			if (isDisplayedElement(phoneCountryCode) == true && isEnabledElement(phoneCountryCode) == true
//					&& getTextOf(phoneCountryCode).contains(Expected)) {
//				flag = true;
//				printValueOf(" PASS, phoneCountryCode is displayed properly");
//			} else {
//				flag = false;
//				printValueOf(" FAIL , phoneCountryCode is not displayed properly, [Actual]: "
//						+ getTextOf(phoneCountryCode) + " [Expected]:" + Expected);
//			}
//		} catch (Exception e) {
//			flag = false;
//			printValueOf(" FAIL , phoneCountryCode is not displayed properly!" + e);
//		}
//		return flag;
//	}
//
//	private boolean phone_Field_Displayed(String Language) {
//		boolean flag = false;
//
//		try {
//			waitForElement(TruDoc_Logo);
//
//			if (Language.equalsIgnoreCase("EN") || Language.equalsIgnoreCase("ENGLISH")) {
//				String Expected = "Enter Mobile";
//
//				if (isDisplayedElement(phone_Field) == true && isEnabledElement(phone_Field) == true
//						&& getTextOf(phone_Field).startsWith(Expected)) {
//					flag = true;
//					printValueOf(" PASS, phone_Field is displayed properly");
//				} else {
//					flag = false;
//					printValueOf(" FAIL , phone_Field is not displayed properly, [Actual]: " + getTextOf(phone_Field)
//							+ "  [Expected] start with:" + Expected);
//				}
//			} else if (Language.equalsIgnoreCase("AR") || Language.equalsIgnoreCase("ARABIC")) {
//				String Expected = "رقم الهاتف الجوال";
//
//				if (isDisplayedElement(phone_Field) == true && isEnabledElement(phone_Field) == true
//						&& getTextOf(phone_Field).startsWith(Expected)) {
//					flag = true;
//					printValueOf(" PASS, phone_Field is displayed properly");
//				} else {
//					flag = false;
//					printValueOf(" FAIL , phone_Field is not displayed properly, [Actual]: " + getTextOf(phone_Field)
//							+ "  [Expected] start with:" + Expected);
//				}
//
//			} else {
//				flag = false;
//				printValueOf("error, not defined language EN or AR");
//			}
//		} catch (Exception e) {
//			flag = false;
//			printValueOf(" FAIL , phone_Field is not displayed properly!" + e);
//		}
//		return flag;
//	}
//
//	private boolean continue_BTN_Displayed(String Language) {
//		boolean flag = false;
//
//		try {
//			waitForElement(TruDoc_Logo);
//
//			if (Language.equalsIgnoreCase("EN") || Language.equalsIgnoreCase("ENGLISH")) {
//				String Expected = "CONTINUE"; // "CONTINUE"
//
//				if (isDisplayedElement(continue_BTN) == true && isEnabledElement(continue_BTN) == true
//						&& getTextOf(continue_BTN).equals(Expected)) {
//					flag = true;
//					printValueOf(" PASS, continue_BTN is displayed properly");
//				} else {
//					flag = false;
//					printValueOf(" FAIL , continue_BTN is not displayed properly, [Actual]: " + getTextOf(continue_BTN)
//							+ " [Expected]:" + Expected);
//				}
//			} else if (Language.equalsIgnoreCase("AR") || Language.equalsIgnoreCase("ARABIC")) {
//				String Expected = "استمر"; // "CONTINUE"
//
//				if (isDisplayedElement(continue_BTN) == true && isEnabledElement(continue_BTN) == true
//						&& getTextOf(continue_BTN).equals(Expected)) {
//					flag = true;
//					printValueOf(" PASS, continue_BTN is displayed properly");
//				} else {
//					flag = false;
//					printValueOf(" FAIL , continue_BTN is not displayed properly, [Actual]: " + getTextOf(continue_BTN)
//							+ " [Expected]:" + Expected);
//				}
//			} else {
//				flag = false;
//				printValueOf("error, not defined language EN or AR");
//			}
//		} catch (Exception e) {
//			flag = false;
//			printValueOf(" FAIL , continue_BTN is not displayed properly!" + e);
//		}
//		return flag;
//	}
//
//	private boolean guest_BTN_Displayed(String Language) {
//		boolean flag = false;
//
//		try {
//			waitForElement(TruDoc_Logo);
//			if (Language.equalsIgnoreCase("EN") || Language.equalsIgnoreCase("ENGLISH")) {
//				String Expected = "SIGN UP AS GUEST"; // "SIGN UP AS GUEST" //Sign up as guest
//
//				if (isDisplayedElement(guest_BTN) == true && isEnabledElement(guest_BTN) == true
//						&& getTextOf(guest_BTN).equals(Expected)) {
//					flag = true;
//					printValueOf(" PASS, guest_BTN is displayed properly");
//				} else {
//					flag = false;
//					printValueOf(" FAIL , guest_BTN is not displayed properly, [Actual]: " + getTextOf(guest_BTN)
//							+ " [Expected]: " + Expected);
//				}
//			} else if (Language.equalsIgnoreCase("AR") || Language.equalsIgnoreCase("ARABIC")) {
//				String Expected = "قم بالتسجيل كضيف"; // "SIGN UP AS GUEST"
//
//				if (isDisplayedElement(guest_BTN) == true && isEnabledElement(guest_BTN) == true
//						&& getTextOf(guest_BTN).equals(Expected)) {
//					flag = true;
//					printValueOf(" PASS, guest_BTN is displayed properly");
//				} else {
//					flag = false;
//					printValueOf(" FAIL , guest_BTN is not displayed properly, [Actual]: " + getTextOf(guest_BTN)
//							+ " [Expected]: " + Expected);
//				}
//			} else {
//				flag = false;
//				printValueOf("error, not defined language EN or AR");
//			}
//		} catch (Exception e) {
//			flag = false;
//			printValueOf(" FAIL , guest_BTN is not displayed properly!" + e);
//		}
//		return flag;
//	}
//
//	private boolean help_BTN_Displayed(String Language) {
//		boolean flag = false;
//
//		try {
//			waitForElement(TruDoc_Logo);
//
//			if (Language.equalsIgnoreCase("EN") || Language.equalsIgnoreCase("ENGLISH")) {
//				String Expected = "NEED HELP?"; // "NEED HELP?"//Need Help?
//
//				if (isDisplayedElement(help_BTN) == true && isEnabledElement(help_BTN) == true
//						&& getTextOf(help_BTN).equals(Expected)) {
//					flag = true;
//					printValueOf(" PASS, help_BTN is displayed properly");
//				} else {
//					flag = false;
//					printValueOf(" FAIL , help_BTN is not displayed properly, [Actual]: " + getTextOf(help_BTN)
//							+ " [Expected]: " + Expected);
//				}
//			} else if (Language.equalsIgnoreCase("AR") || Language.equalsIgnoreCase("ARABIC")) {
//				String Expected = "تحتاج مساعدة؟"; // "NEED HELP?"
//
//				if (isDisplayedElement(help_BTN) == true && isEnabledElement(help_BTN) == true
//						&& getTextOf(help_BTN).equals(Expected)) {
//					flag = true;
//					printValueOf(" PASS, help_BTN is displayed properly");
//				} else {
//					flag = false;
//					printValueOf(" FAIL , help_BTN is not displayed properly, [Actual]: " + getTextOf(help_BTN)
//							+ " [Expected]: " + Expected);
//				}
//			} else {
//				flag = false;
//				printValueOf("error, not defined language EN or AR");
//			}
//		}
//
//		catch (Exception e) {
//			flag = false;
//			printValueOf(" FAIL , help_BTN is not displayed properly!" + e);
//		}
//		return flag;
//	}
}
