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



if(Mobile.waitForElementPresent(spotlove_logo, 10)) {

	KeywordUtil.markPassed("Spot.Love Logo Found......!")

	if(Mobile.waitForElementPresent(btn_back, 10)) {

		CustomKeywords.'com.spotlove.Utility.tap_back'()
//		print("Back Button Found and tapped......!")

		if(Mobile.waitForElementPresent(lbl_SPOT, 10)) {

			KeywordUtil.markPassed("User navigate to the Previous Screen and Spotlove at first sight label text is found......!")

			if(Mobile.waitForElementPresent(btn_continue, 10)) {

				CustomKeywords.'com.spotlove.Utility.tap_Phone_Numebr'()
//				print("Continue Button Found and tapped......!")

				if(Mobile.waitForElementPresent(lbl_first_text, 10)) {

					KeywordUtil.markPassed("User navigate to the Next Screen and Sign in to Spot.Love label text is found......!")

					if(Mobile.waitForElementPresent(lbl_Second_text, 10)) {

						KeywordUtil.markPassed("Continue with your phone number label text is found......!")

						if(Mobile.waitForElementPresent(flag_icon, 10)) {

							print("Country Flag Icon is found......!")
							Mobile.tap(flag_icon, 10)
							KeywordUtil.markPassed("Country slection dropdown is opened......!")

							if(Mobile.waitForElementPresent(search_box, 10)) {

								Mobile.setText(search_box, C_Name, 10)
								KeywordUtil.markPassed("Country Name Entered in the Search Box......!")

								if(Mobile.waitForElementPresent(First_index, 10)) {

									Mobile.tap(First_index, 10)
									KeywordUtil.markPassed("Country Selection Successfully......!")

									if(Mobile.waitForElementPresent(Enter_Phonenumber, 10)) {

										Mobile.setText(Enter_Phonenumber, PhoneNumber, 10)
										KeywordUtil.markPassed("Phon number Entered......!")

										CustomKeywords.'com.spotlove.Utility.tap_Continue'()
										Mobile.delay(15)

									}else {
										KeywordUtil.markFailed("Phone Numebr field not found......!")
									}
								}else {
									KeywordUtil.markFailed("Country not Selected......!")
								}
							}else {
								KeywordUtil.markFailed("Search box is not found......!")
							}
						}else {
							KeywordUtil.markFailed("Country Flag Icon is not found......!")
						}
					}else {
						KeywordUtil.markFailed("Continue with your phone number label text is not found......!")
					}
				}else {
					KeywordUtil.markFailed("Naviagation is not made and Sign in to Spot.Love label text is not found......!")
				}
			}else {
				KeywordUtil.markFailed("Continue Button not Found......!")
			}
		}else {
			KeywordUtil.markFailed("Naviagation is not made and Spotlove at first sight label text is not found......!")
		}
	}else {
		KeywordUtil.markFailed("Back Button not Found......!")
	}
}else {
	KeywordUtil.markFailed("Spot.Love Logo Found......!")
}




