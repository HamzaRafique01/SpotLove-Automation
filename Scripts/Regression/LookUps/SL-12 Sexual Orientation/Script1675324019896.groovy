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

	Mobile.tap(btn_back, 10)
	KeywordUtil.markPassed("User navigate back to the Gender screen......!")
	Mobile.delay(10)
	
	if(Mobile.waitForElementPresent(mirror_icon, 20)) {

		KeywordUtil.markPassed("Mirror icon found on Gender screen......!")

		if(Mobile.waitForElementPresent(btn_continue, 10)) {

			Mobile.tap(btn_continue, 10)
			KeywordUtil.markPassed("User navigate to the Gender Screen......!")

			if(Mobile.waitForElementPresent(profile_icon, 10)) {

				KeywordUtil.markPassed("Profile icon found on Into screen......!")

				if(Mobile.waitForElementPresent(lbl_Who, 10)) {

					KeywordUtil.markPassed("Who are you into? label text found......!")

					CustomKeywords.'com.spotlove.Utility.dating_Pref'(random)
					KeywordUtil.markPassed("Partner gender Selection successfully......!")

					if(Mobile.waitForElementPresent(btn_S_Continue, 10)) {

						Mobile.tap(btn_S_Continue, 10)
						KeywordUtil.markPassed("User navigate to the Height Screen.......!")

						if(Mobile.waitForElementPresent(Scale_icon, 10)) {

							KeywordUtil.markPassed("Scale icon found on next Screen.......!")

						}else {
							KeywordUtil.markFailed("Scale icon not found on next Screen.....!")
						}
					}else {
						KeywordUtil.markFailed("User navigation not successfully.....!")
					}
				}else {
					KeywordUtil.markFailed("Partner Gender Selection is not selected....!")
					KeywordUtil.markFailed("Who are you into? label text not found....!")
				}
			}else {
				KeywordUtil.markFailed("Profile icon not found on Into screen....!")
			}
		}else {
			KeywordUtil.markFailed("Continue button is not working....!")
		}
	}else {
		KeywordUtil.markFailed("Mirror icon not found on Gender screen....!")
	}
}else {
	KeywordUtil.markFailed("Back button is not working.....!")
}