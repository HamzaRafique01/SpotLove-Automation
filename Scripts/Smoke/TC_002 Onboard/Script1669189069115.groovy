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

//Mobile.startExistingApplication("com.spotlove.releaseproduction" , FailureHandling.STOP_ON_FAILURE)


Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUp For Onboard/Tap on I agree button'),
	null, FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUp For Onboard/Tap continue btn on source screen'),
	null, FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUp For Onboard/Enter First Name and continue'),
	['FName':FName], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUp For Onboard/Tap Continue button on birth screen'),
	null, FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUp For Onboard/Tap Continue on Gender Screen'),
	['Gender':Gender], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUp For Onboard/Tap continue on Into Screen'),
	['Into':Into], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUp For Onboard/Tap to continue btn n Height screen'),
	null, FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUp For Onboard/Tap to Continue on Ethnicity Screen'),
	['Ethnicity':Ethnicity], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUp For Onboard/Tap to continue on Religion Screen'),
	['Religion':Religion], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUp For Onboard/Tap to continue on Relationship Screen'),
	['Relationship':Relationship], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUp For Onboard/Tap to Continue on Family Plan'),
	['Children':Children,'Plan':Plan], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUp For Onboard/Tap to Continue on Education Screen'),
	['Education':Education], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUp For Onboard/Tap to continue on Vices Screen'),
	['Smoking':Smoking,'Marijuana':Marijuana,'Alcohol':Alcohol], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUp For Onboard/Tap to continue on Politics Screen'),
	['Political':Political], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUp For Onboard/Upload Profile Picture And tap Continue'),
	null, FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUp For Onboard/Tap to Continue on One-liner Screen'),
	['One_liner':One_liner], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUp For Onboard/Tap to Enable Location on location screen'),
	null, FailureHandling.STOP_ON_FAILURE)






