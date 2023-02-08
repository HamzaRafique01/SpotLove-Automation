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


	if(Mobile.waitForElementPresent(lbl_how, 10)) {

		KeywordUtil.markPassed("User navigate back to the Source screen and How did you about us? label text found......!")

		if(Mobile.waitForElementPresent(btn_Referral_Continue, 10)) {

			CustomKeywords.'com.spotlove.Utility.tap_Continue'()
			KeywordUtil.markPassed("User navigate Move forword to the First Name screen......!")

			if(Mobile.waitForElementPresent(Contact_icon, 30)) {

				KeywordUtil.markPassed("Contact icon found......!")

				if(Mobile.waitForElementPresent(lbl_what, 10)) {

					KeywordUtil.markPassed("What should we call you? label text found......!")

					if(Mobile.waitForElementPresent(lbl_tell, 10)) {

						KeywordUtil.markPassed("Tell us your first name label text found......!")

						if(Mobile.waitForElementPresent(First_Name, 10)) {

							Mobile.setText(First_Name, S_First_Name, 0)
							KeywordUtil.markPassed("First name Entered text......!")

							if(Mobile.waitForElementPresent(btn_continue, 10)) {


								CustomKeywords.'com.spotlove.Utility.tap_Continue'()
								Mobile.delay(15)

								if(Mobile.waitForElementPresent(lbl_whats, 10)) {

									KeywordUtil.markPassed("User navigate Move forword to the Birth date screen and What's your date of birth? label text found......!")

								}else {
									KeywordUtil.markFailed("What's your date of birth? label text not found.....!")
								}

							}else {
								KeywordUtil.markFailed("Continue button is not working.....!")
							}

						}else {
							KeywordUtil.markFailed("First name not entered text .....!")
						}
					}else {
						KeywordUtil.markFailed("Tell us your first name label text not found.....!")
					}
				}else {
					KeywordUtil.markFailed("What should we call you? label text not found.....!")
				}

			}else {
				KeywordUtil.markFailed("Contact icon not found.....!")
			}
		}else {
			KeywordUtil.markFailed("Continue button is not working...............!")
		}

	}else {
		KeywordUtil.markFailed("How did you about us? label text not found......!")
	}
}else {
	KeywordUtil.markFailed("Back button is not working.....!")
}
















