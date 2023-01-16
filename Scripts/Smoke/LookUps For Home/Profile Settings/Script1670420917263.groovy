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


if(Mobile.waitForElementPresent(Push_notification, 10)) {

	Mobile.tap(Push_notification, 10)
	KeywordUtil.markPassed("Passed! notification Toggle button successfully Changed.....")

	if(Mobile.waitForElementPresent(Switch_App, 10)) {

		Mobile.tap(Switch_App, 10)
		KeywordUtil.markPassed("Passed! notification Toggle button successfully Changed.....")

		if(Mobile.waitForElementPresent(btn_back, 10)) {

			Mobile.tap(btn_back, 10)
			KeywordUtil.markPassed("Passed! notification Toggle button successfully Changed.....")

		}else {
			KeywordUtil.markFailed("Failed! to change the notification toggle.....")
		}
	}else {
		KeywordUtil.markFailed("Failed! to change the notification toggle.....")
	}
}else {

	KeywordUtil.markFailed("Failed! to change the notification toggle.....")

}
