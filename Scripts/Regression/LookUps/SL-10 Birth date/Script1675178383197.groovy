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


if(Mobile.waitForElementPresent(btn_back, 10)) {

	Mobile.tap(btn_back, 10)
	KeywordUtil.markPassed("User navigate back to the First Name screen......!")

	if(Mobile.waitForElementPresent(Contact_icon, 10)) {

		Mobile.tap(btn_previous_continue, 10)
		KeywordUtil.markPassed("User navigate Move forword to the Date of Birth screen......!")

		if(Mobile.waitForElementPresent(Cake_icon, 10)) {

			KeywordUtil.markPassed("Cake icon found......!")

			if(Mobile.waitForElementPresent(lbl_what, 10)) {

				KeywordUtil.markPassed("What's your date of birth? label text found......!")

				if(Mobile.waitForElementPresent(lbl_AGe, 10)) {

					KeywordUtil.markPassed("Age xx label text found......!")

					if(Mobile.waitForElementPresent(lbl_This, 10)) {

						KeywordUtil.markPassed("This can't be changed later label text found......!")

						if(Mobile.waitForElementPresent(btn_continue, 10)) {

							Mobile.tap(btn_continue, 10)
							KeywordUtil.markPassed("PopUp should opened on the screen.......!")

							if(Mobile.waitForElementPresent(lbl_Please, 10)) {

								KeywordUtil.markPassed("Please confirm your birthdate on the PopUp label text found.......!")

								if(Mobile.waitForElementPresent(lbl_can, 10)) {

									KeywordUtil.markPassed("This can't be changed later label text found.......!")

									if(Mobile.waitForElementPresent(Age_cofirm, 10)) {

										KeywordUtil.markPassed("Age Confirmation label text found.......!")

										if(Mobile.waitForElementPresent(DOB_cofirmation, 10)) {

											KeywordUtil.markPassed("DOB Confirmation label text found.......!")

											if(Mobile.waitForElementPresent(btn_edit, 10)) {

												Mobile.tap(btn_edit, 10)
												KeywordUtil.markPassed("User navigate back to the Date of Birth.......!")

												if(Mobile.waitForElementPresent(btn_continue, 10)) {

													Mobile.tap(btn_continue, 10)
													KeywordUtil.markPassed("PopUp should opened on the screen.......!")

													if(Mobile.waitForElementPresent(btn_continue_popup, 10)) {

														Mobile.tap(btn_continue_popup, 10)
														KeywordUtil.markPassed("User navigate to the Gender Screen.......!")

														if(Mobile.waitForElementPresent(mirror_icon, 10)) {

															KeywordUtil.markPassed("Mirror icon found on Gender Screen.......!")


														}else {
															KeywordUtil.markFailed("Mirror icon is not found.....!")
														}
													}else {
														KeywordUtil.markFailed("Continue button is not working.....!")
													}
												}else {
													KeywordUtil.markFailed("Continue button is not working.....!")
												}
											}else {
												KeywordUtil.markFailed("Edit button is not working.....!")
											}
										}else {
											KeywordUtil.markFailed("DOB Confirmation label text not found.....!")
										}
									}else {
										KeywordUtil.markFailed("Age Confirmation label text not found.....!")
									}
								}else {
									KeywordUtil.markFailed("This can't be changed later label text not found.....!")
								}
							}else {
								KeywordUtil.markFailed("PopUp dosn't open on the screen.....!")
							}

						}else {
							KeywordUtil.markFailed("Continue button is not working.....!")
						}
					}else {
						KeywordUtil.markFailed("This can't be changed later label text not found.....!")
					}
				}else {
					KeywordUtil.markFailed("Age xx label text not found.....!")
				}
			}else {
				KeywordUtil.markFailed("What's your date of birth? label text not found.....!")
			}
		}else {
			KeywordUtil.markFailed("Cake icon not found.....!")
		}
	}else {
		KeywordUtil.markFailed("Continue button is not working.....!")
	}
}else {
	KeywordUtil.markFailed("Back button is not working.....!")
}