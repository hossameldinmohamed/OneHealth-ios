package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;

public class PageBase {

	protected static AppiumDriver<MobileElement> driver;
	// protected

	public Select select;
	public Actions action;
	public static String currentWindowID = null;
	public static JavascriptExecutor jse;

	// create constructor
	/*
	 * public PageBase(AppiumDriver<MobileElement> driver) { //this.driver = driver;
	 * PageFactory.initElements(driver, this); }
	 */

	public PageBase(AppiumDriver<MobileElement> driver) {
		PageBase.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	/*
	 * public static void clickOn(WebDriver driver, MobileElement locator, int
	 * timeout) { new
	 * WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).
	 * until(ExpectedConditions.elementToBeClickable(locator)); locator.click();
	 * 
	 * }
	 */

	// Wait for Next button to be visible.
	public boolean waitUntilVisible(MobileElement element) {

		// Wait for Element to be visible.
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(element));
			// element found, return true
			return true;
		} catch (Exception e) {
			// Element not found, return false
			return false;
		}

	}

	// Wait for Next button to be clickable.
	public boolean waitUntilElementClickableAndClick(MobileElement element) {

		// Wait for Element to be visible.
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			element = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			return true;
		} catch (Exception e) {
			// Element not found, return false
			return false;
		}

	}

	// Wait for Next button to be clickable.
	public boolean waitUntilElementClickableAndNotClick(MobileElement element) {

		// Wait for Element to be visible.
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			element = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(element));
			return true;
		} catch (Exception e) {
			// Element not found, return false
			return false;
		}

	}

	// Method to Click Buttons
	protected void clickButton(MobileElement button) {
		button.click();

	}

	// Method to send Keys
	protected void clearAndSetText(MobileElement textElement, String value) {

		waitUntilVisible(textElement);
		textElement.clear();
		textElement.sendKeys(value);
	}

	// Method to send Keys
	protected void setText(MobileElement textElement, String value) {

		waitUntilVisible(textElement);
		textElement.sendKeys(value);
	}

	// Method to Press Enter
	public void KeyPressEnter(MobileElement element) {

		element.sendKeys(Keys.ENTER);
	}

	// Method to Press Enter
	public void KeyPressTab(MobileElement element) {

		element.sendKeys(Keys.TAB);
	}

	// Method to scroll down
	public void scrollToBottom() {

		jse.executeScript("scrollBy(0,1500)");
	}

	public void scrollToTop() {

		jse.executeScript("scrollBy(0,-1500)");
	}

	// Method to confirmCookies
	public void cookieHandle(MobileElement driver) {

		MobileElement elementcookie = driver.findElement(By.xpath("//div[@class='cta-button bg-blue']"));
		jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", elementcookie);

	}

	// Method to handle windows
	public void WindowHandling(WebDriver driver) {
		currentWindowID = driver.getWindowHandle();

		for (String windowID : driver.getWindowHandles()) {

			driver.switchTo().window(windowID);
			/*
			 * String URL = driver.getCurrentUrl();
			 * 
			 * if (URL.contains(URL))
			 * 
			 * { }
			 */

		}

	}

	// Method to select from Drop down
	public void selectDropDownList(MobileElement driver, MobileElement selectElement, String selectItem) {
		Select drop = new Select(selectElement);

		drop.selectByVisibleText(selectItem);
	}

	// Method to get text
	public String getText(MobileElement e) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(e));
		return e.getText().toString();
	}

	public MobileElement getElementByText(String text) {

		MobileElement element = driver.findElement(By.xpath("//*[@text='" + text + "']"));

		return element;
	}

	public void refreshPage() {
		driver.navigate().refresh();
	}

	// ----------------//

	//////////////// Actions ////////////////

	protected void clickOn(MobileElement element) {
		(element).click();
	}

	protected String getTextOf(MobileElement element) {
		return (element).getText();
	}

	protected void typeOnElement(MobileElement element, String value) {
		element.sendKeys(value);
	}

	protected void hideKeyboard() {
		driver.hideKeyboard();
	}

	protected void clearText(MobileElement element) {
		element.clear();
	}

	protected boolean isEnabledElement(MobileElement element) {
		return element.isEnabled();
	}

	protected boolean isDisplayedElement(MobileElement element) {
		return element.isDisplayed();
	}

	protected void waitForElement(MobileElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(element));
			// wait.until(ExpectedConditions.presenceOfElementLocated(element));

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	protected void waitForElementHide(MobileElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.invisibilityOf(element));

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	protected void printValueOf(String text) {
		System.out.println(text);
	}

	// Method for scrolling down till reach the desired element
	protected void scrollDown(MobileElement element) {
		try {
			// TouchAction action = new TouchAction(driver);
			// action.press(PointOption.point(0,
			// 1500)).waitAction().moveTo(PointOption.point(0, 500)).release().perform();

			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)"
					+ ".instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + element + "\").instance(0))"));

			// waitForElement(element);
		} catch (Exception e) {
			System.out.println(e);
		}

		/*
		 * driver.findElement(MobileBy.
		 * AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)" +
		 * ".instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + "Settings" +
		 * "\").instance(0))"));
		 */
	}

	protected MobileElement getReadingElementFromReadingStatusText(String ReadingBeforeTranslate,
			String readingTypeTxt) {
		MobileElement element = null;
		if (ReadingBeforeTranslate == "Steps" || ReadingBeforeTranslate == "Weight"
				|| ReadingBeforeTranslate == "Visceral Fat Rating") {
			element = driver.findElement(
					By.xpath("//*[@resource-id='com.mydoctor.axa.debug:id/txt_reading_name' and contains(@text,'"
							+ readingTypeTxt
							+ "')]/..//*[@resource-id='com.mydoctor.axa.debug:id/txt_reading_value']"));
		} else {
			element = driver.findElement(
					By.xpath("//*[@resource-id='com.mydoctor.axa.debug:id/txt_reading_name' and contains(@text,'"
							+ readingTypeTxt
							+ "')]/..//*[@resource-id='com.mydoctor.axa.debug:id/tvAboveOrBelowNormalStatus']"));
		}
		return element;
	}

	// Method for scrolling down till reach the desired element
	protected void scrollDownToText(String appLanguage, String element, boolean clickOrNot) {

		MobileElement elementToClick = null;
		// MobileElement elementToClick = (MobileElement)
		// driver.findElement(By.xpath("//*[text()='" + element + "']"));

		try {
			waitUntilElementClickableAndNotClick(getElementByText(element));
			elementToClick = getElementByText(element);

			// TouchAction action = new TouchAction(driver);
			// action.press(PointOption.point(0,
			// 1500)).waitAction().moveTo(PointOption.point(0, 500)).release().perform();
			/*
			 * 
			 * elementToClick = (MobileElement) driver .findElement(MobileBy.
			 * AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)" +
			 * ".instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + element +
			 * "\").instance(0))"));
			 */
			// waitForElement(element);
			// elementToClick.click();
			// Thread.sleep(2000);
			// elementToClick = driver.findElement(By.xpath("//*[@text='" + element +
			// "']"));

		} catch (Exception e) {
			System.out.println(e);
			TouchAction action = new TouchAction(driver);
			action.press(PointOption.point(0, 1500)).waitAction().moveTo(PointOption.point(0, 500)).release().perform();
			elementToClick = getElementByText(element);
		}
		if (clickOrNot == true) {
			elementToClick.click();
		}

	}

}
