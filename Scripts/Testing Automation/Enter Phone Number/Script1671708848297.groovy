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


if(Mobile.waitForElementPresent(Back, 30)) {

	Mobile.tap(Back, 30)
	KeywordUtil.markPassed('PASSED: Continue With phone is present on the screen.')

	if(Mobile.waitForElementPresent(cntinue, 30)) {

		Mobile.tap(cntinue, 30)
		KeywordUtil.markPassed('PASSED: Continue With phone is present on the screen.')

		if(Mobile.waitForElementPresent(logo, 30)) {

			KeywordUtil.markPassed('PASSED: SpotLove logo is present on the screen.')

			if(Mobile.waitForElementPresent(SignIn, 30)) {

				KeywordUtil.markPassed('PASSED: signIn to spotlove. is present on the screen.')

				if(Mobile.waitForElementPresent(Continue, 30)) {

					KeywordUtil.markPassed('PASSED: Continue with... is present on the screen.')

					if(Mobile.waitForElementPresent(Dropdown, 30)) {

						Mobile.tap(Dropdown, 30)
						KeywordUtil.markPassed('PASSED: Country dropdown is present on the screen.')

						if(Mobile.waitForElementPresent(Search, 30)) {

							Mobile.setText(Search, Country, 30)
							KeywordUtil.markPassed('PASSED: Search Country is present on the screen.')

							if(Mobile.waitForElementPresent(first_index, 30)) {

								Mobile.tap(first_index, 30)
								KeywordUtil.markPassed('PASSED: Your Search in the first index Country is present on the screen.')

								if(Mobile.waitForElementPresent(phone, 30)) {

									Mobile.setText(phone, PNumber, 30)
									KeywordUtil.markPassed('PASSED: Phone number enter successfully.')

									if(Mobile.waitForElementPresent(Continue_Button, 30)) {

										Mobile.tap(Continue_Button, 30)
										KeywordUtil.markPassed('PASSED: Continue button.')

//										if(Mobile.waitForElementPresent(Toast, 10)) {
//
//											KeywordUtil.markPassed("Toast Successfully displayed")
//
//										}else if(Mobile.waitForElementPresent(OTP, 30)) {
//
//											KeywordUtil.markPassed("OTP screen has been displayed")
//										}
//									}else {
//										KeywordUtil.markFailed('FAILED: Neither toast appear nor OTP screen appears ')
//									}
									}else {
										KeywordUtil.markFailed('FAILED: Continue Button.')
									}
								}else {
									KeywordUtil.markFailed('FAILED: Phone number enter is not successfully.')
								}
							}else {
								KeywordUtil.markFailed('FAILED: Your Search in the first index Country is present on the screen.')
							}
						}else {
							KeywordUtil.markFailed('FAILED: Search Country is present on the screen.')
						}
					}else {
						KeywordUtil.markFailed('FAILED: Country dropdown is not present on the screen.')
					}
				}else {
					KeywordUtil.markFailed('FAILED: Continue with... is not present on the screen.')
				}
			}else {
				KeywordUtil.markFailed('FAILED: signIn to spotlove. is not present on the screen.')
			}
		}else {
			KeywordUtil.markFailed('FAILED: SpotLove logo is not present on the screen.')
		}
	}else {
		KeywordUtil.markFailed('FAILED: Continue With phone is not present on the screen.')
	}
}else {
	KeywordUtil.markFailed('FAILED: Continue With phone is not present on the screen.')
}
