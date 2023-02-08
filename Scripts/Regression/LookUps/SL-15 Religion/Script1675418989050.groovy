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

	CustomKeywords.'com.spotlove.Utility.tap_back'()

	if(Mobile.waitForElementPresent(lbl_whats, 10)) {

		KeywordUtil.markPassed("User navigate back to the Ethnicity screen and What's your Ethnicity? label text found......!")

		if(Mobile.waitForElementPresent(btn_continue, 10)) {

			Mobile.delay(5)
			CustomKeywords.'com.spotlove.Utility.tap_Continue'()
			Mobile.delay(5)

			if(Mobile.waitForElementPresent(lbl_What, 10)) {

				KeywordUtil.markPassed("What's your religon? label text found......!")


				if(Mobile.waitForElementPresent(book_icon, 10)) {

					KeywordUtil.markPassed("Book icon found on Religon screen......!")

					if(Mobile.waitForElementPresent(lbl_What, 10)) {

						KeywordUtil.markPassed("What's your religon? label text found......!")

						CustomKeywords.'com.spotlove.Utility.dating_Pref'(random)
						KeywordUtil.markPassed("Religon Selection successfully......!")

						if(Mobile.waitForElementPresent(btn_continue, 10)) {

							CustomKeywords.'com.spotlove.Utility.tap_Continue'()
							KeywordUtil.markPassed("User navigate to the Ethnicity Screen.......!")

							if(Mobile.waitForElementPresent(lbl_relation, 10)) {

								KeywordUtil.markPassed("What's your Relationship? label text found......!")

							}else {
								KeywordUtil.markFailed("What's your Relationship? label text not found....!")
							}
						}else {
							KeywordUtil.markFailed("User navigation not successfully.....!")
						}
					}else {
						KeywordUtil.markFailed("religon is not selected....!")
						KeywordUtil.markFailed("What's your religon? label text not found....!")
					}
				}else {
					KeywordUtil.markFailed("Book icon not found on Religon screenn....!")
				}
			}else {
				KeywordUtil.markFailed("religon is not selected....!")
				KeywordUtil.markFailed("What's your religon? label text not found....!")
			}

		}else {
			KeywordUtil.markFailed("Continue button is not working.....!")
		}
	}else {
		KeywordUtil.markFailed("What's your Ethnicity? label text not found......!")
	}
}else {
	KeywordUtil.markFailed("Back button is not working.....!")
}





