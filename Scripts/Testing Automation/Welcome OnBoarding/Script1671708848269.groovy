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

Mobile.startExistingApplication(GlobalVariable.packageID , FailureHandling.STOP_ON_FAILURE)
if(Mobile.waitForElementPresent(logo, 30)) {
	
	KeywordUtil.markPassed('PASSED: SpotLove logo is present on the screen.')
	
	if(Mobile.waitForElementPresent(welcome, 30)) {
		
		KeywordUtil.markPassed('PASSED: Welcome... label text is present on the screen.')
		
		if(Mobile.waitForElementPresent(Please, 30)) {
			
			KeywordUtil.markPassed('PASSED: Please... label text is present on the screen.')
			
			if(Mobile.waitForElementPresent(Heart1, 30)) {
				
				KeywordUtil.markPassed('PASSED: Heart Icon... is present on the screen.')
				
				if(Mobile.waitForElementPresent(Be, 30)) {
					
					KeywordUtil.markPassed('PASSED: Be Kind... label text is present on the screen.')
					
					if(Mobile.waitForElementPresent(Treat, 30)) {
						
						KeywordUtil.markPassed('PASSED: Treat... label text is present on the screen.')
						
						if(Mobile.waitForElementPresent(Heart2, 30)) {
							
							KeywordUtil.markPassed('PASSED: Heart Icon... is present on the screen.')
							
							if(Mobile.waitForElementPresent(Be_You, 30)) {
								
								KeywordUtil.markPassed('PASSED: Be Your... label text is present on the screen.')
								
								if(Mobile.waitForElementPresent(Be_honest, 30)) {
									
									KeywordUtil.markPassed('PASSED: Be Honest... label text is present on the screen.')
									
									if(Mobile.waitForElementPresent(Heart3, 30)) {
										
										KeywordUtil.markPassed('PASSED: Heart Icon... is present on the screen.')
										
										if(Mobile.waitForElementPresent(Be_Out, 30)) {
											
											KeywordUtil.markPassed('PASSED: Be Out... label text is present on the screen.')
											
											if(Mobile.waitForElementPresent(Always, 30)) {
												
												KeywordUtil.markPassed('PASSED: Always... label text is present on the screen.')
												
												if(Mobile.waitForElementPresent(Terms, 30)) {
													
													KeywordUtil.markPassed('PASSED: View Terms and Conditions are show on the screen')
													
													if(Mobile.waitForElementPresent(Agree, 30)) {
														
														Mobile.tap(Agree, 30)
														KeywordUtil.markPassed('PASSED: I Agree Button ise show on the screen')
														
														
													}else {
														KeywordUtil.markFailed('FAILED: I Agree Button is not show on the screen')
													}
												}else {
													KeywordUtil.markFailed('FAILED: View Terms and Conditions are not show on the screen')
												}
											}else {
												KeywordUtil.markFailed('FAILED: Always... label text is not present on the screen.')
											}
										}else {
											KeywordUtil.markFailed('FAILED: Be Out... label text is not present on the screen.')
										}
									}else {
										KeywordUtil.markFailed('FAILED: Heart Icon... is not present on the screen.')
									}
								}else {
									KeywordUtil.markFailed('FAILED: Be Honest... label text is not present on the screen.')
								}
							}else {
								KeywordUtil.markFailed('FAILED: Be Your... label text is not present on the screen.')
							}
						}else {
							KeywordUtil.markFailed('FAILED: Heart Icon... is not present on the screen.')
						}
					}else {
						KeywordUtil.markFailed('FAILED: Treat... label text is not present on the screen.')
					}	
				}else {
					KeywordUtil.markFailed('FAILED: Be Kind... label text is not present on the screen.')
				}
			}else {
				KeywordUtil.markFailed('FAILED: Heart Icon... is not present on the screen.')
			}
		}else {
			KeywordUtil.markFailed('FAILED: Please... label text is not present on the screen.')
		}
	}else {
		KeywordUtil.markFailed('FAILED: Welcome... label text is not present on the screen.')
	}
}else {
	KeywordUtil.markFailed('FAILED: SpotLove logo is not present on the screen.')
}