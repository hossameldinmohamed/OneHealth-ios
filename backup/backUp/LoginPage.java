//package backUp;
//
//import org.openqa.selenium.support.FindBy;
//
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
//
//public class LoginPage extends PageBase {
//
//	public LoginPage(AppiumDriver<MobileElement> driver) {
//		super(driver);
//		//this.driver = driver;
//
//	}
//
//	@FindBy(xpath = "//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']")
//	MobileElement btnAllow;
//
//	@FindBy(xpath = "//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']")
//	MobileElement btnallowLocation;
//
//	@FindBy(xpath = "//android.widget.Button[@resource-id='com.youclick.wecare:id/btn_english']")
//	MobileElement btnLang_English;
//
//	@FindBy(xpath = "//*[@resource-id='com.healthconnect.trudoc247.debug:id/img_flag']")
//	MobileElement btnCountry;
//
//	@FindBy(xpath = "//*[@resource-id='com.healthconnect.trudoc247.debug:id/et_country_search']")
//	MobileElement editTxtCountry;
//
//	@FindBy(xpath = "//*[@resource-id='com.healthconnect.trudoc247.debug:id/tv_country']")
//	MobileElement tvCountry;
//
//	@FindBy(xpath = "//*[@resource-id='com.healthconnect.trudoc247.debug:id/et_phone_number']")
//	MobileElement editTxtPhoneNumber;
//
//	@FindBy(xpath = "//*[@resource-id='com.healthconnect.trudoc247.debug:id/btn_continue']")
//	MobileElement btn_Countinue;
//
//	@FindBy(xpath = "//*[@resource-id='com.healthconnect.trudoc247.debug:id/et_password']")
//	MobileElement et_password;
//
//	@FindBy(xpath = "//*[@resource-id='com.healthconnect.trudoc247.debug:id/btn_login']")
//	MobileElement btn_login;
//
//	// @FindBy(xpath = "//*[@resource-id='com.youclick.wecare:id/img_flag']")
//	// MobileElement btnCountry;
//
//	// @FindBy(xpath =
//	// "//*[@resource-id='com.youclick.wecare:id/et_country_search']")
//	// MobileElement editTxtCountry;
//	//
//	// @FindBy(xpath = "//*[@resource-id='com.youclick.wecare:id/tv_country']")
//	// MobileElement tvCountry;
//	//
//	// @FindBy(xpath = "//*[@resource-id='com.youclick.wecare:id/et_phone_number']")
//	// MobileElement editTxtPhoneNumber;
//	//
//	// @FindBy(xpath = "//*[@resource-id='com.youclick.wecare:id/btn_continue']")
//	// MobileElement btn_Countinue;
//	//
//	// @FindBy(xpath = "//*[@resource-id='com.youclick.wecare:id/et_password']")
//	// MobileElement et_password;
//	//
//	// @FindBy(xpath = "//*[@resource-id='com.youclick.wecare:id/btn_login']")
//	// MobileElement btn_login;
//	//
//	// @FindBy(xpath =
//	// "//*[@resource-id='com.healthconnect.trudoc247.debug:id/img_flag']")
//	// MobileElement btnCountry;
//
//	public void login(String contry, String phoneNumber, String password) {
//		try {
//			clickButton(btnAllow);
//			// clickButton(btnallowLocation);
//
//			// waitForElement(btnLang_English);
//			// clickButton(btnLang_English);
//			waitUntilVisible(btnCountry);
//			clickButton(btnCountry);
//			waitUntilVisible(editTxtCountry);
//			clearAndSetText(editTxtCountry, contry);
//			waitUntilVisible(tvCountry);
//			clickButton(tvCountry);
//			waitUntilVisible(editTxtPhoneNumber);
//			clearAndSetText(editTxtPhoneNumber, phoneNumber);
//			//hideKeyboard();
//			clickButton(btn_Countinue);
//			
//			waitUntilVisible(et_password);
//			clearAndSetText(et_password, password);
//			//hideKeyboard();
//			clickButton(btn_login);
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	public void setPhoneNumber(String country, String phoneNumber) {
//		clickButton(btnAllow);
//		// clickButton(btnallowLocation);
//
//		// waitForElement(btnLang_English);
//		// clickButton(btnLang_English);
//		waitUntilVisible(btnCountry);
//		clickButton(btnCountry);
//		waitUntilVisible(editTxtCountry);
//		clearAndSetText(editTxtCountry, country);
//		waitUntilVisible(tvCountry);
//		clickButton(tvCountry);
//		waitUntilVisible(editTxtPhoneNumber);
//		clearAndSetText(editTxtPhoneNumber, phoneNumber);
//		hideKeyboard();
//		clickButton(btn_Countinue);
//	}
//}
