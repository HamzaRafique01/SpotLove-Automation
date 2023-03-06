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

try {
if(Mobile.waitForElementPresent(Children_icon, 120)) {

	KeywordUtil.markPassed("Children icon found.......!")
	CustomKeywords.'com.spotlove.Utility.swipe_down'()
	
	
	if(Mobile.waitForElementPresent(Children_userdata, 120)) {

		KeywordUtil.markPassed("Children User data Label text found.......!")

		if(Mobile.waitForElementPresent(for_icon, 120)) {

			KeywordUtil.markPassed("Children Forword icon found.......!")

			if(Mobile.waitForElementPresent(lbl_Children, 120)) {

				Mobile.tap(lbl_Children, 120)
				KeywordUtil.markPassed("Children Selection PopUp opened.......!")

				if(Mobile.waitForElementPresent(close_popup, 120)) {

					Mobile.tap(close_popup, 120)
					KeywordUtil.markPassed("Children PopUp closed.......!")

					if(Mobile.waitForElementPresent(lbl_Children, 120)) {

						Mobile.tap(lbl_Children, 120)
						KeywordUtil.markPassed("Children Selection PopUp opened.......!")

						if(Mobile.waitForElementPresent(Children_popup, 20)) {

							KeywordUtil.markPassed("Header Children on PopUp Found.......!")

							if(Mobile.waitForElementPresent(lbl_what, 120)) {

								KeywordUtil.markPassed("What are you open to? on PopUp Found.......!")
								CustomKeywords.'com.spotlove.Utility.dating_Pref'(Children)

								if(Mobile.waitForElementPresent(btn_save, 120)) {

									Mobile.tap(btn_save, 120)
									KeywordUtil.markPassed("Children PopUp Closed Found.......!")
									
									if(Mobile.waitForElementPresent(Preferences_updated, 120)) {
										
										KeywordUtil.markPassed("Children preferences Updated Successfully.......!")
										Mobile.delay(5)
									}else {
										KeywordUtil.markFailed("Children preferences Updating Error.......!")
									}


								}else {
									KeywordUtil.markFailed("Save Button not Found.......!")
								}
							}else {
								KeywordUtil.markFailed("What are you open to? not Found.......!")
							}
						}else {
							KeywordUtil.markFailed("Header Children on PopUp not Found.......!")
						}
					}else {
						KeywordUtil.markFailed("Children Popup not opened on the screen.......!")
					}
				}else {
					KeywordUtil.markFailed("Close button not Found.......!")
				}
			}else {
				KeywordUtil.markFailed("Children Popup not opened on the screen.......!")
			}
		}else {
			KeywordUtil.markFailed("Children Forword icon Label text not Found.......!")
		}
	}else {
		KeywordUtil.markFailed("Children User data Label text not Found.......!")
	}
}else {
	KeywordUtil.markFailed("Children icon not Found.......!")
}

}catch(Exception e) {
	e.printStackTrace()
}finally {
	Mobile.delay(5)
}




