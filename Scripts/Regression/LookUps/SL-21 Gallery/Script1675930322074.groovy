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
import com.spotlove.Utility


//Mobile.startExistingApplication("com.spotlove.releaseproduction" , FailureHandling.STOP_ON_FAILURE)


if(Mobile.waitForElementPresent(btn_back, 10)) {

	CustomKeywords.'com.spotlove.Utility.tap_back'()

	if(Mobile.waitForElementPresent(lbl_whats, 10)) {

		KeywordUtil.markPassed("User navigate back to the Poilitics screen and What are your political views? label text found......!")

		if(Mobile.waitForElementPresent(btn_continue, 10)) {

			Mobile.delay(5)
			CustomKeywords.'com.spotlove.Utility.tap_Continue'()
			Mobile.delay(5)

			if(Mobile.waitForElementPresent(lbl_Gallery, 10)) {

				KeywordUtil.markPassed("User navigate back to the Gallery screen and Add Profile photos label text found......!")

				if(Mobile.waitForElementPresent(Gallery_icon, 10)) {

					KeywordUtil.markPassed("Gallery Icon found......!")

					if(Mobile.waitForElementPresent(lbl_Gallery, 10)) {

						KeywordUtil.markPassed("Add Profile photos label text found......!")

						if(Mobile.waitForElementPresent(lbl_add, 10)) {

							KeywordUtil.markPassed("Add 3 photos to continue label text found......!")

							if(Mobile.waitForElementPresent(lbl_Main, 10)) {

								KeywordUtil.markPassed("Main Photo label text found......!")

								if(Mobile.waitForElementPresent(btn_photo3, 10)) {

									Mobile.tap(btn_photo3, 10)
									KeywordUtil.markPassed("Bottom sheet opened on the screen......!")

									if(Mobile.waitForElementPresent(btn_take, 10)) {

										Mobile.tap(btn_take, 10)
										KeywordUtil.markPassed("Camera opened by tapping the take photo button......!")

										if(Mobile.waitForElementPresent(btn_capture, 10)) {

											Mobile.tap(btn_capture, 10)
											KeywordUtil.markPassed("Camera takes the Photo......!")

											if(Mobile.waitForElementPresent(btn_Okay, 10)) {

												Mobile.tap(btn_Okay, 10)
												KeywordUtil.markPassed("Okay Button Tapped and move forword to crop image......!")

												if(Mobile.waitForElementPresent(btn_crop, 10)) {

													Mobile.tap(btn_crop, 10)
													KeywordUtil.markPassed("User crop the image and tap on done button......!")
													Mobile.delay(15)

													if(Mobile.waitForElementPresent(btn_photo1, 10)) {

														Mobile.tap(btn_photo1, 10)
														KeywordUtil.markPassed("Bottom sheet opened on the screen......!")

														if(Mobile.waitForElementPresent(btn_Photo, 10)) {

															Mobile.tap(btn_Photo, 10)
															KeywordUtil.markPassed("Gallery opened by tapping the take photo button......!")

															if(Mobile.waitForElementPresent(select_photo, 10)) {

																Mobile.tap(select_photo, 10)
																KeywordUtil.markPassed("Photo selected from Gallery......!")

																if(Mobile.waitForElementPresent(btn_crop, 10)) {

																	Mobile.tap(btn_crop, 10)
																	KeywordUtil.markPassed("Uploading photo......!")
																	Mobile.delay(15)

																	if(Mobile.waitForElementPresent(btn_continue, 10)) {

																		CustomKeywords.'com.spotlove.Utility.tap_Continue'()

																		if(Mobile.waitForElementPresent(lbl_Giveus, 10)) {

																			KeywordUtil.markPassed("User navigate to the One-Liner screen screen and Give us your best... label text found......!")



																		}else {
																			KeywordUtil.markFailed("Continue button is not working.....!")
																		}
																	}else {
																		KeywordUtil.markFailed("Continue button is not working.....!")
																	}
																}else {
																	KeywordUtil.markFailed("Photo Selection failed....!")
																}
															}else {
																KeywordUtil.markFailed("Photo Selection failed....!")
															}
														}else {
															KeywordUtil.markFailed("Gallery is not opened....!")
														}
													}else {
														KeywordUtil.markFailed("Bottom sheet is not appears on the screen not found....!")
													}
												}else {
													KeywordUtil.markFailed("User can't crop the image and tap on done button......!")
												}
											}else {
												KeywordUtil.markFailed("Done button is not found....!")
											}
										}else {
											KeywordUtil.markFailed("Okay Button not found")
										}
									}else {
										KeywordUtil.markFailed("camera permission denied....!")
									}
								}else {
									KeywordUtil.markFailed("camera is not opened....!")
								}
							}else {
								KeywordUtil.markFailed("Main Photo label text not found....!")
							}
						}else {
							KeywordUtil.markFailed("Add 3 Photos to continue label text not found....!")
						}
					}else {
						KeywordUtil.markFailed("Add Profile photos label text not found....!")
					}
				}else {
					KeywordUtil.markFailed("Gallery Icon not found....!")
				}
			}else {
				KeywordUtil.markFailed("Add Profile photos label text not found....!")
			}
		}else {
			KeywordUtil.markFailed("Continue button is not working.....!")
		}
	}else {
		KeywordUtil.markFailed("What are your political views? label text not found......!")
	}
}else {
	KeywordUtil.markFailed("Back button is not working.....!")
}



















