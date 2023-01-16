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

if(Mobile.waitForElementPresent(Gallery_Icon, 30)) {

	KeywordUtil.markPassed('PASSED: Gallery Icon present on the screen')

	if(Mobile.waitForElementPresent(Add, 30)) {

		KeywordUtil.markPassed('PASSED: Add Profile... label text present on the screen')

		if(Mobile.waitForElementPresent(Add3, 30)) {

			KeywordUtil.markPassed('PASSED: Add 3 Profile... label text present on the screen')

			if(Mobile.waitForElementPresent(Main, 30)) {

				KeywordUtil.markPassed('PASSED: Main Photo label text present on the screen')

				if(Mobile.waitForElementPresent(Pic_Picker1, 30)) {

					Mobile.tap(Pic_Picker1, 30)
					KeywordUtil.markPassed('PASSED: Pic Picker Button present on the screen')

					if(Mobile.waitForElementPresent(Take_Photo, 30)) {

						Mobile.tap(Take_Photo, 30)
						KeywordUtil.markPassed('PASSED: Take Photo Button present on the screen')

						if(Mobile.waitForElementPresent(Capture, 30)) {

							Mobile.tap(Capture, 30)
							KeywordUtil.markPassed('PASSED: Capture Button present on the screen')

							if(Mobile.waitForElementPresent(OK, 30)) {

								Mobile.tap(OK, 30)
								KeywordUtil.markPassed('PASSED: ok Button present on the screen')

								if(Mobile.waitForElementPresent(Upload_image, 30)) {

									Mobile.tap(Upload_image, 30)
									KeywordUtil.markPassed('PASSED: Upload Button present on the screen')

									if(Mobile.waitForElementPresent(Photo3, 30)) {

										KeywordUtil.markPassed('PASSED: 3 Photo Required Button present on the screen')
										Mobile.delay(30)

										if(Mobile.waitForElementPresent(Drag, 30)) {

											KeywordUtil.markPassed('PASSED: Drag to reorder label text present on the screen')
											Mobile.delay(30)

											if(Mobile.waitForElementPresent(Continue, 30)) {

												Mobile.tap(Continue, 30)
												KeywordUtil.markPassed('PASSED: Continue Button present on the screen')

											}else {
												KeywordUtil.markFailed('FAILED: Continue Button is not present on the screen')
											}
										}else {
											KeywordUtil.markFailed('FAILED: Drag to reorder label text is not present on the screen')
										}
									}else {
										KeywordUtil.markFailed('FAILED: Upload Button present on the screen')
									}
								}else {
									KeywordUtil.markFailed('FAILED: 3 Photos Required Button is not present on the screen')
								}
							}else {
								KeywordUtil.markFailed('FAILED: ok Button is not present on the screen')
							}
						}else {
							KeywordUtil.markFailed('FAILED: Capture Button is not present on the screen')
						}
					}else {
						KeywordUtil.markFailed('FAILED: Take Photo Button is not present on the screen')
					}
				}else {
					KeywordUtil.markFailed('FAILED: Pic Picker Button is not present on the screen')
				}
			}else {
				KeywordUtil.markFailed('FAILED: Main Photo label text is not present on the screen')
			}
		}else {
			KeywordUtil.markFailed('FAILED: Add 3 Profile... label text is not present on the screen')
		}
	}else {
		KeywordUtil.markFailed('FAILED: Add Profile... label text is not present on the screen')
	}
}else {
	KeywordUtil.markFailed('FAILED: Gallery Icon is not present on the screen')
}










