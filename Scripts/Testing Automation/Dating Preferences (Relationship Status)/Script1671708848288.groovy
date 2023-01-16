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

	if(Mobile.waitForElementPresent(Relationship, 30)) {

		Mobile.tap(Relationship, 30)
		KeywordUtil.markPassed('PASSED: Relationship Tab is present on the screen')

		if(Mobile.waitForElementPresent(Relationship_header, 30)) {

			KeywordUtil.markPassed('PASSED: Relationship header is present on the screen')

			if(Mobile.waitForElementPresent(Widowed, 30)) {

				Mobile.tap(Widowed, 30)
				KeywordUtil.markPassed('PASSED: Widowed CheckBox is present on the screen')
				

				if(Mobile.waitForElementPresent(Open_to_All, 30)) {

					Mobile.tap(Open_to_All, 30)
					KeywordUtil.markPassed('PASSED: Open_to_All CheckBox is present on the screen')
					Mobile.tap(Open_to_All, 30)

					if(Mobile.waitForElementPresent(Separated, 30)) {

						Mobile.tap(Separated, 30)
						KeywordUtil.markPassed('PASSED: Separated CheckBox is present on the screen')

						if(Mobile.waitForElementPresent(Divorced, 30)) {

							Mobile.tap(Divorced, 30)
							KeywordUtil.markPassed('PASSED: Divorced CheckBox is present on the screen')

							if(Mobile.waitForElementPresent(Never_Married, 30)) {

								Mobile.tap(Never_Married, 30)
								KeywordUtil.markPassed('PASSED: Never Married CheckBox is present on the screen')

								if(Mobile.waitForElementPresent(Close, 30)) {

									Mobile.tap(Close, 30)
									KeywordUtil.markPassed('PASSED: Close Button is present on the screen')

									if(Mobile.waitForElementPresent(Relationship, 30)) {

										Mobile.tap(Relationship, 30)
										KeywordUtil.markPassed('PASSED:  Relationship Tab is present on the screen')

										if(Mobile.waitForElementPresent(Divorce_In_Progress, 30)) {

											Mobile.tap(Divorce_In_Progress, 30)
											KeywordUtil.markPassed('PASSED:  Divorce In Progress CheckBox is present on the screen')

											if(Mobile.waitForElementPresent(Save, 30)) {

												Mobile.tap(Save, 30)
												KeywordUtil.markPassed('PASSED: Save Button is present on the screen')

											}else {
												KeywordUtil.markFailed("Failed: Save Button is not present on the screen")
											}
										}else {
											KeywordUtil.markFailed("Failed: Divorce In Progress CheckBox is not present on the screen")
										}
									}else {
										KeywordUtil.markFailed("Failed: Relationship Tab is not present on the screen")
									}
								}else {
									KeywordUtil.markFailed("Failed: Close Button is not present on the screen")
								}
							}else {
								KeywordUtil.markFailed("Failed: Never Married CheckBox is not present on the screen")
							}
						}else {
							KeywordUtil.markFailed("Failed: Divorced CheckBox is not present on the screen")
						}
					}else {
						KeywordUtil.markFailed("Failed: Separated CheckBox is not present on the screen")
					}
				}else {
					KeywordUtil.markFailed("Failed: Widowed CheckBox is not present on the screen")
				}
			}else {
				KeywordUtil.markFailed("Failed: Open_to_All CheckBox is not present on the screen")
			}
		}else {
			KeywordUtil.markFailed("Failed: Relationship Header is not present on the screen")
		}
	}else {
		KeywordUtil.markFailed("Failed: Relationship Tab is not present on the screen")
	}
}else {
	KeywordUtil.markFailed("Failed: Dating Preferences label text is not present on the screen")
}
