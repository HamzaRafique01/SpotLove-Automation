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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver

//Mobile.startExistingApplication(GlobalVariable.packageID , FailureHandling.STOP_ON_FAILURE)

if (Mobile.waitForElementPresent(hearticon, 30)) {
    KeywordUtil.markPassed('PASSED: App is launched successfully')

    if (Mobile.waitForElementPresent(Access, 30)) {
        KeywordUtil.markPassed('PASSED: Access label text is present on the screen')

        if (Mobile.waitForElementPresent(Matchmakers, 30)) {
            KeywordUtil.markPassed('PASSED: Matchmakers label text is present on the screen')

            if (Mobile.waitForElementPresent(Berief_Labeltext, 30)) {
                KeywordUtil.markPassed('PASSED: We have.... label text is present on the screen')

                if (Mobile.waitForElementPresent(background, 30)) {
                    KeywordUtil.markPassed('PASSED: background Image is present on the screen')

                    if (Mobile.waitForElementPresent(continuebutton, 30)) {
                        Mobile.tap(continuebutton, 30)

                        KeywordUtil.markPassed('Passed: continue button Element is present')
                    } else {
                        KeywordUtil.markFailed('FAILED: continue button is not present on the screen')
                    }
                } else {
                    KeywordUtil.markFailed('FAILED: background Image is not present on the screen')
                }
            } else {
                KeywordUtil.markFailed('FAILED: We have.... label text is not present on the screen')
            }
        } else {
            KeywordUtil.markFailed('FAILED: Matchmakers label text is not present on the screen')
        }
    } else {
        KeywordUtil.markFailed('FAILED: Access label text is not present on the screen')
    }
} else {
    KeywordUtil.markFailed('FAILED: App launch failed')
}

