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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver

try {
if(Mobile.waitForElementPresent(Logo , 30)) {
	
	KeywordUtil.markPassed('PASSED: Spot Love is present on the screen.')
	
	if(Mobile.waitForElementPresent(Site , 30)) {
		
		KeywordUtil.markPassed('PASSED: Site Tight label is present on the screen.')
		
		if(Mobile.waitForElementPresent(Were , 30)) {
			
			KeywordUtil.markPassed('PASSED: We re.... label text is present on the screen.')
			
			if(Mobile.waitForElementPresent(Background , 30)) {
				
				KeywordUtil.markPassed('PASSED: Background image is present on the screen.')
			}else {
				KeywordUtil.markFailed('FAILED: Background image is not present on the screen.')
			}
		}else {
			KeywordUtil.markFailed('FAILED: We re.... label text is not present on the screen.')
		}
	}else {
		KeywordUtil.markFailed('FAILED: Site Tight label is not present on the screen.')
	}
}else {
	KeywordUtil.markFailed('FAILED: Spot Love is not present on the screen.')
}
}catch(Exception e) {
	e.printStackTrace()
}finally {
	AppiumDriver<?> driver = MobileDriverFactory.getDriver()
	//MobileDriver driver = MobileDriverFactory.getDriver()
	driver.resetApp()
}