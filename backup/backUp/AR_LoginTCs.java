package backUp;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import backUp.TestBase;
import pages.AddNewReadingPage;
import pages.LoginPageEN_AR;
import pages.sideMenu;
import pages.HomePage;

public class AR_LoginTCs extends TestBase {

	// Attributes
	String AppLanguage = "EN";
	boolean expectedResult = true;

	// Objects from classes
	LoginPageEN_AR LoginPageEN_AR_Obj = null;
	sideMenu sideMenu_Obj = null;
	HomePage homePage_Obj = null;
	AddNewReadingPage addNewReadingPage_Obj = null;

	@BeforeClass
	// @BeforeMethod(dependsOnMethods = "launchApp")
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
		boolean actual = LoginPageEN_AR_Obj.LoginAsGuest(AppLanguage);
		Assert.assertEquals(actual, expectedResult);
		Assert.assertEquals(sideMenu_Obj.LogoutFromApp(AppLanguage), expectedResult);
	}

	@Test(priority = 2, enabled = true)
	public void loginAsRegistered_And_Logout_AR() throws InterruptedException {

		String phoneNumString = "552223311";
		String phoneNumPassString = "12345678";
		String MergeOldData_YesNo = "No";

		boolean actual = LoginPageEN_AR_Obj.loginWithRegisteredUser(AppLanguage, phoneNumString, phoneNumPassString,
				MergeOldData_YesNo);
		Assert.assertEquals(actual, expectedResult);
		Assert.assertEquals(sideMenu_Obj.LogoutFromApp(AppLanguage), expectedResult);
	}

}
