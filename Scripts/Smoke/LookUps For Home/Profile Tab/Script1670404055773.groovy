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


if(Mobile.waitForElementPresent(Profile, 10)) {

	Mobile.tap(Profile, 10)

	KeywordUtil.markPassed("Passed! User navigate to the Profile Tab.....")

	if(Mobile.waitForElementPresent(btn_editprofile, 10)) {

		Mobile.tap(btn_editprofile, 10)

		KeywordUtil.markPassed("Passed! User navigate to the Edit Profile Tab.....")

		if(Mobile.waitForElementPresent(btn_back_editprofile, 10)) {

			Mobile.tap(btn_back_editprofile, 10)

			KeywordUtil.markPassed("Passed! User navigate to the Profile Tab.....")

			if(Mobile.waitForElementPresent(btn_preferences, 10)) {

				Mobile.tap(btn_preferences, 10)

				KeywordUtil.markPassed("Passed! User navigate to the preferences Tab.....")

				if(Mobile.waitForElementPresent(btn_back_pref, 10)) {

					Mobile.tap(btn_back_pref, 10)

					KeywordUtil.markPassed("Passed! User navigate to the Profile Tab.....")

					if(Mobile.waitForElementPresent(btn_settings, 10)) {

						Mobile.tap(btn_settings, 10)

						Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Home/Profile Settings'),
								null, FailureHandling.STOP_ON_FAILURE)

						KeywordUtil.markPassed("Passed! Settings Tab Successfully Verified.....")


						Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Home/Dating Prefereneces'),
								['Gender':Gender,'Ethnicity':Ethnicity,'Religion':Religion,'RelationshipStatus':RelationshipStatus,'Children':Children,'Education':Education,'Vices':Vices,'PoliticalViews':PoliticalViews], FailureHandling.STOP_ON_FAILURE)

						KeywordUtil.markPassed("Passed! Dating Prefereneces Tab Successfully Verified.....")

						Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Home/Edit Profile'),
								['E_Gender':E_Gender,'E_oneliner':E_oneliner,'E_Ethnicity':E_Ethnicity,'E_Religion':E_Religion,'E_Relationship_Status':E_Relationship_Status,'E_Children':E_Children,'E_Education':E_Education,'E_Political_Views':E_Political_Views], FailureHandling.STOP_ON_FAILURE)

						KeywordUtil.markPassed("Passed! Edit Profile Tab Successfully Verified.....")

					}else {
						KeywordUtil.markFailed("Failed! to Verify Settings Tab.....")
					}
				}else {
					KeywordUtil.markFailed("Failed! to navigate on the Profile Tab.....")
				}
			}else {
				KeywordUtil.markFailed("Failed! to navigate on the preferences Tab.....")
			}
		}else {
			KeywordUtil.markFailed("Failed! to navigate on the Profile Tab.....")
		}
	}else {
		KeywordUtil.markFailed("Failed! to navigate on the Edit Profile Tab.....")
	}
}else {
	KeywordUtil.markFailed("Failed! to navigate on the Profile Tab.....")
}