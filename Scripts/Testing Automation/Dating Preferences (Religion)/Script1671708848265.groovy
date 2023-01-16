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

	if(Mobile.waitForElementPresent(Religion, 30)) {

		Mobile.tap(Religion, 30)
		KeywordUtil.markPassed('PASSED: Religion Tab is present on the screen')

		if(Mobile.waitForElementPresent(Religion_header, 30)) {

			KeywordUtil.markPassed('PASSED: Religion header is present on the screen')

			if(Mobile.waitForElementPresent(Open_to_All, 30)) {

				Mobile.tap(Open_to_All, 30)
				KeywordUtil.markPassed('PASSED: Open_to_All CheckBox is present on the screen')
				Mobile.tap(Open_to_All, 30)

				if(Mobile.waitForElementPresent(Catholic, 30)) {

					Mobile.tap(Catholic, 30)
					KeywordUtil.markPassed('PASSED: East Asian CheckBox is present on the screen')

					if(Mobile.waitForElementPresent(Jewish, 30)) {

						Mobile.tap(Jewish, 30)
						KeywordUtil.markPassed('PASSED: Middle Eastern CheckBox is present on the screen')

						if(Mobile.waitForElementPresent(Sikh, 30)) {

							Mobile.tap(Sikh, 30)
							KeywordUtil.markPassed('PASSED: South Asian CheckBox is present on the screen')

							if(Mobile.waitForElementPresent(Atheist, 30)) {

								Mobile.tap(Atheist, 30)
								KeywordUtil.markPassed('PASSED: Other CheckBox is present on the screen')

								if(Mobile.waitForElementPresent(Close, 30)) {

									Mobile.tap(Close, 30)
									KeywordUtil.markPassed('PASSED: Close Button is present on the screen')

									if(Mobile.waitForElementPresent(Religion, 30)) {

										Mobile.tap(Religion, 30)
										KeywordUtil.markPassed('PASSED:  Religion Tab is present on the screen')

										if(Mobile.waitForElementPresent(Hindu, 30)) {

											Mobile.tap(Hindu, 30)
											KeywordUtil.markPassed('PASSED:  Native_American CheckBox is present on the screen')

											if(Mobile.waitForElementPresent(Agnostic, 30)) {

												Mobile.tap(Agnostic, 30)
												KeywordUtil.markPassed('PASSED:  Pacific_Islander CheckBox is present on the screen')

												if(Mobile.waitForElementPresent(Muslim, 30)) {

													Mobile.tap(Muslim, 30)
													KeywordUtil.markPassed('PASSED:  White_Caucasian CheckBox is present on the screen')

													if(Mobile.waitForElementPresent(Save, 30)) {

														Mobile.tap(Save, 30)
														KeywordUtil.markPassed('PASSED: Save Button is present on the screen')

													}else {
														KeywordUtil.markFailed("Failed: Save Button is not present on the screen")
													}
												}else {
													KeywordUtil.markFailed("Failed: White_Caucasian CheckBox is not present on the screen")
												}

											}else {
												KeywordUtil.markFailed("Failed: Pacific_Islander CheckBox is not present on the screen")
											}
										}else {
											KeywordUtil.markFailed("Failed: Native_American CheckBox is not present on the screen")
										}
									}else {
										KeywordUtil.markFailed("Failed: Religion Tab is not present on the screen")
									}
								}else {
									KeywordUtil.markFailed("Failed: Close Button is not present on the screen")
								}
							}else {
								KeywordUtil.markFailed("Failed: Other CheckBox is not present on the screen")
							}
						}else {
							KeywordUtil.markFailed("Failed: South Asian CheckBox is not present on the screen")
						}
					}else {
						KeywordUtil.markFailed("Failed: Middle Eastern CheckBox is not present on the screen")
					}
				}else {
					KeywordUtil.markFailed("Failed: East Asian CheckBox is not present on the screen")
				}
			}else {
				KeywordUtil.markFailed("Failed: Open_to_All CheckBox is not present on the screen")
			}
		}else {
			KeywordUtil.markFailed("Failed: Religion Header is not present on the screen")
		}
	}else {
		KeywordUtil.markFailed("Failed: Religion Tab is not present on the screen")
	}
}else {
	KeywordUtil.markFailed("Failed: Dating Preferences label text is not present on the screen")
}









