package backUp;

import org.testng.annotations.Test;

public class EditProfile extends TestBase {

	@Test(priority = 1, enabled = true)
	private void editProfile_displayed() throws InterruptedException {
		/*
		 * // LOGIN DATA WITH MERGIND OLD DATA String MobileNumber = "552223311"; String
		 * Password = "12345678"; String YesOrNo = "Yes";
		 * 
		 * // USER DATA - EDIT PROFILE String FirstName = "TesterFN"; String LastName =
		 * "TesterLN"; String Gender = "Male"; // Male or Female String BirthDate =
		 * "May 22, 2002";
		 * 
		 * // Allow location Permissions LanguageFirstPage.allowPermission();
		 * 
		 * // Choose English Language LanguageFirstPage.choose_EN_BTN();
		 * 
		 * LoginPageEN.ContinueWith(MobileNumber); passwordPage.loginToTheApp(Password);
		 * passwordPage.MergeGuestData(YesOrNo);
		 * 
		 * if (YesOrNo.equals("Yes")) {
		 * Assert.assertEquals(HomePage.NewAddedReading(Login.StepsValue), true);
		 * System.out.println("New data added due to Yes Merge");
		 * 
		 * } else { Assert.assertEquals(HomePage.homeScreenIsDisplayed(), true);
		 * System.out.println("Old Data should be displayed due to  No Merge");
		 * 
		 * } sideMenu.editMyProfileWith(FirstName, LastName, Gender, BirthDate);
		 */
	}

}
