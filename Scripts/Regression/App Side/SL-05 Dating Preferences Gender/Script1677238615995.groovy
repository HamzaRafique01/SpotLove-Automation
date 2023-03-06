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


Mobile.startExistingApplication('com.spotlove.releaseproduction', FailureHandling.STOP_ON_FAILURE)


Mobile.tap(Profile_tap, 120)

try {
	if(Mobile.waitForElementPresent(setting_icon_DP, 120)) {

		KeywordUtil.markPassed("Setting icon on Dating Preference Tab found.......!")

		if(Mobile.waitForElementPresent(forword_icon_DP, 120)) {

			KeywordUtil.markPassed("Forword icon on Dating Preferences Tab found.......!")

			if(Mobile.waitForElementPresent(Dating_Preferences, 120)) {

				Mobile.tap(Dating_Preferences, 120)
				KeywordUtil.markPassed("Dating Preference tab tapped.......!")

				if(Mobile.waitForElementPresent(lbl_Dating, 120)) {

					KeywordUtil.markPassed("User Navigate to the Dating Preference tab and Profile text found.......!")

					if(Mobile.waitForElementPresent(Gender_icon, 120)) {

						KeywordUtil.markPassed("Gender icon found.......!")

						if(Mobile.waitForElementPresent(Gender_userdata, 120)) {

							KeywordUtil.markPassed("Gender User data Label text found.......!")

							if(Mobile.waitForElementPresent(lbl_Gender, 120)) {

								Mobile.tap(lbl_Gender, 120)
								KeywordUtil.markPassed("Gender Field tapped.......!")
								
								if(Mobile.waitForElementPresent(lbl_what, 120)) {

									KeywordUtil.markPassed("What are you open to? on PopUp Opened.......!")

									if(Mobile.waitForElementPresent(close_popup, 120)) {

										Mobile.tap(close_popup, 120)
										KeywordUtil.markPassed("Gender PopUp closed.......!")

										if(Mobile.waitForElementPresent(Gender_userdata, 120)) {

											Mobile.tap(Gender_userdata, 120)
											KeywordUtil.markPassed("Gender Field retap.......!")

											Mobile.delay(2)
											if(Mobile.waitForElementPresent(Gender_popup, 120)) {

												KeywordUtil.markPassed("Header Gender on PopUp Found.......!")

												CustomKeywords.'com.spotlove.Utility.dating_Pref'(Gender)

												if(Mobile.waitForElementPresent(btn_save, 120)) {

													Mobile.tap(btn_save, 120)
													KeywordUtil.markPassed("Gender PopUp Closed.......!")
													
													if(Mobile.waitForElementPresent(Preferences_updated, 120)) {
														
														KeywordUtil.markPassed("Gender preferences Updated Successfully.......!")
														Mobile.delay(5)
													}else {
														KeywordUtil.markFailed("Gender preferences Updating Error.......!")
													}
												}else {
													KeywordUtil.markFailed("Save Button not Found.......!")
												}
											}else {
												KeywordUtil.markFailed("Header Gender on PopUp not Found.......!")
											}
										}else {
											KeywordUtil.markFailed("Gender Popup not opened on the screen.......!")
										}
									}else {
										KeywordUtil.markFailed("Close button not Found.......!")
									}
								}else {
									KeywordUtil.markFailed("What are you open to? not Found.......!")
								}
							}else {
								KeywordUtil.markFailed("Gender Popup not opened on the screen.......!")
							}
						}else {
							KeywordUtil.markFailed("Gender User data Label text not Found.......!")
						}
					}else {
						KeywordUtil.markFailed("Gender icon not Found.......!")
					}
				}else {
					KeywordUtil.markFailed("Profile lbl text not Found.......!")
				}
			}else {
				KeywordUtil.markFailed("Setting icon on Dating Preference setting Tab not Found.......!")
			}
		}else {
			KeywordUtil.markFailed("Forword icon on Dating Preference Tab not Found.......!")
		}
	}else {
		KeywordUtil.markFailed("Setting icon on Dating Preferences setting Tab not Found.......!")
	}
}catch(Exception e) {
	e.printStackTrace()
}finally {
	Mobile.delay(2)
}
