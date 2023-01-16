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

	if(Mobile.waitForElementPresent(Education, 30)) {

		Mobile.tap(Education, 30)
		KeywordUtil.markPassed('PASSED: Education Tab is present on the screen')

		if(Mobile.waitForElementPresent(Education_header, 30)) {

			KeywordUtil.markPassed('PASSED: Education header is present on the screen')

			if(Mobile.waitForElementPresent(Some_College, 30)) {

				Mobile.tap(Some_College, 30)
				KeywordUtil.markPassed('PASSED: Some College CheckBox is present on the screen')

				if(Mobile.waitForElementPresent(Open_to_All, 30)) {

					Mobile.tap(Open_to_All, 30)
					KeywordUtil.markPassed('PASSED: Open to All CheckBox is present on the screen')
					Mobile.tap(Open_to_All, 30)

					if(Mobile.waitForElementPresent(PHD_Doctoral, 30)) {

						Mobile.tap(PHD_Doctoral, 30)
						KeywordUtil.markPassed('PASSED: PHD_Doctoral CheckBox is present on the screen')

						if(Mobile.waitForElementPresent(Close, 30)) {

							Mobile.tap(Close, 30)
							KeywordUtil.markPassed('PASSED: Close Button is present on the screen')

							if(Mobile.waitForElementPresent(Education, 30)) {

								Mobile.tap(Education, 30)
								KeywordUtil.markPassed('PASSED:  Education Tab is present on the screen')

								if(Mobile.waitForElementPresent(High_School, 30)) {

									Mobile.tap(High_School, 30)
									KeywordUtil.markPassed('PASSED:  High_School CheckBox is present on the screen')

									if(Mobile.waitForElementPresent(College_Degree, 30)) {

										Mobile.tap(College_Degree, 30)
										KeywordUtil.markPassed('PASSED:  College_Degree CheckBox is present on the screen')

										if(Mobile.waitForElementPresent(Save, 30)) {

											Mobile.tap(Save, 30)
											KeywordUtil.markPassed('PASSED: Save Button is present on the screen')

										}else {
											KeywordUtil.markFailed("Failed: Save Button is not present on the screen")
										}
									}else {
										KeywordUtil.markFailed("Failed: College_Degree CheckBox is not present on the screen")
									}
								}else {
									KeywordUtil.markFailed("Failed: High_School CheckBox is not present on the screen")
								}
							}else {
								KeywordUtil.markFailed("Failed: Education Tab is not present on the screen")
							}
						}else {
							KeywordUtil.markFailed("Failed: Close Button is not present on the screen")
						}
					}else {
						KeywordUtil.markFailed("Failed: PHD_Doctoral CheckBox is not present on the screen")
					}
				}else {
					KeywordUtil.markFailed("Failed: Open to All CheckBox is not present on the screen")
				}
			}else {
				KeywordUtil.markFailed("Failed: Some College CheckBox is not present on the screen")
			}
		}else {
			KeywordUtil.markFailed("Failed: Education Header is not present on the screen")
		}
	}else {
		KeywordUtil.markFailed("Failed: Education Tab is not present on the screen")
	}
}else {
	KeywordUtil.markFailed("Failed: Dating Preferences label text is not present on the screen")
}




