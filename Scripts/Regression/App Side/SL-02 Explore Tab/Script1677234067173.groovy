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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.spotlove.Utility
import com.detroitlabs.katalonmobileutil.touch.Swipe as Swipe
import com.detroitlabs.katalonmobileutil.touch.Swipe.SwipeDirection as SwipeDirection
import com.detroitlabs.katalonmobileutil.touch.Scroll as Scroll
import com.detroitlabs.katalonmobileutil.touch.Scroll.ScrollFactor as ScrollFactor

//Mobile.startExistingApplication('com.spotlove.releaseproduction', FailureHandling.STOP_ON_FAILURE)


if(Mobile.waitForElementPresent(ProfileImage, 30)) {

	KeywordUtil.markPassed("User Profile Image found on Explore Tab User Details....!")

	if(Mobile.waitForElementPresent(header_Explore, 30)) {

		KeywordUtil.markPassed("Explore header Label Text found....!")

		if(Mobile.waitForElementPresent(Preferences_icon, 10)) {

			Mobile.tap(Preferences_icon, 10)
			KeywordUtil.markPassed("Icon Found and Tapped....!")

			if(Mobile.waitForElementPresent(lbl_Dating, 10)) {

				KeywordUtil.markPassed("User Navigate to the Dating Preferences Screen and Dating Preferences header text found....!")

				if(Mobile.waitForElementPresent(btn_back, 10)) {

					CustomKeywords.'com.spotlove.Utility.tap_back'()
					KeywordUtil.markPassed("Back Button Found and Tapped....!")

					if(Mobile.waitForElementPresent(header_Explore, 10)) {

						KeywordUtil.markPassed("User Navigate back to the Explore Screen and Explore header Label Text found....!!")

						if(Mobile.waitForElementPresent(three_dots, 10)) {

							Mobile.tap(three_dots, 10)
							KeywordUtil.markPassed("Three Dots icon found on Explore Tab User Details....!")

							if(Mobile.waitForElementPresent(btn_close, 10)) {

								Mobile.tap(btn_close, 10)
								KeywordUtil.markPassed("Report/Block Bottom sheet close ....!")

								if(Mobile.waitForElementPresent(three_dots, 10)) {

									Mobile.tap(three_dots, 10)
									KeywordUtil.markPassed("Three Dots icon found on Explore Tab User Details....!")

									if(Mobile.waitForElementPresent(header_option, 0)) {

										KeywordUtil.markPassed("Header Option Label text found.....!")

										if(Mobile.waitForElementPresent(block_user, 10)) {

											Mobile.tap(block_user, 10)
											KeywordUtil.markPassed("Current User has been blocked...!")

											if(Mobile.waitForElementPresent(three_dots, 10)) {

												Mobile.tap(three_dots, 10)
												KeywordUtil.markPassed("Three Dots icon found on Explore Tab User Details....!")

												if(Mobile.waitForElementPresent(report_user, 10)) {

													Mobile.tap(report_user, 10)
													KeywordUtil.markPassed("Report bottom sheet opened on the Screen...!")
													Mobile.delay(10)

													if(Mobile.waitForElementPresent(btn_close, 10)) {

														Mobile.tap(btn_close, 10)
														KeywordUtil.markPassed("Report/Block Bottom sheet close ....!")

														if(Mobile.waitForElementPresent(three_dots, 10)) {

															Mobile.tap(three_dots, 10)
															KeywordUtil.markPassed("Three Dots icon found on Explore Tab User Details....!")

															if(Mobile.waitForElementPresent(report_user, 10)) {

																Mobile.tap(report_user, 10)
																KeywordUtil.markPassed("Report bottom sheet opened on the Screen...!")

																if(Mobile.waitForElementPresent(report_header, 10)) {

																	KeywordUtil.markPassed("Report Reason header label found on the bottom sheet....!")

																	if(Mobile.waitForElementPresent(we_lbl, 10)) {

																		KeywordUtil.markPassed("We will never show this user to you again label text found on the bottom sheet....!")

																		if(Mobile.waitForElementPresent(input_reason, 10)) {

																			Mobile.setText(input_reason, reason, 0)
																			KeywordUtil.markPassed("User Report reason entered on the Text edit box....!")

																			if(Mobile.waitForElementPresent(input_reason, 10)) {

																				CustomKeywords.'com.spotlove.Utility.tap_Submit'()
																				KeywordUtil.markPassed("Submit Button found on the bottom sheet......!")

																				if(Mobile.waitForElementPresent(User_Name, 10)) {

																					KeywordUtil.markPassed("User name found on Explore Tab User Details....!")

																					if(Mobile.waitForElementPresent(User_AGe, 10)) {

																						KeywordUtil.markPassed("User Age found on Explore Tab User Details....!")

																						if(Mobile.waitForElementPresent(ProfileImage, 10)) {

																							KeywordUtil.markPassed("User Profile Image found on Explore Tab User Details....!")

																							if(Mobile.waitForElementPresent(oneliner, 10)) {

																								KeywordUtil.markPassed("User Oneliner details found on Explore Tab User Details....!")
																								CustomKeywords.'com.spotlove.Utility.swipe_down'()

																								if(Mobile.waitForElementPresent(user_location, 10)) {


																									KeywordUtil.markPassed("User Location details found on Explore Tab User Details....!")

																									if(Mobile.waitForElementPresent(user_height, 10)) {

																										KeywordUtil.markPassed("User height details found on Explore Tab User Details....!")

																										if(Mobile.waitForElementPresent(user_Gender, 10)) {

																											KeywordUtil.markPassed("User Gender details found on Explore Tab User Details....!")

																											if(Mobile.waitForElementPresent(partner_gender, 10)) {

																												KeywordUtil.markPassed("User Partner Gender details found on Explore Tab User Details....!")

																												if(Mobile.waitForElementPresent(ethnicity, 10)) {

																													KeywordUtil.markPassed("User ethnicity details found on Explore Tab User Details....!")

																													if(Mobile.waitForElementPresent(religon, 10)) {

																														KeywordUtil.markPassed("User religon details found on Explore Tab User Details....!")

																														if(Mobile.waitForElementPresent(relationship_status, 10)) {

																															KeywordUtil.markPassed("User Relationship Status details found on Explore Tab User Details....!")

																															if(Mobile.waitForElementPresent(family_plan, 10)) {

																																KeywordUtil.markPassed("User Family Plan details found on Explore Tab User Details....!")

																																if(Mobile.waitForElementPresent(education, 10)) {

																																	KeywordUtil.markPassed("User Education details found on Explore Tab User Details....!")
																																	CustomKeywords.'com.spotlove.Utility.swipe_up'(0,0)
																																	Mobile.delay(10)

																																	//																			if(Mobile.waitForElementPresent(Vices, 10)) {
																																	//
																																	//																				KeywordUtil.markPassed("User Vices details found on Explore Tab User Details....!")
																																	//
																																	//																			} else {
																																	//																				KeywordUtil.markFailed("User Vices details not found on Explore Tab")
																																	//																			}
																																} else {
																																	KeywordUtil.markFailed("User Education details not found on Explore Tab")
																																}
																															} else {
																																KeywordUtil.markFailed("User Family Plan details not found on Explore Tab")
																															}
																														} else {
																															KeywordUtil.markFailed("User Relationship Status details not found on Explore Tab")
																														}
																													} else {
																														KeywordUtil.markFailed("User religon details not found on Explore Tab")
																													}
																												} else {
																													KeywordUtil.markFailed("User ethnicity details not found on Explore Tab")
																												}
																											} else {
																												KeywordUtil.markFailed("User Partner Gender details not found on Explore Tab")
																											}
																										} else {
																											KeywordUtil.markFailed("User Gender details not found on Explore Tab")
																										}
																									} else {
																										KeywordUtil.markFailed("User height details not found on Explore Tab")
																									}
																								} else {
																									KeywordUtil.markFailed("User Location details not found on Explore Tab")
																								}
																							} else {
																								KeywordUtil.markFailed("User Oneliner details not found on Explore Tab")
																							}
																						} else {
																							KeywordUtil.markFailed("User Profile Image not found on Explore Tab")
																						}
																					} else {
																						KeywordUtil.markFailed("User AGe not found on Explore Tab")
																					}
																				} else {
																					KeywordUtil.markFailed("User Name not found on Explore Tab")
																				}
																			} else {
																				KeywordUtil.markFailed("Back button not found....")
																			}

																		} else {
																			KeywordUtil.markFailed("Submit button is not found!")
																		}
																	} else {
																		KeywordUtil.markFailed("Report text box not found....!")
																	}
																} else {
																	KeywordUtil.markFailed("We will never show this user to you again label text not found....!")
																}
															} else {
																KeywordUtil.markFailed("Report Header is not found....!")
															}
														} else {
															KeywordUtil.markFailed("Report Button is not working")
														}
													} else {
														KeywordUtil.markFailed("Three Dots icon not found on Explore Tab")
													}
												} else {
													KeywordUtil.markFailed("Close button is not found on Explore Tab")
												}
											} else {
												KeywordUtil.markFailed("Report Button is not working")
											}
										} else {
											KeywordUtil.markFailed("Three Dots icon not found on Explore Tab")
										}
									} else {
										KeywordUtil.markFailed("Block Button is not working")
									}

								}else {
									KeywordUtil.markFailed("Header Option Label text not found.....!")
								}
							} else {
								KeywordUtil.markFailed("Three Dots icon not found on Explore Tab")
							}
						} else {
							KeywordUtil.markFailed("Close button is not found on Explore Tab")
						}
					} else {
						KeywordUtil.markFailed("Three Dots icon not found on Explore Tab")
					}
				} else {
					KeywordUtil.markFailed("Back button not found....!")
				}
			} else {
				KeywordUtil.markFailed("Dating Preferences header Label text not found....!")
			}
		} else {
			KeywordUtil.markFailed("Preferences Icon not Found....!")
		}
	} else {
		KeywordUtil.markFailed("Explore header Label text not found....!")
	}
}else {
	KeywordUtil.markFailed("User Profile Image not found on Explore Tab")
}





















