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
int a,b
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.spotlove.Utility

Mobile.startExistingApplication('com.spotlove.releaseproduction', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(explore_tab, 60)

if(Mobile.waitForElementPresent(profile_image, 60)) {

	KeywordUtil.markPassed("Application Launched Successfully.......!")
	KeywordUtil.markPassed("User Profile Image found on Explore Tab User Details.......!")

	if(Mobile.waitForElementPresent(explore_tab, 60)) {

		KeywordUtil.markPassed("User Navigate to the Explore tab.......!")

		CustomKeywords.'com.spotlove.Utility.swipe_down'()
		Mobile.delay(2)
		CustomKeywords.'com.spotlove.Utility.swipe_up'(a,b)

		if(Mobile.waitForElementPresent(preferences_home, 60)) {

			Mobile.tap(preferences_home, 60)
			KeywordUtil.markPassed("Icon Found and Tapped.......!")

			if(Mobile.waitForElementPresent(lbl_Dating, 60)) {

				KeywordUtil.markPassed("User Navigate to the Dating Preferences Screen and Dating Preferences header text found.......!")

				CustomKeywords.'com.spotlove.Utility.swipe_down'()
				Mobile.delay(2)
				CustomKeywords.'com.spotlove.Utility.swipe_up'(a,b)

				if(Mobile.waitForElementPresent(btn_back, 60)) {

					CustomKeywords.'com.spotlove.Utility.tap_back'()
					KeywordUtil.markPassed("Back Button Found and Tapped.......!")

					if(Mobile.waitForElementPresent(header_Explore, 60)) {

						KeywordUtil.markPassed("User Navigate back to the Explore Screen and Explore header Label Text found.......!")

						if(Mobile.waitForElementPresent(profile_tab, 60)) {

							Mobile.tap(profile_tab, 60)
							KeywordUtil.markPassed("User tap on the Profile tab.......!")

							if(Mobile.waitForElementPresent(profile_lbl, 60)) {

								KeywordUtil.markPassed("User Navigate to the Profile Tab Screen and Profile header text found.......!")

								if(Mobile.waitForElementPresent(Edit_profile, 60)) {

									Mobile.tap(Edit_profile, 60)
									KeywordUtil.markPassed("User Tapped on the Edit Profile button.......!")

									if(Mobile.waitForElementPresent(User_Name, 30)) {

										KeywordUtil.markPassed("User Navigate to the Edit Profile Tab Screen and User Name header text found.......!")

										CustomKeywords.'com.spotlove.Utility.swipe_down'()
										Mobile.delay(2)
										CustomKeywords.'com.spotlove.Utility.swipe_up'(a,b)

										if(Mobile.waitForElementPresent(btn_back, 60)) {

											CustomKeywords.'com.spotlove.Utility.tap_back'()
											KeywordUtil.markPassed("Back Button Found and Tapped.......!")

											if(Mobile.waitForElementPresent(profile_lbl, 60)) {

												KeywordUtil.markPassed("User Navigate to the Profile Tab Screen and Profile header text found.......!")

												if(Mobile.waitForElementPresent(liked_tab, 60)) {

													Mobile.tap(liked_tab, 60)
													KeywordUtil.markPassed("User Navigate to the liked tab.......!")

													if(Mobile.waitForElementPresent(liked_lbl, 60)) {

														KeywordUtil.markPassed("User Navigate to the liked tab and Liked You Lbl text found on the Liked you tab.......!")

														CustomKeywords.'com.spotlove.Utility.swipe_left_to_right'()
														Mobile.delay(2)
														CustomKeywords.'com.spotlove.Utility.swipe_right_to_left'()
														Mobile.delay(2)
														CustomKeywords.'com.spotlove.Utility.swipe_down'()
														Mobile.delay(2)
														CustomKeywords.'com.spotlove.Utility.swipe_up'(a,b)

														if(Mobile.waitForElementPresent(matches_tab, 60)) {

															Mobile.tap(matches_tab, 60)
															KeywordUtil.markPassed("User Navigate to the Matches tab.......!")

															if(Mobile.waitForElementPresent(matches_lbl, 60)) {

																KeywordUtil.markPassed("User Navigate to the Matches tab and Matches Lbl text found on the Matches tab.......!")

																CustomKeywords.'com.spotlove.Utility.swipe_left_to_right'()
																Mobile.delay(2)
																CustomKeywords.'com.spotlove.Utility.swipe_right_to_left'()
																Mobile.delay(2)
																CustomKeywords.'com.spotlove.Utility.swipe_down'()
																Mobile.delay(2)
																CustomKeywords.'com.spotlove.Utility.swipe_up'(a,b)

																if(Mobile.waitForElementPresent(explore_tab, 60)) {

																	Mobile.tap(explore_tab, 60)
																	KeywordUtil.markPassed("User Navigate to the Explore tab.......!")

																}else {
																	KeywordUtil.markFailed("User cannot moving to the Explore tab.......!")
																}
															}else {
																KeywordUtil.markFailed("User cannot moving to the Matches tab.......!")
															}
														}else {
															KeywordUtil.markFailed("User cannot moving to the Matches tab.......!")
														}
													}else {
														KeywordUtil.markFailed("User cannot moving to the liked tab.......!")
													}
												}else {
													KeywordUtil.markFailed("User cannot moving to the liked tab.......!")
												}
											}else {
												KeywordUtil.markFailed("Navigation Failed.......!")
											}
										} else {
											KeywordUtil.markFailed("Back button not found.......!")
										}
									}else {
										KeywordUtil.markFailed("User Name header Label text not found.......!")
									}
								}else {
									KeywordUtil.markFailed("Edit profile button not found.......!")
								}
							}else {
								KeywordUtil.markFailed("Profile header Label text not found.......!")
							}
						}else {
							KeywordUtil.markFailed("Profile Tab not found.......!")
						}
					} else {
						KeywordUtil.markFailed("Back button not found.......!")
					}
				} else {
					KeywordUtil.markFailed("Back button not found.......!")
				}
			} else {
				KeywordUtil.markFailed("Dating Preferences header Label text not found.......!")
			}
		} else {
			KeywordUtil.markFailed("Preferences Icon not Found.......!")
		}
	}else {
		KeywordUtil.markFailed("User cannot moving to the Explore tab.......!")
	}
}else {
	KeywordUtil.markFailed("User Profile Image not found on Explore Tab.......!")
}