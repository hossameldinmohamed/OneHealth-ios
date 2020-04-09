package englishArabic_TCs;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.ahmed.excelizer.ExcelReader;

import TestData.configInputData;
import junit.framework.Assert;
import pages.ReadingPage;
import pages.HomePage;
import pages.LoginPage;
import pages.sideMenu;

public class ReadingsTCs extends TestBase {



	ReadingPage ReadingObject = null;
	LoginPage LoginObject = null;
	sideMenu sideMenuObject = null;
	HomePage homePageObject = null;


	@BeforeClass
	private void initializeObjects() {
		try {
			sideMenuObject = new sideMenu(driver);
			LoginObject = new LoginPage(driver);
			homePageObject = new HomePage(driver);
			ReadingObject =new ReadingPage(driver);
		} catch (Exception e) {
			System.out.println("exception: (( " + e + "))");
		}
	}

	//Reading Excel Sheet Path 
	String EnglishReadingFilePath = configInputData.ReadingexcelSheetEnglishPath;
	String ArabicReadingFilePath = configInputData.ReadingexcelSheetArabicPath;

	@DataProvider(name = "Steps")
	public Object[][] stepsData() {

		return ExcelReader.loadTestData(EnglishReadingFilePath, "Steps");
	}

	@DataProvider(name = "Blood Sugar")
	public Object[][] bloodreading() {

		if(configInputData.AppLanguage=="Arabic")
		return ExcelReader.loadTestData(EnglishReadingFilePath, "Blood Sugar");
		
		else 
		return ExcelReader.loadTestData(EnglishReadingFilePath, "Blood Sugar");

	}

	@DataProvider(name = "Weight")
	public Object[][] weightreading() {

		return ExcelReader.loadTestData(EnglishReadingFilePath, "Weight");
	}

	@DataProvider(name = "Oxygen Level")
	public Object[][] oxygenleve() {

		return ExcelReader.loadTestData(EnglishReadingFilePath, "Oxygen Level");
	}

	@DataProvider(name = "Blood Pressure")
	public Object[][] Blood_Pressure() {

		return ExcelReader.loadTestData(EnglishReadingFilePath, "Blood Pressure");
	}

	@DataProvider(name = "Heart Rate")
	public Object[][] Heart_Rate() {

		return ExcelReader.loadTestData(EnglishReadingFilePath, "Heart Rate");
	}

	@DataProvider(name = "Temperature")
	public Object[][] Temperature() {

		return ExcelReader.loadTestData(EnglishReadingFilePath, "Temperature");
	}

	@DataProvider(name = "Respiration Rate")
	public Object[][] Respiration_Rate() {

		return ExcelReader.loadTestData(EnglishReadingFilePath, "Respiration Rate");
	}

	@DataProvider(name = "BMI")
	public Object[][] BMI() {

		return ExcelReader.loadTestData(EnglishReadingFilePath, "BMI");
	}

	@DataProvider(name = "Bones Mass")
	public Object[][] Bones_Mass() {

		return ExcelReader.loadTestData(EnglishReadingFilePath, "Bones Mass");
	}

	@DataProvider(name = "Muscle Mass")
	public Object[][] Muscle_Mass() {

		return ExcelReader.loadTestData(EnglishReadingFilePath, "Muscle Mass");
	}

	@DataProvider(name = "Body Fat")
	public Object[][] Body_Fat() {

		return ExcelReader.loadTestData(EnglishReadingFilePath, "Body Fat");
	}

	@DataProvider(name = "Body Water")
	public Object[][] Body_Water() {

		return ExcelReader.loadTestData(EnglishReadingFilePath, "Body Water");
	}

	@DataProvider(name = "Visceral Fat Rating")
	public Object[][] Fasceral_Fat() {

		return ExcelReader.loadTestData(EnglishReadingFilePath, "Visceral Fat Rating");
	}

	//////////////////////////////////// Tests /////////////////////////////////


	@Test(priority = 1, enabled = false)
	public void login() {
		// Create Test Case For login 
		logger = report.createTest("Login To OneHealth");	
		//Login with Valid User Name & Password
		LoginObject.loginWithRegisteredUser(configInputData.phoneNubmer,configInputData.Password);
		logger.info("Add Phone number and Password " );

		//Log Pass Status
		logger.pass("User logged in successfully");



	}


	@Test(priority = 2 , enabled = true )
	public void showAllReadingsCells() {
		// Method to Show all Readings Cards 

		// Create Test Case For showing all Cards
		logger = report.createTest("Show all Cells ");	

		//Click on More icon from home page
		homePageObject.clickmore();
		logger.info("Click on More Button");

		//Select Reading from Menu
		sideMenuObject.clickOnReadings();
		logger.info("Select Readings from Menu");

		//Display all reading cells to validate the status 
		ReadingObject.Show_all_Celles();
		logger.info("Show all Readings cells ");

	}





	@Test(priority = 3, enabled = true, dependsOnMethods = "showAllReadingsCells", dataProvider = "Steps")
	public void addStepsReading(String Readval, String read) {
		logger = report.createTest("Add Steps Readings");	


		logger.info("Add Steps Reading = " + Readval);
		Assert.assertEquals(Readval, ReadingObject.addsteps(Readval));

		logger.pass("Steps Readings Added successfully");

	}

