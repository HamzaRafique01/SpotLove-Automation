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

if(Mobile.waitForElementPresent(Dating_Header, 30)) {

	KeywordUtil.markPassed('PASSED: Dating Preferences label text is present on the screen')

	if(Mobile.waitForElementPresent(Politics, 30)) {

		Mobile.tap(Politics, 30)
		KeywordUtil.markPassed('PASSED: Politics Tab is present on the screen')

		if(Mobile.waitForElementPresent(Politics_header, 30)) {

			KeywordUtil.markPassed('PASSED: Politics header is present on the screen')

			if(Mobile.waitForElementPresent(Liberal, 30)) {

				Mobile.tap(Liberal, 30)
				KeywordUtil.markPassed('PASSED: Liberal CheckBox is present on the screen')

				if(Mobile.waitForElementPresent(Open_to_All, 30)) {

					Mobile.tap(Open_to_All, 30)
					KeywordUtil.markPassed('PASSED: Open to All CheckBox is present on the screen')
					Mobile.tap(Open_to_All, 30)

					if(Mobile.waitForElementPresent(Conservative, 30)) {

						Mobile.tap(Conservative, 30)
						KeywordUtil.markPassed('PASSED: Conservative CheckBox is present on the screen')

						if(Mobile.waitForElementPresent(Close, 30)) {

							Mobile.tap(Close, 30)
							KeywordUtil.markPassed('PASSED: Close Button is present on the screen')

							if(Mobile.waitForElementPresent(Politics, 30)) {

								Mobile.tap(Politics, 30)
								KeywordUtil.markPassed('PASSED:  Politics Tab is present on the screen')

								if(Mobile.waitForElementPresent(Apolitical, 30)) {

									Mobile.tap(Apolitical, 30)
									KeywordUtil.markPassed('PASSED:  Apolitical CheckBox is present on the screen')

									if(Mobile.waitForElementPresent(Moderate, 30)) {

										Mobile.tap(Moderate, 30)
										KeywordUtil.markPassed('PASSED:  Moderate CheckBox is present on the screen')

										if(Mobile.waitForElementPresent(Save, 30)) {

											Mobile.tap(Save, 30)
											KeywordUtil.markPassed('PASSED: Save Button is present on the screen')

											if(Mobile.waitForElementPresent(back, 30)) {

												Mobile.tap(back, 30)
												KeywordUtil.markPassed('PASSED: Back Button is present on the screen')

											}else {
												KeywordUtil.markFailed("Failed: Save Button is not present on the screen")
											}

										}else {
											KeywordUtil.markFailed("Failed: Save Button is not present on the screen")
										}
									}else {
										KeywordUtil.markFailed("Failed: Moderate CheckBox is not present on the screen")
									}
								}else {
									KeywordUtil.markFailed("Failed: Apolitical CheckBox is not present on the screen")
								}
							}else {
								KeywordUtil.markFailed("Failed: Politics Tab is not present on the screen")
							}
						}else {
							KeywordUtil.markFailed("Failed: Close Button is not present on the screen")
						}
					}else {
						KeywordUtil.markFailed("Failed: Conservative CheckBox is not present on the screen")
					}
				}else {
					KeywordUtil.markFailed("Failed: Open to All CheckBox is not present on the screen")
				}
			}else {
				KeywordUtil.markFailed("Failed: Liberal CheckBox is not present on the screen")
			}
		}else {
			KeywordUtil.markFailed("Failed: Politics Header is not present on the screen")
		}
	}else {
		KeywordUtil.markFailed("Failed: Politics Tab is not present on the screen")
	}
}else {
	KeywordUtil.markFailed("Failed: Dating Preferences label text is not present on the screen")
}