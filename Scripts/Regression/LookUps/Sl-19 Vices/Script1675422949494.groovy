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

//	Mobile.tap(btn_back, 10)
	CustomKeywords.'com.spotlove.Utility.tap_back'()
	KeywordUtil.markPassed("User navigate back to the Education screen......!")
	Mobile.delay(10)

	if(Mobile.waitForElementPresent(hat_icon, 20)) {

		KeywordUtil.markPassed("Hat icon found on Education screen......!")

		if(Mobile.waitForElementPresent(btn_continue, 10)) {

//			Mobile.tap(btn_continue, 10)
			CustomKeywords.'com.spotlove.Utility.tap_Continue'()
			KeywordUtil.markPassed("User navigate to the Vices Screen......!")

			if(Mobile.waitForElementPresent(bottle_icon, 10)) {

				KeywordUtil.markPassed("Bottle icon found on Vices screen......!")

				if(Mobile.waitForElementPresent(lbl_What, 10)) {

					KeywordUtil.markPassed("What are your vices? label text found......!")

					if(Mobile.waitForElementPresent(btn_toggle_M, 10)) {

						Mobile.tap(btn_toggle_M, 10)
						KeywordUtil.markPassed("Marijuana Toggle button On......!")

						if(Mobile.waitForElementPresent(btn_toggle_S, 10)) {

							Mobile.tap(btn_toggle_S, 10)
							KeywordUtil.markPassed("Smoking Toggle button On......!")

							if(Mobile.waitForElementPresent(btn_toggle_A, 10)) {

								Mobile.tap(btn_toggle_A, 10)
								KeywordUtil.markPassed("Alcohol Toggle button On......!")

								CustomKeywords.'com.spotlove.Utility.dating_Pref'(A_random)
								KeywordUtil.markPassed("Alcohol Toggle button On......!")
//
//								CustomKeywords.'com.spotlove.Utility.dating_Pref'(S_random)
//								KeywordUtil.markPassed("Smoking Selected......!")
//
//								CustomKeywords.'com.spotlove.Utility.dating_Pref'(M_random)
//								KeywordUtil.markPassed("Marijuana Selected......!")

								if(Mobile.waitForElementPresent(btn_V_Continue, 10)) {

//									Mobile.tap(btn_V_Continue, 10)
									CustomKeywords.'com.spotlove.Utility.tap_Continue'()
									KeywordUtil.markPassed("User navigate to the justice Screen.......!")

									if(Mobile.waitForElementPresent(justice_icon, 10)) {

										KeywordUtil.markPassed("justice icon found on next Screen.......!")

									}else {
										KeywordUtil.markFailed("justice icon not found on next Screen.....!")
									}
								}else {
									KeywordUtil.markFailed("User navigation not successfully.....!")
								}
							}else {
								KeywordUtil.markFailed("Alcohol Toggle button Off....!")
							}
						}else {
							KeywordUtil.markFailed("Smoking Toggle button Off....!")
						}
					}else {
						KeywordUtil.markFailed("Marijuana Toggle button Off....!")
					}
				}else {
					KeywordUtil.markFailed("What are your vices? label text not found....!")
				}
			}else {
				KeywordUtil.markFailed("Bottle icon not found on Vices screen....!")
			}
		}else {
			KeywordUtil.markFailed("Continue button is not working....!")
		}
	}else {
		KeywordUtil.markFailed("Hat icon found on Education screen....!")
	}
}else {
	KeywordUtil.markFailed("Back button is not working.....!")
}




