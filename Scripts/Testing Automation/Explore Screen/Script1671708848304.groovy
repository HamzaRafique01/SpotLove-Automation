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



if(Mobile.waitForElementPresent(Explore_Label, 30)) {
	
	KeywordUtil.markPassed('PASSED: Explore Label text is present on the screen')
	
	if(Mobile.waitForElementPresent(Preferences_Button, 30)) {
		
		Mobile.tap(Preferences_Button, 30)
		KeywordUtil.markPassed('PASSED: Preferences Button is present on the screen')
		
		if(Mobile.waitForElementPresent(home_back, 30)) {
			
			Mobile.tap(home_back, 30)
			KeywordUtil.markPassed('PASSED: Preferences Back Button is functional and present on the screen')
			
			if(Mobile.waitForElementPresent(User_Name, 30)) {
				
				KeywordUtil.markPassed('PASSED: User Name text is present on the screen')
				
				if(Mobile.waitForElementPresent(Be_The, 30)) {
					
					KeywordUtil.markPassed('PASSED: Be The... label text is present on the screen')
				
					if(Mobile.waitForElementPresent(Like_Button, 30)) {
						
						Mobile.tap(Like_Button, 30)
						KeywordUtil.markPassed('PASSED: Like Button is functional and present on the screen')
						
						if(Mobile.waitForElementPresent(Dislike_Button, 30)) {
							
							Mobile.tap(Dislike_Button, 30)
							KeywordUtil.markPassed('PASSED: Dislike Button is functional and present on the screen')
							
							if(Mobile.waitForElementPresent(Like_You, 30)) {
								
								Mobile.tap(Like_You, 30)
								KeywordUtil.markPassed('PASSED: Liked You Tap is functional and present on the screen')
								
								if(Mobile.waitForElementPresent(Liked_You, 30)) {
									
									KeywordUtil.markPassed('PASSED: Liked You Label text is present on the screen')
									
									if(Mobile.waitForElementPresent(Square_Heart, 30)) {
										
										KeywordUtil.markPassed('PASSED: Square Heart icon is present on the screen')
										
										if(Mobile.waitForElementPresent(Youve, 30)) {
											
											KeywordUtil.markPassed('PASSED: Youve Got... Label text is present on the screen')
											
											if(Mobile.waitForElementPresent(Matches, 30)) {
												
												Mobile.tap(Matches, 30)
												KeywordUtil.markPassed('PASSED: Matches Tap is functional and present on the screen')
												
												if(Mobile.waitForElementPresent(Mutaul_Match_icon, 30)) {
													
													KeywordUtil.markPassed('PASSED: Matual Matches icon text is present on the screen')
													
													if(Mobile.waitForElementPresent(Check_Back, 30)) {
														
														KeywordUtil.markPassed('PASSED: Check_Back... label text is present on the screen')
														
														if(Mobile.waitForElementPresent(Start, 30)) {
															
															Mobile.tap(Start, 30)
															KeywordUtil.markPassed('PASSED: Start Exploring button is present on the screen')
															
															if(Mobile.waitForElementPresent(Profile_Tab, 30)) {
																
																Mobile.tap(Profile_Tab, 30)
																KeywordUtil.markPassed('PASSED: Profile Tab is functional on the screen')
															
															}else {
																KeywordUtil.markFailed("Failed: Profile Tab is not functional on the screen")
															}
														}else {
															KeywordUtil.markFailed("Failed: Start Exploring button is not present on the screen")
														}
													}else {
														KeywordUtil.markFailed("Failed: Check_Back... label text is not present on the screen")
													}
												}else {
													KeywordUtil.markFailed("Failed: Matual Matches icon is not present on the screen")
												}
											}else {
												KeywordUtil.markFailed("Failed: Matches Tap is not functional and present on the screen")
											}
										}else {
											KeywordUtil.markFailed("Failed: Youve Got... Label text is not present on the screen")
										}
									}else {
										KeywordUtil.markFailed("Failed: Square Heart icon is not present on the screen")
									}
								}else {
									KeywordUtil.markFailed("Failed: Liked You Label text is not present on the screen")
								}
							}else {
								KeywordUtil.markFailed("Failed: Liked you Tap is not functional and present on the screen")
							}
						}else {
							KeywordUtil.markFailed("Failed: Dislike Button is not functional and present on the screen")
						}
					}else {
						KeywordUtil.markFailed("Failed: Like Button is not functional and present on the screen")
					}
				}else {
					KeywordUtil.markFailed("Failed: Be The... label text is not present on the screen")
				}	
			}else {
				KeywordUtil.markFailed("Failed: User Name is not present on the screen")
			}
		}else {
			KeywordUtil.markFailed("Failed: Preferences Back Button is not present on the screen")
		}
	}else {
		KeywordUtil.markFailed("Failed: Preferences Button is not present on the screen")
	}
}else {
	KeywordUtil.markFailed("Failed: Explore Label text is not present on the Screen")
	
}