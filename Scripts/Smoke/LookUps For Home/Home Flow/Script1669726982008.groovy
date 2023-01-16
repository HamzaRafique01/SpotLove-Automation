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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.Keys as Keys

if(Mobile.waitForElementPresent(Navigation, 10)) {

	Mobile.waitForElementPresent(Tab_LikedYou, 10)
	Mobile.tap(Tab_LikedYou, 10)
	KeywordUtil.markPassed("Passed! User move to Liked you tab.....!")

	if(Mobile.waitForElementPresent(Tab_Profile, 10)) {

		Mobile.tap(Tab_Profile, 10)
		KeywordUtil.markPassed("Passed! User move to Profile tab.....!")

		if(Mobile.waitForElementPresent(Tab_Matches, 10)) {

			Mobile.tap(Tab_Matches, 10)
			KeywordUtil.markPassed("Passed! User move to Matches tab.....!")

			if(Mobile.waitForElementPresent(btn_Preferneces, 10)) {

				Mobile.tap(btn_Preferneces, 10)
				KeywordUtil.markPassed("Passed! User move to Preferneces tab.....!")

				if(Mobile.waitForElementPresent(btn_back, 10)) {

					Mobile.tap(btn_back, 10)
					KeywordUtil.markPassed("Passed! User move to Previous tab.....!")

					if(Mobile.waitForElementPresent(Tab_Explore, 10)) {

						Mobile.tap(Tab_Explore, 10)
						KeywordUtil.markPassed("Passed! User move to Explore tab.....!")


					}else {
						KeywordUtil.markPassed("Failed! to move to Explore tab......!")
					}
				}else {
					KeywordUtil.markPassed("Failed! to move to Previous tab......!")
				}
			}else {
				KeywordUtil.markPassed("Failed! to move to Preferneces tab......!")
			}
		}else {
			KeywordUtil.markPassed("Failed! to move to Matches tab......!")
		}
	}else {
		KeywordUtil.markPassed("Failed! to move to Profile tab......!")
	}
}else {
	KeywordUtil.markPassed("Failed! Navigation Bar not found......!")
	KeywordUtil.markPassed("Failed! to move to Liked you tab......!")
}
