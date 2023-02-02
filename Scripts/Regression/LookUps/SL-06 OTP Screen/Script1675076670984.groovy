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


if(Mobile.waitForElementPresent(spotlove_logo, 10)) {

	KeywordUtil.markPassed("Spot.Love Logo Found......!")

	if(Mobile.waitForElementPresent(btn_back, 10)) {

		KeywordUtil.markPassed("Back Button Found......!")

		if(Mobile.waitForElementPresent(lbl_first_text, 60)) {

			KeywordUtil.markPassed("Enter your verification code label text is found......!")

			if(Mobile.waitForElementPresent(lbl_Second_text, 10)) {

				KeywordUtil.markPassed("We're sent a pin to +16505559876 label text is found......!")

				Mobile.tap(findTestObject('Object Repository/Smoke/OTP/android.widget.EditText - -'), 15)

				Mobile.setText(findTestObject('Object Repository/Smoke/OTP/android.widget.EditText - - (1)'), '1', 2)

				Mobile.setText(findTestObject('Object Repository/Smoke/OTP/android.widget.EditText - - (2)'), '2', 2)

				Mobile.setText(findTestObject('Object Repository/Smoke/OTP/android.widget.EditText - - (3)'), '3', 2)

				Mobile.setText(findTestObject('Object Repository/Smoke/OTP/android.widget.EditText - - (4)'), '4', 2)

				Mobile.setText(findTestObject('Object Repository/Smoke/OTP/android.widget.EditText - - (5)'), '5', 2)

				Mobile.setText(findTestObject('Object Repository/Smoke/OTP/android.widget.EditText - - (6)'), '6', 2)
				
				CustomKeywords.'com.spotlove.Utility.Verify'()

//				if(Mobile.waitForElementPresent(btn_Resend, 10)) {
//
//					Mobile.tap(btn_Resend, 10)
//					KeywordUtil.markPassed("OTP Code Received Successfully......!")
//
//					CustomKeywords.'com.spotlove.Utility.Verify'()
//				}else {
//					KeywordUtil.markFailed("OTP Code dosn't Received......!")
//				}
			}else {
				KeywordUtil.markFailed("We're sent a pin to +16505559876 label text is not found......!")
			}
		}else {
			KeywordUtil.markFailed("Enter your verification code label text is not found......!")
		}
	}else {
		KeywordUtil.markFailed("Back Button not Found......!")
	}
}else {
	KeywordUtil.markFailed("Spot.Love Logo not Found......!")
}