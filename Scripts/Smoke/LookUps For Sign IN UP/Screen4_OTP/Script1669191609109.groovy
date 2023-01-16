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

Mobile.tap(findTestObject('Object Repository/Smoke/OTP/android.widget.EditText - -'), 15)

Mobile.setText(findTestObject('Object Repository/Smoke/OTP/android.widget.EditText - - (1)'), '1', 2)

Mobile.setText(findTestObject('Object Repository/Smoke/OTP/android.widget.EditText - - (2)'), '2', 2)

Mobile.setText(findTestObject('Object Repository/Smoke/OTP/android.widget.EditText - - (3)'), '3', 2)

Mobile.setText(findTestObject('Object Repository/Smoke/OTP/android.widget.EditText - - (4)'), '4', 2)

Mobile.setText(findTestObject('Object Repository/Smoke/OTP/android.widget.EditText - - (5)'), '5', 2)

Mobile.setText(findTestObject('Object Repository/Smoke/OTP/android.widget.EditText - - (6)'), '6', 2)

//Mobile.closeApplication()

Mobile.callTestCase(findTestCase('Test Cases/Smoke/LookUps For Sign IN UP/Screen4/Tap to verify OTP'),
	null, FailureHandling.STOP_ON_FAILURE)


