import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil



if(Mobile.waitForElementPresent(btn_Continue_WPN, 30)) {
	Mobile.delay(5)
	
	Mobile.tap(btn_Continue_WPN, 15)
	
	KeywordUtil.markPassed("Phone number selected......")
	
}else {
	
	KeywordUtil.markPassed("No Method Selected for Log-in")
}
