package backUp;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.ahmed.excelizer.ExcelReader;
import junit.framework.Assert;
import pages.AddNewReadingPage;
import pages.LoginPageEN_AR;

public class ReadingsTCs extends TestBase {
/*
	LoginPageEN_AR loginpage;
	AddNewReadingPage add;
	// ExcelUtils e ;

	String filePath = System.getProperty("user.dir") + "/src/test/java/TestData/ReadingsData.xlsx";

	@DataProvider(name = "Steps")
	public Object[][] stepsData() {

		return ExcelReader.loadTestData(filePath, "Steps");

	}

	@DataProvider(name = "Blood Sugar")
	public Object[][] bloodreading() {

		return ExcelReader.loadTestData(filePath, "Blood Sugar");

	}

	@DataProvider(name = "Weight")
	public Object[][] weightreading() {

		return ExcelReader.loadTestData(filePath, "Weight");

	}

	@DataProvider(name = "Oxygen Level")
	public Object[][] oxygenleve() {

		return ExcelReader.loadTestData(filePath, "Oxygen Level");
	}

	@DataProvider(name = "Blood Pressure")
	public Object[][] Blood_Pressure() {

		return ExcelReader.loadTestData(filePath, "Blood Pressure");
	}

	@DataProvider(name = "Heart Rate")
	public Object[][] Heart_Rate() {

		return ExcelReader.loadTestData(filePath, "Heart Rate");
	}

	@DataProvider(name = "Temperature")
	public Object[][] Temperature() {

		return ExcelReader.loadTestData(filePath, "Temperature");
	}

	@DataProvider(name = "Respiration Rate")
	public Object[][] Respiration_Rate() {

		return ExcelReader.loadTestData(filePath, "Respiration Rate");
	}

	@DataProvider(name = "BMI")
	public Object[][] BMI() {

		return ExcelReader.loadTestData(filePath, "BMI");
	}

	@DataProvider(name = "Bones Mass")
	public Object[][] Bones_Mass() {

		return ExcelReader.loadTestData(filePath, "Bones Mass");
	}

	@DataProvider(name = "Muscle Mass")
	public Object[][] Muscle_Mass() {

		return ExcelReader.loadTestData(filePath, "Muscle Mass");
	}

	@DataProvider(name = "Body Fat")
	public Object[][] Body_Fat() {

		return ExcelReader.loadTestData(filePath, "Body Fat");
	}

	@DataProvider(name = "Body Water")
	public Object[][] Body_Water() {

		return ExcelReader.loadTestData(filePath, "Body Water");
	}

	@DataProvider(name = "Fasceral Fat")
	public Object[][] Fasceral_Fat() {

		return ExcelReader.loadTestData(filePath, "Fasceral Fat");
	}

	@Test(priority = 1, enabled = true)
	public void login() {

		loginpage = new LoginPageEN_AR(driver);
		add = new AddNewReadingPage(driver);
		loginpage.login("egypt", "1006147962", "mmgh0123");
	}

	@Test(priority = 2, enabled = true, dependsOnMethods = "login", dataProvider = "Steps")
	public void Steps(String Readval, String read) {

		add.Add_Steps(Readval);
	}

// 7 fail
	@Test(priority = 3, enabled = false, dependsOnMethods = "login", dataProvider = "Blood Sugar")
	public void AddBloodData(String Readval, String foodReference, String status) {
		if (foodReference.toString().equals("Before Meal")) {

			add.Add_blood_Sugar(Readval);
			Assert.assertEquals(status, add.r.toString());

		} else {

			add.Add_blood_Sugar2(Readval);
			Assert.assertEquals(status, add.r.toString());

		}

	}

	// pass

	@Test(priority = 4, enabled = false, dependsOnMethods = "login", dataProvider = "Weight")
	public void AddWeight(String Readval, String status) {

		add.add_weight(Readval);

	}

// fail 4
	@Test(priority = 5, enabled = false, dependsOnMethods = "login", dataProvider = "Oxygen Level")
	public void Add_Oxygen_Level(String Readval, String Provision, String status) {

		if (Provision.toString().equals("On Air")) {
			add.add_Oxygen_On_Air(Readval);
			Assert.assertEquals(status, add.r.toString());
		} else
			add.add_Oxygen_On_oxygen(Readval);
		Assert.assertEquals(status, add.r.toString());
	}

// 2 fail
	@Test(priority = 6, enabled = false, dependsOnMethods = "login", dataProvider = "Blood Pressure")
	public void Add_Blood_Pressure(String Systolic, String Dialstolic, String status) {

		add.Add_Blood_Pressure(Systolic, Dialstolic);

		Assert.assertEquals(status, add.r.toString());

	}

// 4 fail
	@Test(priority = 7, enabled = false, dependsOnMethods = "login", dataProvider = "Heart Rate")
	public void Add_Heart_Rate(String value, String status) {

		add.Add_Heart_Rate(value);
		Assert.assertEquals(status, add.r.toString());

	}

// 3 fail
	@Test(priority = 7, enabled = false, dependsOnMethods = "login", dataProvider = "Temperature")
	public void Add_Temperature(String value, String status) {

		add.Add_Temperature(value);
		Assert.assertEquals(status, add.r.toString());

	}

// 2 fail ( 1 & 18 )
	@Test(priority = 8, enabled = false, dependsOnMethods = "login", dataProvider = "Respiration Rate")
	public void Add_Respiration_Rate(String value, String status) {

		add.Add_Respiration_Rate(value);
		Assert.assertEquals(status, add.r.toString());

	}

	// pass
	@Test(priority = 9, enabled = false, dependsOnMethods = "login", dataProvider = "BMI")
	public void Add_BMI(String weight, String height) {

		add.Add_BMI(weight, height);

	}

	// fail 1
	@Test(priority = 10, enabled = false, dependsOnMethods = "login", dataProvider = "Bones Mass")
	public void Add_Bones_Mass(String value, String status) {

		add.Add_Bones_Mass(value);
		Assert.assertEquals(status, add.r.toString());

	}

/// stopped heree...
	@Test(priority = 11, enabled = false, dependsOnMethods = "login", dataProvider = "Muscle Mass")
	public void Add_Muscle_Mass(String value, String status) {

		add.Add_Muscle_Mass(value);
		Assert.assertEquals(status, add.r.toString());

	}

	@Test(priority = 12, enabled = false, dependsOnMethods = "login", dataProvider = "Body Fat")
	public void Add_body_Fat(String value, String status) {

		add.Add_Body_Fat(value);
		Assert.assertEquals(status, add.r.toString());

	}

	@Test(priority = 13, enabled = false, dependsOnMethods = "login", dataProvider = "Body Water")
	public void Add_body_Water(String value, String status) {

		add.Add_Body_Water(value);
		Assert.assertEquals(status, add.r.toString());

	}

	@Test(priority = 14, enabled = false, dependsOnMethods = "login", dataProvider = "Fasceral Fat")
	public void Add_Fasceral_Fat(String value, String status) {

		add.Add_Body_Water(value);
		Assert.assertEquals(status, add.r.toString());

	}
*/
}
