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

if(Mobile.waitForElementPresent(Back, 30)) {
	
	KeywordUtil.markPassed('PASSED: Back button present on the screen')

	if(Mobile.waitForElementPresent(Politice_Home, 30)) {
		
		KeywordUtil.markPassed('PASSED: Politice Icon present on the screen')
	
		if(Mobile.waitForElementPresent(What, 30)) {
			
			KeywordUtil.markPassed('PASSED: What are... label text present on the screen')
			
			CustomKeywords.'com.spotlove.Utility.random_value'(Political)
		
//			if(Mobile.waitForElementPresent(Liberal, 30)) {
//				
//				Mobile.tap(Liberal, 30)
//				KeywordUtil.markPassed('PASSED: Liberal Chips button present on the screen')
//			
//				if(Mobile.waitForElementPresent(Conservative, 30)) {
//					
//					Mobile.tap(Conservative, 30)
//					KeywordUtil.markPassed('PASSED: Conservative Chips button present on the screen')
//				
//					if(Mobile.waitForElementPresent(Moderate, 30)) {
//						
//						Mobile.tap(Moderate, 30)
//						KeywordUtil.markPassed('PASSED: Moderate Chips button present on the screen')
//					
//						if(Mobile.waitForElementPresent(Apolitical, 30)) {
//							
//							Mobile.tap(Apolitical, 30)
//							KeywordUtil.markPassed('PASSED: Apolitical Chips button present on the screen')
						
							if(Mobile.waitForElementPresent(Continue, 30)) {
								
								Mobile.tap(Continue, 30)
								KeywordUtil.markPassed('PASSED: Continue Chips button present on the screen')
								
//								if(Mobile.waitForElementPresent(permissions, 30)) {
//
//									Mobile.tap(permissions)
//									KeywordUtil.markPassed('PASSED: Permissions present on the screen')
//
//								}else {
//									KeywordUtil.markFailed('FAILED: Permissions are not present on the screen')
//								}
							}else {
								KeywordUtil.markFailed('FAILED: Continue Chips button is not present on the screen')
							}
//						}else {
//							KeywordUtil.markFailed('FAILED: Apolitical Chips button is not present on the screen')
//						}
//					}else {
//						KeywordUtil.markFailed('FAILED: Moderate Chips button is not present on the screen')
//					}
//				}else {
//					KeywordUtil.markFailed('FAILED: Conservative Chips button is not present on the screen')
//				}
//			}else {
//				KeywordUtil.markFailed('FAILED: Liberal Chips button is not present on the screen')
//			}
		}else {
			KeywordUtil.markFailed('FAILED: Whats are... label text is not present on the screen')
		}
	}else {
		KeywordUtil.markFailed('FAILED: Politice Icon is not present on the screen')
	}
}else {
	KeywordUtil.markFailed('FAILED: Back button is not present on the screen')
}
