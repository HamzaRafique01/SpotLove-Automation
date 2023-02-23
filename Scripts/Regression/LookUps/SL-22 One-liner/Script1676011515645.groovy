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

	if(Mobile.waitForElementPresent(lbl_Add, 10)) {

		KeywordUtil.markPassed("User navigate back to the Gallery screen and Add profile photos label text found......!")

		if(Mobile.waitForElementPresent(btn_continue, 10)) {

			Mobile.delay(5)
			CustomKeywords.'com.spotlove.Utility.tap_Continue'()
			Mobile.delay(5)

			if(Mobile.waitForElementPresent(lbl_Giveus, 10)) {

				KeywordUtil.markPassed("User navigate back to the Oneliner screen and Give us your best..... label text found......!")

				if(Mobile.waitForElementPresent(oneliner_icon, 10)) {

					KeywordUtil.markPassed("Oneliner icon found on the Oneliner screen!")

					if(Mobile.waitForElementPresent(lbl_Giveus, 10)) {

						KeywordUtil.markPassed("Give us your best..... label text found......!")

						if(Mobile.waitForElementPresent(lbl_lets, 10)) {

							KeywordUtil.markPassed("Let's help you stand out label text found......!")

							if(Mobile.waitForElementPresent(input_oneliner, 10)) {

								Mobile.setText(input_oneliner, oneliner, 10)
								KeywordUtil.markPassed("Oneliner enter in the text box label text found......!")

								if(Mobile.waitForElementPresent(btn_continue, 10)) {

									Mobile.delay(5)
									CustomKeywords.'com.spotlove.Utility.tap_Continue'()
									Mobile.delay(5)

									if(Mobile.waitForElementPresent(lbl_Enable, 10)) {

										KeywordUtil.markPassed("Enable location label text found......!")
									}else {
										KeywordUtil.markFailed("Enable location label text not found....!")
									}
								}else{
									KeywordUtil.markFailed("Continue button is not working.....!")
								}
							}else {
								KeywordUtil.markFailed("Oneliner not enter in the text box....!")
							}
						}else {
							KeywordUtil.markFailed("Let's help you stand out. label text not found....!")
						}
					}else {
						KeywordUtil.markFailed("Give us your best..... label text not found....!")
					}
				}else {
					KeywordUtil.markFailed("Oneliner icon not found....!")
				}
			}else {
				KeywordUtil.markFailed("Give us your best..... label text not found....!")
			}
		}else {
			KeywordUtil.markFailed("Continue button is not working.....!")
		}
	}else {
		KeywordUtil.markFailed("Add profile photos label text not found......!")
	}
}else {
	KeywordUtil.markFailed("Back button is not working.....!")
}












