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

	if(Mobile.waitForElementPresent(Edu_hut_Icon, 30)) {

		KeywordUtil.markPassed('PASSED: Hat Icon present on the screen')

		if(Mobile.waitForElementPresent(Whats, 30)) {

			KeywordUtil.markPassed('PASSED: Whats your... label text present on the screen')

			CustomKeywords.'com.spotlove.Utility.random_value'(Education)

			if(Mobile.waitForElementPresent(Continue, 30)) {

				Mobile.tap(Continue, 30)
				KeywordUtil.markPassed('PASSED: Continue button present on the screen')

			}else {
				KeywordUtil.markFailed('FAILED: Continue button is not present on the screen')
			}
		}else {
			KeywordUtil.markFailed('FAILED: Whats your... label text is not present on the screen')
		}
	}else {
		KeywordUtil.markFailed('FAILED: Hat Icon is not present on the screen')
	}
}else {
	KeywordUtil.markFailed('FAILED: Back button is not present on the screen')
}

