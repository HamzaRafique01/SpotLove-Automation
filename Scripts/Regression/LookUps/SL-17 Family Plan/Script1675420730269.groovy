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

		KeywordUtil.markPassed("User navigate back to the Religion screen and What's your Relationship Status? label text found......!")

		if(Mobile.waitForElementPresent(btn_continue, 10)) {

			Mobile.delay(5)
			CustomKeywords.'com.spotlove.Utility.tap_Continue'()
			Mobile.delay(5)

			if(Mobile.waitForElementPresent(lbl_tell, 10)) {

				KeywordUtil.markPassed("User navigate back to the family Plan screen and Tell us about your family label text found......!")

				if(Mobile.waitForElementPresent(face_icon, 10)) {

					KeywordUtil.markPassed("Face icon found on Family Plan screen......!")

					if(Mobile.waitForElementPresent(lbl_tell, 10)) {

						KeywordUtil.markPassed("Tell us about your family label text found......!")

						if(Mobile.waitForElementPresent(lbl_do, 10)) {

							KeywordUtil.markPassed("Do you have children? label text found......!")

							CustomKeywords.'com.spotlove.Utility.comma_sprt_value'(random)
							KeywordUtil.markPassed("Children Selection successfully......!")

							if(Mobile.waitForElementPresent(lbl_what, 10)) {

								KeywordUtil.markPassed("What are your family Plans? label text found......!")

								CustomKeywords.'com.spotlove.Utility.dating_Pref'(randoom)
								KeywordUtil.markPassed("Family Plan Selection successfully......!")

								if(Mobile.waitForElementPresent(btn_continue, 10)) {

							
									CustomKeywords.'com.spotlove.Utility.tap_Continue'()
									KeywordUtil.markPassed("User navigate to the Education Screen.......!")

									if(Mobile.waitForElementPresent(lbl_edu, 10)) {

										KeywordUtil.markPassed("Study Hat icon found on next Screen.......!")

									}else {
										KeywordUtil.markFailed("Study Hat icon not found on next Screen.....!")
									}
								}else {
									KeywordUtil.markFailed("User navigation not successfully.....!")
								}


							}else {
								KeywordUtil.markFailed("What are your family Plans? label text not found....!")
							}
						}else {
							KeywordUtil.markFailed("Do you have children? label text not found....!")
						}
					}else {
						KeywordUtil.markFailed("Children is not selected....!")
						KeywordUtil.markFailed("Tell us about your family label text not found....!")
					}
				}else {
					KeywordUtil.markFailed("Face icon not found on Family Plan screen....!")
				}


			}else {
				KeywordUtil.markFailed("Children is not selected....!")
				KeywordUtil.markFailed("Tell us about your family label text not found....!")
			}


		}else {
			KeywordUtil.markFailed("Continue button is not working.....!")
		}
	}else {
		KeywordUtil.markFailed("What's your Religion? label text not found......!")
	}
}else {
	KeywordUtil.markFailed("Back button is not working.....!")
}



















