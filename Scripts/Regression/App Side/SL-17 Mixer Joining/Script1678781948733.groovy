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


if(Mobile.waitForElementPresent(mixer_time, 120)) {

	KeywordUtil.markPassed("Mixer Remaining time Found on the Mixer Banner.......")

	if(Mobile.waitForElementPresent(lbl_RSVP, 120)) {

		KeywordUtil.markPassed("RSVP for the Next Mixer lbl text found.......")

		if(Mobile.waitForElementPresent(btn_RSVP, 120)) {

			Mobile.tap(btn_RSVP, 120)
			KeywordUtil.markPassed("User tapped on the Reserve Button for the Mixer.......")

			if(Mobile.waitForElementPresent(lbl_RSVPD, 120)) {

				KeywordUtil.markPassed("RSVP'D button lbl text found.......")
				println("Please wait for Starting the Mixer After completing the Remaining time is has been shown in the Above")

				if(Mobile.waitForElementPresent(Live_badge, 120)) {

					KeywordUtil.markPassed("User navigate to the Mixer screen and Live Badge is shown in the Top left corner of the screen.......")

					if(Mobile.waitForElementPresent(Live_users, 120)) {

						KeywordUtil.markPassed("Live users count is shown in the Top left corner of the screen.......")

						if(Mobile.waitForElementPresent(btn_leave_Mixer, 120)) {

							Mobile.tap(btn_leave_Mixer, 120)
							KeywordUtil.markPassed("User Tap on the Leave Mixer.......")

							if(Mobile.waitForElementPresent(lbl_live, 120)) {

								KeywordUtil.markPassed("User Navigate back to the Home Screen (Explore Screen) and Live Now lbl text found on the Mixer Banner.......")

								if(Mobile.waitForElementPresent(lbl_Join, 120)) {

									KeywordUtil.markPassed("Join the Mixer Now lbl text found.......")

									if(Mobile.waitForElementPresent(btn_join, 120)) {

										Mobile.tap(btn_join, 120)
										KeywordUtil.markPassed("Join Mixer button found and tapped.......")

										if(Mobile.waitForElementPresent(Live_badge, 120)) {

											KeywordUtil.markPassed("User navigate to the Mixer screen and Live Badge is shown in the Top left corner of the screen.......")

											if(Mobile.waitForElementPresent(lbl_you, 120)) {

												KeywordUtil.markPassed("You're about to get a Call label text found.......")
												Mobile.delay(180)

												if(Mobile.waitForElementPresent(first_lbl, 120)) {

													KeywordUtil.markPassed("No Matches In the Waiting Room lbl text found.......")

													if(Mobile.waitForElementPresent(second_lbl, 120)) {

														KeywordUtil.markPassed("None of your matches have joined the mixer--yet. You can enable blind matching to get more opportunities. lbl text found.......")

														if(Mobile.waitForElementPresent(btn_blindcall, 120)) {

															Mobile.tap(btn_blindcall, 120)
															KeywordUtil.markPassed("Enable blind Call button found and tapped..............")

															if(Mobile.waitForElementPresent(lbl_you, 120)) {

																KeywordUtil.markPassed("You're about to get a Call label text found.......")

																if(Mobile.waitForElementPresent(lbl_blind, 120)) {

																	KeywordUtil.markPassed("Blind Dates Enabled label text found.......")

																	if(Mobile.waitForElementPresent(btn_Close, 120)) {

																		Mobile.tap(btn_Close, 120)
																		KeywordUtil.markPassed("Bottom sheet Open Button found and Tapped.......")

																		if(Mobile.waitForElementPresent(btn_open, 120)) {

																			Mobile.tap(btn_open, 120)
																			KeywordUtil.markPassed("Bottom sheet Open Button found and Tapped.......")
																			println("________----------________--------________---------________")


																		}else {
																			KeywordUtil.markFailed("Bottom sheet Open Button not found......")
																		}
																	}else {
																		KeywordUtil.markFailed("Bottom sheet Open Button not found......")
																	}
																}else {
																	KeywordUtil.markFailed("Blind Dates Enabled label text not found......")
																}
															}else {
																KeywordUtil.markFailed("You're about to get a Call label text not found......")
															}
														}else {
															KeywordUtil.markFailed("Enable blind Call button not found......")
														}
													}else {
														KeywordUtil.markFailed("None of your matches have joined the mixer--yet. You can enable blind matching to get more opportunities. lbl text not found......")
													}
												}else {
													KeywordUtil.markFailed("No Matches In the Waiting Room lbl text not found......")
												}
											}else {
												KeywordUtil.markFailed("You're about to get a Call label text not found......")
											}
										}else {
											KeywordUtil.markFailed("User Navigation failed......")
										}
									}else {
										KeywordUtil.markFailed("Join Mixer button not found......")
									}
								}else {
									KeywordUtil.markFailed("Join the Mixer Now lbl text not found......")
								}
							}else {
								KeywordUtil.markFailed("navigation Failed......")
							}
						}else {
							KeywordUtil.markFailed("Leave mixer Button not found......")
						}
					}else {
						KeywordUtil.markFailed("User count not found......")
					}
				}else {
					KeywordUtil.markFailed("User Navigation failed......")
				}
			}else {
				KeywordUtil.markFailed("RSVP'D button lbl text not found......")
			}
		}else {
			KeywordUtil.markFailed("RSVP button not found for Reservation of the mixer......")
		}
	}else {
		KeywordUtil.markFailed("RSVP for the Next Mixer lbl text not found......")
	}
}else {
	KeywordUtil.markFailed("Mixer Remainning timer not found......")
}










