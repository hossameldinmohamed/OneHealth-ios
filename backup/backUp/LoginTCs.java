package backUp;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddNewReadingPage;
import pages.LoginPageEN_AR;
import pages.sideMenu;
import pages.HomePage;

public class LoginTCs extends TestBase {

	// Objects from classes
	LoginPageEN_AR LoginPageEN_AR_Obj = null;
	sideMenu sideMenu_Obj = null;
	HomePage homePage_Obj = null;
	AddNewReadingPage addNewReadingPage_Obj = null;

	// Attributes
	String AppLanguage;
	boolean expected = true;

	@BeforeMethod(dependsOnMethods = "setup")
	private void initializeObjects() {
		try {
			LoginPageEN_AR_Obj = new LoginPageEN_AR(driver);
			sideMenu_Obj = new sideMenu(driver);
			addNewReadingPage_Obj = new AddNewReadingPage(driver);
			homePage_Obj = new HomePage(driver);
		} catch (Exception e) {
			System.out.println("ex: (( " + e + "))");
		}
	}

	@Test(priority = 1, enabled = true)
	public void loginAsGuest_And_Logout_AR() throws InterruptedException {
		AppLanguage = "AR";
		boolean actual = LoginPageEN_AR_Obj.LoginAsGuest(AppLanguage);
		Assert.assertEquals(actual, expected);
		Assert.assertEquals(sideMenu_Obj.LogoutFromApp(AppLanguage), expected);
	}

	@Test(priority = 2, enabled = false)
	public void loginAsRegistered_And_Logout_AR() throws InterruptedException {

		AppLanguage = "AR";
		String phoneNumString = "552223311";
		String phoneNumPassString = "12345678";
		String MergeOldData_YesNo = "No";

		LoginPageEN_AR_Obj.loginWithRegisteredUser(AppLanguage, phoneNumString, phoneNumPassString, MergeOldData_YesNo);
		Assert.assertEquals(sideMenu_Obj.LogoutFromApp(AppLanguage), expected);
	}

	@Test(priority = 3, enabled = true)
	public void loginAsGuest_And_Logout_EN() throws InterruptedException {

		AppLanguage = "EN";
		boolean actual = LoginPageEN_AR_Obj.LoginAsGuest(AppLanguage);
		Assert.assertEquals(actual, expected);
		Assert.assertEquals(sideMenu_Obj.LogoutFromApp(AppLanguage), expected);
	}

	@Test(priority = 4, enabled = false)
	public void loginAsRegistered_And_Logout_EN() throws InterruptedException {

		AppLanguage = "EN";
		String phoneNumString = "552223311";
		String phoneNumPassString = "12345678";
		String MergeOldData_YesNo = "No";

		LoginPageEN_AR_Obj.loginWithRegisteredUser(AppLanguage, phoneNumString, phoneNumPassString, MergeOldData_YesNo);
		Assert.assertEquals(sideMenu_Obj.LogoutFromApp(AppLanguage), expected);
	}
	// Check the guest can add new reading and displayed in the HomePage properly
	// then logout

	@Test(priority = 5, enabled = false, dependsOnMethods = "loginAsGuest_And_Logout_EN")
	private void GuestCanAddReadingAndLogout_EN() throws InterruptedException {

		AppLanguage = "EN";
		String StepsValue = "2000"; // Reading Value
		String ReadingType = "Steps"; // Reading Type

		// Validate the Home screen of EN language is displayed properly
		boolean GuestLoginActual = LoginPageEN_AR_Obj.LoginAsGuest(AppLanguage);
		Assert.assertEquals(GuestLoginActual, expected);

		// Validate the Home screen of EN language display the added reading value
		// properly
		boolean GuestAddReadingActual = addNewReadingPage_Obj.AddNewStepsReading(StepsValue, ReadingType);
		Assert.assertEquals(GuestAddReadingActual, expected);

		// Validate the login screen of language English displayed properly
		Assert.assertEquals(sideMenu_Obj.LogoutFromApp(AppLanguage), expected);
	}

}
