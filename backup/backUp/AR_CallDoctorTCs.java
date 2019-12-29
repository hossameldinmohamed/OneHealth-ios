package backUp;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import backUp.TestBase;
import pages.LoginPageEN_AR;
import pages.CallDoctor_EN_AR;
import pages.LanguageFirstPage;
import pages.sideMenu;

public class AR_CallDoctorTCs extends TestBase {

	// Attributes
	String AppLanguage = "AR";
	boolean expectedResult = true;

	// Objects from classes
	CallDoctor_EN_AR CallDoctor_EN_AR_Obj = null;
	LoginPageEN_AR LoginPageEN_AR_Obj = null;
	sideMenu sideMenu_Obj = null;
	LanguageFirstPage LanguageFirstPage_Obj = null;

	// @BeforeMethod(dependsOnMethods = "setup")
	@BeforeClass
	private void initializeObjects() {
		try {
			LoginPageEN_AR_Obj = new LoginPageEN_AR(driver);
			sideMenu_Obj = new sideMenu(driver);
			CallDoctor_EN_AR_Obj = new CallDoctor_EN_AR(driver);
			LanguageFirstPage_Obj = new LanguageFirstPage(driver);
		} catch (Exception e) {
			System.out.println("ex: (( " + e + "))");
		}
	}

	@Test(priority = 1, enabled = true)
	public void loginScreen_displayed_AR() {
		// Allow location Permissions
		LanguageFirstPage_Obj.allowPermission();

		// Validate the first screen of language selection is displayed properly
		Assert.assertEquals(LanguageFirstPage_Obj.ContentDisplayedProperly(), expectedResult);

		// Choose English Language
		LanguageFirstPage_Obj.choose_AR_BTN();

		// Validate the login screen of language English is displayed properly
		Assert.assertEquals(LoginPageEN_AR_Obj.ContentDisplayedProperly(AppLanguage), expectedResult);

	}

	@Test(priority = 2, enabled = true, dependsOnMethods = "loginScreen_displayed_AR")
	private void GuestVideoCall_NotNow_AR() throws InterruptedException {

		// login as guest in English language
		boolean actual = LoginPageEN_AR_Obj.LoginAsGuest(AppLanguage);
		Assert.assertEquals(actual, expectedResult);

		// make a video call
		CallDoctor_EN_AR_Obj.ContentDisplayedProperly(AppLanguage);

		// validate Pop-up content of the guest video call
		Assert.assertEquals(CallDoctor_EN_AR_Obj.videoPopUpcontentDisplayed(AppLanguage), expectedResult);
		Assert.assertEquals(CallDoctor_EN_AR_Obj.NotNowVideoRegister(AppLanguage), expectedResult);
		Assert.assertEquals(sideMenu_Obj.LogoutFromApp(AppLanguage), expectedResult);

	}

	@Test(priority = 3, enabled = true, dependsOnMethods = "loginScreen_displayed_AR")
	private void GuestVideoCall_Register_AR() throws InterruptedException {

		// login as guest in English language
		boolean actual = LoginPageEN_AR_Obj.LoginAsGuest(AppLanguage);
		Assert.assertEquals(actual, expectedResult);

		// make a video call
		CallDoctor_EN_AR_Obj.ContentDisplayedProperly(AppLanguage);

		// validate Pop-up content of the guest video call
		Assert.assertEquals(CallDoctor_EN_AR_Obj.videoPopUpcontentDisplayed(AppLanguage), expectedResult);
		Assert.assertEquals(CallDoctor_EN_AR_Obj.Login_RegisterNow(AppLanguage), expectedResult);
	}
}
