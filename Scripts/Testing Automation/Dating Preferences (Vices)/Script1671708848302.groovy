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

	if(Mobile.waitForElementPresent(Vices, 30)) {

		Mobile.tap(Vices, 30)
		KeywordUtil.markPassed('PASSED: Vices Tab is present on the screen')

		if(Mobile.waitForElementPresent(Vices_header, 30)) {

			KeywordUtil.markPassed('PASSED: Vices header is present on the screen')

			if(Mobile.waitForElementPresent(S_often, 30)) {

				Mobile.tap(S_often, 30)
				KeywordUtil.markPassed('PASSED: Smoking often CheckBox is present on the screen')

				if(Mobile.waitForElementPresent(S_Never, 30)) {

					Mobile.tap(S_Never, 30)
					KeywordUtil.markPassed('PASSED: Smoking Never CheckBox is present on the screen')

					if(Mobile.waitForElementPresent(S_Socially, 30)) {

						Mobile.tap(S_Socially, 30)
						KeywordUtil.markPassed('PASSED: Smoking Socially CheckBox is present on the screen')

						if(Mobile.waitForElementPresent(Close, 30)) {

							Mobile.tap(Close, 30)
							KeywordUtil.markPassed('PASSED: Close Button is present on the screen')

							if(Mobile.waitForElementPresent(Vices, 30)) {

								Mobile.tap(Vices, 30)
								KeywordUtil.markPassed('PASSED: Vices Tab is present on the screen')

								if(Mobile.waitForElementPresent(Mari_Socially, 30)) {

									Mobile.tap(Mari_Socially, 30)
									KeywordUtil.markPassed('PASSED:  Marijuana Socially CheckBox is present on the screen')

									if(Mobile.waitForElementPresent(Mari_Never, 30)) {

										Mobile.tap(Mari_Never, 30)
										KeywordUtil.markPassed('PASSED:  Marijuana Never CheckBox is present on the screen')

										if(Mobile.waitForElementPresent(Mari_All, 30)) {

											Mobile.tap(Mari_All, 30)
											KeywordUtil.markPassed('PASSED:  Marijuana Open to All CheckBox is present on the screen')
											Mobile.tap(Mari_All, 30)

											if(Mobile.waitForElementPresent(Mari_Often, 30)) {

												Mobile.tap(Mari_Often, 30)
												KeywordUtil.markPassed('PASSED:  Marijuana Often CheckBox is present on the screen')

												if(Mobile.waitForElementPresent(Al_Never, 30)) {

													Mobile.tap(Al_Never, 30)
													KeywordUtil.markPassed('PASSED:  Alcohal Never CheckBox is present on the screen')

													if(Mobile.waitForElementPresent(Al_Socially, 30)) {

														Mobile.tap(Al_Socially, 30)
														KeywordUtil.markPassed('PASSED:  Alcohal Socially CheckBox is present on the screen')

														if(Mobile.waitForElementPresent(Save, 30)) {

															Mobile.tap(Save, 30)
															KeywordUtil.markPassed('PASSED: Save Button is present on the screen')

														}else {
															KeywordUtil.markFailed("Failed: Save Button is not present on the screen")
														}
													}else {
														KeywordUtil.markFailed("Failed: Marijuana Open to All CheckBox is not present on the screen")
													}

												}else {
													KeywordUtil.markFailed("Failed: Marijuana Never CheckBox is not present on the screen")
												}
											}else {
												KeywordUtil.markFailed("Failed: Marijuana Socially CheckBox is not present on the screen")
											}

										}else {
											KeywordUtil.markFailed("Failed: Marijuana Open to All CheckBox is not present on the screen")
										}

									}else {
										KeywordUtil.markFailed("Failed: Marijuana Never CheckBox is not present on the screen")
									}
								}else {
									KeywordUtil.markFailed("Failed: Marijuana Socially CheckBox is not present on the screen")
								}
							}else {
								KeywordUtil.markFailed("Failed: Vices Tab is not present on the screen")
							}
						}else {
							KeywordUtil.markFailed("Failed: Close Button is not present on the screen")
						}
					}else {
						KeywordUtil.markFailed("Failed: Smoking Socially CheckBox is not present on the screen")
					}
				}else {
					KeywordUtil.markFailed("Failed: Smoking Never CheckBox is not present on the screen")
				}
			}else {
				KeywordUtil.markFailed("Failed: Smoking often CheckBox is not present on the screen")
			}
		}else {
			KeywordUtil.markFailed("Failed: Vices Header is not present on the screen")
		}
	}else {
		KeywordUtil.markFailed("Failed: Vices Tab is not present on the screen")
	}
}else {
	KeywordUtil.markFailed("Failed: Dating Preferences label text is not present on the screen")
}




