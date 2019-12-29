package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class myProfileEditPage extends PageBase {

	public myProfileEditPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		// this.driver = driver;
	}
	//////////////// Elements ////////////////

	@FindBy(id = "menu_action_save_edit")
	MobileElement saveProfileBTN;

	@FindBy(xpath = "//*[@class='android.widget.ScrollView']/*[1]/*[5]") // view_phone_number_selector //edt_first_name
	MobileElement firstName;

	@FindBy(id = "edt_last_name")
	MobileElement lastName;

	@FindBy(xpath = "view_phone_number_selector")
	MobileElement mobile;

	@FindBy(id = "view_mail_selector")
	MobileElement mail;

	@FindBy(id = "spinner_gender")
	MobileElement gender;

	@FindBy(id = "view_date_of_birth_selector")
	MobileElement date;

	@FindBy(xpath = "view_country_selector")
	MobileElement country;

	@FindBy(xpath = "view_city_selector")
	MobileElement city;

	@FindBy(xpath = "tv_date_of_birth_value")
	MobileElement dateOfBirth;

	public void EditProfileDataWith(String FirstName, String LastName, String Gender, String BirthDate)
			throws InterruptedException {
		// String FirstName, String LastName, String MobileNum, String Email,
		// String Gender, String BirthDate, String Country, String City

		// wait(saveProfileBTN);
		Thread.sleep(2000);
		try {
			clickOn(firstName);
		} catch (Exception e) {
			System.out.println("e:" + e);
		}

		// driver.findElementById(firstName).sendKeys(FirstName);
		// driver.findElementById("edt_first_name").sendKeys(FirstName);
		hideKeyboard();
		typeOnElement(lastName, LastName);
		hideKeyboard();
		// driver.findElement(gender).click();

		Select dropdown = new Select(driver.findElement(By.id("gender")));
		dropdown.selectByVisibleText(Gender);

		typeOnElement(dateOfBirth, BirthDate);

	}

}
