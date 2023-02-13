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



Mobile.startExistingApplication("qa.pulse.app", FailureHandling.STOP_ON_FAILURE)
KeywordUtil.markPassed("Application Launched successfully")

if(Mobile.waitForElementPresent(abc, 10)) {

	Mobile.tap(abc, 10)
	KeywordUtil.markPassed("User Navigate to the Log-In Screen")
	Mobile.delay(20)

	if(Mobile.waitForElementPresent(btn_Accept, 10)) {

		Mobile.tap(btn_Accept, 10)
		KeywordUtil.markPassed("All Cookies are accepted")

		if(Mobile.waitForElementPresent(email_textbox, 10)) {

			Mobile.setText(email_textbox, email, 10)
			KeywordUtil.markPassed("Email Entered")

			if(Mobile.waitForElementPresent(btn_Get, 10)) {

				Mobile.tap(btn_Get, 10)
				Mobile.delay(30)
				KeywordUtil.markPassed("User navigate to the Pass Code screen")

				if(Mobile.waitForElementPresent(enter_pass, 10)) {

					Mobile.delay(30)
//					Mobile.setText(enter_pass, "", 10)
					KeywordUtil.markPassed("Passcode entered")


					if(Mobile.waitForElementPresent(btn_loginAP, 10)) {
//  btn_loginAP---> Login Button after Passcode
						Mobile.tap(btn_loginAP, 10)
						KeywordUtil.markPassed("User Successfully LggedIn")



					}else {
						KeywordUtil.markFailed("PassCode Incorrect")
					}

				}else {
					KeywordUtil.markFailed("Passcode field not found")
				}

			}else {
				KeywordUtil.markFailed("User navigation failed")
			}
		}else {
			KeywordUtil.markFailed("Email Field not found")
		}
	}else {

		KeywordUtil.markFailed("Accept Cookies Button not found on logIn Screen")
	}
}else {

	KeywordUtil.markFailed("Navigate cannot made successfully")

}