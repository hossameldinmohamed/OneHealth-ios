package pages;

import org.openqa.selenium.support.FindBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class helpPageEN_AR extends PageBase {

	public helpPageEN_AR(AppiumDriver<MobileElement> driver) {
		super(driver);
		// this.driver = driver;
	}
	//////////////// Elements ////////////////

	@FindBy(xpath = "//*[@resource-id='com.youclick.wecare.debug:id/trudoctoolbar']/*[1]")
	MobileElement backBTN;

	@FindBy(xpath = "//*[@resource-id='com.youclick.wecare.debug:id/trudoctoolbar']/*[2]")
	MobileElement headerLabel;

	@FindBy(id = "img_logo")
	MobileElement logo;

	@FindBy(id = "tv_welcome")
	MobileElement welcomeLabel;

	@FindBy(id = "tv_question") //
	MobileElement questionLabel;

	@FindBy(id = "btn_call_us")
	MobileElement callUsBTN;

	@FindBy(id = "tv_or")
	MobileElement orLabel;

	@FindBy(id = "tv_leave_msg")
	MobileElement msgLabel;

	@FindBy(id = "view_select_country")
	MobileElement phoneCountryArea;

	@FindBy(id = "img_flag")
	MobileElement phoneCountryFlag;

	@FindBy(id = "tvCountryCode")
	MobileElement phoneCountryCode;

	@FindBy(id = "et_phone_number")
	MobileElement phone_Field;

	@FindBy(id = "et_message")
	MobileElement dialogBox;

	@FindBy(id = "btn_send")
	MobileElement sendBTN;

	public boolean ContentDisplayedProperly(String language) {
		boolean flag = false;

		try {
			waitForElement(logo);

			if (language.equalsIgnoreCase("EN") || language.equalsIgnoreCase("ENGLISH")) {
				if (allElementsFlags(language) == true) {
					flag = true;
					printValueOf("PASS ^_^ , Everything is OKAY in the [English] Help Screen");
				} else {
					flag = false;
					printValueOf(" FAIL !!! , Something wrong in the [English] Help Screen");
				}
			} else if (language.equalsIgnoreCase("AR") || language.equalsIgnoreCase("ARABIC")) {
				if (allElementsFlags(language) == true) {
					flag = true;
					printValueOf("PASS ^_^ , Everything is OKAY in the [Arabic] Help Screen");
				} else {
					flag = false;
					printValueOf(" FAIL !!! , Something wrong in the [Arabic] Help Screen");
				}
			} else {
				flag = false;
				printValueOf(" FAIL !!! , Something wrong in the [English] or [Arabic] Help Screen");
			}
		} catch (Exception e) {
			flag = false;
			printValueOf(" FAIL , ContentDisplayedProperly is not displayed properly!" + e);
		}
		return flag;
	}

	//////////////// Elements Implementation ////////////////

	private boolean allElementsFlags(String language) {
		boolean allFlags = false;
		try {
			boolean result1 = TruDoc_Logo_Displayed();
			boolean result2 = backBTN_Displayed();
			boolean result3 = sendBTN_Displayed(language);
			boolean result4 = dialogBox_Displayed(language);
			boolean result5 = callUsBTN_Displayed(language);
			boolean result6 = phoneCountryArea_Displayed();
			boolean result7 = phoneCountryFlag_Displayed();
			boolean result8 = phoneCountryCode_Displayed();
			boolean result9 = phone_Field_Displayed(language);
			boolean result10 = headerLabel_Displayed(language);
			boolean result11 = welcomeLabel_Displayed(language);
			boolean result12 = questionLabel_Displayed(language);
			boolean result13 = orLabel_Displayed(language);
			boolean result14 = msgLabel_Displayed(language);

			if (result1 == false || result2 == false || result3 == false || result4 == false || result5 == false
					|| result6 == false || result7 == false || result8 == false || result9 == false || result10 == false
					|| result11 == false || result12 == false || result13 == false || result14 == false) {
				allFlags = false;

			} else {
				allFlags = true;
			}
		} catch (Exception e) {
			allFlags = false;
			printValueOf(" FAIL , some of allFlags is not displayed properly!" + e);
		}
		return allFlags;
	}

	private boolean TruDoc_Logo_Displayed() {
		boolean flag = false;

		try {
			waitForElement(logo);

			if (isDisplayedElement(logo) == true) {
				flag = true;
				printValueOf(" PASS, TruDoc Logo is displayed properly");
			} else {
				flag = false;
				printValueOf(" FAIL , TruDoc Logo is not displayed properly");

			}
		} catch (Exception e) {
			flag = false;
			printValueOf(" FAIL , phoneCountryArea is not displayed properly!" + e);
		}
		return flag;
	}

	private boolean backBTN_Displayed() {
		boolean flag = false;

		try {
			waitForElement(logo);

			if (isDisplayedElement(backBTN) == true && isEnabledElement(backBTN) == true) {
				flag = true;
				printValueOf(" PASS, back btn is displayed properly");
			} else {
				flag = false;
				printValueOf(" FAIL , back btn is not displayed properly");

			}
		} catch (Exception e) {
			flag = false;
			printValueOf(" FAIL , phoneCountryArea is not displayed properly!" + e);
		}
		return flag;
	}

	private boolean sendBTN_Displayed(String Language) {
		boolean flag = false;

		try {
			waitForElement(logo);
			if (Language.equalsIgnoreCase("EN") || Language.equalsIgnoreCase("ENGLISH")) {
				String Expected = "SEND";

				if (isDisplayedElement(sendBTN) == true && isEnabledElement(sendBTN) == true
						&& getTextOf(sendBTN).equals(Expected)) {
					flag = true;
					printValueOf(" PASS, sendBTN is displayed properly");
				} else {
					flag = false;
					printValueOf(" FAIL , sendBTN is not displayed properly, [Actual]: " + getTextOf(sendBTN)
							+ " [Expected]: " + Expected);

				}
			} else if (Language.equalsIgnoreCase("AR") || Language.equalsIgnoreCase("ARABIC")) {
				String Expected = "إرسال";

				if (isDisplayedElement(sendBTN) == true && isEnabledElement(sendBTN) == true
						&& getTextOf(sendBTN).equals(Expected)) {
					flag = true;
					printValueOf(" PASS, sendBTN is displayed properly");
				} else {
					flag = false;
					printValueOf(" FAIL , sendBTN is not displayed properly, [Actual]: " + getTextOf(sendBTN)
							+ " [Expected]: " + Expected);

				}
			} else {
				flag = false;
				printValueOf("error, not defined language EN or AR");
			}
		} catch (Exception e) {
			flag = false;
			printValueOf(" FAIL , sendBTN is not displayed properly!" + e);
		}
		return flag;
	}

	private boolean dialogBox_Displayed(String Language) {
		boolean flag = false;

		try {
			waitForElement(logo);

			if (Language.equalsIgnoreCase("EN") || Language.equalsIgnoreCase("ENGLISH")) {
				String Expected = "Write your message here";

				if (isDisplayedElement(dialogBox) == true && isEnabledElement(dialogBox) == true
						&& getTextOf(dialogBox).equals(Expected)) {
					flag = true;
					printValueOf(" PASS, dialogBox is displayed properly");
				} else {
					flag = false;
					printValueOf(" FAIL , dialogBox is not displayed properly, [Actual]: " + getTextOf(dialogBox)
							+ " [Expected]: " + Expected);

				}
			} else if (Language.equalsIgnoreCase("AR") || Language.equalsIgnoreCase("ARABIC")) {
				String Expected = "اكتب رسالتك هنا";

				if (isDisplayedElement(dialogBox) == true && isEnabledElement(dialogBox) == true
						&& getTextOf(dialogBox).equals(Expected)) {
					flag = true;
					printValueOf(" PASS, dialogBox is displayed properly");
				} else {
					flag = false;
					printValueOf(" FAIL , dialogBox is not displayed properly, [Actual]: " + getTextOf(dialogBox)
							+ " [Expected]: " + Expected);
				}
			} else {
				flag = false;
				printValueOf("error, not defined language EN or AR");
			}
		} catch (Exception e) {
			flag = false;
			printValueOf(" FAIL , dialogBox_Displayed is not displayed properly!" + e);
		}
		return flag;
	}

	private boolean phoneCountryFlag_Displayed() {

		boolean flag = false;

		try {
			waitForElement(logo);

			if (isDisplayedElement(phoneCountryFlag) == true) {
				flag = true;
				printValueOf(" PASS, phoneCountryFlag is displayed properly");
			} else {
				flag = false;
				printValueOf(" FAIL , phoneCountryFlag is not displayed properly");

			}
		} catch (Exception e) {
			flag = false;
			printValueOf(" FAIL , phoneCountryFlag is not displayed properly!" + e);
		}
		return flag;
	}

	private boolean phoneCountryCode_Displayed() {

		String Expected = "+";
		boolean flag = false;

		try {
			waitForElement(logo);

			if (isDisplayedElement(phoneCountryCode) == true && isEnabledElement(phoneCountryCode) == true
					&& getTextOf(phoneCountryCode).contains(Expected)) {
				flag = true;
				printValueOf(" PASS, phoneCountryCode is displayed properly");
			} else {
				flag = false;
				printValueOf(" FAIL , phoneCountryCode is not displayed properly, [Actual]: "
						+ getTextOf(phoneCountryCode) + " [Expected]:" + Expected);

			}
		} catch (Exception e) {
			flag = false;
			printValueOf(" FAIL , phoneCountryCode is not displayed properly!" + e);
		}
		return flag;
	}

	private boolean phone_Field_Displayed(String Language) {
		boolean flag = false;

		try {
			waitForElement(logo);
			if (Language.equalsIgnoreCase("EN") || Language.equalsIgnoreCase("ENGLISH")) {
				String Expected = "mobile";
				if (isDisplayedElement(phone_Field) == true && isEnabledElement(phone_Field) == true
						&& getTextOf(phone_Field).startsWith(Expected)) {
					flag = true;
					printValueOf(" PASS, phone_Field is displayed properly");
				} else {
					flag = false;
					printValueOf(" FAIL , phone_Field is not displayed properly, [Actual]: " + getTextOf(phone_Field)
							+ "  [Expected] start with:" + Expected);

				}
			} else if (Language.equalsIgnoreCase("AR") || Language.equalsIgnoreCase("ARABIC")) {
				String Expected = "أدخل رقم";

				if (isDisplayedElement(phone_Field) == true && isEnabledElement(phone_Field) == true
						&& getTextOf(phone_Field).startsWith(Expected)) {
					flag = true;
					printValueOf(" PASS, phone_Field is displayed properly");
				} else {
					flag = false;
					printValueOf(" FAIL , phone_Field is not displayed properly, [Actual]: " + getTextOf(phone_Field)
							+ "  [Expected] start with:" + Expected);
				}

			} else {
				flag = false;
				printValueOf("error, not defined language EN or AR");
			}
		} catch (Exception e) {
			flag = false;
			printValueOf(" FAIL , phone_Field is not displayed properly!" + e);
		}
		return flag;
	}

	private boolean phoneCountryArea_Displayed() {

		boolean flag = false;

		try {
			waitForElement(logo);

			if (isDisplayedElement(phoneCountryArea) == true) {
				flag = true;
				printValueOf(" PASS, phoneCountryArea is displayed properly");
			} else {
				flag = false;
				printValueOf(" FAIL , phoneCountryArea is not displayed properly");

			}
		} catch (Exception e) {
			flag = false;
			printValueOf(" FAIL , phoneCountryArea is not displayed properly!" + e);
		}
		return flag;
	}

	private boolean callUsBTN_Displayed(String Language) {
		boolean flag = false;

		try {
			waitForElement(logo);
			if (Language.equalsIgnoreCase("EN") || Language.equalsIgnoreCase("ENGLISH")) {
				String Expected = "CALL US";

				if (isDisplayedElement(callUsBTN) == true && isEnabledElement(callUsBTN) == true
						&& getTextOf(callUsBTN).equals(Expected)) {
					flag = true;
					printValueOf(" PASS, callUsBTN is displayed properly");
				} else {
					flag = false;
					printValueOf(" FAIL , callUsBTN is not displayed properly, [Actual]: " + getTextOf(callUsBTN)
							+ " [Expected]: " + Expected);
				}
			} else if (Language.equalsIgnoreCase("AR") || Language.equalsIgnoreCase("ARABIC")) {
				String Expected = "إتصل بنا";

				if (isDisplayedElement(callUsBTN) == true && isEnabledElement(callUsBTN) == true
						&& getTextOf(callUsBTN).equals(Expected)) {
					flag = true;
					printValueOf(" PASS, callUsBTN is displayed properly");
				} else {
					flag = false;
					printValueOf(" FAIL , callUsBTN is not displayed properly, [Actual]: " + getTextOf(callUsBTN)
							+ " [Expected]: " + Expected);
				}
			} else {
				flag = false;
				printValueOf("error, not defined language EN or AR");
			}
		} catch (Exception e) {
			flag = false;
			printValueOf(" FAIL , callUsBTN is not displayed properly!" + e);
		}
		return flag;
	}

	private boolean headerLabel_Displayed(String Language) {
		boolean flag = false;

		try {
			waitForElement(logo);
			if (Language.equalsIgnoreCase("EN") || Language.equalsIgnoreCase("ENGLISH")) {
				String Expected = "Need help?";
				if (isDisplayedElement(headerLabel) == true && getTextOf(headerLabel).equals(Expected)) {
					flag = true;
					printValueOf(" PASS, headerLabel is displayed properly");
				} else {
					flag = false;
					printValueOf(" FAIL , headerLabel is not displayed properly, [Actual]: " + getTextOf(headerLabel)
							+ " [Expected]: " + Expected);
				}
			} else if (Language.equalsIgnoreCase("AR") || Language.equalsIgnoreCase("ARABIC")) {
				String Expected = "تحتاج مساعدة؟";
				if (isDisplayedElement(headerLabel) == true && getTextOf(headerLabel).equals(Expected)) {
					flag = true;
					printValueOf(" PASS, headerLabel is displayed properly");
				} else {
					flag = false;
					printValueOf(" FAIL , headerLabel is not displayed properly, [Actual]: " + getTextOf(headerLabel)
							+ " [Expected]: " + Expected);
				}
			} else {
				flag = false;
				printValueOf("error, not defined language EN or AR");
			}
		} catch (Exception e) {
			flag = false;
			printValueOf(" FAIL , headerLabel is not displayed properly!" + e);
		}
		return flag;
	}

	private boolean welcomeLabel_Displayed(String Language) {

		boolean flag = false;

		try {
			waitForElement(logo);
			if (Language.equalsIgnoreCase("EN") || Language.equalsIgnoreCase("ENGLISH")) {
				String Expected = "Welcome To TruDoc 24x7";

				if (isDisplayedElement(welcomeLabel) == true && getTextOf(welcomeLabel).equals(Expected)) {
					flag = true;
					printValueOf(" PASS, welcomeLabel is displayed properly");
				} else {
					flag = false;
					printValueOf(" FAIL , welcomeLabel is not displayed properly, [Actual]: " + getTextOf(welcomeLabel)
							+ " [Expected]: " + Expected);
				}
			} else if (Language.equalsIgnoreCase("AR") || Language.equalsIgnoreCase("ARABIC")) {
				String Expected = "مرحبا بك في ترودوك 24x7";
				if (isDisplayedElement(welcomeLabel) == true && getTextOf(welcomeLabel).equals(Expected)) {
					flag = true;
					printValueOf(" PASS, welcomeLabel is displayed properly");
				} else {
					flag = false;
					printValueOf(" FAIL , welcomeLabel is not displayed properly, [Actual]: " + getTextOf(welcomeLabel)
							+ " [Expected]: " + Expected);
				}
			} else {
				flag = false;
				printValueOf("error, not defined language EN or AR");
			}
		} catch (Exception e) {
			flag = false;
			printValueOf(" FAIL , welcomeLabel is not displayed properly!" + e);
		}
		return flag;
	}

	private boolean questionLabel_Displayed(String Language) {

		boolean flag = false;

		try {
			waitForElement(logo);
			if (Language.equalsIgnoreCase("EN") || Language.equalsIgnoreCase("ENGLISH")) {
				String Expected = "Are you having trouble with the app?\n" + " We will be more than happy to assist.";

				if (isDisplayedElement(questionLabel) == true && getTextOf(questionLabel).equals(Expected)) {
					flag = true;
					printValueOf(" PASS, questionLabel is displayed properly");
				} else {
					flag = false;
					printValueOf(" FAIL , questionLabel is not displayed properly, [Actual]: "
							+ getTextOf(questionLabel) + " [Expected]: " + Expected);

				}
			} else if (Language.equalsIgnoreCase("AR") || Language.equalsIgnoreCase("ARABIC")) {
				String Expected = "هل لديك مشكلة في استخدام التطبيق؟\n" + " سنكون سعداءلمساعدتك";
				if (isDisplayedElement(questionLabel) == true && getTextOf(questionLabel).equals(Expected)) {
					flag = true;
					printValueOf(" PASS, questionLabel is displayed properly");
				} else {
					flag = false;
					printValueOf(" FAIL , questionLabel is not displayed properly, [Actual]: "
							+ getTextOf(questionLabel) + " [Expected]: " + Expected);
				}
			} else {
				flag = false;
				printValueOf("error, not defined language EN or AR");
			}
		} catch (Exception e) {
			flag = false;
			printValueOf(" FAIL , questionLabel is not displayed properly!" + e);
		}
		return flag;
	}

	private boolean orLabel_Displayed(String Language) {
		boolean flag = false;

		try {
			waitForElement(logo);
			if (Language.equalsIgnoreCase("EN") || Language.equalsIgnoreCase("ENGLISH")) {
				String Expected = "OR";

				if (isDisplayedElement(orLabel) == true && getTextOf(orLabel).equals(Expected)) {
					flag = true;
					printValueOf(" PASS, orLabel is displayed properly");
				} else {
					flag = false;
					printValueOf(" FAIL , orLabel is not displayed properly, [Actual]: " + getTextOf(orLabel)
							+ " [Expected]: " + Expected);
				}
			} else if (Language.equalsIgnoreCase("AR") || Language.equalsIgnoreCase("ARABIC")) {
				String Expected = "أو";
				if (isDisplayedElement(orLabel) == true && getTextOf(orLabel).equals(Expected)) {
					flag = true;
					printValueOf(" PASS, orLabel is displayed properly");
				} else {
					flag = false;
					printValueOf(" FAIL , orLabel is not displayed properly, [Actual]: " + getTextOf(orLabel)
							+ " [Expected]: " + Expected);
				}
			} else {
				flag = false;
				printValueOf("error, not defined language EN or AR");
			}
		} catch (Exception e) {
			flag = false;
			printValueOf(" FAIL , orLabel is not displayed properly !" + e);
		}
		return flag;
	}

	private boolean msgLabel_Displayed(String Language) {
		boolean flag = false;

		try {
			waitForElement(logo);
			if (Language.equalsIgnoreCase("EN") || Language.equalsIgnoreCase("ENGLISH")) {
				String Expected = "Leave us a message";

				if (isDisplayedElement(msgLabel) == true && getTextOf(msgLabel).equals(Expected)) {
					flag = true;
					printValueOf(" PASS, msgLabel is displayed properly");
				} else {
					flag = false;
					printValueOf(" FAIL , msgLabel is not displayed properly, [Actual]: " + getTextOf(msgLabel)
							+ " [Expected]: " + Expected);
				}
			} else if (Language.equalsIgnoreCase("AR") || Language.equalsIgnoreCase("ARABIC")) {
				String Expected = "اترك لنا رسالة";

				if (isDisplayedElement(msgLabel) == true && getTextOf(msgLabel).equals(Expected)) {
					flag = true;
					printValueOf(" PASS, msgLabel is displayed properly");
				} else {
					flag = false;
					printValueOf(" FAIL , msgLabel is not displayed properly, [Actual]: " + getTextOf(msgLabel)
							+ " [Expected]: " + Expected);
				}
			} else {
				flag = false;
				printValueOf("error, not defined language EN or AR");
			}
		}

		catch (Exception e) {
			flag = false;
			printValueOf(" FAIL , msgLabel is not displayed properly!" + e);
		}
		return flag;
	}

}
