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



if(Mobile.waitForElementPresent(btn_Photo_Placeholder_2, 10)) {

	Mobile.tap(btn_Photo_Placeholder_2, 5)

	KeywordUtil.markPassed("Passed! Second Placeholder tapped successfully......!")

	if(Mobile.waitForElementPresent(btn_Take_Photo, 10)) {

		Mobile.tap(btn_Take_Photo, 5)

		KeywordUtil.markPassed("Passed! Take Photo button tapped successfully......!")

		if(Mobile.waitForElementPresent(btn_Capture_Photo, 10)) {

			Mobile.tap(btn_Capture_Photo, 5)

			KeywordUtil.markPassed("Passed! Photo Captured successfully......!")

			if(Mobile.waitForElementPresent(btn_OK, 10)) {

				Mobile.tap(btn_OK, 5)

				KeywordUtil.markPassed("Passed! Okay button tapped successfully......!")
				Mobile.delay(10)

				if(Mobile.waitForElementPresent(btn_Done_Camera, 10)) {

					Mobile.tap(btn_Done_Camera, 5)
					
					KeywordUtil.markPassed("Passed! Done button tapped successfully......!")
					
					Mobile.delay(10)
					
				}else {
					KeywordUtil.markPassed("Failed to tapped on Done Button......!")
				}
			}else {
				KeywordUtil.markPassed("Failed to tap on Okay button......!")
			}
		}else {
			KeywordUtil.markPassed("Failed to Capture Photo ......!")
		}
	}else {
		KeywordUtil.markPassed("Failed to tapped on Take Photo button......!")
	}
}else {

	KeywordUtil.markPassed("Failed to tapped on Second Placeholder......!")
}



if(Mobile.waitForElementPresent(Photo_Placeholder_1, 10)) {
	
	Mobile.tap(Photo_Placeholder_1, 5)
	
	KeywordUtil.markPassed("Passed! First Placeholder tapped successfully......!")
	
	if(Mobile.waitForElementPresent(Photo_Gallery, 10)) {
		
		Mobile.tap(Photo_Gallery, 5)
		
		KeywordUtil.markPassed("Passed! Photo Gallery tapped successfully......!")
		
		if(Mobile.waitForElementPresent(Existing_Photo, 10)) {
			
			Mobile.tap(Existing_Photo, 5)
			
			KeywordUtil.markPassed("Passed! Select Photo from Gallery successfully......!")
			
			if(Mobile.waitForElementPresent(btn_Done_Gallery, 10)) {
				
				Mobile.tap(btn_Done_Gallery, 5)
				
				KeywordUtil.markPassed("Passed! Done Button tapped successfully......!")
				
				Mobile.delay(10)
				
				if(Mobile.waitForElementPresent(btn_Continue, 10)) {
					
					Mobile.tap(btn_Continue, 5)
					
					KeywordUtil.markPassed("Passed! Continue Button tapped successfully......!")
					KeywordUtil.markPassed("Passed! User Navigate to the One-liner Screen......!")
					
					
				}else {
					KeywordUtil.markPassed("Failed to tap on Continue Button......!")
					KeywordUtil.markPassed("Failed to Navigate to the One-liner Screen......!")
				}
			}else {
				KeywordUtil.markPassed("Failed to tap on Done Button......!")
			}
		}else {
			KeywordUtil.markPassed("Failed to Select Photo from Gallery......!")
		}
	}else {
		KeywordUtil.markPassed("Failed to tapp on Photo Gallery......!")
	}	
}else {
	KeywordUtil.markPassed("Failed to tapped on First Placeholder......!")
}









