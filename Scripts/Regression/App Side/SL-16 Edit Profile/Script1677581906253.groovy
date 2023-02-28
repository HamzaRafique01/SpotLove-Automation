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


Mobile.startExistingApplication('com.spotlove.releaseproduction', FailureHandling.STOP_ON_FAILURE)


Mobile.tap(Profile_tap, 60)

if(Mobile.waitForElementPresent(btn_editprofile, 60)) {

	Mobile.tap(btn_editprofile, 60)
	KeywordUtil.markPassed("User tapped on the Edit Button.......!")

	if(Mobile.waitForElementPresent(header_profile_lbl, 60)) {

		KeywordUtil.markPassed("User navigate to the edit profile and User Name header text found.......!")

		if(Mobile.waitForElementPresent(lbl_about, 60)) {

			KeywordUtil.markPassed("About label text found.......!")

			if(Mobile.waitForElementPresent(lbl_Name, 60)) {

				KeywordUtil.markPassed("Name label text found.......!")

				if(Mobile.waitForElementPresent(Name_icon, 60)) {

					KeywordUtil.markPassed("Name label text found.......!")

					if(Mobile.waitForElementPresent(user_name, 60)) {

						KeywordUtil.markPassed("User Name label text found.......!")

						if(Mobile.waitForElementPresent(lbl_Phone, 60)) {

							KeywordUtil.markPassed("Phone Numebr label text found.......!")

							if(Mobile.waitForElementPresent(Phone_icon, 60)) {

								KeywordUtil.markPassed("Phone Numebr label text found.......!")

								if(Mobile.waitForElementPresent(Phone_number, 60)) {

									KeywordUtil.markPassed("Phone Numebr label text found.......!")

									if(Mobile.waitForElementPresent(lbl_Age, 60)) {

										KeywordUtil.markPassed("Age label text found.......!")

										if(Mobile.waitForElementPresent(Age_icon, 60)) {

											KeywordUtil.markPassed("Age label text found.......!")

											if(Mobile.waitForElementPresent(Age, 60)) {

												KeywordUtil.markPassed("Age label text found.......!")

												if(Mobile.waitForElementPresent(lbl_Oneliner, 60)) {

													KeywordUtil.markPassed("Oneliner label text found.......!")

													if(Mobile.waitForElementPresent(Oneliner_icon, 60)) {

														KeywordUtil.markPassed("Oneliner label text found.......!")

														if(Mobile.waitForElementPresent(Oneliner, 60)) {

															KeywordUtil.markPassed("Oneliner label text found.......!")

															if(Mobile.waitForElementPresent(forword_icon_Oneliner, 60)) {

																Mobile.tap(forword_icon_Oneliner, 60)
																KeywordUtil.markPassed("forword icon Oneliner label text found.......!")

																if(Mobile.waitForElementPresent(btn_close_Oneliner, 60)) {

																	KeywordUtil.markPassed("forword icon Oneliner label text found.......!")

																	if(Mobile.waitForElementPresent(User_oneliner, 60)) {

																		Mobile.tap(User_oneliner, 60)
																		Mobile.setText(input, oneliner, 60)
																		KeywordUtil.markPassed("Oneline Set in the Oneliner field.......!")

																		if(Mobile.waitForElementPresent(btn_save, 60)) {

																			Mobile.tap(btn_save, 60)
																			KeywordUtil.markPassed("Save button tapped and Oneliner PopUp closed.......!")

																			CustomKeywords.'com.spotlove.Utility.swipe_down'()

																			
																		}else {
																			KeywordUtil.markFailed("Save button not found.......!")
																		}
																	}else {
																		KeywordUtil.markFailed("Oneliner field not found not found.......!")
																	}

																}else {
																	KeywordUtil.markFailed("forword icon Oneliner label text not found.......!")
																}
															}else {
																KeywordUtil.markFailed("forword icon Oneliner label text not found.......!")
															}
														}else {
															KeywordUtil.markFailed("Oneliner label text not found.......!")
														}
													}else {
														KeywordUtil.markFailed("Oneliner label text not found.......!")
													}
												}else {
													KeywordUtil.markFailed("Oneliner label text not found.......!")
												}

											}else {
												KeywordUtil.markFailed("Age label text not found.......!")
											}
										}else {
											KeywordUtil.markFailed("Age label text not found.......!")
										}
									}else {
										KeywordUtil.markFailed("Age label text not found.......!")
									}
								}else {
									KeywordUtil.markFailed("Phone Numebr label text not found.......!")
								}
							}else {
								KeywordUtil.markFailed("Phone Numebr label text not found.......!")
							}
						}else {
							KeywordUtil.markFailed("Phone Numebr label text not found.......!")
						}
					}else {
						KeywordUtil.markFailed("User Name label text not found.......!")
					}
				}else {
					KeywordUtil.markFailed("Name label text not found.......!")
				}
			}else {
				KeywordUtil.markFailed("Name label text not found.......!")
			}
		}else {
			KeywordUtil.markFailed("About label text not found.......!")
		}
	}else {
		KeywordUtil.markFailed(" User Name header text not found.......!")
	}
}else {
	KeywordUtil.markFailed("Edit Pofile button not found.......!")
}


















