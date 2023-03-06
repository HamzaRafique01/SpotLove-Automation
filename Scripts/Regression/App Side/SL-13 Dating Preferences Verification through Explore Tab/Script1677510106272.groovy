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
int a,b



//Mobile.startExistingApplication('com.spotlove.releaseproduction', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(explore_tab, 120)

try {

	if(Mobile.waitForElementPresent(lbl_explore, 120)) {

		KeywordUtil.markPassed("Application Launched Successfully and User Navigate to the Explore tab.......!")

		CustomKeywords.'com.spotlove.Utility.swipe_down'()
		Mobile.delay(2)
		CustomKeywords.'com.spotlove.Utility.swipe_up'(a,b)

		if(Mobile.waitForElementPresent(preferences_home, 120)) {

			Mobile.tap(preferences_home, 120)
			KeywordUtil.markPassed("Icon Found and Tapped.......!")

			if(Mobile.waitForElementPresent(lbl_Dating, 120)) {

				KeywordUtil.markPassed("User Navigate to the Dating Preferences Screen and Dating Preferences header text found.......!")

				if(Mobile.waitForElementPresent(Religion_icon, 120)) {

					KeywordUtil.markPassed("Religion icon found.......!")

					if(Mobile.waitForElementPresent(Religion_userdata, 120)) {

						KeywordUtil.markPassed("Religion User data Label text found.......!")

						if(Mobile.waitForElementPresent(for_icon, 120)) {

							KeywordUtil.markPassed("Religion Forword icon found.......!")

							if(Mobile.waitForElementPresent(lbl_Religion, 120)) {

								Mobile.tap(lbl_Religion, 120)
								KeywordUtil.markPassed("Religion Selection PopUp opened.......!")

								if(Mobile.waitForElementPresent(close_popup, 120)) {

									Mobile.tap(close_popup, 120)
									KeywordUtil.markPassed("Religion PopUp closed.......!")

									if(Mobile.waitForElementPresent(Religion_userdata, 120)) {

										Mobile.tap(Religion_userdata, 120)
										KeywordUtil.markPassed("Religion Selection PopUp opened.......!")

										if(Mobile.waitForElementPresent(Religion_popup, 20)) {

											KeywordUtil.markPassed("Header Religion on PopUp Found.......!")

											if(Mobile.waitForElementPresent(lbl_what, 120)) {

												KeywordUtil.markPassed("What are you open to? on PopUp Found.......!")
												CustomKeywords.'com.spotlove.Utility.dating_Pref'(Religion)

												if(Mobile.waitForElementPresent(btn_save, 120)) {

													Mobile.tap(btn_save, 120)
													KeywordUtil.markPassed("Religion PopUp Closed Found.......!")

													if(Mobile.waitForElementPresent(Preferences_updated, 120)) {

														KeywordUtil.markPassed("Religion preferences Updated Successfully.......!")
														Mobile.delay(5)

														if(Mobile.waitForElementPresent(btn_back, 120)) {

															CustomKeywords.'com.spotlove.Utility.tap_back'()
															KeywordUtil.markPassed("Back Button Found and Tapped.......!")

															if(Mobile.waitForElementPresent(lbl_explore, 120)) {

																KeywordUtil.markPassed("User Navigate to the Explore Tab Screen and Explore header text found.......!")

															}else {
																KeywordUtil.markFailed("Navigation Failed.......!")
															}
														} else {
															KeywordUtil.markFailed("Back button not found.......!")
														}

													}else {
														KeywordUtil.markFailed("Save Button not Found.......!")
													}
												}else {
													KeywordUtil.markFailed("Religion preferences Updating Error.......!")
												}
											}else {
												KeywordUtil.markFailed("What are you open to? not Found.......!")
											}
										}else {
											KeywordUtil.markFailed("Header Religion on PopUp not Found.......!")
										}
									}else {
										KeywordUtil.markFailed("Religion Popup not opened on the screen.......!")
									}
								}else {
									KeywordUtil.markFailed("Close button not Found.......!")
								}
							}else {
								KeywordUtil.markFailed("Religion Popup not opened on the screen.......!")
							}
						}else {
							KeywordUtil.markFailed("Religion Forword icon Label text not Found.......!")
						}
					}else {
						KeywordUtil.markFailed("Religion User data Label text not Found.......!")
					}
				}else {
					KeywordUtil.markFailed("Religion icon not Found.......!")
				}
			} else {
				KeywordUtil.markFailed("Dating Preferences header Label text not found.......!")
			}
		} else {
			KeywordUtil.markFailed("Preferences Icon not Found.......!")
		}
	}else {
		KeywordUtil.markFailed("User cannot moving to the Explore tab.......!")
	}



}catch(Exception e) {
	e.printStackTrace()
}finally {
	Mobile.delay(5)
}






