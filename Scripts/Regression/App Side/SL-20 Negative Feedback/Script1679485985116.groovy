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




if(Mobile.waitForElementPresent(logo, 120)) {

	KeywordUtil.markPassed("Spotlove logo found on the on the Center of the Screen......")

	if(Mobile.waitForElementPresent(lbl_What, 120)) {

		KeywordUtil.markPassed("What was it about her? label text found......")

		if(Mobile.waitForElementPresent(lbl_tell, 120)) {

			KeywordUtil.markPassed("Tell us why *User Name* was a match label text found......")

			if(Mobile.waitForElementPresent(profile_imgae, 120)) {

				KeywordUtil.markPassed("USer profile image not found found......")

				if(Mobile.waitForElementPresent(Btn_not_interested, 120)) {

					CustomKeywords.'com.spotlove.Utility.comma_sprt_value'(feedback)
					KeywordUtil.markPassed("Feedback Selected......")

					if(Mobile.waitForElementPresent(btn_Continue, 120)) {

						Mobile.tap(btn_Continue, 120)
						KeywordUtil.markPassed("Continue Button Tapped......")

						if(Mobile.waitForElementPresent(lbl_tell1, 120)) {

							KeywordUtil.markPassed("Tell us why *User Name* was not a match label text found......")

							if(Mobile.waitForElementPresent(profile_imgae1, 120)) {

								KeywordUtil.markPassed("USer profile image not found found......")

								if(Mobile.waitForElementPresent(btn_boring1, 120)) {

									CustomKeywords.'com.spotlove.Utility.comma_sprt_value'(feedback1)
									KeywordUtil.markPassed("Feedback Selected......")

									if(Mobile.waitForElementPresent(btn_Continue1, 120)) {

										Mobile.tap(btn_Continue, 120)
										KeywordUtil.markPassed("Continue Button Tapped......")

										if(Mobile.waitForElementPresent(btn_Mixer_leave, 120)) {

											Mobile.tap(btn_Mixer_leave, 120)
											KeywordUtil.markPassed("Leave Button Tapped......")
											Mobile.delay(10)

										}else {
											KeywordUtil.markFailed("Leave Button not found......")
										}

									}else {
										KeywordUtil.markFailed("Continue Button not found......")
									}
								}else {
									KeywordUtil.markFailed("Nothing Selection......")
								}
							}else {
								KeywordUtil.markFailed("USer profile image not found......")
							}
						}else {
							KeywordUtil.markFailed("Tell us why *User Name* was not a match label text not found......")
						}



					}else {
						KeywordUtil.markFailed("Continue Button not found......")
					}
				}else {
					KeywordUtil.markFailed("Feedback Not Selected......")
				}
			}else {
				KeywordUtil.markFailed("USer profile image not found......")
			}
		}else {
			KeywordUtil.markFailed("Tell us why *User Name* was a match label text not found......")
		}
	}else {
		KeywordUtil.markFailed("What was it about her? label text not found......")
	}
}else {
	KeywordUtil.markFailed("Spotlove logo not found......")
}





























