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


Mobile.startExistingApplication('com.spotlove.releaseproduction', FailureHandling.STOP_ON_FAILURE)


Mobile.tap(Profile_tap, 10)


if(Mobile.waitForElementPresent(setting_icon_DP, 10)) {
	
		KeywordUtil.markPassed("Setting icon on Dating Preference Tab found.......!")
	
		if(Mobile.waitForElementPresent(forword_icon_DP, 10)) {
	
			KeywordUtil.markPassed("Forword icon on Dating Preferences Tab found.......!")
	
			if(Mobile.waitForElementPresent(Dating_Preferences, 10)) {
	
				Mobile.tap(Dating_Preferences, 10)
				KeywordUtil.markPassed("Dating Preference tab tapped.......!")
	
				if(Mobile.waitForElementPresent(lbl_profile, 10)) {
	
					KeywordUtil.markPassed("User Navigate to the Dating Preference tab and Profile text found.......!")
					
					
				}else {
					KeywordUtil.markFailed("Profile lbl text not Found.......!")
				}
			}else {
				KeywordUtil.markFailed("Setting icon on Dating Preference setting Tab not Found.......!")
			}
		}else {
			KeywordUtil.markFailed("Forword icon on Dating Preference Tab not Found.......!")
		}
	}else {
		KeywordUtil.markFailed("Setting icon on Dating Preferences setting Tab not Found.......!")
	}