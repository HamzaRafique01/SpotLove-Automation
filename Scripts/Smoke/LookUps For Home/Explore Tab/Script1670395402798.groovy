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


if(Mobile.waitForElementPresent(btn_dislike, 10)) {

	Mobile.tap(btn_dislike, 10)
	KeywordUtil.markPassed("Passed! Successfully tapped on the Dislike button ")

	if(Mobile.waitForElementPresent(btn_like, 10)) {

		Mobile.tap(btn_like, 10)
		KeywordUtil.markPassed("Passed! Successfully tapped on the Liked You button ")

		if(Mobile.waitForElementPresent(btn_Tripledots, 10)) {

			Mobile.tap(btn_Tripledots, 10)
			KeywordUtil.markPassed("Passed! Successfully tapped on the Tripledots button ")

			if(Mobile.waitForElementPresent(btn_block, 10)) {

				Mobile.tap(btn_block, 10)
				KeywordUtil.markPassed("Passed! Successfully tapped on the block user button ")

				if(Mobile.waitForElementPresent(btn_Tripledots, 10)) {

					Mobile.tap(btn_Tripledots, 10)
					KeywordUtil.markPassed("Passed! Successfully tapped on the Tripledots button ")

					if(Mobile.waitForElementPresent(btn_report, 10)) {

						Mobile.tap(btn_report, 10)
						KeywordUtil.markPassed("Passed! Successfully tapped on the Report button ")

						if(Mobile.waitForElementPresent(txt_reporting, 10)) {

							Mobile.sendKeys(txt_reporting, report_string)
							
							Mobile.tap(btn_submit, 10)
							
							KeywordUtil.markPassed("Passed! Successfully Reporting Reason enter Successfully ")



						}else {
							KeywordUtil.markFailed("Failed! Report user text area not found...")
						}
					}else {
						KeywordUtil.markFailed("Failed! Report user element not found...")
					}
				}else {
					KeywordUtil.markFailed("Failed! Tripledots element not found...")
				}
			}else {
				KeywordUtil.markFailed("Failed! block user element not found...")
			}
		}else {
			KeywordUtil.markFailed("Failed! Tripledots element not found...")
		}
	}else {
		KeywordUtil.markFailed("Failed! Liked You element not found...")
	}
}else {
	KeywordUtil.markFailed("Failed! Disliked element not found...")
}





