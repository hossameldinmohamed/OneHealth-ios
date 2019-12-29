package englishArabic_TCs;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.ahmed.excelizer.ExcelReader;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import TestData.configInputData;
import junit.framework.Assert;
import pages.AddNewReadingPage;
import pages.HomePage;
import pages.LoginPageEN_AR;
import pages.sideMenu;

public class ReadingsTCs extends TestBase {



	AddNewReadingPage addNewReadingPage_Obj = null;
	LoginPageEN_AR LoginPageEN_AR_Obj = null;
	sideMenu sideMenu_Obj = null;
	HomePage homePage_Obj = null;


	@BeforeClass
	private void initializeObjects() {
		try {
			sideMenu_Obj = new sideMenu(driver);
			LoginPageEN_AR_Obj = new LoginPageEN_AR(driver);
			homePage_Obj = new HomePage(driver);
			addNewReadingPage_Obj =new AddNewReadingPage(driver);
		} catch (Exception e) {
			System.out.println("ex: (( " + e + "))");
		}
	}

	//Reading Excel Sheet Path 
	String filePath = configInputData.ReadingexcelSheetPath;

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

	@DataProvider(name = "Visceral Fat Rating")
	public Object[][] Fasceral_Fat() {

		return ExcelReader.loadTestData(filePath, "Visceral Fat Rating");
	}

	//////////////////////////////////// Tests /////////////////////////////////


	@Test(priority = 1, enabled = true)
	public void login() {
		// Create Test Case For login 
		logger = report.createTest("Login To OneHealth");	
		//Login with Valid User Name & Password
		LoginPageEN_AR_Obj.loginWithRegisteredUser(configInputData.phoneNubmer,configInputData.Password);
		logger.info("Add Phone number and Password " );

		//Log Pass Status
		logger.pass("User logged in successfully");


	}


	@Test(priority = 2 , enabled = true )
	public void ShowAllReadingsCells() {
		// Method to Show all Readings Cards 

		// Create Test Case For showing all Cards
		logger = report.createTest("Show all Cells ");	

		//Click on More icon from home page
		homePage_Obj.clickmore();
		logger.info("Click on More Button");

		//Select Reading from Menu
		sideMenu_Obj.clickOnReadings();
		logger.info("Select Readings from Menu");

		//Display all reading cells to validate the status 
		addNewReadingPage_Obj.Show_all_Celles();
		logger.info("Show all Readings cells ");

	}





	@Test(priority = 3, enabled = true, dependsOnMethods = "ShowAllReadingsCells", dataProvider = "Steps")
	public void Add_Steps(String Readval, String read) {
		logger = report.createTest("Add Steps Readings");	


		logger.info("Add Steps Reading = " + Readval);
		Assert.assertEquals(Readval,addNewReadingPage_Obj.addsteps(Readval));

		logger.pass("Steps Readings Added successfully");

	}

	@Test(priority = 4, enabled = true, dependsOnMethods = "ShowAllReadingsCells" ,  dataProvider = "Blood Sugar")
	public void Add_BloodSugar(String Readval, String foodReference, String status) {
		if (foodReference.toString().equals("Before Meal")) {



		} else {

			logger = report.createTest("Add Blood suger Readings");	
			//try {
			logger.info("Add Blood Suger Reading = " + Readval);
			Assert.assertEquals(status,addNewReadingPage_Obj.Add_Blood_Sugar(Readval));
			//logger.pass("Blood Suger Reading Added successfully");
			//logger.log(Status.PASS, "Passed");
			//	} catch (AssertionError e) {
			//logger.log(Status.FAIL, " Result of  "+ Readval +" Failed");

			//	}
		}
	}

	@Test(priority = 5, enabled = true, dependsOnMethods = "ShowAllReadingsCells", dataProvider = "Oxygen Level")
	public void Add_Oxygen_Level(String Readval, String Provision, String status) {

		logger = report.createTest("Add Oxygen Level Readings");	

		if (Provision.toString().equals("On Air")) {
			//try {
			logger.info("Add Oxygen Level Reading = " + Readval);
			Assert.assertEquals(status,	addNewReadingPage_Obj.Add_Oxygen_level(Readval));

		} //else

	}

