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


Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Home/LookUps For Edit Profile/Gender'),
	['E_Gender':E_Gender], FailureHandling.STOP_ON_FAILURE)

KeywordUtil.markPassed("Passed! Gender Selection Successfully.....")


Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Home/LookUps For Edit Profile/Oneliner'),
	['E_oneliner':E_oneliner], FailureHandling.STOP_ON_FAILURE)

KeywordUtil.markPassed("Passed! Oneliner entered Successfully.....")

Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Home/LookUps For Edit Profile/Ethnicity'),
	['E_Ethnicity':E_Ethnicity], FailureHandling.STOP_ON_FAILURE)

KeywordUtil.markPassed("Passed! Ethnicity Selection Successfully.....")


Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Home/LookUps For Edit Profile/Religion'),
	['E_Religion':E_Religion], FailureHandling.STOP_ON_FAILURE)

KeywordUtil.markPassed("Passed! Religion Selection Successfully.....")


Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Home/LookUps For Edit Profile/Relationship_Status'),
	['E_Relationship_Status':E_Relationship_Status], FailureHandling.STOP_ON_FAILURE)

KeywordUtil.markPassed("Passed! Religion Selection Successfully.....")

Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Home/LookUps For Edit Profile/Children'),
	['E_Children':E_Children], FailureHandling.STOP_ON_FAILURE)

KeywordUtil.markPassed("Passed! Children Selection Successfully.....")

Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Home/LookUps For Edit Profile/Education'),
	['E_Education':E_Education], FailureHandling.STOP_ON_FAILURE)

KeywordUtil.markPassed("Passed! Education Selection Successfully.....")

Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Home/LookUps For Edit Profile/Political Views'),
	['E_Political_Views':E_Political_Views], FailureHandling.STOP_ON_FAILURE)

KeywordUtil.markPassed("Passed! Education Selection Successfully.....")









