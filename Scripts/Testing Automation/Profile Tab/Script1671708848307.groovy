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

import com.kms.katalon.core.util.KeywordUtil as KeywordUtil



if(Mobile.waitForElementPresent(Profile, 30)) {
	
	KeywordUtil.markPassed('PASSED: Profile label text is present on the screen')
	
	if(Mobile.waitForElementPresent(Name, 30)) {
		
		KeywordUtil.markPassed('PASSED: User name label text is present on the screen')
		
		if(Mobile.waitForElementPresent(Edit_profile, 30)) {
			
			KeywordUtil.markPassed('PASSED: Edit Profile label text is present on the screen')
			
			if(Mobile.waitForElementPresent(icon, 30)) {
				
				Mobile .tap(icon, 30)
				KeywordUtil.markPassed('PASSED: Edit Profile icon is present on the screen')
				
				if(Mobile.waitForElementPresent(Profile_Back, 30)) {
					
					Mobile .tap(Profile_Back, 30)
					KeywordUtil.markPassed('PASSED: Edit Profile Back button is present on the screen')
					
					if(Mobile.waitForElementPresent(Dating_Preferences, 30)) {
						
						Mobile .tap(Dating_Preferences, 30)
						KeywordUtil.markPassed('PASSED: Dating Preferences Tab is present on the screen')
						
						if(Mobile.waitForElementPresent(Dating_Back, 30)) {
							
							Mobile .tap(Dating_Back, 30)
							KeywordUtil.markPassed('PASSED: Dating Preferences back is present on the screen')
							
							if(Mobile.waitForElementPresent(Setting_Tab, 30)) {
								
								Mobile .tap(Setting_Tab, 30)
								KeywordUtil.markPassed('PASSED: Setting Tab is present on the screen')
								
								if(Mobile.waitForElementPresent(Setting_Back, 30)) {
									
									Mobile .tap(Setting_Back, 30)
									KeywordUtil.markPassed('PASSED: Setting Back is present on the screen')
									
								
								}else {
									KeywordUtil.markFailed("Failed: Setting Back is not present on the screen")
								}
							}else {
								KeywordUtil.markFailed("Failed: Setting Tab is not present on the screen")
							}
						}else {
							KeywordUtil.markFailed("Failed: Dating Preferences back is not present on the screen")
						}
					}else {
						KeywordUtil.markFailed("Failed: Dating Preferences Tab is not present on the screen")
					}
				}else {
					KeywordUtil.markFailed("Failed: Edit Profile Back button is not present on the screen")
				}
			}else {
				KeywordUtil.markFailed("Failed: Edit Profile icon is not present on the screen")
			}
		}else {
			KeywordUtil.markFailed("Failed: Edit Profile label text is not present on the screen")
		}
	}else {
		KeywordUtil.markFailed("Failed: User name label text is not present on the screen")
	}
}else {
	KeywordUtil.markFailed("Failed: Profile label text is not present on the screen")
}