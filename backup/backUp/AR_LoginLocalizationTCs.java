package backUp;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import backUp.TestBase;
import pages.LanguageFirstPage;
import pages.LoginPageEN_AR;
import pages.helpPageEN_AR;
import pages.sideMenu;

public class AR_LoginLocalizationTCs extends TestBase {

	// Attributes
	String AppLanguage = "AR";
	boolean expectedResult = true;

	// Objects from classes
	LoginPageEN_AR LoginPageEN_AR_Obj = null;
	sideMenu sideMenu_Obj = null;
	helpPageEN_AR helpPageEN_ObjEN_AR = null;
	LanguageFirstPage LanguageFirstPage_Obj = null;

	@BeforeClass
	// @BeforeMethod(dependsOnMethods = "launchApp")
	private void initializeObjects() {
		try {
			LoginPageEN_AR_Obj = new LoginPageEN_AR(driver);
			sideMenu_Obj = new sideMenu(driver);
			LanguageFirstPage_Obj = new LanguageFirstPage(driver);
			helpPageEN_ObjEN_AR = new helpPageEN_AR(driver);
		} catch (Exception e) {
			System.out.println("ex: (( " + e + "))");
		}
	}

	@Test(priority = 1, enabled = true)
	public void firstScreen_displayed() {
		//

		// Allow location Permissions
		LanguageFirstPage_Obj.allowPermission();

		// Validate the first screen of language selection is displayed properly
		Assert.assertEquals(LanguageFirstPage_Obj.ContentDisplayedProperly(), expectedResult);

		// Choose Arabic Language
		LanguageFirstPage_Obj.choose_AR_BTN();

	}

	@Test(priority = 2, enabled = true, dependsOnMethods = "firstScreen_displayed")
	public void loginScreen_displayed_AR() {

		// Validate the login screen of language Arabic is displayed properly
		Assert.assertEquals(LoginPageEN_AR_Obj.ContentDisplayedProperly(AppLanguage), expectedResult);

	}

	@Test(priority = 3, enabled = true, dependsOnMethods = "loginScreen_displayed_AR")
	public void help_displayed_AR() {

		// Click on Help
		LoginPageEN_AR_Obj.clickOn_helpBTN();

		// Validate the help screen of language Arabic is displayed properly
		Assert.assertEquals(helpPageEN_ObjEN_AR.ContentDisplayedProperly(AppLanguage), expectedResult);

	}
}
