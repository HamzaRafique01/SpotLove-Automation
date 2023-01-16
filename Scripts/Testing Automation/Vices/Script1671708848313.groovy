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

	if(Mobile.waitForElementPresent(Bottle_Icon, 30)) {

		KeywordUtil.markPassed('PASSED: Bottle Icon present on the screen')

		if(Mobile.waitForElementPresent(Smoking_Switch, 30)) {

			Mobile.tap(Smoking_Switch, 30)
			KeywordUtil.markPassed('PASSED: Smoking Switch Button present on the screen')

			if(Mobile.waitForElementPresent(Alcohol_Switch, 30)) {

				Mobile.tap(Alcohol_Switch, 30)
				KeywordUtil.markPassed('PASSED: Alcohol Switch Button present on the screen')

				if(Mobile.waitForElementPresent(Marijuana_Switch, 30)) {

					Mobile.tap(Marijuana_Switch, 30)
					KeywordUtil.markPassed('PASSED: Marijuana Switch Button present on the screen')

					CustomKeywords.'com.spotlove.Utility.random_value'(Smoking)
					CustomKeywords.'com.spotlove.Utility.random_value'(Marijuana)
					CustomKeywords.'com.spotlove.Utility.random_value'(Alcohol)

					if(Mobile.waitForElementPresent(Cntinue, 30)) {

						Mobile.tap(Cntinue, 30)
						KeywordUtil.markPassed('PASSED: Continue Button present on the screen')

					}else {
						KeywordUtil.markFailed('FAILED: Continue Button is not present on the screen')
					}

				}else {
					KeywordUtil.markFailed('FAILED: Marijuana Switch Button is not present on the screen')
				}
			}else {
				KeywordUtil.markFailed('FAILED: Alcohol Switch Button is not present on the screen')
			}
		}else {
			KeywordUtil.markFailed('FAILED: Smoking Switch Button is not present on the screen')
		}
	}else {
		KeywordUtil.markFailed('FAILED: Bottle Icon is not present on the screen')
	}
}else {
	KeywordUtil.markFailed('FAILED: Back button is not present on the screen')
}
