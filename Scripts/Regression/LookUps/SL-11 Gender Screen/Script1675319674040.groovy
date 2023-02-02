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
	KeywordUtil.markPassed("User navigate back to the Birthday screen......!")

	if(Mobile.waitForElementPresent(cake_icon, 10)) {

		KeywordUtil.markPassed("Cake icon found on Birthday screen......!")

		if(Mobile.waitForElementPresent(btn_continue, 10)) {

			Mobile.tap(btn_continue, 10)
			KeywordUtil.markPassed("PopUp should opened on the screen.......!")

			if(Mobile.waitForElementPresent(btn_continue_popup, 10)) {

				Mobile.tap(btn_continue_popup, 10)
				KeywordUtil.markPassed("User navigate to the Gender Screen.......!")

				if(Mobile.waitForElementPresent(mirror_icon, 10)) {

					KeywordUtil.markPassed("Mirror icon found on Gender Screen.......!")

					if(Mobile.waitForElementPresent(lbl_how, 10)) {

						KeywordUtil.markPassed("How do you identify? label text found.......!")

						CustomKeywords.'com.spotlove.Utility.dating_Pref'(random)

						KeywordUtil.markPassed("Gender selection successfully.......!")

						if(Mobile.waitForElementPresent(btn_G_Continue, 10)) {

							Mobile.tap(btn_G_Continue, 10)
							KeywordUtil.markPassed("User navigate to the Sexual Orientation Screen.......!")

							if(Mobile.waitForElementPresent(profile_icon, 10)) {

								KeywordUtil.markPassed("Profile icon found on next Screen.......!")

							}else {
								KeywordUtil.markFailed("Profile icon not found on next Screen.....!")
							}
						}else {
							KeywordUtil.markFailed("User navigation not successfully.....!")
						}
					}else {
						KeywordUtil.markFailed("Gender selection Un-successfully.....!")
						KeywordUtil.markFailed("How do you identify? label text not found.....!")
					}
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
		KeywordUtil.markFailed("Cake icon not found on Birthday screen....!")
	}
}else {
	KeywordUtil.markFailed("Back button is not working.....!")
}