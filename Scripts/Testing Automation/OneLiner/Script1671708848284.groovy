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

if(Mobile.waitForElementPresent(Back , 30)) {
	
	KeywordUtil.markPassed('PASSED: Back button is present on the screen.')
	
	if(Mobile.waitForElementPresent(icon , 30)) {
		
		KeywordUtil.markPassed('PASSED: icon is present on the screen.')
		
		if(Mobile.waitForElementPresent(Give , 30)) {
			
			KeywordUtil.markPassed('PASSED: Give us.... label text is present on the screen.')
			
			if(Mobile.waitForElementPresent(Let , 30)) {
				
				KeywordUtil.markPassed('PASSED: Lets help... is present on the screen.')
				
				if(Mobile.waitForElementPresent(Enter_Text , 30)) {
					
					Mobile.setText(Enter_Text, Text, 30)
					KeywordUtil.markPassed('PASSED: Text Box Available on the screen.')
					Mobile.delay(30)
					
					if(Mobile.waitForElementPresent(Skip , 30)) {
						
						KeywordUtil.markPassed('PASSED: Continue button is present on the screen.')
						
						if(Mobile.waitForElementPresent(Continue , 30)) {
							
							Mobile.tap(Continue, 30)
							KeywordUtil.markPassed('PASSED: Skip button is present on the screen.')
							
						}else {
							KeywordUtil.markFailed('FAILED: Skip button is not present on the screen.')
						}
					}else {
						KeywordUtil.markFailed('FAILED: Continue button is not present on the screen.')
					}
				}else {
					KeywordUtil.markFailed('FAILED: Text Box Available is not present on the screen.')
				}
			}else {
				KeywordUtil.markFailed('FAILED: Lets help... is not present on the screen.')
			}
		}else {
			KeywordUtil.markFailed('FAILED: Give us.... label text is not present on the screen.')
		}
	}else {
		KeywordUtil.markFailed('FAILED: icon is not present on the screen.')
	}
}else {
	KeywordUtil.markFailed('FAILED: Back button is not present on the screen.')
}