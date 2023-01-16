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

if(Mobile.waitForElementPresent(btn_preferences_home, 10)) {
	
	// Navigate to Dating Preferences through Home Tabs
	
	Mobile.tap(btn_preferences_home,10)
	KeywordUtil.markPassed("Passed! User navigate to the Dating Preferences Tab.....")
	
	Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Home/LookUps for Dating Prefereneces/Gender selection'),
		['Gender':Gender], FailureHandling.STOP_ON_FAILURE)
	KeywordUtil.markPassed("Passed! Gender Selection Successfully.....")
	
	Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Home/LookUps for Dating Prefereneces/Ethnicity Selection'),
		['Ethnicity':Ethnicity], FailureHandling.STOP_ON_FAILURE)
	KeywordUtil.markPassed("Passed! Ethnicity Selection Successfully.....")
	
	Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Home/LookUps for Dating Prefereneces/Religion Selection'),
		['Religion':Religion], FailureHandling.STOP_ON_FAILURE)
	KeywordUtil.markPassed("Passed! Religion Selection Successfully.....")
	
	Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Home/LookUps for Dating Prefereneces/Relationship Status Selection'),
		['RelationshipStatus':RelationshipStatus], FailureHandling.STOP_ON_FAILURE)
	KeywordUtil.markPassed("Passed! Relationship Status Selection Successfully.....")
	
	Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Home/LookUps for Dating Prefereneces/Children Selection'),
		['Children':Children], FailureHandling.STOP_ON_FAILURE)
	KeywordUtil.markPassed("Passed! Children Selection Successfully.....")
	
	Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Home/LookUps for Dating Prefereneces/Education Selection'),
		['Education':Education], FailureHandling.STOP_ON_FAILURE)
	KeywordUtil.markPassed("Passed! Education Selection Successfully.....")
	
	Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Home/LookUps for Dating Prefereneces/Vices Selection'),
		['Vices':Vices], FailureHandling.STOP_ON_FAILURE)
	KeywordUtil.markPassed("Passed! Vices Selection Successfully.....")
	
	Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Home/LookUps for Dating Prefereneces/Political Views Selection'),
		['PoliticalViews':PoliticalViews], FailureHandling.STOP_ON_FAILURE)
	KeywordUtil.markPassed("Passed! Political Views Selection Successfully.....")
	
	Mobile.tap(btn_back, 10)
	
	
}else if(Mobile.waitForElementPresent(Profile, 10)) {
	
	// Navigate to Dating Preferences through Profile Tab   btn_Dating_pref
	
	Mobile.tap(Profile, 10)
	KeywordUtil.markPassed("Passed! User navigate to the Profile Tab.....")
	
	Mobile.tap(btn_Dating_pref,10)
	KeywordUtil.markPassed("Passed! User navigate to the Dating Preferences Tab.....")
	
	Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Home/LookUps for Dating Prefereneces/Gender selection'),
		['Gender':Gender], FailureHandling.STOP_ON_FAILURE)
	KeywordUtil.markPassed("Passed! Gender Selection Successfully.....")
	
	Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Home/LookUps for Dating Prefereneces/Ethnicity Selection'),
		['Ethnicity':Ethnicity], FailureHandling.STOP_ON_FAILURE)
	KeywordUtil.markPassed("Passed! Ethnicity Selection Successfully.....")
	
	Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Home/LookUps for Dating Prefereneces/Religion Selection'),
		['Religion':Religion], FailureHandling.STOP_ON_FAILURE)
	KeywordUtil.markPassed("Passed! Religion Selection Successfully.....")
	
	Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Home/LookUps for Dating Prefereneces/Relationship Status Selection'),
		['RelationshipStatus':RelationshipStatus], FailureHandling.STOP_ON_FAILURE)
	KeywordUtil.markPassed("Passed! Relationship Status Selection Successfully.....")
	
	Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Home/LookUps for Dating Prefereneces/Children Selection'),
		['Children':Children], FailureHandling.STOP_ON_FAILURE)
	KeywordUtil.markPassed("Passed! Children Selection Successfully.....")
	
	Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Home/LookUps for Dating Prefereneces/Education Selection'),
		['Education':Education], FailureHandling.STOP_ON_FAILURE)
	KeywordUtil.markPassed("Passed! Education Selection Successfully.....")
	
	Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Home/LookUps for Dating Prefereneces/Vices Selection'),
		['Vices':Vices], FailureHandling.STOP_ON_FAILURE)
	KeywordUtil.markPassed("Passed! Vices Selection Successfully.....")
	
	Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Home/LookUps for Dating Prefereneces/Political Views Selection'),
		['PoliticalViews':PoliticalViews], FailureHandling.STOP_ON_FAILURE)
	KeywordUtil.markPassed("Passed! Political Views Selection Successfully.....")
	
	Mobile.tap(btn_back, 10)
	
	Mobile.tap(Home, 10)
	
}else {
	
	KeywordUtil.markFailed("Failed! to navigate to the Dating Preferences.....")
}












