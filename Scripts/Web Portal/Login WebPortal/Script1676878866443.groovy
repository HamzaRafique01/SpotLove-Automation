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
import com.spotlove.Utility

WebUI.openBrowser('https://spotlove-production.web.app/', FailureHandling.STOP_ON_FAILURE)
WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

if(WebUI.waitForElementPresent(User_Name, 10)) {
	
	WebUI.setText(User_Name, "umair2@gmail.com")
	
	WebUI.setText(Password, "test123")
	
	WebUI.delay(5)
	
	WebUI.click(Login)
	
	WebUI.delay(5)
	
	WebUI.click(admin)
	
	WebUI.refresh()
	
	WebUI.click(search)
	
	WebUI.delay(3)
	
	WebUI.setText(Name, "+16505559876")
	
	WebUI.click(select_user)
	
	WebUI.click(Waitlist)
	
	WebUI.delay(5)
	
	
}



