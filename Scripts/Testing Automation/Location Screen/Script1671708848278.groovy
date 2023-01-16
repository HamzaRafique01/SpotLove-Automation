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
		
		KeywordUtil.markPassed('PASSED: Loation icon is present on the screen.')
		
		if(Mobile.waitForElementPresent(Enable , 30)) {
			
			KeywordUtil.markPassed('PASSED: Enable location label text is present on the screen.')
			
			if(Mobile.waitForElementPresent(Well , 30)) {
				
				KeywordUtil.markPassed('PASSED: We ll use... is present on the screen.')
				
				if(Mobile.waitForElementPresent(Location , 30)) {
					
					Mobile.tap(Location, 30)
					KeywordUtil.markPassed('PASSED: Enable location button is present on the screen.')
					
					if(Mobile.waitForElementPresent(Permission , 30)) {
						
						Mobile.tap(Permission, 30)
						KeywordUtil.markPassed('PASSED: Enable location button is present on the screen.')
						
					}else {
						KeywordUtil.markFailed('FAILED: Enable location button is not present on the screen.')
					}
				}else {
					KeywordUtil.markFailed('FAILED: Enable location button is not present on the screen.')
				}
			}else {
				KeywordUtil.markFailed('FAILED: We ll use is not present on the screen.')
			}
		}else {
			KeywordUtil.markFailed('FAILED: Enable location label text is not present on the screen.')
		}
	}else {
		KeywordUtil.markFailed('FAILED: icon is not present on the screen.')
	}
}else {
	KeywordUtil.markFailed('FAILED: Back button is not present on the screen.')
}