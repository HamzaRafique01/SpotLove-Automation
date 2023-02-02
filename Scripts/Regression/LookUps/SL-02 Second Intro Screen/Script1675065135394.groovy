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


if(Mobile.waitForElementPresent(btn_back, 10)) {
	
	Mobile.waitForElementPresent(logo, 10)
	
	KeywordUtil.markPassed("Back button Found......!")
	KeywordUtil.markPassed("Spot Love Logo Found......!")
	
	if(Mobile.waitForElementPresent(F_lbl_text, 10)) {
		
		KeywordUtil.markPassed("Make a Match Lbl text Found......!")
		
		if(Mobile.waitForElementPresent(S_lbl_text, 10)) {
			
			KeywordUtil.markPassed("Your Soulmate Lbl text Found......!")
			
			if(Mobile.waitForElementPresent(T_lbl_text, 10)) {
				
				KeywordUtil.markPassed("It's a match Lbl text Found......!")
				
				if(Mobile.waitForElementPresent(Centr_image, 10)) {
					
					KeywordUtil.markPassed("Center Image Found......!")
					
					if(Mobile.waitForElementPresent(btn_continue, 10)) {
						
						Mobile.tap(btn_continue, 10)
						KeywordUtil.markPassed("User Navigate to the Third Screen......!")
						
					
					}else {
						KeywordUtil.markFailed("Somethong missing Please check......!")
					}
				}else {
					KeywordUtil.markFailed("Center Image Not Found......!")
				}
			}else {
				KeywordUtil.markFailed("It's a match Lbl text Not Found......!")
			}
		}else {
			KeywordUtil.markFailed("Your Soulmate Lbl text Not Found......!")
		}
	}else {
		KeywordUtil.markFailed("Make a Match Lbl text Not Found......!")
	}
}else {
		KeywordUtil.markFailed("Back button Not Found......!")
	KeywordUtil.markFailed("Spot Love Logo Not Found......!")
}
