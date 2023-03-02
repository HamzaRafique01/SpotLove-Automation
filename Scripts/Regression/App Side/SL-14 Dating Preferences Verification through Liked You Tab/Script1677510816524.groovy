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


try {
if(Mobile.waitForElementPresent(likedyou_tab, 60)) {

	Mobile.tap(likedyou_tab, 60)
	KeywordUtil.markPassed("Application Launched Successfully and user navigate to the Liked You Tab.......!")

	if(Mobile.waitForElementPresent(lbl_Likedyou, 60)) {

		KeywordUtil.markPassed("Liked You Header label text found.......!")

		if(Mobile.waitForElementPresent(preferences_home, 60)) {

			Mobile.tap(preferences_home, 60)
			KeywordUtil.markPassed("Icon Found and Tapped.......!")

			if(Mobile.waitForElementPresent(lbl_Dating, 60)) {

				KeywordUtil.markPassed("User Navigate to the Dating Preferences Screen and Dating Preferences header text found.......!")

				if(Mobile.waitForElementPresent(Ethnicity_icon, 60)) {

					KeywordUtil.markPassed("Ethnicity icon found.......!")

					if(Mobile.waitForElementPresent(Ethnicity_userdata, 60)) {

						KeywordUtil.markPassed("Ethnicity User data Label text found.......!")

						if(Mobile.waitForElementPresent(for_icon, 60)) {

							KeywordUtil.markPassed("Ethnicity Forword icon found.......!")

							if(Mobile.waitForElementPresent(lbl_Ethnicity, 60)) {

								Mobile.tap(lbl_Ethnicity, 60)
								KeywordUtil.markPassed("Ethnicity Selection PopUp opened.......!")

								if(Mobile.waitForElementPresent(close_popup, 60)) {

									Mobile.tap(close_popup, 60)
									KeywordUtil.markPassed("Ethnicity PopUp closed.......!")

									if(Mobile.waitForElementPresent(Ethnicity_userdata, 60)) {

										Mobile.tap(Ethnicity_userdata, 60)
										KeywordUtil.markPassed("Ethnicity Selection PopUp opened.......!")

										if(Mobile.waitForElementPresent(Ethnicity_popup, 60)) {

											KeywordUtil.markPassed("Header Ethnicity on PopUp Found.......!")

											if(Mobile.waitForElementPresent(lbl_what, 60)) {

												KeywordUtil.markPassed("What are you open to? on PopUp Found.......!")
												CustomKeywords.'com.spotlove.Utility.dating_Pref'(Ethnicity)

												if(Mobile.waitForElementPresent(btn_save, 60)) {

													Mobile.tap(btn_save, 60)
													KeywordUtil.markPassed("Ethnicity PopUp Closed Found.......!")

													if(Mobile.waitForElementPresent(btn_back, 60)) {

														CustomKeywords.'com.spotlove.Utility.tap_back'()
														KeywordUtil.markPassed("Back Button Found and Tapped.......!")

														if(Mobile.waitForElementPresent(lbl_Likedyou, 60)) {

															KeywordUtil.markPassed("User Navigate to the Liked You Tab Screen and Liked You header text found.......!")

														}else {
															KeywordUtil.markFailed("Navigation Failed.......!")
														}
													} else {
														KeywordUtil.markFailed("Back button not found.......!")
													}
												}else {
													KeywordUtil.markFailed("Save Buttonnot Found.......!")
												}
											}else {
												KeywordUtil.markFailed("What are you open to? not Found.......!")
											}
										}else {
											KeywordUtil.markFailed("Header Ethnicity on PopUp not Found.......!")
										}
									}else {
										KeywordUtil.markFailed("Ethnicity Popup not opened on the screen.......!")
									}
								}else {
									KeywordUtil.markFailed("Close button not Found.......!")
								}
							}else {
								KeywordUtil.markFailed("Ethnicity Popup not opened on the screen.......!")
							}
						}else {
							KeywordUtil.markFailed("Ethnicity  Forword icon Label text not Found.......!")
						}
					}else {
						KeywordUtil.markFailed("Ethnicity User data Label text not Found.......!")
					}
				}else {
					KeywordUtil.markFailed("Ethnicity icon not Found.......!")
				}
			} else {
				KeywordUtil.markFailed("Dating Preferences header Label text not found.......!")
			}
		} else {
			KeywordUtil.markFailed("Preferences Icon not Found.......!")
		}
	}else {
		KeywordUtil.markFailed("Liked You Header label text not found.......!")
	}
}else {
	KeywordUtil.markFailed("Application Launching Unsuccessfully.......!")
}

}catch(Exception e) {
	e.printStackTrace()
}finally {
	Mobile.delay(5)
}


