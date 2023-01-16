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



if(Mobile.waitForElementPresent(btn_Enable_Location, 10)) {

	Mobile.tap(btn_Enable_Location, 5)

	KeywordUtil.markPassed("Passed! User Navigate Permission POPUP......!")

	if(Mobile.waitForElementPresent(Only_this_time, 10)) {

		Mobile.tap(Only_this_time, 5)

		KeywordUtil.markPassed("Passed! User Navigate Location Screen......!")

		if(Mobile.waitForElementPresent(btn_submit, 10)) {

			Mobile.tap(btn_submit, 5)

			KeywordUtil.markPassed("Passed! User Navigate Sit tight Screen......!")

			if(Mobile.waitForElementPresent(lb_txt, 10)) {

				Mobile.tap(lb_txt, 5)
				Mobile.delay(15)

				KeywordUtil.markPassed("Passed! Label Text Present on Sit Tight Screen......!")

			}else {
				KeywordUtil.markFailed("Failed To Label Text Present on Sit Tight Screen......!")
			}

		}else {
			KeywordUtil.markFailed("Failed To Navigate Sit tight Screen......!")
		}

	}else {
		KeywordUtil.markFailed("Failed To Navigate Location Screen......!")
	}

}else {
	KeywordUtil.markFailed("Failed To Navigate Permission POPUP......!")
}












