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



if(Mobile.waitForElementPresent(Dating_preferences, 30)) {

	Mobile.tap(Dating_preferences, 30)
	KeywordUtil.markPassed('PASSED: Dating preferences Tab is present on the screen')

	if(Mobile.waitForElementPresent(Dating_Header, 30)) {

		KeywordUtil.markPassed('PASSED: Dating Preferences label text is present on the screen')

		if(Mobile.waitForElementPresent(Gender, 30)) {

			Mobile.tap(Gender, 30)
			KeywordUtil.markPassed('PASSED: Gender Tab is present on the screen')

			if(Mobile.waitForElementPresent(Gender_header, 30)) {

				KeywordUtil.markPassed('PASSED: Gender Header is present on the screen')

				if(Mobile.waitForElementPresent(Male, 30)) {

					Mobile.tap(Male, 30)
					KeywordUtil.markPassed('PASSED: Male CheckBox is present on the screen')

					if(Mobile.waitForElementPresent(Anything, 30)) {

						Mobile.tap(Anything, 30)
						KeywordUtil.markPassed('PASSED: Anything Really CheckBox is present on the screen')

						if(Mobile.waitForElementPresent(Female, 30)) {

							Mobile.tap(Female, 30)
							KeywordUtil.markPassed('PASSED: Female CheckBox is present on the screen')

							if(Mobile.waitForElementPresent(Open_to_All, 30)) {

								Mobile.tap(Open_to_All, 30)
								KeywordUtil.markPassed('PASSED: Open_to_All CheckBox is present on the screen')
								Mobile.tap(Open_to_All, 30)

								if(Mobile.waitForElementPresent(Non_binary, 30)) {

									Mobile.tap(Non_binary, 30)
									KeywordUtil.markPassed('PASSED: Open_to_All CheckBox is present on the screen')

									if(Mobile.waitForElementPresent(Close, 30)) {

										Mobile.tap(Close, 30)
										KeywordUtil.markPassed('PASSED: Close Button is present on the screen')

										if(Mobile.waitForElementPresent(Gender, 30)) {

											Mobile.tap(Gender, 30)
											KeywordUtil.markPassed('PASSED:  Gender Tab is present on the screen')

											if(Mobile.waitForElementPresent(Save, 30)) {

												Mobile.tap(Save, 30)
												KeywordUtil.markPassed('PASSED: Save Button is present on the screen')

											}else {
												KeywordUtil.markFailed("Failed: Save Button is not present on the screen")
											}
										}else {
											KeywordUtil.markFailed("Failed: Gender Tab is not present on the screen")
										}
									}else {
										KeywordUtil.markFailed("Failed: Close Button is not present on the screen")
									}
								}else {
									KeywordUtil.markFailed("Failed: Open_to_All CheckBox is not present on the screen")
								}
							}else {
								KeywordUtil.markFailed("Failed: Open_to_All CheckBox is not present on the screen")
							}
						}else {
							KeywordUtil.markFailed("Failed: Female CheckBox is not present on the screen")
						}
					}else {
						KeywordUtil.markFailed("Failed: Anything Really CheckBox is not present on the screen")
					}
				}else {
					KeywordUtil.markFailed("Failed: Male CheckBox is not present on the screen")
				}
			}else {
				KeywordUtil.markFailed("Failed: Gender Header is not present on the screen")
			}
		}else {
			KeywordUtil.markFailed("Failed: Gender Tab is not present on the screen")
		}
	}else {
		KeywordUtil.markFailed("Failed: Dating Preferences label text is not present on the screen")
	}
}else {
	KeywordUtil.markFailed("Failed: Dating preferences Tab is not present on the screen")
}