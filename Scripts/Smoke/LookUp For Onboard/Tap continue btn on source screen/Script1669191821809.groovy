import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

if(Mobile.waitForElementPresent(btn_Continue, 10)) {
	
	Mobile.tap(btn_Continue, 5)
	
	KeywordUtil.markPassed("User Successfully Navigate to the First Name Screen......!")
	
}else {
	
	KeywordUtil.markFailed("Failed To Navigate to the First Name Screen......!")
}