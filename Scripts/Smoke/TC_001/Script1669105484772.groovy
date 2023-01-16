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

//boolean check_image = false

TestObject check_image = findTestObject('Object Repository/Smoke/Verify Login Sign Up/Intro screen image')

//if(check_image == true) {

if(Mobile.waitForElementPresent(check_image, 10)) {

	Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Sign IN UP/Screen1_Intro Screens'),
			null, FailureHandling.STOP_ON_FAILURE)
	KeywordUtil.markPassed("Screen1_Intro Passed Successfully")

	if(Mobile.waitForElementPresent(btn_Continue_WPN, 10,FailureHandling.STOP_ON_FAILURE)) {

		Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Sign IN UP/Screen2_Welcome Screen'),
				null, FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Sign IN UP/Screen3_Phone Number (Enter number)'),
				['CName':CName,'PNumber':PNumber], FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Sign IN UP/Screen4_OTP'),
				null, FailureHandling.STOP_ON_FAILURE)

		KeywordUtil.markPassed("OTP Verified......!")

	}else if(Mobile.waitForElementPresent(Agree, 10,FailureHandling.STOP_ON_FAILURE )) {

		KeywordUtil.markPassed("Please Create Your SpotLove Account......!")

	}else{
		Mobile.callTestCase(findTestCase('Test Cases/Smoke/TC_003 Home'),
				null, FailureHandling.STOP_ON_FAILURE)
		KeywordUtil.markPassed("User Successfully Logged into the App.....!")
	}

}else{
	if(Mobile.waitForElementPresent(btn_Continue_WPN, 10,FailureHandling.STOP_ON_FAILURE)) {

		Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Sign IN UP/Screen2_Welcome Screen'),
				null, FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Sign IN UP/Screen3_Phone Number (Enter number)'),
				['CName':CName,'PNumber':PNumber], FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Sign IN UP/Screen4_OTP'),
				null, FailureHandling.STOP_ON_FAILURE)

		KeywordUtil.markPassed("OTP Verified......!")

	}else if(Mobile.waitForElementPresent(Agree, 10, FailureHandling.STOP_ON_FAILURE)) {

		KeywordUtil.markPassed("Please Create Your SpotLove Account..(Else)....!")

	}else{
		Mobile.callTestCase(findTestCase('Test Cases/Smoke/TC_003 Home'),
				null, FailureHandling.STOP_ON_FAILURE)
		KeywordUtil.markPassed("User Successfully Logged into the App.....!")
	}


}















