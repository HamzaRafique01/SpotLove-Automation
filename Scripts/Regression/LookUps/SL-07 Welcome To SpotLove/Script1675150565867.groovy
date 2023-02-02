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
import com.spotlove.Utility


if(Mobile.waitForElementPresent(Logo_Spotlove, 10)) {

	KeywordUtil.markPassed("Spot.Love Logo Found......!")

	if(Mobile.waitForElementPresent(lbl_txt_first, 10)) {

		KeywordUtil.markPassed("Welcome to Spot.Love lbl text Found......!")

		if(Mobile.waitForElementPresent(lbl_txt_Sec, 10)) {

			KeywordUtil.markPassed("Please follow these house rules lbl text Found......!")

			if(Mobile.waitForElementPresent(first_heart_icon, 10)) {

				KeywordUtil.markPassed("First Heart Icon Found......!")

				if(Mobile.waitForElementPresent(Be_kind_lbl, 10)) {

					KeywordUtil.markPassed("Be Kind lbl text Found......!")

					if(Mobile.waitForElementPresent(Treat_lbl, 10)) {

						KeywordUtil.markPassed("Treat everyone with respect and kindness lbl text Found......!")

						if(Mobile.waitForElementPresent(Second_heart_icon, 10)) {

							KeywordUtil.markPassed("Second Heart Icon Found......!")

							if(Mobile.waitForElementPresent(Be_your_lbl, 10)) {

								KeywordUtil.markPassed("Be yourself lbl text Found......!")

								if(Mobile.waitForElementPresent(Be_honest_lbl, 10)) {

									KeywordUtil.markPassed("Be honest about your age, photos, and bio lbl text Found......!")

									if(Mobile.waitForElementPresent(Third_heart_icon, 10)) {

										KeywordUtil.markPassed("Third Heart Icon Found......!")

										if(Mobile.waitForElementPresent(Be_out_lbl, 10)) {

											KeywordUtil.markPassed("Be outspoken lbl text Found......!")

											if(Mobile.waitForElementPresent(Always_lbl, 10)) {

												KeywordUtil.markPassed("Always reported bad behavior lbl text Found......!")

												if(Mobile.waitForElementPresent(View_term, 10)) {

													KeywordUtil.markPassed("Terms and Conditions Link is functional......!")

													if(Mobile.waitForElementPresent(btn_Agree, 10)) {

														Mobile.tap(btn_Agree, 10)
														KeywordUtil.markPassed("I Agree button found, User navigate to the Source Screen......!")

														if(Mobile.waitForElementPresent(Source_heart, 10)) {

															KeywordUtil.markPassed("Heart icon found......!")

														}else {
															KeywordUtil.markFailed("Heart icon not found.....!")
														}
													}else {
														KeywordUtil.markFailed("I Agree button dosn't found.....!")
													}
												}else {
													KeywordUtil.markFailed("Terms and Conditions Link is not functional......!")
												}
											}else {
												KeywordUtil.markFailed("Always reported bad behavior lbl text not Found......!")
											}
										}else {
											KeywordUtil.markFailed("Be outspoken lbl text not Found......!")
										}
									}else {
										KeywordUtil.markFailed("Third Heart Icon not Found......!")
									}
								}else {
									KeywordUtil.markFailed("Be honest about your age, photos, and bio lbl text not Found......!")
								}
							}else {
								KeywordUtil.markFailed("Be yourself lbl text not Found......!")
							}
						}else {
							KeywordUtil.markFailed("Second Heart Icon not Found......!")
						}
					}else {
						KeywordUtil.markFailed("Treat everyone with respect and kindness lbl text not Found......!")
					}
				}else {
					KeywordUtil.markFailed("Be Kind lbl text not Found......!")
				}
			}else {
				KeywordUtil.markFailed("First Heart Icon not Found......!")
			}
		}else {
			KeywordUtil.markFailed("Please follow these house rules lbl text not Found......!")
		}
	}else {
		KeywordUtil.markFailed("Welcome to Spot.Love lbl text not Found......!")
	}
}else {
	KeywordUtil.markFailed("Spot.Love Logo not Found......!")
}