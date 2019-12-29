package backUp;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LanguageFirstPage;
import pages.LoginPageEN_AR;
import pages.helpPageEN_AR;
import pages.sideMenu;

public class LoginLocalizationTCs extends TestBase {

	// Objects from classes
	LoginPageEN_AR LoginPageEN_AR_Obj = null;
	sideMenu sideMenu_Obj = null;
	helpPageEN_AR helpPageEN_ObjEN_AR = null;
	LanguageFirstPage LanguageFirstPage_Obj = null;

	String AppLanguage;
	boolean expected = true;

	/*
	 * //@BeforeClass
	 * 
	 * @BeforeMethod(dependsOnMethods = "launchApp") private void
	 * initializeObjects() { try { LoginPageEN_AR_Obj = new LoginPageEN_AR(driver);
	 * sideMenu_Obj = new sideMenu(driver); LanguageFirstPage_Obj = new
	 * LanguageFirstPage(driver); helpPageEN_ObjEN_AR = new helpPageEN_AR(driver); }
	 * catch (Exception e) { System.out.println("ex: (( " + e +"))"); } }
	 */
	// CloseApp
	@BeforeMethod
	@Test(priority = 1, enabled = true)
	public void firstScreen_displayed() {
		// launchApp();
		launchApp();

		// Allow location Permissions
		LanguageFirstPage_Obj.allowPermission();

		// Validate the first screen of language selection is displayed properly
		Assert.assertEquals(LanguageFirstPage_Obj.ContentDisplayedProperly(), expected);
		// CloseApp();
		CloseApp();

	}

	@Test(priority = 2, enabled = true, dependsOnMethods = "firstScreen_displayed")
	public void loginScreen_displayed_EN() {

		launchApp();

		AppLanguage = "EN";

		// Allow location Permissions
		LanguageFirstPage_Obj.allowPermission();

		// Choose English Language
		LanguageFirstPage_Obj.choose_EN_BTN();

		// Validate the login screen of language English is displayed properly
		Assert.assertEquals(LoginPageEN_AR_Obj.ContentDisplayedProperly(AppLanguage), expected);
		CloseApp();

	}

	@Test(priority = 3, enabled = true, dependsOnMethods = "firstScreen_displayed")
	public void loginScreen_displayed_AR() {
		launchApp();

		AppLanguage = "AR";

		// Allow location Permissions
		LanguageFirstPage_Obj.allowPermission();

		// Choose Arabic Language
		LanguageFirstPage_Obj.choose_AR_BTN();

		// Validate the login screen of language Arabic is displayed properly
		Assert.assertEquals(LoginPageEN_AR_Obj.ContentDisplayedProperly(AppLanguage), expected);
		CloseApp();

	}

	@Test(priority = 4, enabled = true, dependsOnMethods = "firstScreen_displayed")
	public void help_displayed_EN() {
		launchApp();

		AppLanguage = "EN";

		// Allow location Permissions
		LanguageFirstPage_Obj.allowPermission();

		// Choose English Language
		LanguageFirstPage_Obj.choose_EN_BTN();

		// Click on Help
		LoginPageEN_AR_Obj.clickOn_helpBTN();

		// Validate the help screen of language English is displayed properly
		Assert.assertEquals(helpPageEN_ObjEN_AR.ContentDisplayedProperly(AppLanguage), expected);
		CloseApp();

	}

	@Test(priority = 5, enabled = true, dependsOnMethods = "firstScreen_displayed")
	public void help_displayed_AR() {
		launchApp();

		AppLanguage = "AR";

		// Allow location Permissions
		LanguageFirstPage_Obj.allowPermission();

		// Choose Arabic Language
		LanguageFirstPage_Obj.choose_AR_BTN();

		// Click on Help
		LoginPageEN_AR_Obj.clickOn_helpBTN();

		// Validate the help screen of language Arabic is displayed properly
		Assert.assertEquals(helpPageEN_ObjEN_AR.ContentDisplayedProperly(AppLanguage), expected);
		CloseApp();

	}

}
