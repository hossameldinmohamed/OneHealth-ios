package backUp;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPageEN_AR;
import pages.CallDoctor_EN_AR;
import pages.sideMenu;

public class CallDoctorTCs extends TestBase {

	// Objects from classes

	CallDoctor_EN_AR CallDoctor_EN_AR_Obj = null;
	LoginPageEN_AR LoginPageEN_AR_Obj = null;
	sideMenu sideMenu_Obj = null;

	// Attributes
	String AppLanguage;
	boolean expected = true;

	@BeforeMethod(dependsOnMethods = "setup")
	private void initializeObjects() {
		try {
			LoginPageEN_AR_Obj = new LoginPageEN_AR(driver);
			sideMenu_Obj = new sideMenu(driver);
			CallDoctor_EN_AR_Obj = new CallDoctor_EN_AR(driver);
		} catch (Exception e) {
			System.out.println("ex: (( " + e + "))");
		}
	}

	@Test(priority = 6, enabled = true)
	private void GuestVideoCall_NotNow_EN() throws InterruptedException {

		AppLanguage = "EN";
		// login as guest in English language
		boolean actual = LoginPageEN_AR_Obj.LoginAsGuest(AppLanguage);
		Assert.assertEquals(actual, expected);

		// make a video call
		CallDoctor_EN_AR_Obj.ContentDisplayedProperly(AppLanguage);
		// CallDoctor_EN_AR_Obj.makeVideoCall();

		// validate Pop-up content of the guest video call
		Assert.assertEquals(CallDoctor_EN_AR_Obj.videoPopUpcontentDisplayed(AppLanguage), expected);
		Assert.assertEquals(CallDoctor_EN_AR_Obj.NotNowVideoRegister(AppLanguage), expected);
		Assert.assertEquals(sideMenu_Obj.LogoutFromApp(AppLanguage), expected);

	}

	@Test(priority = 7, enabled = true)
	private void GuestVideoCall_NotNow_AR() throws InterruptedException {

		AppLanguage = "AR";
		// login as guest in English language
		boolean actual = LoginPageEN_AR_Obj.LoginAsGuest(AppLanguage);
		Assert.assertEquals(actual, expected);

		// make a video call
		CallDoctor_EN_AR_Obj.ContentDisplayedProperly(AppLanguage);
		// CallDoctor_EN_AR_Obj.makeVideoCall();

		// validate Pop-up content of the guest video call
		Assert.assertEquals(CallDoctor_EN_AR_Obj.videoPopUpcontentDisplayed(AppLanguage), expected);
		Assert.assertEquals(CallDoctor_EN_AR_Obj.NotNowVideoRegister(AppLanguage), expected);
		Assert.assertEquals(sideMenu_Obj.LogoutFromApp(AppLanguage), expected);

	}

	@Test(priority = 8, enabled = true)
	private void GuestVideoCall__LoginEN() throws InterruptedException {

		AppLanguage = "EN";
		// login as guest in English language
		boolean actual = LoginPageEN_AR_Obj.LoginAsGuest(AppLanguage);
		Assert.assertEquals(actual, expected);

		// make a video call
		CallDoctor_EN_AR_Obj.ContentDisplayedProperly(AppLanguage);
		// CallDoctor_EN_AR_Obj.makeVideoCall();

		// validate Pop-up content of the guest video call
		Assert.assertEquals(CallDoctor_EN_AR_Obj.videoPopUpcontentDisplayed(AppLanguage), expected);
		Assert.assertEquals(CallDoctor_EN_AR_Obj.Login_RegisterNow(AppLanguage), expected);
	}

	@Test(priority = 9, enabled = true)
	private void GuestVideoCall_Login_AR() throws InterruptedException {

		AppLanguage = "AR";
		// login as guest in English language
		boolean actual = LoginPageEN_AR_Obj.LoginAsGuest(AppLanguage);
		Assert.assertEquals(actual, expected);

		// make a video call
		CallDoctor_EN_AR_Obj.ContentDisplayedProperly(AppLanguage);

		// validate Pop-up content of the guest video call
		Assert.assertEquals(CallDoctor_EN_AR_Obj.videoPopUpcontentDisplayed(AppLanguage), expected);
		Assert.assertEquals(CallDoctor_EN_AR_Obj.Login_RegisterNow(AppLanguage), expected);
	}

}
