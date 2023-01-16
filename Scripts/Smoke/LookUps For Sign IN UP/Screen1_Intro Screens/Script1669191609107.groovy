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



if (Mobile.waitForElementPresent(btn_Continue1, 10)) {

	Mobile.tap(btn_Continue1, 5)

	print('First Intro Screen Verified Successfully.......')

}else {

	print('First Intro Screen failed to Verify.......')
}


if(Mobile.waitForElementPresent(btn_Continue2, 10)) {

	Mobile.tap(btn_Continue2, 5)

	print('Second Intro Screen Verified Successfully.......')

}else {

	print('Second Intro Screen failed to Verify.......')
}


if(Mobile.waitForElementPresent(btn_Continue3, 10)) {


	Mobile.tap(btn_Continue3, 5)

	print('Third Intro Screen Verified Successfully.......')

}else {

	print('Third Intro Screen failed to Verify.......')
}



//Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)