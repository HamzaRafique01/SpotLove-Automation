import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
if(Mobile.waitForElementPresent(btn_Continue, 10)) {

	Mobile.tap(btn_Continue, 5)

	KeywordUtil.markPassed("Passed! User Navigate to POPUP Sheet to confirm birth date......!")

	if(Mobile.waitForElementPresent(btn_edit, 10)) {

		Mobile.tap(btn_edit, 5)

		KeywordUtil.markPassed("Passed! User Navigate birth date......!")

		Mobile.tap(btn_Continue, 5)

		KeywordUtil.markPassed("Passed! User Navigate to POPUP Sheet to confirm birth date......!")

		if(Mobile.waitForElementPresent(btn_Confirm_birth, 10)) {

			Mobile.tap(btn_Confirm_birth, 5)

			KeywordUtil.markPassed("Passed! User Navigate First Name Screen......!")

		}else {
			KeywordUtil.markFailed("Failed To Navigate First Name Screen......!")
		}
	}else {
		KeywordUtil.markFailed("Failed To Navigate birth date......!")
	}
}else {
	KeywordUtil.markFailed("Failed To Navigate POPUP (Edit or Confirm POPUP)......!")
}




