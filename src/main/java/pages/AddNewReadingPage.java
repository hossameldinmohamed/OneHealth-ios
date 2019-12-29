package pages;

import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class AddNewReadingPage extends PageBase {


	public static String currentReadingValue;
    public int i = 0 ;



	public AddNewReadingPage(AppiumDriver<MobileElement> driver) {
		super(driver);
	}

	//////////////// Elements ////////////////


	@FindBy(id = "AddButtonIcon")
	MobileElement AddButtonIcon; // Cross Icon

	@FindBy(id = "ReadingTypeAddManualReadingTableTextField")
	MobileElement selectreading;


	@FindBy(id = "Add")
	MobileElement add_btn;

	@FindBy(id = "Done")
	MobileElement donebtn;

	
	
	//steps 
	@FindBy(id = "stepsReadingsTypetextLabel")
	MobileElement stepsItem;
	@FindBy(id = "AddManualReadingTableTextField")
	MobileElement stepsvalue;
	
	@FindBy(id = "stepsReadingsHomevalueLabel")
	MobileElement stepsstatus;
	




	//Blood Sugar
	@FindBy(id = "BloodSugarReadingsTypetextLabel")
	MobileElement bloodItem;

	@FindBy(id = "SugarMeasureAddManualReadingTableTextField")
	MobileElement bloodsugarvalue;

	@FindBy(id = "readingsFoodPreferenceAddManualReadingTableTextField")
	MobileElement bloodfoodPreference;

	@FindBy(id = "BloodSugarReadingsHomeaboveBelowNormalLabel")
	MobileElement bloodSugerStatus;




	// Weight 
	@FindBy(id = "WeightReadingsTypetextLabel")
	MobileElement weightItem;
	@FindBy(id = "WeightAddManualReadingTableTextField")
	MobileElement weightvalue;


	// Oxygen Level 

	@FindBy(id = "OxygenLevelReadingsTypetextLabel")
	MobileElement oxygenItem;

	@FindBy(id = "percentAddManualReadingTableTextField")
	MobileElement oxygentvalue;

	@FindBy(id = "OxygenLevelReadingsHomeaboveBelowNormalLabel")
	MobileElement OxygenLevelStatus;



	// Blood Pressure 

	@FindBy(id = "BloodPressureReadingsTypetextLabel")
	MobileElement bloodPressureItem;

	@FindBy(id = "readingsSystolicAddManualReadingTableTextField")
	MobileElement Systolicvalue;

	@FindBy(id = "readingsDiastolicAddManualReadingTableTextField")
	MobileElement Diastolicvalue;
	@FindBy(id = "BloodPressureReadingsHomeaboveBelowNormalLabel")
	MobileElement bloodPressureStatus;



	//Heart Rate 
	@FindBy(id = "HeartRateReadingsTypetextLabel")
	MobileElement HeartRateItem;

	@FindBy(id = "RateOfAddManualReadingTableTextField")
	MobileElement HeartRatevalue;
	@FindBy(id = "HeartRateReadingsHomeaboveBelowNormalLabel")
	MobileElement HeartRateStatus;




	//Temperature 
	@FindBy(id = "TemperatureReadingsTypetextLabel")
	MobileElement TemperatureItem;

	@FindBy(id = "TempretureAddManualReadingTableTextField")
	MobileElement Temperaturevalue;

	@FindBy(id = "TemperatureReadingsHomeaboveBelowNormalLabel")
	MobileElement TemperatureStatus;


	// Respiration Rate 
	@FindBy(id = "RespirationRateReadingsTypetextLabel")
	MobileElement RespirationRateItem;

	@FindBy(id = "RateOfAddManualReadingTableTextField")
	MobileElement RespirationRatevalue;

	@FindBy(id = "RespirationRateReadingsHomeaboveBelowNormalLabel")
	MobileElement RespirationRateStatus;


	// BMI 
	@FindBy(id = "BMIReadingsTypetextLabel")
	MobileElement BMIItem;

	@FindBy(id = "WeightAddManualReadingTableTextField")
	MobileElement BMIWeightvalue;

	@FindBy(id = "HeightAddManualReadingTableTextField")
	MobileElement BMIHeightvalue;

	@FindBy(id = "BMIReadingsHomeaboveBelowNormalLabel")
	MobileElement BMIStatus;


	// Bones Mass
	@FindBy(id = "BonesMassReadingsTypetextLabel")
	MobileElement BonesMassItem;
	@FindBy(id = "percentAddManualReadingTableTextField")
	MobileElement BonesMassvalue;

	@FindBy(id = "BonesMassReadingsHomeaboveBelowNormalLabel")
	MobileElement BonesMassStatus;



	//Muscles Mass
	@FindBy(id = "MusclesMassReadingsTypetextLabel")
	MobileElement MusclesMassItem;
	@FindBy(id = "percentAddManualReadingTableTextField")
	MobileElement MusclesMassvalue;

	@FindBy(id = "MusclesMassReadingsHomeaboveBelowNormalLabel")
	MobileElement MusclesMassStatus;



	//Body Fats
	@FindBy(id = "BodyFatsReadingsTypetextLabel")
	MobileElement BodyFatsItem;
	@FindBy(id = "percentAddManualReadingTableTextField")
	MobileElement BodyFatsvalue;

	@FindBy(id = "BodyFatsReadingsHomeaboveBelowNormalLabel")
	MobileElement BodyFatsStatus;


	//Body Water 
	@FindBy(id = "BodyWaterReadingsTypetextLabel")
	MobileElement BodyWaterItem;
	@FindBy(id = "percentAddManualReadingTableTextField")
	MobileElement BodyWatervalue;
	@FindBy(id = "BodyWaterReadingsHomeaboveBelowNormalLabel")
	MobileElement BodyWaterStatus;



	//VF 
	@FindBy(id = "VFRReadingsTypetextLabel")
	MobileElement VFItem;
	@FindBy(id = "percentAddManualReadingTableTextField")
	MobileElement VFvalue;


	//// Manage items cells //// 

	@FindBy(id = "ReadingsHome")
	MobileElement ManageReadingItem;

	@FindBy(id = "VFRtextLabel")
	MobileElement StepsLabel;

	@FindBy(id = "BloodSugarReadingsTypeTabletextLabel")
	MobileElement BloodSugerLabel;

	@FindBy(id = "WeightReadingsTypeTabletextLabel")
	MobileElement WeightLabel;

	@FindBy(id = "OxygenLevelReadingsTypeTabletextLabel")
	MobileElement OxygenLevelLabel;

	@FindBy(id = "BloodPressureReadingsTypeTabletextLabel")
	MobileElement BloodPressureLabel;

	@FindBy(id = "HeartRateReadingsTypeTabletextLabel")
	MobileElement HeartRateLabel;

	@FindBy(id = "TemperatureReadingsTypeTabletextLabel")
	MobileElement TemperatureLabel;

	@FindBy(id = "RespirationRateReadingsTypetextLabel")
	MobileElement RespirationRateLabel;

	@FindBy(id = "BMIReadingsTypetextLabel")
	MobileElement BMILabel;

	@FindBy(id = "BonesMassReadingsTypetextLabel")
	MobileElement BonesMassLabel;

	@FindBy(id = "MusclesMassReadingsTypetextLabel")
	MobileElement MusclesMassLabel;

	@FindBy(id = "BodyFatsReadingsTypetextLabel")
	MobileElement BodyFatsLabel;

	@FindBy(id = "BodyWaterReadingsTypetextLabel")
	MobileElement BodyWaterLabel;

	@FindBy(id = "VFRReadingsTypetextLabel")
	MobileElement VFRLabel;

	//////////////////// Methods /////////////////////


	public void Show_all_Celles() {

		//waitUntilElementClickableAndClick(ManageReadingItem);
		waitForElement(ManageReadingItem);
		clickOn(ManageReadingItem);

		//	//	
		//				try {
		//					Thread.sleep(10000);
		//					} catch (InterruptedException e) {
		//						// TODO Auto-generated catch block
		//					e.printStackTrace();
		//					}
		//	clickOn(ManageReadingItem);
		//	clickOn(StepsLabel);
		//	clickOn(BloodSugerLabel);
		//	clickOn(WeightLabel);
		//	clickOn(OxygenLevelLabel);
		//	clickOn(BloodPressureLabel);
		//	clickOn(HeartRateLabel);
		//	clickOn(TemperatureLabel);

		waitUntilElementClickableAndClick(RespirationRateLabel);
		waitUntilElementClickableAndClick(BMILabel);
		waitUntilElementClickableAndClick(BonesMassLabel);
		waitUntilElementClickableAndClick(MusclesMassLabel);
		waitUntilElementClickableAndClick(BodyFatsLabel);
		waitUntilElementClickableAndClick(BodyWaterLabel);
		
		Scrollto(VFRLabel);
		waitUntilElementClickableAndClick(VFRLabel);
		clickOn(donebtn);


	}

	public String addsteps (String value ) {

		waitUntilElementClickableAndClick(AddButtonIcon);
		clickOn(selectreading);
		waitUntilElementClickableAndClick(stepsItem);
		clickOn(donebtn);
		waitForElement(stepsvalue);
		clearAndSetText(stepsvalue , value);
		clickOn(add_btn);
		waitForElement(stepsstatus);
		currentReadingValue = stepsstatus.getText().toString();
        return currentReadingValue;
	} 


	public String Add_Blood_Sugar (String Value) {
		waitUntilElementClickableAndClick(AddButtonIcon);
		clickOn(selectreading);
		waitUntilElementClickableAndClick(bloodItem);
		clickOn(donebtn);
		waitForElement(bloodsugarvalue);
		clearAndSetText(bloodsugarvalue , Value);
		clickOn(add_btn);
		waitForElement(bloodSugerStatus);
		currentReadingValue = bloodSugerStatus.getText().toString();
		return currentReadingValue;

		//clickOn(bloodfoodPreference);

		//	
		//	try {
		//		Thread.sleep(10000);
		//		} catch (InterruptedException e) {
		//			// TODO Auto-generated catch block
		//		e.printStackTrace();
		//		}
	}


	public void Add_weight () {
		waitUntilElementClickableAndClick(AddButtonIcon);
		clickOn(selectreading);
		waitUntilElementClickableAndClick(weightItem);
		clickOn(donebtn);

		waitForElement(weightvalue);
		clearAndSetText(weightvalue , "70");
		clickOn(add_btn);
		

	}



	public String Add_Oxygen_level(String value) {

		waitUntilElementClickableAndClick(AddButtonIcon);
		clickOn(selectreading);
		waitUntilElementClickableAndClick(oxygenItem);
		clickOn(donebtn);

		waitForElement(oxygentvalue);
		clearAndSetText(oxygentvalue , value);
		clickOn(add_btn);
		waitForElement(OxygenLevelStatus);
		currentReadingValue = OxygenLevelStatus.getText().toString();
		return currentReadingValue ;

	}



	public String Add_Blood_Pressure (String sylstolic , String diastolic ) {

		waitUntilElementClickableAndClick(AddButtonIcon);
		clickOn(selectreading);
		waitUntilElementClickableAndClick(bloodPressureItem);
		clickOn(donebtn);


		waitForElement(Systolicvalue);
		clearAndSetText(Systolicvalue , sylstolic);
		clearAndSetText(Diastolicvalue , diastolic);
		clickOn(add_btn);
		waitForElement(bloodPressureStatus);
		currentReadingValue = bloodPressureStatus.getText().toString();
		
		

		return currentReadingValue;


	}





	public String Add_Heart_Rate (String value) {
		waitUntilElementClickableAndClick(AddButtonIcon);
		clickOn(selectreading);
		waitUntilElementClickableAndClick(HeartRateItem);
		clickOn(donebtn);
		waitForElement(HeartRatevalue);
		clearAndSetText(HeartRatevalue , value);
		clickOn(add_btn);

		waitForElement(HeartRateStatus);
		currentReadingValue = HeartRateStatus.getText().toString();
		return currentReadingValue;


	}




	public String  Add_Temperature (String value) {

		waitUntilElementClickableAndClick(AddButtonIcon);
		clickOn(selectreading);
		waitUntilElementClickableAndClick(TemperatureItem);
		clickOn(donebtn);

		waitForElement(Temperaturevalue);
		clearAndSetText(Temperaturevalue , value);
		clickOn(add_btn);

		waitForElement(TemperatureStatus);
		currentReadingValue = TemperatureStatus.getText().toString();
		return currentReadingValue;

	}




	public String Add_Respiration_Rate(String value) {

		waitUntilElementClickableAndClick(AddButtonIcon);
		clickOn(selectreading);
		waitUntilElementClickableAndClick(RespirationRateItem);
		clickOn(donebtn);	

		//waitForElement(RespirationRatevalue);
		clearAndSetText(RespirationRatevalue , value);
		clickOn(add_btn);

		//	Scrollto("Respiration Rate");
		waitForElement(RespirationRateStatus);
		currentReadingValue = RespirationRateStatus.getText().toString();
		return currentReadingValue;

	}



	public String Add_BMI(String weight , String hieght) {
		waitUntilElementClickableAndClick(AddButtonIcon);
		clickOn(selectreading);
		waitUntilElementClickableAndClick(BMIItem);
		clickOn(donebtn);
		waitForElement(BMIWeightvalue);
		clearAndSetText(BMIWeightvalue , weight);
		clearAndSetText(BMIHeightvalue , hieght);
		clickOn(add_btn);
		waitForElement(BMIStatus);
		currentReadingValue = BMIStatus.getText().toString();
		return currentReadingValue;

	}



	public String Add_Bones_Mass(String value) {

		waitUntilElementClickableAndClick(AddButtonIcon);
		clickOn(selectreading);
		waitUntilElementClickableAndClick(BonesMassItem);
		clickOn(donebtn);
		waitForElement(BonesMassvalue);
		clearAndSetText(BonesMassvalue , value);
		clickOn(add_btn);
  
		waitForElement(BonesMassStatus);
		currentReadingValue = BonesMassStatus.getText().toString();
		return currentReadingValue;

	}



	public String Add_Muscles_Mass(String value)  {

		waitUntilElementClickableAndClick(AddButtonIcon);
		clickOn(selectreading);
		waitUntilElementClickableAndClick(MusclesMassItem);
		clickOn(donebtn);

		waitForElement(MusclesMassvalue);
		clearAndSetText(MusclesMassvalue , value);
		clickOn(add_btn);
		if (i==0 ) {
		Scrollto(MusclesMassvalue);
		}
		waitForElement(MusclesMassStatus);
		currentReadingValue = MusclesMassStatus.getText().toString();
		i++;
		

		return currentReadingValue;

	}




	public String Add_Body_Fats (String value) {
		waitUntilElementClickableAndClick(AddButtonIcon);
		clickOn(selectreading);
		waitUntilElementClickableAndClick(BodyFatsItem);
		clickOn(donebtn);

		waitForElement(BodyFatsvalue);
		clearAndSetText(BodyFatsvalue , value);
		clickOn(add_btn);
		waitForElement(BodyFatsStatus);
		currentReadingValue = BodyFatsStatus.getText().toString();
		return currentReadingValue;

	}


	public String Add_Body_Water (String value) {

		waitUntilElementClickableAndClick(AddButtonIcon);
		clickOn(selectreading);
		waitUntilElementClickableAndClick(BodyWaterItem);
		clickOn(donebtn);
		waitForElement(BodyWatervalue);
		clearAndSetText(BodyWatervalue , value);
		clickOn(add_btn);

		waitForElement(BodyWaterStatus);
		currentReadingValue = BodyWaterStatus.getText().toString();
		return currentReadingValue;
	}








	public void Add_VF(String value) {

		waitUntilElementClickableAndClick(AddButtonIcon);
		clickOn(selectreading);
		waitUntilElementClickableAndClick(VFItem);
		clickOn(donebtn);


		waitForElement(VFvalue);
		clearAndSetText(VFvalue , value);
		clickOn(add_btn);



	}





	public void Scrollto (MobileElement element) {

//		HashMap scrollObject = new HashMap<>();
//		//scrollObject.put("text", reading);
//
//		//	+ "new UiSelector().text(\"" + reading + "\"));"));
//
//		scrollObject.put("predicateString", "value CONTAINS \'"+reading+"\'"); // Only for ‘scroll in element’
//		//scrollObject.put("direction", "down");
//		driver.executeScript("mobile: scroll", scrollObject);

		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap scrollObjects = new HashMap();
		//scrollObjects.put("element", ((RemoteWebElement) element).getId());
		scrollObjects.put("direction", "down");
		driver.executeScript("mobile: scroll", scrollObjects );
		
		
	}






}
