import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.spotlove.Utility


//Mobile.startExistingApplication('com.spotlove.releaseproduction', FailureHandling.STOP_ON_FAILURE)


Mobile.tap(Profile_tap, 60)


if(Mobile.waitForElementPresent(setting_icon, 60)) {

	KeywordUtil.markPassed("Setting icon on setting Tab found.......!")

	if(Mobile.waitForElementPresent(forword_icon_setting, 60)) {

		KeywordUtil.markPassed("Forword icon on setting Tab found.......!")

		if(Mobile.waitForElementPresent(Setting, 60)) {

			Mobile.tap(Setting, 60)
			KeywordUtil.markPassed("Setting tab tapped.......!")

			if(Mobile.waitForElementPresent(lbl_profile, 60)) {

				KeywordUtil.markPassed("User Navigate to the Setting tab and Profile text found.......!")

				if(Mobile.waitForElementPresent(lbl_push, 60)) {

					KeywordUtil.markPassed("Push Notifications label text found.......!")

					if(Mobile.waitForElementPresent(NOti_toggle, 60)) {

						Mobile.tap(NOti_toggle, 60)
						KeywordUtil.markPassed("Push Notifications Toggle button found and Tapped.......!")

						if(Mobile.waitForElementPresent(lbl_App, 60)) {

							KeywordUtil.markPassed("App Sounds/Vibrations label text found.......!")

							if(Mobile.waitForElementPresent(App_toggle, 60)) {

								Mobile.tap(App_toggle, 60)
								KeywordUtil.markPassed("App Sounds/Vibrationss Toggle button found and Tapped.......!")

								if(Mobile.waitForElementPresent(lbl_feed, 60)) {

									KeywordUtil.markPassed("Feedback label text found.......!")

									if(Mobile.waitForElementPresent(for_feed, 60)) {

										KeywordUtil.markPassed("Feedback Forword icon found.......!")

										if(Mobile.waitForElementPresent(lbl_trem, 60)) {

											KeywordUtil.markPassed("Trems of Services label text found.......!")

											if(Mobile.waitForElementPresent(for_term, 60)) {

												KeywordUtil.markPassed("Trems of Services Forword icon found.......!")

												if(Mobile.waitForElementPresent(lbl_policy, 60)) {

													KeywordUtil.markPassed("Privacy Policy label text found.......!")

													if(Mobile.waitForElementPresent(for_policy, 60)) {

														KeywordUtil.markPassed("Privacy Policy Forword icon found.......!")

															if(Mobile.waitForElementPresent(btn_back, 60)) {

																CustomKeywords.'com.spotlove.Utility.tap_back'()

																if(Mobile.waitForElementPresent(lbl_profile_H, 60)) {

																	KeywordUtil.markPassed("User Navigate to the Profile tab and Profile text found.......!")


																}else {
																	KeywordUtil.markFailed("Back button not found.......!")
																}
															}else {
																KeywordUtil.markFailed("Back button not found.......!")
															}
													}else {
														KeywordUtil.markFailed("Privacy Policy Forword icon not Found.......!")
													}
												}else {
													KeywordUtil.markFailed("Privacy Policy label text not Found.......!")
												}
											}else {
												KeywordUtil.markFailed("Trems of Services Forword icon not Found.......!")
											}
										}else {
											KeywordUtil.markFailed("Trems of Services label text not Found.......!")
										}
									}else {
										KeywordUtil.markFailed("Feedback Forword icon not Found.......!")
									}
								}else {
									KeywordUtil.markFailed("Feedback label text not Found.......!")
								}
							}else {
								KeywordUtil.markFailed("App Sounds/Vibrations Toggle button  not Found.......!")
							}
						}else {
							KeywordUtil.markFailed("App Sounds/Vibrations label text  not Found.......!")
						}
					}else {
						KeywordUtil.markFailed("Push Notifications Toggle button  not Found.......!")
					}
				}else {
					KeywordUtil.markFailed("Push Notifications label text  not Found.......!")
				}
			}else {
				KeywordUtil.markFailed("Profile lbl text not Found.......!")
			}
		}else {
			KeywordUtil.markFailed("Setting icon on Help Center setting Tab not Found.......!")
		}
	}else {
		KeywordUtil.markFailed("Forword icon on setting Tab not Found.......!")
	}
}else {
	KeywordUtil.markFailed("Setting icon on Dating Preferences setting Tab not Found.......!")
}




