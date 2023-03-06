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



//Mobile.startExistingApplication('com.spotlove.releaseproduction', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(profile_tab, 60)

if(Mobile.waitForElementPresent(lbl_profile, 60)) {

	KeywordUtil.markPassed("User Navigate to the Profile tab and Profile text found.......!")

	if(Mobile.waitForElementPresent(profile_image, 60)) {

		KeywordUtil.markPassed("Profile Image found.......!")

		if(Mobile.waitForElementPresent(lbl_profile_percentage, 60)) {

			KeywordUtil.markPassed("Profile 100% Complete lbl text found.......!")

			if(Mobile.waitForElementPresent(user_name, 60)) {

				KeywordUtil.markPassed("User Name & Age lbl text found.......!")

				if(Mobile.waitForElementPresent(btn_Editprofile, 60)) {

					Mobile.tap(btn_Editprofile, 60)

					if(Mobile.waitForElementPresent(User_Name_edit_setting, 60)) {

						KeywordUtil.markPassed("User Navigate to the Edit profile settings and User Name found.......!")

						if(Mobile.waitForElementPresent(btn_back, 60)) {

							CustomKeywords.'com.spotlove.Utility.tap_back'()

							if(Mobile.waitForElementPresent(lbl_profile, 60)) {

								KeywordUtil.markPassed("User Navigate to the Profile tab and Profile text found.......!")

								if(Mobile.waitForElementPresent(lbl_edit_profile, 60)) {

									KeywordUtil.markPassed("Edit Profile lbl text found.......!")

									if(Mobile.waitForElementPresent(Settings_icon_DP, 60)) {

										KeywordUtil.markPassed("Setting icon on Dating Preferences setting Tab found.......!")

										if(Mobile.waitForElementPresent(forword_icon_DP, 60)) {

											KeywordUtil.markPassed("Forword icon on Dating Preferences setting Tab found.......!")

											if(Mobile.waitForElementPresent(Dating_Preferences, 60)) {

												Mobile.tap(Dating_Preferences, 60)
												KeywordUtil.markPassed("Dating Preferences lbl text found.......!")

												if(Mobile.waitForElementPresent(Dating_Preferences_lbl, 60)) {

													KeywordUtil.markPassed("Dating Preferences lbl text found.......!")

													if(Mobile.waitForElementPresent(btn_back, 60)) {

														CustomKeywords.'com.spotlove.Utility.tap_back'()

														if(Mobile.waitForElementPresent(lbl_profile, 60)) {

															KeywordUtil.markPassed("User Navigate to the Profile tab and Profile text found.......!")

															if(Mobile.waitForElementPresent(setting_icon, 60)) {

																KeywordUtil.markPassed("Setting icon on setting Tab found.......!")

																if(Mobile.waitForElementPresent(forword_icon_setting, 60)) {

																	KeywordUtil.markPassed("Forword icon on setting Tab found.......!")

																	if(Mobile.waitForElementPresent(Setting, 60)) {

																		Mobile.tap(Setting, 60)
																		KeywordUtil.markPassed("Setting tab tapped.......!")

																		if(Mobile.waitForElementPresent(lbl_profile, 60)) {

																			KeywordUtil.markPassed("User Navigate to the Setting tab and Profile text found.......!")

																			if(Mobile.waitForElementPresent(btn_back, 60)) {

																				CustomKeywords.'com.spotlove.Utility.tap_back'()

																				if(Mobile.waitForElementPresent(lbl_profile, 60)) {

																					KeywordUtil.markPassed("User Navigate to the Profile tab and Profile text found.......!")

																					if(Mobile.waitForElementPresent(info_icon, 60)) {

																						KeywordUtil.markPassed("Info icon on Dating Preferences setting Tab found.......!")

																						if(Mobile.waitForElementPresent(forword_icon_info, 60)) {

																							KeywordUtil.markPassed("Forword icon on Help Center setting Tab found.......!")

																							if(Mobile.waitForElementPresent(Help_center, 60)) {

																								KeywordUtil.markPassed("Setting icon on Help Center setting Tab found.......!")
																								CustomKeywords.'com.spotlove.Utility.swipe_down'()

																								if(Mobile.waitForElementPresent(APp_Version, 60)) {

																									KeywordUtil.markPassed("App Version label text found.......!")




																								}else {
																									KeywordUtil.markFailed("App Version label text not Found.......!")
																								}
																							}else {
																								KeywordUtil.markFailed("Setting icon on Help Center setting Tab not Found.......!")
																							}
																						}else {
																							KeywordUtil.markFailed("Forword icon on Help Center setting Tab not Found.......!")
																						}
																					}else {
																						KeywordUtil.markFailed("Info icon on Dating Preferences setting Tab not Found.......!")
																					}
																				}else {
																					KeywordUtil.markFailed("Back button not found.......!")
																				}
																			}else {
																				KeywordUtil.markFailed("Back button not found.......!")
																			}
																		}else {
																			KeywordUtil.markFailed("Profile lbl text not Found.......!")
																		}
																	}else {
																		KeywordUtil.markFailed("Setting icon on Help Center setting Tab not Found.......!")
																	}
																}else {
																	KeywordUtil.markFailed("Forword icon on setting Tab not Found.......!")
																}
															}else {
																KeywordUtil.markFailed("Setting icon on Dating Preferences setting Tab not Found.......!")
															}
														}else {
															KeywordUtil.markFailed("Profile lbl text not found.......!")
														}
													}else {
														KeywordUtil.markFailed("Back button not found.......!")
													}
												}else {
													KeywordUtil.markFailed("Dating Preferences lbl text not Found.......!")
												}
											}else {
												KeywordUtil.markFailed("Dating Preferences lbl text not Found.......!")
											}
										}else {
											KeywordUtil.markFailed("Forword icon on Dating Preferences setting Tab not Found.......!")
										}
									}else {
										KeywordUtil.markFailed("Setting icon on Dating Preferences setting Tab not Found.......!")
									}
								}else {
									KeywordUtil.markFailed("Edit Profile lbl  not Found.......!")
								}
							}else {
								KeywordUtil.markFailed("Profile lbl text not Found.......!")
							}
						}else {
							KeywordUtil.markFailed("User Name lbl text not Found.......!")
						}
					}else {
						KeywordUtil.markFailed("Edit Profile lbl text not Found.......!")
					}
				}else {
					KeywordUtil.markFailed("User Navigation failed.......!")
				}
			}else {
				KeywordUtil.markFailed("User Name & Age lbl text not Found.......!")
			}
		}else {
			KeywordUtil.markFailed("Profile 100% Complete lbl text not Found.......!")
		}
	}else {
		KeywordUtil.markFailed("Profile image not Found.......!")
	}
}else {
	KeywordUtil.markFailed("Profile lbl text not Found.......!")
}
