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

		KeywordUtil.markPassed("What did you thing? label text found......")

		if(Mobile.waitForElementPresent(lbl_tell, 120)) {

			KeywordUtil.markPassed("Tell us about your date with *User Name* label text found......")

			if(Mobile.waitForElementPresent(profile_imgae, 120)) {

				KeywordUtil.markPassed("USer profile image not found found......")

				if(Mobile.waitForElementPresent(Positive_feedback, 120)) {

					Mobile.tap(Positive_feedback, 120)
					KeywordUtil.markPassed("I want to chat with user name Again Button tapped......")

					if(Mobile.waitForElementPresent(btn_Continue, 120)) {

						Mobile.tap(btn_Continue, 120)
						KeywordUtil.markPassed("Continue Button Tapped......")

						if(Mobile.waitForElementPresent(btn_report_user, 60)) {

							Mobile.tap(btn_report_user, 60)
							KeywordUtil.markPassed("Report bottom sheet opened on the Screen...!")
							Mobile.delay(10)

							if(Mobile.waitForElementPresent(btn_close, 60)) {

								Mobile.tap(btn_close, 60)
								KeywordUtil.markPassed("Report/Block Bottom sheet close button found.....!")

								if(Mobile.waitForElementPresent(btn_report_user, 60)) {

									Mobile.tap(btn_report_user, 60)
									KeywordUtil.markPassed("Report bottom sheet opened on the Screen...!")

									if(Mobile.waitForElementPresent(lbl_header, 60)) {

										KeywordUtil.markPassed("Report bottom Header label appear on the Screen...!")

										if(Mobile.waitForElementPresent(text, 60)) {

											Mobile.setText(text, reason, 120)
											KeywordUtil.markPassed("Report bottom Header label appear on the Screen...!")

											if(Mobile.waitForElementPresent(btn_submit, 60)) {

												Mobile.tap(btn_submit, 120)
												KeywordUtil.markPassed("Continue button tapped...!")



											} else {
												KeywordUtil.markFailed("Continue Button not found")
											}
										} else {
											KeywordUtil.markFailed("Report bottom Header label not appear on the Screen")
										}
									} else {
										KeywordUtil.markFailed("Report bottom Header label not appear on the Screen")
									}
								} else {
									KeywordUtil.markFailed("Report bottom sheet not opened on the Screen.....")
								}
							} else {
								KeywordUtil.markFailed("Report/Block Bottom sheet close button not found....!")
							}
						} else {
							KeywordUtil.markFailed("Report bottom sheet not opened on the Screen.....")
						}
					}else {
						KeywordUtil.markFailed("Continue Button not found......")
					}
				}else {
					KeywordUtil.markFailed("I want to chat with user name Again Button not found......")
				}
			}else {
				KeywordUtil.markFailed("USer profile image not found......")
			}
		}else {
			KeywordUtil.markFailed("Tell us about your date with *User Name* label text not found......")
		}
	}else {
		KeywordUtil.markFailed("What did you thing? label text not found......")
	}
}else {
	KeywordUtil.markFailed("Spotlove logo not found......")
}