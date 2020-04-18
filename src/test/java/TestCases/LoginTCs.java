package TestCases;

import TestData.configInputData;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTCs extends TestBase {


	// Objects from classes
	LoginPage LoginObject = null;


	@BeforeClass
	private void initializeObjects() {
		try {
			LoginObject = new LoginPage(driver);

		} catch (Exception e) {
			System.out.println("ex: (( " + e + "))");
		}
	}





	@Test(priority = 1, enabled = true)
	public void login() {
		// Create Test Case For login
		logger = report.createTest("Login To OneHealth");
		//Login with Valid User Name & Password
		LoginObject.loginWithRegisteredUser(configInputData.phoneNubmer,configInputData.Password);
		logger.info("Add Phone number and Password " );

		//Log Pass Status
		logger.pass("User logged in successfully");



	}


//	@Test(priority = 1, enabled = false)
//	public void loginAsGuest_And_Logout_AR() throws InterruptedException {
//		boolean actual = LoginPageEN_AR_Obj.LoginAsGuest(AppLanguage);
//		Assert.assertEquals(actual, expectedResult);
//		Assert.assertEquals(sideMenu_Obj.LogoutFromApp(AppLanguage), expectedResult);
//	}

//	@Test(priority = 2, enabled = true)
//	public void loginAsRegistered_And_Logout_AR() throws InterruptedException {
//
//		String phoneNumString = "1019544789";
//		String phoneNumPassString = "asdasdasd";
//
//	//	languge.choose_EN_BTN();
//
//	//LoginPageEN_AR_Obj.loginWithRegisteredUser(phoneNumString,phoneNumPassString);
//
////		homePage_Obj.clickmore();
////		sideMenu_Obj.clickOnReadings();
////
////		addNewReadingPage_Obj.addsteps();
////
////	addNewReadingPage_Obj.Add_Blood_Sugar();
////		addNewReadingPage_Obj.Add_weight();
////	   addNewReadingPage_Obj.Add_Oxygen_level();
////
////		//addNewReadingPage_Obj.Add_VF();
////		addNewReadingPage_Obj.Add_Blood_Pressure();
////		addNewReadingPage_Obj.Add_Heart_Rate();
////		addNewReadingPage_Obj.Add_Temperature();
////
////	//	addNewReadingPage_Obj.Show_all_Celles();
////		addNewReadingPage_Obj.Add_Respiration_Rate();
////		addNewReadingPage_Obj.Add_BMI();
////		addNewReadingPage_Obj.Add_Bone_Mass();
////		addNewReadingPage_Obj.Add_Muscles_Mass();
////		addNewReadingPage_Obj.Add_Body_Fats();
////		addNewReadingPage_Obj.Add_Body_Water();
////		addNewReadingPage_Obj.Add_VF();
//
//	}

}
