package englishArabic_TCs;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.*;
import pages.LoginPage;

public class LoginTCs extends TestBase {

	// Attributes
	String AppLanguage = "AR";
	boolean expectedResult = true;

	// Objects from classes
	LoginPage LoginPageEN_AR_Obj = null;
	sideMenu sideMenu_Obj = null;
	HomePage homePage_Obj = null;
	ReadingPage addNewReadingPage_Obj = null;
    LanguageFirstPage languge;
	
	@BeforeClass
	// @BeforeMethod(dependsOnMethods = "launchApp")
	private void initializeObjects() {
		try {
			LoginPageEN_AR_Obj = new LoginPage(driver);
	      	sideMenu_Obj = new sideMenu(driver);
			addNewReadingPage_Obj = new ReadingPage(driver);
			homePage_Obj = new HomePage(driver);
			languge = new LanguageFirstPage(driver);
		} catch (Exception e) {
			System.out.println("ex: (( " + e + "))");
		}
	}

//	@Test(priority = 1, enabled = false)
//	public void loginAsGuest_And_Logout_AR() throws InterruptedException {
//		boolean actual = LoginPageEN_AR_Obj.LoginAsGuest(AppLanguage);
//		Assert.assertEquals(actual, expectedResult);
//		Assert.assertEquals(sideMenu_Obj.LogoutFromApp(AppLanguage), expectedResult);
//	}

	@Test(priority = 2, enabled = true)
	public void loginAsRegistered_And_Logout_AR() throws InterruptedException {

		String phoneNumString = "1019544789";
		String phoneNumPassString = "asdasdasd";
		
	//	languge.choose_EN_BTN();
		
	//LoginPageEN_AR_Obj.loginWithRegisteredUser(phoneNumString,phoneNumPassString);
		
//		homePage_Obj.clickmore();
//		sideMenu_Obj.clickOnReadings();
//		
//		addNewReadingPage_Obj.addsteps();
//		
//	addNewReadingPage_Obj.Add_Blood_Sugar();
//		addNewReadingPage_Obj.Add_weight();
//	   addNewReadingPage_Obj.Add_Oxygen_level();
//		
//		//addNewReadingPage_Obj.Add_VF();
//		addNewReadingPage_Obj.Add_Blood_Pressure();
//		addNewReadingPage_Obj.Add_Heart_Rate();
//		addNewReadingPage_Obj.Add_Temperature();
//		
//	//	addNewReadingPage_Obj.Show_all_Celles();
//		addNewReadingPage_Obj.Add_Respiration_Rate();
//		addNewReadingPage_Obj.Add_BMI();
//		addNewReadingPage_Obj.Add_Bone_Mass();
//		addNewReadingPage_Obj.Add_Muscles_Mass();
//		addNewReadingPage_Obj.Add_Body_Fats();
//		addNewReadingPage_Obj.Add_Body_Water();
//		addNewReadingPage_Obj.Add_VF();
		
	}

}
