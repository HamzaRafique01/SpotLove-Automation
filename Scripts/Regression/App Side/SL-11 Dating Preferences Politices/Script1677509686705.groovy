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
import com.spotlove.Utility as Utility

//int a,b
//Mobile.startExistingApplication('com.spotlove.releaseproduction', FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.spotlove.Utility.swipe_down'()

try {
    if (Mobile.waitForElementPresent(Politics_icon, 120)) {
        KeywordUtil.markPassed('Politics icon found.......!')

        if (Mobile.waitForElementPresent(Politics_userdata, 120)) {
            KeywordUtil.markPassed('Politics User data Label text found.......!')

            if (Mobile.waitForElementPresent(for_icon, 120)) {
                KeywordUtil.markPassed('Politics Forword icon found.......!')

                if (Mobile.waitForElementPresent(lbl_Politics, 120)) {
                    Mobile.tap(lbl_Politics, 120)

                    KeywordUtil.markPassed('Politics Selection PopUp opened.......!')

                    if (Mobile.waitForElementPresent(close_popup, 120)) {
                        Mobile.tap(close_popup, 120)

                        KeywordUtil.markPassed('Politics PopUp closed.......!')

                        CustomKeywords.'com.spotlove.Utility.swipe_down'()

                        Mobile.delay(15)

                        if (Mobile.waitForElementPresent(lbl_Politics, 80)) {
                            Mobile.tap(lbl_Politics, 120)

                            KeywordUtil.markPassed('Politics Selection PopUp opened.......!')

                            if (Mobile.waitForElementPresent(Politics_popup, 120)) {
                                KeywordUtil.markPassed('Header Politics on PopUp Found.......!')

                                if (Mobile.waitForElementPresent(lbl_what, 120)) {
                                    KeywordUtil.markPassed('What are you open to? on PopUp Found.......!')

                                    CustomKeywords.'com.spotlove.Utility.dating_Pref'(Politics)

                                    if (Mobile.waitForElementPresent(btn_save, 120)) {
                                        Mobile.tap(btn_save, 120)

                                        KeywordUtil.markPassed('Politics PopUp Closed Found.......!')

                                        if (Mobile.waitForElementPresent(Preferences_updated, 120)) {
                                            KeywordUtil.markPassed('Politics preferences Updated Successfully.......!')

                                            Mobile.delay(5)
                                        } else {
                                            KeywordUtil.markFailed('Politics preferences Updating Error.......!')
                                        }
                                    } else {
                                        KeywordUtil.markFailed('Save Button not Found.......!')
                                    }
                                } else {
                                    KeywordUtil.markFailed('What are you open to? not Found.......!')
                                }
                            } else {
                                KeywordUtil.markFailed('Header Politics on PopUp not Found.......!')
                            }
                        } else {
                            KeywordUtil.markFailed('Politics Popup not opened on the screen.......!')
                        }
                    } else {
                        KeywordUtil.markFailed('Close button not Found.......!')
                    }
                } else {
                    KeywordUtil.markFailed('Politics Popup not opened on the screen.......!')
                }
            } else {
                KeywordUtil.markFailed('Politics Forword icon Label text not Found.......!')
            }
        } else {
            KeywordUtil.markFailed('Politics User data Label text not Found.......!')
        }
    } else {
        KeywordUtil.markFailed('Politics icon not Found.......!')
    }
}
catch (Exception e) {
    e.printStackTrace()
} 
finally { 
    Mobile.delay(5)
}

