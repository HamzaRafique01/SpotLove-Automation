import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.awt.RenderingHints.Key
import org.openqa.selenium.WebDriver
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
import org.openqa.selenium.Keys
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileBy
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement
import org.openqa.selenium.By
import org.openqa.selenium.Dimension;
import com.kms.katalon.core.testobject.MobileTestObject
import com.kms.katalon.core.testobject.MobileTestObject.MobileLocatorStrategy
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.TouchAction
import io.appium.java_client.TouchAction as TouchAction
import io.appium.java_client.touch.WaitOptions
import io.appium.java_client.touch.offset.PointOption
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.util.KeywordUtil as KeywordUtil



AndroidDriver androidDriver = MobileDriverFactory.getDriver();
AppiumDriver driver = MobileDriverFactory.getDriver();
Actions action = new Actions(driver);


if(Mobile.waitForElementPresent(Back, 30)) {

	KeywordUtil.markPassed('PASSED: Back button present on the screen')

	if(Mobile.waitForElementPresent(Megnifying_icon, 30)) {

		KeywordUtil.markPassed('PASSED: Megnifying icon present on the screen')

		if(Mobile.waitForElementPresent(Whats, 30)) {

			KeywordUtil.markPassed('PASSED: Whats your... label text present on the screen')


			//	MobileTestObject obj = androidDriver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\""+Ethnicity+"\").index(0))"))

			//	MobileTestObject obj = androidDriver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text('White/Caucasian').index(0))")).click()
			
			WebElement good_url = driver.findElement(By.xpath("//*[@class = 'android.widget.TextView' and (@text = '"+Ethnicity+"')]"))
			System.out.println("XPATH >>>>>>>>> "    + good_url)
			good_url.click()
			//Mobile.tap(good_url, 10)
			//*[@class = 'android.widget.TextView' and (@text = 'Black/African Descent' or . = 'Black/African Descent')]
		//	WebElement good_url = driver.findElement(By.xpath("//*[@class = 'android.view.View' and (@content-desc = '"+goodURL+"')]"))
		//	androidDriver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text('White/Caucasian').index(0))")).click()
			//	Mobile.tap(obj, 10)


			if(Mobile.waitForElementPresent(Continue, 30)) {

				Mobile.tap(Continue, 30)
				KeywordUtil.markPassed('PASSED: Continue button present on the screen')


			}else {
				KeywordUtil.markFailed('FAILED: Whats your... label text is not present on the screen')
			}
		}else {
			KeywordUtil.markFailed('FAILED: Megnifying icon is not present on the screen')
		}
	}else {
		KeywordUtil.markFailed('FAILED: Back button is not present on the screen')
	}
}else {
	KeywordUtil.markFailed('FAILED: Back button is not present on the screen')
}