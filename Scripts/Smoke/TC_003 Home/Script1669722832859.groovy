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

Mobile.startExistingApplication("com.spotlove.releaseproduction" , FailureHandling.STOP_ON_FAILURE)


Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Home/Home Flow'),
		null, FailureHandling.STOP_ON_FAILURE)

KeywordUtil.markPassed("Passed! Home Flow is verified Successfully.....!")

Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Home/Dating Prefereneces'),
	['Gender':Gender,'Ethnicity':Ethnicity,'Religion':Religion,'RelationshipStatus':RelationshipStatus,'Children':Children,'Education':Education,'Vices':Vices,'PoliticalViews':PoliticalViews,'E_Gender':E_Gender,'E_oneliner':E_oneliner,'E_Ethnicity':E_Ethnicity,'E_Religion':E_Religion,'E_Relationship_Status':E_Relationship_Status,'E_Children':E_Children,'E_Education':E_Education,'E_Political_Views':E_Political_Views], FailureHandling.STOP_ON_FAILURE)

KeywordUtil.markPassed("Passed! Dating Prefereneces Tab Successfully Verified.....")

Mobile.delay(10)

Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Home/Explore Tab'),
	null, FailureHandling.STOP_ON_FAILURE)

KeywordUtil.markPassed("Passed! Explore Tab is verified Successfully.....!")

Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Home/Profile Tab'),
		['Gender':Gender,'Ethnicity':Ethnicity,'Religion':Religion,'RelationshipStatus':RelationshipStatus,'Children':Children,'Education':Education,'Vices':Vices,'PoliticalViews':PoliticalViews,'E_Gender':E_Gender,'E_oneliner':E_oneliner,'E_Ethnicity':E_Ethnicity,'E_Religion':E_Religion,'E_Relationship_Status':E_Relationship_Status,'E_Children':E_Children,'E_Education':E_Education,'E_Political_Views':E_Political_Views], FailureHandling.STOP_ON_FAILURE)

KeywordUtil.markPassed("Passed! Profile Tab is verified Successfully.....!")