	@Test(priority = 4, enabled = true, dependsOnMethods = "showAllReadingsCells",  dataProvider = "Blood Sugar")
	public void addBloodSugarReading(String Readvalue, String foodReference, String status) {
		if (foodReference.toString().equals("Before Meal")) {



		} else {

			logger = report.createTest("Add Blood suger Readings");	
			//try {
			logger.info("Add Blood Suger Reading = " + Readvalue);
			Assert.assertEquals(status, ReadingObject.Add_Blood_Sugar(Readvalue));

		}
	}

	@Test(priority = 5, enabled = true, dependsOnMethods = "showAllReadingsCells", dataProvider = "Oxygen Level")
	public void addOxygenLevelReading(String ReadValue, String Provision, String status) {

		logger = report.createTest("Add Oxygen Level Readings");	

		if (Provision.toString().equals("On Air")) {
			//try {
			logger.info("Add Oxygen Level Reading = " + ReadValue);
			Assert.assertEquals(status,	ReadingObject.Add_Oxygen_level(ReadValue));

		} //else

	}

	@Test(priority = 6, enabled = true, dependsOnMethods = "showAllReadingsCells", dataProvider = "Blood Pressure")
	public void addBloodPressureReading(String Systolic, String Dialstolic, String status) {

		logger = report.createTest("Add Blood Pressure Readings");	

		logger.info("Add Blood Pressure Reading = " + Systolic + " " + Dialstolic);

		Assert.assertEquals(status, ReadingObject.Add_Blood_Pressure(Systolic, Dialstolic));
	}

	@Test(priority = 7, enabled = true, dependsOnMethods = "showAllReadingsCells", dataProvider = "Heart Rate")
	public void addHeartRateReading(String ReadingValue, String status) throws InterruptedException {

		logger = report.createTest("Add Heart Rate Readings");	
		logger.info("Add Heart Rate Reading = " + ReadingValue);

		Assert.assertEquals(status, ReadingObject.Add_Heart_Rate(ReadingValue));
	}

	@Test(priority = 8, enabled = true, dependsOnMethods = "showAllReadingsCells", dataProvider = "Temperature")
	public void addTemperatureReading(String ReadingValue, String status) throws InterruptedException {

		logger = report.createTest("Add Temprature Readings");	
		logger.info("Add Temperature Reading = " + ReadingValue);

		Assert.assertEquals(status, ReadingObject.Add_Temperature(ReadingValue));
	}



	@Test(priority = 9, enabled = true, dependsOnMethods = "showAllReadingsCells", dataProvider = "Respiration Rate")
	public void addRespirationRateReading(String ReadingValue, String status) throws InterruptedException {

		logger = report.createTest("Add Respiration Rate Readings");	
		logger.info("Add Respiration Rate Reading = " + ReadingValue);
		Assert.assertEquals(status, ReadingObject.Add_Respiration_Rate(ReadingValue));
	}


	@Test(priority = 10, enabled = true, dependsOnMethods = "showAllReadingsCells", dataProvider = "BMI")
	public void addBMIReading(String weight, String height, String Status) {

		logger = report.createTest("Add BMI Readings");	
		logger.info("Add BMI Reading = " + weight + " " + height);

		Assert.assertEquals(Status,	ReadingObject.Add_BMI(weight, height));
	}



	@Test(priority = 11, enabled = true, dependsOnMethods = "showAllReadingsCells", dataProvider = "Bones Mass")
	public void addBonesMassReading(String ReadingValue, String status) throws InterruptedException {


		logger = report.createTest("Add Bones Mass Readings");	
		logger.info("Add Bones Mass Reading = " + ReadingValue);
		Assert.assertEquals(status, ReadingObject.Add_Bones_Mass(ReadingValue));
	}

	@Test(priority = 12, enabled = true, dependsOnMethods = "showAllReadingsCells", dataProvider = "Muscle Mass")
	public void addMuscleMassReading(String ReadingValue, String status) throws InterruptedException {

		logger = report.createTest("Add Muscle Mass Readings");	
		logger.info("Add Muscle Mass Reading = " + ReadingValue);

		Assert.assertEquals(status, ReadingObject.Add_Muscles_Mass(ReadingValue));


	}

	@Test(priority = 13, enabled = true, dependsOnMethods = "showAllReadingsCells", dataProvider = "Body Fat")
	public void addBodyFatReading(String ReadingValue, String status) throws InterruptedException {

		logger = report.createTest("Add Body Fat Readings");	
		logger.info("Add Body Fat Reading = " + ReadingValue);
		Assert.assertEquals(status, ReadingObject.Add_Body_Fats(ReadingValue));
	}

	@Test(priority = 14, enabled = true, dependsOnMethods = "showAllReadingsCells", dataProvider = "Body Water")
	public void addBodyWaterReading(String ReadingValue, String status) throws InterruptedException {

		logger = report.createTest("Add Body Water Readings");	
		logger.info("Add Body Water Reading = " + ReadingValue);

		Assert.assertEquals(status, ReadingObject.Add_Body_Water(ReadingValue));
	}

	@Test(priority = 15, enabled = true, dependsOnMethods = "showAllReadingsCells", dataProvider = "Visceral Fat Rating")
	public void addFasceralFatReading(String ReadingValue) throws InterruptedException {

		logger = report.createTest("Add Fasceral Fat Readings");	
		logger.info("Add Fasceral Fat Reading = " + ReadingValue);
		ReadingObject.Add_VF(ReadingValue);

	}

}
