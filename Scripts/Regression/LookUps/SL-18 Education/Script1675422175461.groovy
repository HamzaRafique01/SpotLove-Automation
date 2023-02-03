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
	KeywordUtil.markPassed("User navigate back to the Family Plans screen......!")
	Mobile.delay(10)
	
	if(Mobile.waitForElementPresent(face_icon, 20)) {

		KeywordUtil.markPassed("Face icon found on Religon screen......!")

		if(Mobile.waitForElementPresent(btn_continue, 10)) {

			Mobile.tap(btn_continue, 10)
			KeywordUtil.markPassed("User navigate to the Education Screen......!")

			if(Mobile.waitForElementPresent(hat_icon, 10)) {

				KeywordUtil.markPassed("Hat icon found on Education screen......!")

				if(Mobile.waitForElementPresent(lbl_What, 10)) {

					KeywordUtil.markPassed("What's your Education background? label text found......!")

					CustomKeywords.'com.spotlove.Utility.dating_Pref'(random)
					KeywordUtil.markPassed("Education Selection successfully......!")

					if(Mobile.waitForElementPresent(btn_E_Continue, 10)) {

						Mobile.tap(btn_E_Continue, 10)
						KeywordUtil.markPassed("User navigate to the Vices Screen.......!")

						if(Mobile.waitForElementPresent(bottle_icon, 10)) {

							KeywordUtil.markPassed("Bottle icon found on next Screen.......!")

						}else {
							KeywordUtil.markFailed("Bottle icon not found on next Screen.....!")
						}
					}else {
						KeywordUtil.markFailed("User navigation not successfully.....!")
					}
				}else {
					KeywordUtil.markFailed("Education is not selected....!")
					KeywordUtil.markFailed("What's your Education background? label text not found....!")
				}
			}else {
				KeywordUtil.markFailed("Hat icon not found on Education screen....!")
			}
		}else {
			KeywordUtil.markFailed("Continue button is not working....!")
		}
	}else {
		KeywordUtil.markFailed("Face icon found on Religon screen....!")
	}
}else {
	KeywordUtil.markFailed("Back button is not working.....!")
}





