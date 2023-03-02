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

//Mobile.startExistingApplication("com.spotlove.releaseproduction" , FailureHandling.STOP_ON_FAILURE)


if(Mobile.waitForElementPresent(btn_back, 10)) {

	CustomKeywords.'com.spotlove.Utility.tap_back'()

	if(Mobile.waitForElementPresent(lbl_Giveus, 10)) {

		KeywordUtil.markPassed("User navigate back to the Oneliner screen and Give us your best..... label text found......!")

		if(Mobile.waitForElementPresent(btn_continue, 10)) {

			Mobile.delay(5)
			CustomKeywords.'com.spotlove.Utility.tap_Continue'()
			Mobile.delay(5)

			if(Mobile.waitForElementPresent(lbl_Enable, 10)) {

				KeywordUtil.markPassed("User navigate to the Location screen and Enabale Location label text found......!")

				if(Mobile.waitForElementPresent(btn_enable, 10)) {

					Mobile.tap(btn_enable, 10)
					KeywordUtil.markPassed("User navigate to the Confirm Location screen and Enabale Location label text found......!")

//					if(Mobile.waitForElementPresent(permission_loc, 10)) {
//
//						Mobile.tap(permission_loc, 10)

						if(Mobile.waitForElementPresent(lbl_confirm, 10)) {

							KeywordUtil.markPassed("User navigate to the Confirm Location screen and Confirm Location label text found......!")
							
							if(Mobile.waitForElementPresent(lbl_confirm, 10)) {
								
//								Mobile.tap(country, 10)
//								Mobile.setText(country, c_name, 10)
//								
//								Mobile.tap(Region, 10)
//								Mobile.setText(Region, r_name, 10)
//								
//								Mobile.tap(city, 10)
//								Mobile.setText(city, city_name, 10)
//								
//								Mobile.tap(code, 10)
//								Mobile.setText(code, code_num, 10)
								
								Mobile.delay(5)
								CustomKeywords.'com.spotlove.Utility.tap_Submit'()
								Mobile.delay(5)
								
								KeywordUtil.markPassed("User navigate to the Sit Tight screen and Sit Tight label text found......!")
								
							}else {
								
								KeywordUtil.markFailed("Confirm location screen is not found.....")
								
							}
						}else if(lbl_sit){
							
							KeywordUtil.markPassed("User navigate to the Sit Tight screen and Sit Tight label text found......!")
							
						}
//					}else {
//						KeywordUtil.markFailed("Continue button is not working....!")
//					}
				}else {
					KeywordUtil.markFailed("Continue button is not working....!")
				}
			}else {
				KeywordUtil.markFailed("Enabale Location  label text not found....!")
			}
		}else {
			KeywordUtil.markFailed("Continue button is not working.....!")
		}
	}else {
		KeywordUtil.markFailed("Give us your best..... label text not found....!")
	}
}else {
	KeywordUtil.markFailed("Back button is not working.....!")
}


