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

//Mobile.startExistingApplication("com.spotlove.releaseproduction" , FailureHandling.STOP_ON_FAILURE)


if(Mobile.waitForElementPresent(First_lbl_text, 10)) {

	KeywordUtil.markPassed("Spot Love At First Sight label text found......!")

	if(Mobile.waitForElementPresent(Second_lbl_text, 10)) {

		KeywordUtil.markPassed("Select an account to Continue label text found......!")

		if(Mobile.waitForElementPresent(btn_Continue, 10)) {

			Mobile.tap(btn_Continue, 10)

			if(Mobile.waitForElementPresent(lbl_Sign, 10)) {
				
				KeywordUtil.markPassed("User Navigate to Phone Numebr Screen and Sign in to Spot.Love label text found......!")
				
			}else {
				KeywordUtil.markFailed("Sign in to Spot.Love label text Not found......!")	
			}
		}else {
			KeywordUtil.markFailed("Something Missing Please check Again......!")
		}
	}else {
		KeywordUtil.markFailed("Select an account to Continue label text Not found......!")
	}
}else {
	KeywordUtil.markFailed("Spot Love At First Sight label text Not Found......!")
}
