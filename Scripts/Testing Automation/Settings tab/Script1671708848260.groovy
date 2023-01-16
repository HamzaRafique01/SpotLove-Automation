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



if(Mobile.waitForElementPresent(Setting_Tab, 30)) {

	Mobile.tap(Setting_Tab, 30)
	KeywordUtil.markPassed('PASSED: Setting Tab is present on the screen')

	if(Mobile.waitForElementPresent(Push_notification, 30)) {

		KeywordUtil.markPassed('PASSED: Push notification label text is present on the screen')

		if(Mobile.waitForElementPresent(Push_Button, 30)) {

			Mobile.tap(Push_Button, 30)
			KeywordUtil.markPassed('PASSED: Push notification Button is present and functional on the screen')

			if(Mobile.waitForElementPresent(App_Sounds_text, 30)) {

				KeywordUtil.markPassed('PASSED: App sounds/ Vibrations label text is present on the screen')

				if(Mobile.waitForElementPresent(App_Sounds_Toggle, 30)) {

					Mobile.tap(App_Sounds_Toggle, 30)
					KeywordUtil.markPassed('PASSED: App sounds/ Vibrations Toggle Button is present on the screen')

					if(Mobile.waitForElementPresent(Feedback, 30)) {

						Mobile.tap(Feedback, 30)
						KeywordUtil.markPassed('PASSED: Feedback label text is present on the screen')

						if(Mobile.waitForElementPresent(Terms, 30)) {

							Mobile.tap(Terms, 30)
							KeywordUtil.markPassed('PASSED: Terms of Service text is present on the screen')

							if(Mobile.waitForElementPresent(Setting_Back, 30)) {

								Mobile .tap(Setting_Back, 30)
								KeywordUtil.markPassed('PASSED: Setting Back is present on the screen')
								
							}else {
								KeywordUtil.markFailed("Failed: Setting Back is not present on the screen")
							}
						}else {
							KeywordUtil.markFailed("Failed: Terms of Service label text is not present on the screen")
						}
					}else {
						KeywordUtil.markFailed("Failed: Feedback label text is not present on the screen")
					}
				}else {
					KeywordUtil.markFailed("Failed: App sounds/ Vibrations Toggle Button is not present on the screen")
				}
			}else {
				KeywordUtil.markFailed("Failed: App sounds/ Vibrations label text is not present on the screen")
			}
		}else {
			KeywordUtil.markFailed("Failed: Push notification Button is not present and functional on the screen")
		}
	}else {
		KeywordUtil.markFailed("Failed: PASSED: Push notification label text is not present on the screen")
	}
}else {
	KeywordUtil.markFailed("Failed: Setting Tab is not present on the screen")
}



