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


if (Mobile.waitForElementPresent(logo, 30)) {
	KeywordUtil.markPassed('PASSED: SpotLove logo is present on the screen.')

	if (Mobile.waitForElementPresent(Enter, 30)) {
		KeywordUtil.markPassed('PASSED: Enter Your... label text is present on the screen.')

		//		if(Mobile.waitForElementPresent(We, 30)) {
		//
		//			KeywordUtil.markPassed('PASSED: We have... label text is present on the screen.')
		//        if (Mobile.waitForElementPresent(Index1, 30)) {
		//        //    Mobile.tap(Index1, 30)
		//
		//            Mobile.setText(Index1,one, 10)
		//
		//            KeywordUtil.markPassed('PASSED: Text Successfully Entered')
		//
		//            if (Mobile.waitForElementPresent(Index2, 30)) {
		//                Mobile.setText(Index2,two, 10)
		//
		//                KeywordUtil.markPassed('PASSED: Text Successfully Entered')
		//
		//                if (Mobile.waitForElementPresent(Index3, 30)) {
		//                    Mobile.setText(Index3,three, 10)
		//
		//                    KeywordUtil.markPassed('PASSED: Text Successfully Entered')
		//
		//                    if (Mobile.waitForElementPresent(Index4, 30)) {
		//                        Mobile.setText(Index4,four, 10)
		//
		//                        KeywordUtil.markPassed('PASSED: Text Successfully Entered')
		//
		//                        if (Mobile.waitForElementPresent(Index5, 30)) {
		//                            Mobile.setText(Index5,five, 10)
		//
		//                            KeywordUtil.markPassed('PASSED: Text Successfully Entered')
		//
		//                            if (Mobile.waitForElementPresent(Index6, 30)) {
		//                                Mobile.setText(Index6,six, 10)
		//
		//                                KeywordUtil.markPassed('PASSED: Text Successfully Entered')


		Mobile.setText(findTestObject('Object Repository/New Folder/android.widget.EditText - - (3)'), '1', 10)

		Mobile.setText(findTestObject('Object Repository/New Folder/android.widget.EditText - - (4)'), '2', 10)

		Mobile.setText(findTestObject('Object Repository/New Folder/android.widget.EditText - - (5)'), '3', 10)

		Mobile.setText(findTestObject('Object Repository/New Folder/android.widget.EditText - - (6)'), '4', 10)

		Mobile.setText(findTestObject('Object Repository/New Folder/android.widget.EditText - - (7)'), '5', 10)

		Mobile.setText(findTestObject('Object Repository/New Folder/android.widget.EditText - - (8)'), '6', 10)

		if (Mobile.waitForElementPresent(Verify, 30)) {
			KeywordUtil.markPassed('PASSED: Verify Button is present on the screen.')

			Mobile.delay(10)

			Mobile.tap(Verify, 30)

			KeywordUtil.markPassed('PASSED: Verify Button Pressed Successfully')
		} else {
			KeywordUtil.markFailed('FAILED: Verify Button is not present on the screen.')
		}
		//                            } else {
		//                                KeywordUtil.markFailed('FAILED: Text Couldnt enter in the Index6  ')
		//                            }
		//                        } else {
		//                            KeywordUtil.markFailed('FAILED: Text Couldnt enter in the Index5  ')
		//                        }
		//                    } else {
		//                        KeywordUtil.markFailed('FAILED: Text Couldnt enter in the Index4  ')
		//                    }
		//                } else {
		//                    KeywordUtil.markFailed('FAILED: Text Couldnt enter in the Index3  ')
		//                }
		//            } else {
		//                KeywordUtil.markFailed('FAILED: Text Couldnt enter in the Index2  ')
		//            }
		//        } //		}else {
		//        //			KeywordUtil.markFailed('FAILED: We have... label text is not present on the screen.')
		//        //		}
		//        else {
		//            KeywordUtil.markFailed('FAILED: Text Couldnt enter in the Index1  ')
		//        }
	} else {
		KeywordUtil.markFailed('FAILED: Enter Your... label text is not present on the screen.')
	}
} else {
	KeywordUtil.markFailed('FAILED: SpotLove logo is not present on the screen.')
}

