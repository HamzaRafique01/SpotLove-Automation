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


if(Mobile.waitForElementPresent(Back, 30)) {
	
	Mobile.tap(Back, 30)
	KeywordUtil.markPassed('PASSED: Back Button is present on the screen')
	
	if(Mobile.waitForElementPresent(Pervious_Continue, 30)) {
		
		Mobile.tap(Pervious_Continue, 30)
		KeywordUtil.markPassed('PASSED: Continue Button is present on the screen')
		
		if(Mobile.waitForElementPresent(cake_icon, 30)) {
			
			KeywordUtil.markPassed('PASSED: Card Icon is present on the screen')
			
			if(Mobile.waitForElementPresent(Whatsyour, 30)) {
				
				KeywordUtil.markPassed('PASSED: Whats your... label text is present on the screen')
				
				if(Mobile.waitForElementPresent(Year, 30)) {
					
					Mobile.tap(Year, 30)
					KeywordUtil.markPassed('PASSED: Year is present on the screen')
					
					if(Mobile.waitForElementPresent(Continue, 30)) {
						
						Mobile.tap(Continue, 30)
						KeywordUtil.markPassed('PASSED: Continue button is present on the screen')
						
						if(Mobile.waitForElementPresent(Please, 30)) {
							
							KeywordUtil.markPassed('PASSED: Please Confirm... label text is present on the screen')
							
							if(Mobile.waitForElementPresent(Thiscant, 30)) {
								
								KeywordUtil.markPassed('PASSED: This cant... label text is present on the screen')
								
								if(Mobile.waitForElementPresent(C_Continue, 30)) {
									
									Mobile.tap(C_Continue, 30)
									KeywordUtil.markPassed('PASSED: C_Continue button present on the screen')
			
									
								}else {
									KeywordUtil.markFailed('FAILED: C_Continue button is not present on the screen')
								}
							}else {
								KeywordUtil.markFailed('FAILED: This cant... label text is not present on the screen')
							}
							
						}else {
							KeywordUtil.markFailed('FAILED: Please Confirm... label text is not present on the screen')
						}
					}else {
						KeywordUtil.markFailed('FAILED: Continue button is not present on the screen')
					}
				}else {
					KeywordUtil.markFailed('FAILED: Year is not present on the screen')
				}
			}else {
				KeywordUtil.markFailed('FAILED: Whats your... label text is not present on the screen')
			}
		}else {
			KeywordUtil.markFailed('FAILED: Card Icon is not present on the screen')
		}
	}else {
		KeywordUtil.markFailed('FAILED: Continue Button is not present on the screen')
	}
}else {
	KeywordUtil.markFailed('FAILED: Back Button is not present on the screen')
}