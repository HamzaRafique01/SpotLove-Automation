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



if(Mobile.waitForElementPresent(btn_back, 10)) {

//	Mobile.tap(btn_back, 10)
	CustomKeywords.'com.spotlove.Utility.tap_back'()
	Mobile.delay(10)

	if(Mobile.waitForElementPresent(bottle_icon, 20)) {

		KeywordUtil.markPassed("User navigate back to the Vices screen......!")
		KeywordUtil.markPassed("bottle icon found on Vices screen......!")

		if(Mobile.waitForElementPresent(btn_continue, 10)) {

//			Mobile.tap(btn_continue, 10)
			CustomKeywords.'com.spotlove.Utility.tap_Continue'()
			KeywordUtil.markPassed("User navigate to the Politics Screen......!")

			if(Mobile.waitForElementPresent(Justics_icon, 10)) {

				KeywordUtil.markPassed("Justics icon found on Politics screen......!")

				if(Mobile.waitForElementPresent(lbl_What, 10)) {

					KeywordUtil.markPassed("What are your political views? label text found......!")

					CustomKeywords.'com.spotlove.Utility.dating_Pref'(random)
					KeywordUtil.markPassed("Political view Selection successfully......!")

					if(Mobile.waitForElementPresent(btn_P_Continue, 10)) {

//						Mobile.tap(btn_P_Continue, 10)
						CustomKeywords.'com.spotlove.Utility.tap_Continue'()
						KeywordUtil.markPassed("User navigate to the Gallery Screen.......!")


						if(Mobile.waitForElementPresent(access_Gallery_Permission, 10)) {

							KeywordUtil.markPassed("Gallery Permission Granted.......!")

							if(Mobile.waitForElementPresent(Gallery_icon, 10)) {

								KeywordUtil.markPassed("Gallery icon found on next Screen.......!")


							}else {
								KeywordUtil.markFailed("Gallery icon not found on next Screen.....!")
							}
						}else {
							KeywordUtil.markFailed("Unable to access gallery due to permissions.....!")
						}
					}else {
						KeywordUtil.markFailed("User navigation not successfully.....!")
					}
				}else {
					KeywordUtil.markFailed("Political view is not selected....!")
					KeywordUtil.markFailed("What are your political views? label text not found....!")
				}
			}else {
				KeywordUtil.markFailed("Justics icon not found on Education screen....!")
			}
		}else {
			KeywordUtil.markFailed("Continue button is not working....:---:....!")
		}
	}else {
		KeywordUtil.markFailed("bottle icon found on Vices screen....!")
		KeywordUtil.markFailed("Back button is not working.....!")
	}
}else {
	KeywordUtil.markFailed("Back button is not working.....!")
}






