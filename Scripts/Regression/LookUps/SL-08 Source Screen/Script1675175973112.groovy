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


if(Mobile.waitForElementPresent(Source_heart, 10)) {

	KeywordUtil.markPassed("Heart icon found......!")

	if(Mobile.waitForElementPresent(lbl_how, 10)) {

		KeywordUtil.markPassed("How did you hear about us? label text found......!")

		if(Mobile.waitForElementPresent(lbl_Referral, 10)) {

			KeywordUtil.markPassed("Referral label text found......!")

			if(Mobile.waitForElementPresent(lbl_Do, 10)) {

				KeywordUtil.markPassed("Do you have a referral code? label text found......!")

				if(Mobile.waitForElementPresent(lbl_code, 10)) {

					KeywordUtil.markPassed("Referral code? label text found......!")

					if(Mobile.waitForElementPresent(btn_continue, 10)) {

						Mobile.tap(btn_continue, 10)
						KeywordUtil.markPassed("User navigate to the First Name Screen......!")

						if(Mobile.waitForElementPresent(card_icon, 10)) {

							KeywordUtil.markPassed("Card icon found on First Name Screen......!")


						}else {
							KeywordUtil.markFailed("Card icon not found on First Name Screen.....!")
						}
					}else {
						KeywordUtil.markFailed("User navigation failed.....!")
					}
				}else {
					KeywordUtil.markFailed("Referral code?  label text not found.....!")
				}
			}else {
				KeywordUtil.markFailed("Do you have a referral code?  label text not found.....!")
			}
		}else {
			KeywordUtil.markFailed("Referral label text not found.....!")
		}
	}else {
		KeywordUtil.markFailed("How did you hear about us? label text not found.....!")
	}
}else {
	KeywordUtil.markFailed("Heart icon not found.....!")
}