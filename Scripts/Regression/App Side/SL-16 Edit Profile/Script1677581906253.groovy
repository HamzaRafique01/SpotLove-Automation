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


Mobile.tap(Profile_tap, 120)
try {
	if(Mobile.waitForElementPresent(btn_editprofile, 120)) {

		Mobile.tap(btn_editprofile, 120)
		KeywordUtil.markPassed("User tapped on the Edit Button.......!")

		if(Mobile.waitForElementPresent(header_profile_lbl, 120)) {

			KeywordUtil.markPassed("User navigate to the edit profile and User Name header text found.......!")

			if(Mobile.waitForElementPresent(lbl_about, 120)) {

				KeywordUtil.markPassed("About label text found.......!")

				if(Mobile.waitForElementPresent(lbl_Name, 120)) {

					KeywordUtil.markPassed("Name label text found.......!")

					if(Mobile.waitForElementPresent(Name_icon, 120)) {

						KeywordUtil.markPassed("Name label text found.......!")

						if(Mobile.waitForElementPresent(user_name, 120)) {

							KeywordUtil.markPassed("User Name label text found.......!")

							if(Mobile.waitForElementPresent(lbl_Phone, 120)) {

								KeywordUtil.markPassed("Phone Numebr label text found.......!")

								if(Mobile.waitForElementPresent(Phone_icon, 120)) {

									KeywordUtil.markPassed("Phone Numebr label text found.......!")

									if(Mobile.waitForElementPresent(Phone_number, 120)) {

										KeywordUtil.markPassed("Phone Numebr label text found.......!")

										if(Mobile.waitForElementPresent(lbl_Age, 120)) {

											KeywordUtil.markPassed("Age label text found.......!")

											if(Mobile.waitForElementPresent(Age_icon, 120)) {

												KeywordUtil.markPassed("Age Icon text found.......!")

												if(Mobile.waitForElementPresent(Age, 120)) {

													KeywordUtil.markPassed("Age User Data text found.......!")

													if(Mobile.waitForElementPresent(lbl_Oneliner, 120)) {

														KeywordUtil.markPassed("Oneliner label text found.......!")

														if(Mobile.waitForElementPresent(Oneliner_icon, 120)) {

															KeywordUtil.markPassed("Oneliner Icon text found.......!")

															if(Mobile.waitForElementPresent(Oneliner, 120)) {

																KeywordUtil.markPassed("Oneliner User Data text found.......!")

																if(Mobile.waitForElementPresent(forword_icon_Oneliner, 120)) {

																	Mobile.tap(forword_icon_Oneliner, 120)
																	KeywordUtil.markPassed("forword icon Oneliner label text found.......!")

																	if(Mobile.waitForElementPresent(btn_close_Oneliner, 120)) {

																		Mobile.tap(btn_close_Oneliner, 120)
																		KeywordUtil.markPassed("forword icon Oneliner label text found.......!")

																		if(Mobile.waitForElementPresent(User_oneliner, 120)) {

																			Mobile.tap(User_oneliner, 120)
																			Mobile.setText(input, oneliner, 120)
																			KeywordUtil.markPassed("Oneline Set in the Oneliner field.......!")

																			if(Mobile.waitForElementPresent(btn_save, 120)) {

																				Mobile.tap(btn_save, 120)
																				KeywordUtil.markPassed("Save button tapped and Oneliner PopUp closed.......!")

																				CustomKeywords.'com.spotlove.Utility.swipe_down'()

																				if(Mobile.waitForElementPresent(lbl_Vices, 120)) {

																					Mobile.tap(lbl_Vices, 120)
																					KeywordUtil.markPassed("Vices label text found.......!")

																					if(Mobile.waitForElementPresent(header_Vices, 120)) {

																						KeywordUtil.markPassed("Vices User data label text found.......!")

																						if(Mobile.waitForElementPresent(Alcohol_toggle, 120)) {

																							Mobile.tap(Alcohol_toggle, 120)
																							KeywordUtil.markPassed("Tapped on the Alcohol Socially Tab.......!")

																							if(Mobile.waitForElementPresent(AL_Socially, 120)) {

																								Mobile.tap(AL_Socially, 120)
																								KeywordUtil.markPassed("Tapped on the Alcohol Socially Tab.......!")

																								if(Mobile.waitForElementPresent(Mari_toggle, 120)) {

																									Mobile.tap(Mari_toggle, 120)
																									KeywordUtil.markPassed("Tapped on the Alcohol Socially Tab.......!")

																									if(Mobile.waitForElementPresent(Mari_Socially, 120)) {

																										Mobile.tap(Mari_Socially, 120)
																										KeywordUtil.markPassed("Tapped on the Alcohol Socially Tab.......!")

																										if(Mobile.waitForElementPresent(btn_save_vices, 120)) {

																											Mobile.delay(5)
																											Mobile.tap(btn_save_vices, 120)
																											KeywordUtil.markPassed("Save button tapped on the popup.......!")

																											if(Mobile.waitForElementPresent(Vices_icon, 120)) {

																												KeywordUtil.markPassed("Vices Icon text found.......!")

																												if(Mobile.waitForElementPresent(Vices_forwordicon, 120)) {

																													KeywordUtil.markPassed("Gender Forword Icon text found.......!")

																													if(Mobile.waitForElementPresent(Vices_userdata, 120)) {

																														Mobile.tap(Vices_userdata, 120)
																														KeywordUtil.markPassed("Vices User data label text found.......!")
																														Mobile.tap(btn_save_vices, 120)

																														if(Mobile.waitForElementPresent(lbl_edu, 120)) {

																															Mobile.tap(lbl_edu, 120)
																															KeywordUtil.markPassed("Education label text found.......!")

																															if(Mobile.waitForElementPresent(btn_close_edu, 120)) {

																																Mobile.tap(btn_close_edu, 120)
																																KeywordUtil.markPassed("Close button found.......!")

																																if(Mobile.waitForElementPresent(lbl_edu, 120)) {

																																	Mobile.tap(lbl_edu, 120)
																																	KeywordUtil.markPassed("Education label found.......!")

																																	if(Mobile.waitForElementPresent(header_edu, 120)) {

																																		Mobile.tap(header_edu, 120)
																																		KeywordUtil.markPassed("Header Education label found.......!")

																																		CustomKeywords.'com.spotlove.Utility.edit_prof_data'(Education_list)

																																		if(Mobile.waitForElementPresent(btn_save_edu, 120)) {

																																			Mobile.delay(5)
																																			Mobile.tap(btn_save_edu, 120)
																																			KeywordUtil.markPassed("Save button tapped on the popup.......!")

																																		}else {
																																			KeywordUtil.markFailed("Save button not found.......!")
																																		}
																																	}else {
																																		KeywordUtil.markFailed("Header Education label text not found.......!")
																																	}
																																}else {
																																	KeywordUtil.markFailed("Education label text not found.......!")
																																}
																															}else {
																																KeywordUtil.markFailed("Close button not found.......!")
																															}
																														}else {
																															KeywordUtil.markFailed("Education label text not found.......!")
																														}
																													}else {
																														KeywordUtil.markFailed("Vices User data label text not found.......!")
																													}
																												}else {
																													KeywordUtil.markFailed("Vices Forword Icon not found.......!")
																												}
																											}else {
																												KeywordUtil.markFailed("Vices Icon text not found.......!")
																											}
																										}else {
																											KeywordUtil.markFailed("save Button notf found.......!")
																										}
																									}else {
																										KeywordUtil.markFailed("Alcohol Socially tab not found.......!")
																									}
																								}else {
																									KeywordUtil.markFailed("Alcohol Socially tab not found.......!")
																								}
																							}else {
																								KeywordUtil.markFailed("Alcohol Socially tab not found.......!")
																							}
																						}else {
																							KeywordUtil.markFailed("Alcohol Socially tab not found.......!")
																						}
																					}else {
																						KeywordUtil.markFailed("Vices User data label text not found.......!")
																					}
																				}else {
																					KeywordUtil.markFailed("Vices label text not found.......!")
																				}
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
																KeywordUtil.markFailed("Oneliner User Data text not found.......!")
															}
														}else {
															KeywordUtil.markFailed("Oneliner Icon text not found.......!")
														}
													}else {
														KeywordUtil.markFailed("Oneliner label text not found.......!")
													}
												}else {
													KeywordUtil.markFailed("Age User Data text not found.......!")
												}
											}else {
												KeywordUtil.markFailed("Age Icon text not found.......!")
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

}catch(Exception e) {
	e.printStackTrace()
}finally {
	Mobile.delay(5)
}




