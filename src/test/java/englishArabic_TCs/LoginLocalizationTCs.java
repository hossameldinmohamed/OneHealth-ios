//package englishArabic_TCs;
//
//import org.testng.Assert;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import pages.LanguageFirstPage;
//import pages.LoginPageEN_AR;
//import pages.helpPageEN_AR;
//import pages.sideMenu;
//
//public class LoginLocalizationTCs extends TestBase {
//
//	// Attributes
//	String AppLanguage = "EN";
//	boolean expectedResult = true;
//
//	// Objects from classes
//	LoginPageEN_AR LoginPageEN_AR_Obj = null;
//	sideMenu sideMenu_Obj = null;
//	helpPageEN_AR helpPageEN_ObjEN_AR = null;
//	LanguageFirstPage LanguageFirstPage_Obj = null;
//
//	@BeforeClass
//	// @BeforeMethod(dependsOnMethods = "launchApp")
//	private void initializeObjects() {
//		try {
//			LoginPageEN_AR_Obj = new LoginPageEN_AR(driver);
//			sideMenu_Obj = new sideMenu(driver);
//			LanguageFirstPage_Obj = new LanguageFirstPage(driver);
//			helpPageEN_ObjEN_AR = new helpPageEN_AR(driver);
//		} catch (Exception e) {
//			System.out.println("ex: (( " + e + "))");
//		}
//	}
//
//	@Test(priority = 1, enabled = true)
//	public void firstScreen_displayed() {
//		System.out.println("TC: firstScreen_displayed");
//
//		// Allow location Permissions
//		LanguageFirstPage_Obj.allowPermission();
//
//		// Validate the first screen of language selection is displayed properly
//		Assert.assertEquals(LanguageFirstPage_Obj.ContentDisplayedProperly(), expectedResult);
//
//		if (AppLanguage.equalsIgnoreCase("EN") || AppLanguage.equalsIgnoreCase("ENGLISH")) {
//			// Choose English Language
//			LanguageFirstPage_Obj.choose_EN_BTN();
//		} else if (AppLanguage.equalsIgnoreCase("AR") || AppLanguage.equalsIgnoreCase("ARABIC")) {
//			// Choose Arabic Language
//			LanguageFirstPage_Obj.choose_AR_BTN();
//		}
//		// Validate the login screen of language English / Arabic is displayed properly
//		Assert.assertEquals(LoginPageEN_AR_Obj.ContentDisplayedProperly(AppLanguage), expectedResult);
//
//	}
//
//	@Test(priority = 2, enabled = true, dependsOnMethods = "firstScreen_displayed")
//	public void help_displayed_EN() {
//
//		// Click on Help
//		LoginPageEN_AR_Obj.clickOn_helpBTN();
//
//		// Validate the help screen of language English / Arabic is displayed properly
//		Assert.assertEquals(helpPageEN_ObjEN_AR.ContentDisplayedProperly(AppLanguage), expectedResult);
//
//	}
//
//}
