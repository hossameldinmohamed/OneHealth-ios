//package pages;
//
//import org.openqa.selenium.support.FindBy;
//import org.testng.annotations.BeforeMethod;
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
//
//public class CallDoctor_EN_AR extends PageBase {
//
//	// HomePage HomePageObj;
//	LoginPageEN_AR LoginPageEN_AR_Obj;
//
//	// Objects initialization
//	@BeforeMethod(dependsOnMethods = "setup")
//	public void initializeObjects() {
//		// HomePageObj = new HomePage(driver);
//		// LoginPageEN_AR_Obj = new LoginPageEN_AR(driver);
//	}
//
//	public CallDoctor_EN_AR(AppiumDriver<MobileElement> driver) {
//		super(driver);
//		// this.driver = driver;
//	}
//
//	@FindBy(xpath = "//*[@resource-id=\"com.youclick.wecare.debug:id/cvVoiceCallContainer\"]/*[1]/*[2]") //cvVoiceCallContainer
//	MobileElement voiceCallitem;
//
//	@FindBy(xpath = "//*[@resource-id=\"com.youclick.wecare.debug:id/tvConversationLanguage\"]") //tvConversationLanguage
//	MobileElement languageType;
//
//	@FindBy(xpath = "//*[@resource-id=\"com.youclick.wecare.debug:id/ivLanguageArrow\"]") //ivLanguageArrow
//	MobileElement languageArrow;
//
//	@FindBy(xpath = "//*[@resource-id=\"com.youclick.wecare.debug:id/cvVideoCallContainer\"]/*[1]/*[2]") //cvVideoCallContainer
//	MobileElement videoCallBTN;
//
//	@FindBy(xpath = "//*[@resource-id=\"com.youclick.wecare.debug:id/ivDoctorsPlaceHolder\"]") //ivDoctorsPlaceHolder
//	MobileElement DoctorsIMG;
//	
//	@FindBy(xpath = "//*[@resource-id=\"com.youclick.wecare.debug:id/action_contact\"]") // 94834df6-f9db-4576-b002-3dc8b8a31684
//	MobileElement ContactDoctorBar;
//
//	@FindBy(xpath = "//*[@resource-id=\"com.youclick.wecare.debug:id/largeLabel\"]") // 94834df6-f9db-4576-b002-3dc8b8a31684
//	MobileElement contactDoctorBarLBL;
//	
//	
//	@FindBy(xpath = "//*[@resource-id=\"com.youclick.wecare.debug:id/tvServiceHint\"]") // tvServiceHint
//	MobileElement middleLabel;
//
//	@FindBy(xpath = "//*[@resource-id=\"com.youclick.wecare.debug:id/trudoctoolbar\"]/*[1]") // trudoctoolbar
//	MobileElement header;
//
//	@FindBy(xpath = "//*[@resource-id=\"com.youclick.wecare.debug:id/tvConversationLanguageHint\"]") //tvConversationLanguageHint
//	MobileElement callLanugageLabel;
//
//	@FindBy(xpath = "//*[@resource-id=\"com.youclick.wecare.debug:id/iv_video_call_warning_dialog\"]") //iv_video_call_warning_dialog
//	MobileElement registerNoteIcon;
//
//	@FindBy(xpath = "//*[@resource-id=\"com.youclick.wecare.debug:id/tv_video_call_warnoing_message\"]") //tv_video_call_warnoing_message
//	MobileElement registerNoteLabel;
//
//	@FindBy(xpath = "//*[@resource-id=\"com.youclick.wecare.debug:id/btn_video_call_submit_action\"]") //btn_video_call_submit_action
//	MobileElement login_registerBTN;
//
//	@FindBy(xpath = "//*[@resource-id=\"com.youclick.wecare.debug:id/tv_not_now\"]") //tv_not_now
//	MobileElement notNowBTN;
//	
//	
//	@FindBy(xpath = "//*[@resource-id=\"com.youclick.wecare.debug:id/cvVoiceCallContainer\"]/*[1]/*[1]") //tv_not_now
//	MobileElement voiceLogo;
//	
//	@FindBy(xpath = "//*[@resource-id=\"com.youclick.wecare.debug:id/cvVideoCallContainer\"]/*[1]/*[1]") //tv_not_now
//	MobileElement videoLogo;
//	
//	//////////////// Calling Methods ////////////////
//
//	public void makeVideoCall() {
//		try {
//			waitForElement(ContactDoctorBar);
//			clickOn(ContactDoctorBar);
//			waitForElement(contactDoctorBarLBL);
//			//waitForElement(DoctorsIMG);
//
//			// clickOn(videoCallBTN);
//			// waitForElement(registerNoteIcon);
//
//		} catch (Exception e) {
//			printValueOf("Exception in make video call method, " + e);
//		}
//
//	}
//
//	public boolean videoPopUpcontentDisplayed(String language) {
//		clickOn(videoCallBTN);
//		waitForElement(registerNoteIcon);
//		boolean popupContentMatches = videoCallPopupContent(language);
//		return popupContentMatches;
//	}
//
//	public boolean NotNowVideoRegister(String language) {
//		clickOn(notNowBTN);
//		return ContentDisplayedProperly(language);
//	}
//
//	public boolean Login_RegisterNow(String language) {
//		LoginPageEN_AR_Obj = new LoginPageEN_AR(driver);
//
//		clickOn(login_registerBTN);
//		return LoginPageEN_AR_Obj.ContentDisplayedProperly(language);
//	}
//
//	public boolean videoCallPopupContent(String language) {
//		boolean flag = false;
//		String ExpectedLabel = "Please login/register to access all app features";
//		String ExpectedRegistBtn = "LOGIN / REGISTER";
//		String ExpectedNotNwBtn = "Not Now";
//
//		String ExpectedLabel_AR = "من فضلك قم بتسجيل الدخول او الإشتراك لأستخدام كل خصائص البرنامج";
//		String ExpectedRegistBtn_AR = "دخول / إنشاء حساب";
//		String ExpectedNotNwBtn_AR = "ليس الآن";
//
//		if (isDisplayedElement(registerNoteIcon) && language.equalsIgnoreCase("EN")
//				|| language.equalsIgnoreCase("ENGLISH")) {
//			if (getTextOf(registerNoteLabel).equalsIgnoreCase(ExpectedLabel)
//					&& getTextOf(login_registerBTN).equalsIgnoreCase(ExpectedRegistBtn)
//					&& getTextOf(notNowBTN).equalsIgnoreCase(ExpectedNotNwBtn)) {
//				flag = true;
//			}
//		} else if (isDisplayedElement(registerNoteIcon) && language.equalsIgnoreCase("AR")
//				|| language.equalsIgnoreCase("ARABIC")) {
//			if (getTextOf(registerNoteLabel).equalsIgnoreCase(ExpectedLabel_AR)
//					&& getTextOf(login_registerBTN).equalsIgnoreCase(ExpectedRegistBtn_AR)
//					&& getTextOf(notNowBTN).equalsIgnoreCase(ExpectedNotNwBtn_AR)) {
//				flag = true;
//			} else {
//				flag = false;
//			}
//		}
//		return flag;
//	}
//
//	public boolean ContentDisplayedProperly(String language) {
//
//		makeVideoCall();
//		// waitForElement(DoctorsIMG);
//
//		boolean flag = false;
//		if (language.equalsIgnoreCase("EN") || language.equalsIgnoreCase("ENGLISH")) {
//			if (allElementsFlags(language) == true) {
//				flag = true;
//				printValueOf("PASS ^_^ , Everything is OKAY in the [English] Contact DR Screen");
//			} else {
//				flag = false;
//				printValueOf(" FAIL !!! , Something wrong in the [English] Contact DR Screen");
//			}
//		} else if (language.equalsIgnoreCase("AR") || language.equalsIgnoreCase("ARABIC")) {
//			if (allElementsFlags(language) == true) {
//				flag = true;
//				printValueOf("PASS ^_^ , Everything is OKAY in the [Arabic] Contact DR Screen");
//			} else {
//				flag = false;
//				printValueOf(" FAIL !!! , Something wrong in the [Arabic] Contact DR Screen");
//			}
//		} else {
//			flag = false;
//			printValueOf(" FAIL !!! , Something wrong in the [English] or [Arabic] Contact DR Screen");
//		}
//		/*
//		 * if (allElementsFlags(language) == true && (language.equalsIgnoreCase("EN") ||
//		 * language.equalsIgnoreCase("ENGLISH"))) { flag = true;
//		 * printValueOf("PASS ^_^ , Everything is OKAY in the [English] Login Screen");
//		 * 
//		 * } else if (allElementsFlags(language) == true &&
//		 * (language.equalsIgnoreCase("AR") || language.equalsIgnoreCase("ARABIC"))) {
//		 * flag = true;
//		 * printValueOf("PASS ^_^ , Everything is OKAY in the [Arabic] Login Screen");
//		 * 
//		 * } else { flag = false;
//		 * printValueOf(" FAIL !!! , Something wrong in the [English] or [Arabic] Login Screen"
//		 * ); }
//		 */
//		return flag;
//	}
//
//	//////////////// Elements Implementation ////////////////
//
//	private boolean allElementsFlags(String language) {
//		boolean allFlags = false;
//		try {
//			boolean result1 = Header_Displayed(language);
//			boolean result2 = callLanugageLabel_Displayed(language);
//			boolean result3 = voiceCall_Displayed(language);
//			boolean result4 = videoCall_Displayed(language);
//			boolean result5 = MiddleLabel_Displayed(language);
//			boolean result6 = Drs_Img_Displayed();
//			boolean result7 = languageArrow_Displayed();
//			boolean result8 = languageType_Displayed();
//			boolean result9 = ContactDoctorBar_Displayed(language);
//			boolean result10 = voiceLogo_Displayed();
//			boolean result11 = videoLogo_Displayed();
//
//			if (result1 == false || result2 == false || result3 == false || result4 == false || result5 == false
//					|| result6 == false || result7 == false || result8 == false || result9 == false || result10 == false || result11 == false) {
//				allFlags = false;
//
//			} else {
//				allFlags = true;
//			}
//		} catch (Exception e) {
//			allFlags = false;
//			printValueOf(" FAIL , some of allFlags is not displayed properly!" + e);
//		}
//		return allFlags;
//	}
//
//	private boolean Drs_Img_Displayed() {
//		boolean flag = false;
//		try {
//			waitForElement(DoctorsIMG);
//
//			if (isDisplayedElement(DoctorsIMG) == true) {
//				flag = true;
//				printValueOf(" PASS, Drs Img is displayed properly");
//			} else {
//				flag = false;
//				printValueOf(" FAIL , Drs Img is not displayed properly");
//			}
//		} catch (Exception e) {
//			flag = false;
//			printValueOf(" FAIL , Drs Img is not displayed properly!" + e);
//		}
//		return flag;
//	}
//
//	private boolean languageArrow_Displayed() {
//		boolean flag = false;
//		try {
//			waitForElement(languageArrow);
//
//			if (isDisplayedElement(languageArrow) == true && isEnabledElement(languageArrow) == true) {
//				flag = true;
//				printValueOf(" PASS, languageArrow is displayed properly");
//			} else {
//				flag = false;
//				printValueOf(" FAIL , languageArrow is not displayed properly");
//			}
//		} catch (Exception e) {
//			flag = false;
//			printValueOf(" FAIL , languageArrow is not displayed properly!" + e);
//		}
//		return flag;
//	}
//
//	private boolean voiceCall_Displayed(String Language) {
//		boolean flag = false;
//		try {
//			waitForElement(voiceCallitem);
//			if (Language.equalsIgnoreCase("EN") || Language.equalsIgnoreCase("ENGLISH")) {
//				String Expected = "Voice call";
//
//				if (isDisplayedElement(voiceCallitem) == true && isEnabledElement(voiceCallitem) == true
//						&& getTextOf(voiceCallitem).equals(Expected)) {
//					flag = true;
//					printValueOf(" PASS, voiceCallitem is displayed properly");
//				} else {
//					flag = false;
//					printValueOf(" FAIL , voiceCallitem is not displayed properly, [Actual]: "
//							+ getTextOf(voiceCallitem) + " [Expected]: " + Expected);
//				}
//			} else if (Language.equalsIgnoreCase("AR") || Language.equalsIgnoreCase("ARABIC")) {
//				String Expected = "مكالمة هاتفية";
//
//				if (isDisplayedElement(voiceCallitem) == true && isEnabledElement(voiceCallitem) == true
//						&& getTextOf(voiceCallitem).equals(Expected)) {
//					flag = true;
//					printValueOf(" PASS, voiceCallitem is displayed properly");
//				} else {
//					flag = false;
//					printValueOf(" FAIL , voiceCallitem is not displayed properly, [Actual]: "
//							+ getTextOf(voiceCallitem) + " [Expected]: " + Expected);
//				}
//			} else {
//				flag = false;
//				printValueOf("error, not defined language EN or AR");
//			}
//		} catch (Exception e) {
//			flag = false;
//			printValueOf(" FAIL , voiceCallitem is not displayed properly!" + e);
//		}
//		return flag;
//	}
//
//	private boolean videoCall_Displayed(String Language) {
//		boolean flag = false;
//		try {
//			waitForElement(videoCallBTN);
//			if (Language.equalsIgnoreCase("EN") || Language.equalsIgnoreCase("ENGLISH")) {
//				String Expected = "Video call";
//
//				if (isDisplayedElement(videoCallBTN) == true && isEnabledElement(videoCallBTN) == true
//						&& getTextOf(videoCallBTN).equals(Expected)) {
//					flag = true;
//					printValueOf(" PASS, videoCallBTN is displayed properly");
//				} else {
//					flag = false;
//					printValueOf(" FAIL , videoCallBTN is not displayed properly, [Actual]: " + getTextOf(videoCallBTN)
//							+ " [Expected]: " + Expected);
//				}
//			} else if (Language.equalsIgnoreCase("AR") || Language.equalsIgnoreCase("ARABIC")) {
//				String Expected = "مكالمة فيديو";
//
//				if (isDisplayedElement(videoCallBTN) == true && isEnabledElement(videoCallBTN) == true
//						&& getTextOf(videoCallBTN).equals(Expected)) {
//					flag = true;
//					printValueOf(" PASS, videoCallBTN is displayed properly");
//				} else {
//					flag = false;
//					printValueOf(" FAIL , videoCallBTN is not displayed properly, [Actual]: " + getTextOf(videoCallBTN)
//							+ " [Expected]: " + Expected);
//				}
//			} else {
//				flag = false;
//				printValueOf("error, not defined language EN or AR");
//			}
//		} catch (Exception e) {
//			flag = false;
//			printValueOf(" FAIL , videoCallBTN is not displayed properly!" + e);
//		}
//		return flag;
//	}
//
//	private boolean ContactDoctorBar_Displayed(String Language) {
//		boolean flag = false;
//		try {
//			waitForElement(contactDoctorBarLBL);
//
//			if (Language.equalsIgnoreCase("EN") || Language.equalsIgnoreCase("ENGLISH")) {
//				String Expected = "Contact a Doctor";
//
//				if (isDisplayedElement(contactDoctorBarLBL) == true && getTextOf(contactDoctorBarLBL).equals(Expected)) {
//					flag = true;
//					printValueOf(" PASS, contactDoctorBarLBL is displayed properly");
//				} else {
//					flag = false;
//					printValueOf(" FAIL , contactDoctorBarLBL is not displayed properly, [Actual]: "
//							+ getTextOf(contactDoctorBarLBL) + " [Expected]: " + Expected);
//				}
//			} else if (Language.equalsIgnoreCase("AR") || Language.equalsIgnoreCase("ARABIC")) {
//				String Expected = "الاتصال بطبيب";
//				if (isDisplayedElement(contactDoctorBarLBL) == true && getTextOf(contactDoctorBarLBL).equals(Expected)) {
//					flag = true;
//					printValueOf(" PASS, contactDoctorBarLBL is displayed properly");
//				} else {
//					flag = false;
//					printValueOf(" FAIL , contactDoctorBarLBL is not displayed properly, [Actual]: "
//							+ getTextOf(contactDoctorBarLBL) + " [Expected]: " + Expected);
//				}
//			} else {
//				flag = false;
//				printValueOf("error, not defined language EN or AR");
//			}
//		} catch (Exception e) {
//			flag = false;
//			printValueOf(" FAIL , contactDoctorBarLBL is not displayed properly!" + e);
//		}
//		return flag;
//	}
//
//	private boolean languageType_Displayed() {
//
//		boolean flag = false;
//		try {
//			waitForElement(languageType);
//
//			if (isDisplayedElement(languageType) == true) {
//				flag = true;
//				printValueOf(" PASS, languageType is displayed properly");
//			} else {
//				flag = false;
//				printValueOf(" FAIL , languageType is not displayed properly");
//			}
//		} catch (Exception e) {
//			flag = false;
//			printValueOf(" FAIL , languageType is not displayed properly!" + e);
//		}
//		return flag;
//	}
//
//	private boolean voiceLogo_Displayed() {
//
//		boolean flag = false;
//		try {
//			waitForElement(voiceLogo);
//
//			if (isDisplayedElement(voiceLogo) == true) {
//				flag = true;
//				printValueOf(" PASS, voiceLogo is displayed properly");
//			} else {
//				flag = false;
//				printValueOf(" FAIL , voiceLogo is not displayed properly");
//			}
//		} catch (Exception e) {
//			flag = false;
//			printValueOf(" FAIL , voiceLogo is not displayed properly!" + e);
//		}
//		return flag;
//	}
//	private boolean videoLogo_Displayed() {
//
//		boolean flag = false;
//		try {
//			waitForElement(videoLogo);
//
//			if (isDisplayedElement(videoLogo) == true) {
//				flag = true;
//				printValueOf(" PASS, videoLogo is displayed properly");
//			} else {
//				flag = false;
//				printValueOf(" FAIL , videoLogo is not displayed properly");
//			}
//		} catch (Exception e) {
//			flag = false;
//			printValueOf(" FAIL , videoLogo is not displayed properly!" + e);
//		}
//		return flag;
//	}
//
//
//	
//	private boolean MiddleLabel_Displayed(String Language) {
//		boolean flag = false;
//		try {
//			waitForElement(middleLabel);
//			if (Language.equalsIgnoreCase("EN") || Language.equalsIgnoreCase("ENGLISH")) {
//				String Expected = "24x7 Doctors and Wellness Experts";
//
//				if (isDisplayedElement(middleLabel) == true && getTextOf(middleLabel).equals(Expected)) {
//					flag = true;
//					printValueOf(" PASS, middleLabel is displayed properly");
//				} else {
//					flag = false;
//					printValueOf(" FAIL , middleLabel is not displayed properly, [Actual]: " + getTextOf(middleLabel)
//							+ " [Expected]: " + Expected);
//				}
//			} else if (Language.equalsIgnoreCase("AR") || Language.equalsIgnoreCase("ARABIC")) {
//				String Expected = "أطباء و مستشاري الصحة ٢٤x٧"; //أطباء و مستشاري الصحة ٢٤x٧
//
//				if (isDisplayedElement(middleLabel) == true && getTextOf(middleLabel).equals(Expected)) {
//					flag = true;
//					printValueOf(" PASS, middleLabel is displayed properly");
//				} else {
//					flag = false;
//					printValueOf(" FAIL , middleLabel is not displayed properly, [Actual]: " + getTextOf(middleLabel)
//							+ " [Expected]: " + Expected);
//				}
//			} else {
//				flag = false;
//				printValueOf("error, not defined language EN or AR");
//			}
//		} catch (Exception e) {
//			flag = false;
//			printValueOf(" FAIL , middleLabel is not displayed properly!" + e);
//		}
//		return flag;
//	}
//
//	private boolean Header_Displayed(String Language) {
//		boolean flag = false;
//		try {
//			waitForElement(header);
//
//			if (Language.equalsIgnoreCase("EN") || Language.equalsIgnoreCase("ENGLISH")) {
//				String Expected = "Contact a Doctor";
//
//				if (isDisplayedElement(header) == true && getTextOf(header).equals(Expected)) {
//					flag = true;
//					printValueOf(" PASS, header is displayed properly");
//				} else {
//					flag = false;
//					printValueOf(" FAIL , header is not displayed properly, [Actual]: " + getTextOf(header)
//							+ " [Expected]: " + Expected);
//				}
//			} else if (Language.equalsIgnoreCase("AR") || Language.equalsIgnoreCase("ARABIC")) {
//				String Expected = "الاتصال بطبيب";
//				if (isDisplayedElement(header) == true && getTextOf(header).equals(Expected)) {
//					flag = true;
//					printValueOf(" PASS, header is displayed properly");
//				} else {
//					flag = false;
//					printValueOf(" FAIL , header is not displayed properly, [Actual]: " + getTextOf(header)
//							+ " [Expected]: " + Expected);
//				}
//			} else {
//				flag = false;
//				printValueOf("error, not defined language EN or AR");
//			}
//		} catch (Exception e) {
//			flag = false;
//			printValueOf(" FAIL , header is not displayed properly!" + e);
//		}
//		return flag;
//	}
//
//	private boolean callLanugageLabel_Displayed(String Language) {
//		boolean flag = false;
//		try {
//			waitForElement(callLanugageLabel);
//
//			if (Language.equalsIgnoreCase("EN") || Language.equalsIgnoreCase("ENGLISH")) {
//				String Expected = "Call Language";
//
//				if (isDisplayedElement(callLanugageLabel) == true && getTextOf(callLanugageLabel).equals(Expected)) {
//					flag = true;
//					printValueOf(" PASS, callLanugageLabel is displayed properly");
//				} else {
//					flag = false;
//					printValueOf(" FAIL , callLanugageLabel is not displayed properly, [Actual]: "
//							+ getTextOf(callLanugageLabel) + " [Expected]: " + Expected);
//				}
//			} else if (Language.equalsIgnoreCase("AR") || Language.equalsIgnoreCase("ARABIC")) {
//				String Expected = "لغة الاتصال";
//				if (isDisplayedElement(callLanugageLabel) == true && getTextOf(callLanugageLabel).equals(Expected)) {
//					flag = true;
//					printValueOf(" PASS, callLanugageLabel is displayed properly");
//				} else {
//					flag = false;
//					printValueOf(" FAIL , callLanugageLabel is not displayed properly, [Actual]: "
//							+ getTextOf(callLanugageLabel) + " [Expected]: " + Expected);
//				}
//			} else {
//				flag = false;
//				printValueOf("error, not defined language EN or AR");
//			}
//		} catch (Exception e) {
//			flag = false;
//			printValueOf(" FAIL , callLanugageLabel is not displayed properly!" + e);
//		}
//		return flag;
//	}
//
//}
