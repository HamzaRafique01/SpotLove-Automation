import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil


if(Mobile.waitForElementPresent(input_UserName, 10)) {
	
//	Mobile.tap(input_UserName, 5)
	KeywordUtil.markPassed("User Name field tapped Successfully......!")
	
	Mobile.sendKeys(input_UserName, FName)
	KeywordUtil.markPassed("User Name Entered Successfully......!")
	
	Mobile.tap(btn_Continue, 5)
	
	KeywordUtil.markPassed("User Navigate to the Birth Screen......!")
}else {
	
	KeywordUtil.markFailed("Please Enter User Name First and tap again Continue......!")
}