	@Test(priority = 6, enabled = true, dependsOnMethods = "ShowAllReadingsCells", dataProvider = "Blood Pressure")
	public void Add_Blood_Pressure(String Systolic, String Dialstolic, String status) {

		logger = report.createTest("Add Blood Pressure Readings");	

		logger.info("Add Blood Pressure Reading = " + Systolic + " " + Dialstolic);

		Assert.assertEquals(status, addNewReadingPage_Obj.Add_Blood_Pressure(Systolic, Dialstolic));
	}

	@Test(priority = 7, enabled = true, dependsOnMethods = "ShowAllReadingsCells", dataProvider = "Heart Rate")
	public void Add_Heart_Rate(String value, String status) throws InterruptedException {

		logger = report.createTest("Add Heart Rate Readings");	
		logger.info("Add Heart Rate Reading = " + value);

		Assert.assertEquals(status, addNewReadingPage_Obj.Add_Heart_Rate(value));
	}

	@Test(priority = 8, enabled = true, dependsOnMethods = "ShowAllReadingsCells", dataProvider = "Temperature")
	public void Add_Temperature(String value, String status) throws InterruptedException {

		logger = report.createTest("Add Temprature Readings");	
		logger.info("Add Temperature Reading = " + value);

		Assert.assertEquals(status, addNewReadingPage_Obj.Add_Temperature(value));
	}



	@Test(priority = 9, enabled = true, dependsOnMethods = "ShowAllReadingsCells", dataProvider = "Respiration Rate")
	public void Add_Respiration_Rate(String value, String status) throws InterruptedException {

		logger = report.createTest("Add Respiration Rate Readings");	
		logger.info("Add Respiration Rate Reading = " + value);
		Assert.assertEquals(status, addNewReadingPage_Obj.Add_Respiration_Rate(value));
	}


	@Test(priority = 10, enabled = true, dependsOnMethods = "ShowAllReadingsCells", dataProvider = "BMI")
	public void Add_BMI(String weight, String height, String Status) {

		logger = report.createTest("Add BMI Readings");	
		logger.info("Add BMI Reading = " + weight + " " + height);

		Assert.assertEquals(Status,	addNewReadingPage_Obj.Add_BMI(weight, height));
	}



	@Test(priority = 11, enabled = true, dependsOnMethods = "ShowAllReadingsCells", dataProvider = "Bones Mass")
	public void Add_Bones_Mass(String value, String status) throws InterruptedException {


		logger = report.createTest("Add Bones Mass Readings");	
		logger.info("Add Bones Mass Reading = " + value);
		Assert.assertEquals(status, addNewReadingPage_Obj.Add_Bones_Mass(value));
	}

	@Test(priority = 12, enabled = true, dependsOnMethods = "ShowAllReadingsCells", dataProvider = "Muscle Mass")
	public void Add_Muscle_Mass(String value, String status) throws InterruptedException {

		logger = report.createTest("Add Muscle Mass Readings");	
		logger.info("Add Muscle Mass Reading = " + value);

		Assert.assertEquals(status, addNewReadingPage_Obj.Add_Muscles_Mass(value));


	}

	@Test(priority = 13, enabled = true, dependsOnMethods = "ShowAllReadingsCells", dataProvider = "Body Fat")
	public void Add_body_Fat(String value, String status) throws InterruptedException {

		logger = report.createTest("Add Body Fat Readings");	
		logger.info("Add Body Fat Reading = " + value);
		Assert.assertEquals(status, addNewReadingPage_Obj.Add_Body_Fats(value));
	}

	@Test(priority = 14, enabled = true, dependsOnMethods = "ShowAllReadingsCells", dataProvider = "Body Water")
	public void Add_body_Water(String value, String status) throws InterruptedException {

		logger = report.createTest("Add Body Water Readings");	
		logger.info("Add Body Water Reading = " + value);

		Assert.assertEquals(status, addNewReadingPage_Obj.Add_Body_Water(value));
	}

	@Test(priority = 15, enabled = true, dependsOnMethods = "ShowAllReadingsCells", dataProvider = "Visceral Fat Rating")
	public void Add_Fasceral_Fat(String value) throws InterruptedException {

		logger = report.createTest("Add Fasceral Fat Readings");	
		logger.info("Add Fasceral Fat Reading = " + value);
		addNewReadingPage_Obj.Add_VF(value);
		//Assert.assertEquals(value);

		//Assert.assertEquals(value, addNewReadingPage_Obj.Add_VF(value));
	}

}
