package backUp;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import pages.passwordPage;

public class AppBaseCases extends TestBase {

	
	// Objects from classes

	passwordPage passwordPageObj = null;
	HomePage HomePageObj = null;

	// Objects initialization
	@BeforeClass
	private void initializeObjects() {
		passwordPageObj = new passwordPage(driver);
		HomePageObj = new HomePage(driver);

	}

	///////// CALL METHODS /////////

	public void mergingDataValidation(String YesOrNoMerge, String old_New_ReadingValue) {

		// Merge previous guest data
		passwordPageObj.MergeGuestData(YesOrNoMerge);

		if (YesOrNoMerge.equalsIgnoreCase("yes")) {
			// Validate data is displayed
			Assert.assertEquals(HomePageObj.NewAddedReading(old_New_ReadingValue), true);
			System.out.println("New data added due to Yes Merge");
		} else {
			// Validate old data is displayed not the new data
			Assert.assertEquals(HomePageObj.NewAddedReading(old_New_ReadingValue), true);
			System.out.println("Old Data should be displayed due to No Merge");
		}

	}

}
