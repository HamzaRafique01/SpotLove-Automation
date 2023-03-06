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
	if(Mobile.waitForElementPresent(matches_tab, 60)) {

		Mobile.tap(matches_tab, 60)
		KeywordUtil.markPassed("Application Launched Successfully and user navigate to the Matches Tab.......!")

		if(Mobile.waitForElementPresent(lbl_matches, 60)) {

			KeywordUtil.markPassed("Matches Header label text found.......!")

			if(Mobile.waitForElementPresent(preferences_home, 60)) {

				Mobile.tap(preferences_home, 60)
				KeywordUtil.markPassed("Icon Found and Tapped.......!")

				if(Mobile.waitForElementPresent(lbl_Dating, 60)) {

					KeywordUtil.markPassed("User Navigate to the Dating Preferences Screen and Dating Preferences header text found.......!")

					if(Mobile.waitForElementPresent(Education_icon, 60)) {

						KeywordUtil.markPassed("Education icon found.......!")

						if(Mobile.waitForElementPresent(Education_userdata, 60)) {

							KeywordUtil.markPassed("Education User data Label text found.......!")

							if(Mobile.waitForElementPresent(for_icon, 60)) {

								KeywordUtil.markPassed("Education Forword icon found.......!")

								if(Mobile.waitForElementPresent(lbl_Education, 60)) {

									Mobile.tap(lbl_Education, 60)
									//				CustomKeywords.'com.spotlove.Utility.swipe_up'(a,b)
									KeywordUtil.markPassed("Education Selection PopUp opened.......!")

									if(Mobile.waitForElementPresent(close_popup, 60)) {

										Mobile.tap(close_popup, 60)
										KeywordUtil.markPassed("Education PopUp closed.......!")
										//					CustomKeywords.'com.spotlove.Utility.swipe_down'()

										if(Mobile.waitForElementPresent(lbl_Education, 60)) {

											Mobile.tap(lbl_Education, 60)
											KeywordUtil.markPassed("Education Selection PopUp opened.......!")

											if(Mobile.waitForElementPresent(Education_popup, 60)) {

												KeywordUtil.markPassed("Header Education on PopUp Found.......!")

												if(Mobile.waitForElementPresent(lbl_what, 60)) {

													KeywordUtil.markPassed("What are you open to? on PopUp Found.......!")
													CustomKeywords.'com.spotlove.Utility.dating_Pref'(Education)

													if(Mobile.waitForElementPresent(btn_save, 60)) {

														Mobile.tap(btn_save, 60)
														KeywordUtil.markPassed("Education PopUp Closed Found.......!")

														if(Mobile.waitForElementPresent(Preferences_updated, 120)) {

															KeywordUtil.markPassed("Education preferences Updated Successfully.......!")
															Mobile.delay(5)

															if(Mobile.waitForElementPresent(btn_back, 60)) {

																CustomKeywords.'com.spotlove.Utility.tap_back'()
																KeywordUtil.markPassed("Back Button Found and Tapped.......!")

																if(Mobile.waitForElementPresent(matches_tab, 60)) {

																	KeywordUtil.markPassed("User Navigate to the Matches Tab Screen and Matches header text found.......!")

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
														KeywordUtil.markFailed("Education preferences Updating Error.......!")
													}
												}else {
													KeywordUtil.markFailed("What are you open to? not Found.......!")
												}
											}else {
												KeywordUtil.markFailed("Header Education on PopUp not Found.......!")
											}
										}else {
											KeywordUtil.markFailed("Education Popup not opened on the screen.......!")
										}
									}else {
										KeywordUtil.markFailed("Close button not Found.......!")
									}
								}else {
									KeywordUtil.markFailed("Education Popup not opened on the screen.......!")
								}
							}else {
								KeywordUtil.markFailed("Education Forword icon Label text not Found.......!")
							}
						}else {
							KeywordUtil.markFailed("Education User data Label text not Found.......!")
						}
					}else {
						KeywordUtil.markFailed("Education icon not Found.......!")
					}
				} else {
					KeywordUtil.markFailed("Dating Preferences header Label text not found.......!")
				}
			} else {
				KeywordUtil.markFailed("Preferences Icon not Found.......!")
			}
		}else {
			KeywordUtil.markFailed("Matches Header label text not found.......!")
		}
	}else {
		KeywordUtil.markFailed("Application Launching Unsuccessfully.......!")
	}


}catch(Exception e) {
	e.printStackTrace()
}finally {
	Mobile.delay(5)
}


