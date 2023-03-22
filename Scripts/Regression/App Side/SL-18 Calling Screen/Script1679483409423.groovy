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


//Mobile.startExistingApplication('com.spotlove.releaseproduction', FailureHandling.STOP_ON_FAILURE)

if(Mobile.waitForElementPresent(User_Name, 120)) {

	KeywordUtil.markPassed("User name found on the screen......")

	if(Mobile.waitForElementPresent(User_Profile, 120)) {

		KeywordUtil.markPassed("User Profile found on the screen......")

		if(Mobile.waitForElementPresent(Camera_rotate, 120)) {

			Mobile.tap(Camera_rotate, 120)
			KeywordUtil.markPassed("Camera Rotate Successfully......")

			if(Mobile.waitForElementPresent(btn_Mic, 120)) {

				Mobile.tap(btn_Mic, 120)
				KeywordUtil.markPassed("Mic OFF Successfully......")
				Mobile.delay(10)
				Mobile.tap(btn_Mic, 120)
				KeywordUtil.markPassed("Mic ON Successfully......")

				if(Mobile.waitForElementPresent(btn_Video_Switch, 120)) {

					Mobile.tap(btn_Video_Switch, 120)
					KeywordUtil.markPassed("Video OFF Successfully......")
					Mobile.delay(10)
					Mobile.tap(btn_Video_Switch, 120)
					KeywordUtil.markPassed("Video ON Successfully......")

					if(Mobile.waitForElementPresent(Call_remainning_timer, 120)) {

						KeywordUtil.markPassed("Call Remainning Timer is shown on the Screen......")

						if(Mobile.waitForElementPresent(Close_popup, 120)) {

							Mobile.tap(Close_popup, 120)
							KeywordUtil.markPassed("Tips PopUp Close Successfully......")

							if(Mobile.waitForElementPresent(btn_End_Call, 120)) {

								Mobile.tap(btn_End_Call, 120)
								KeywordUtil.markPassed("Call Remainning Timer is shown on the Screen......")


							}else {
								KeywordUtil.markFailed("Call Remainning Timer is not Appear on the Screen......")
							}
						}else {
							KeywordUtil.markFailed("Close Button not found......")
						}
					}else {
						KeywordUtil.markFailed("Call Remainning Timer is not Appear on the Screen......")
					}
				}else {
					KeywordUtil.markFailed("Video cannot Switch OFF or ON......")
				}
			}else {
				KeywordUtil.markFailed("Mic cannot Switch OFF or ON......")
			}
		}else {
			KeywordUtil.markFailed("Camera Changing issue......")
		}
	}else {
		KeywordUtil.markFailed("User Profile not found on the screen......")
	}
}else {
	KeywordUtil.markFailed("User name not found on the screen......")
}