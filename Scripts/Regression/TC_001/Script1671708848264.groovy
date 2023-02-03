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

TestObject image = findTestObject("Object Repository/Regression/SC-001 Intro 1/Middle Screen Pic")

if(Mobile.waitForElementPresent(image, 20)) {

	Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-01 First Intro Screen'),
			null, FailureHandling.STOP_ON_FAILURE)

	Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-02 Second Intro Screen'),
			null, FailureHandling.STOP_ON_FAILURE)

	Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-03 Third Intro Screen'),
			null, FailureHandling.STOP_ON_FAILURE)

	KeywordUtil.markPassed("Intro Screens Passed Successfully")

	if(Mobile.waitForElementPresent(btn_continue, 10,FailureHandling.STOP_ON_FAILURE)) {

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-04 Sign In Selection'),
				null, FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-05 Phone Number Enter Screen'),
				null, FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-06 OTP Screen'),
				null, FailureHandling.STOP_ON_FAILURE)

		KeywordUtil.markPassed("User Authenticated......!")

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-07 Welcome To SpotLove'),
				null, FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-08 Source Screen'),
				null, FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-09 First Name'),
				null, FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-10 Birth date'),
				null, FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-11 Gender Screen'),
				null, FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-12 Sexual Orientation'),
				null, FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-13 Height Screen'),
				null, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-14 Ethnicity'),
			null, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-15 Religion'),
			null, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-16 Relationship Status'),
			null, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-17 Family Plan'),
			null, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-18 Education'),
			null, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/Sl-19 Vices'),
			null, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-20 Politics'),
			null, FailureHandling.STOP_ON_FAILURE)


	}else if(Mobile.waitForElementPresent(Agree, 10,FailureHandling.STOP_ON_FAILURE )) {

		KeywordUtil.markPassed("Please Create Your SpotLove Account......!")

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-07 Welcome To SpotLove'),
				null, FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-08 Source Screen'),
				null, FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-09 First Name'),
				null, FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-10 Birth date'),
				null, FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-11 Gender Screen'),
				null, FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-12 Sexual Orientation'),
				null, FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-13 Height Screen'),
				null, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-14 Ethnicity'),
			null, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-15 Religion'),
			null, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-16 Relationship Status'),
			null, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-17 Family Plan'),
			null, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-18 Education'),
			null, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/Sl-19 Vices'),
			null, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-20 Politics'),
			null, FailureHandling.STOP_ON_FAILURE)
	}

	//	}else{
	//		Mobile.callTestCase(findTestCase('Create test case For Home Screen'),
	//				null, FailureHandling.STOP_ON_FAILURE)
	//		KeywordUtil.markPassed("User Successfully Logged into the App.....!")
	//	}
}else {

	if(Mobile.waitForElementPresent(btn_continue, 10,FailureHandling.STOP_ON_FAILURE)) {

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-04 Sign In Selection'),
				null, FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-05 Phone Number Enter Screen'),
				null, FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-06 OTP Screen'),
				null, FailureHandling.STOP_ON_FAILURE)

		KeywordUtil.markPassed("User Authenticated......!")

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-07 Welcome To SpotLove'),
				null, FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-08 Source Screen'),
				null, FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-09 First Name'),
				null, FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-10 Birth date'),
				null, FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-11 Gender Screen'),
				null, FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-12 Sexual Orientation'),
				null, FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-13 Height Screen'),
				null, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-14 Ethnicity'),
			null, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-15 Religion'),
			null, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-16 Relationship Status'),
			null, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-17 Family Plan'),
			null, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-18 Education'),
			null, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/Sl-19 Vices'),
			null, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-20 Politics'),
			null, FailureHandling.STOP_ON_FAILURE)

	}else if(Mobile.waitForElementPresent(Agree, 10,FailureHandling.STOP_ON_FAILURE )) {

		KeywordUtil.markPassed("Please Create Your SpotLove Account......!")

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-07 Welcome To SpotLove'),
				null, FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-08 Source Screen'),
				null, FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-09 First Name'),
				null, FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-10 Birth date'),
				null, FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-11 Gender Screen'),
				null, FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-12 Sexual Orientation'),
				null, FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-13 Height Screen'),
				null, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-14 Ethnicity'),
			null, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-15 Religion'),
			null, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-16 Relationship Status'),
			null, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-17 Family Plan'),
			null, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-18 Education'),
			null, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/Sl-19 Vices'),
			null, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.callTestCase(findTestCase('Test Cases/Regression/LookUps/SL-20 Politics'),
			null, FailureHandling.STOP_ON_FAILURE)
	}

	//	}else{
	//		Mobile.callTestCase(findTestCase('Create test case For Home Screen'),
	//				null, FailureHandling.STOP_ON_FAILURE)
	//		KeywordUtil.markPassed("User Successfully Logged into the App.....!")
	//	}

}