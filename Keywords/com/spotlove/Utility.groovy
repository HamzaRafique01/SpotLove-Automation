package com.spotlove

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions;

import com.detroitlabs.katalonmobileutil.touch.Swipe
import com.detroitlabs.katalonmobileutil.touch.Swipe.SwipeDirection
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.AndroidDriver;







public class Utility {


	@Keyword
	def random_value(List random) {
		System.out.println("**************************** "+ random)
		AndroidDriver androidDriver = MobileDriverFactory.getDriver();
		AppiumDriver driver = MobileDriverFactory.getDriver();
		Actions action = new Actions(driver);

		WebElement obj = driver.findElement(By.xpath("//*[@class = 'android.widget.TextView' and (@text = '"+random+"')]"))
		obj.click()
	}


	@Keyword
	def One_liner(String One_liner) {
		System.out.println("**************************** "+ One_liner)
		AndroidDriver androidDriver = MobileDriverFactory.getDriver();
		AppiumDriver driver = MobileDriverFactory.getDriver();
		Actions action = new Actions(driver);

		WebElement obj = driver.findElement(By.xpath("//*[@class = 'android.widget.EditText' and (@text = 'This is my catch phrase' or . = 'This is my catch phrase')]"))
		obj.sendKeys(One_liner)
	}

	@Keyword
	def Save_btn_Preferences() {

		AndroidDriver androidDriver = MobileDriverFactory.getDriver();
		AppiumDriver driver = MobileDriverFactory.getDriver();
		Actions action = new Actions(driver);

		WebElement obj = driver.findElement(By.xpath('//*[contains(@text, "Save" )]'))
		obj.click()
	}




	@Keyword
	def comma_sprt_value(str1) {

		AndroidDriver androidDriver = MobileDriverFactory.getDriver();
		AppiumDriver driver = MobileDriverFactory.getDriver();
		Actions action = new Actions(driver);

		WebElement obj = driver.findElement(By.xpath('//*[contains(@text, "'+str1+'" )]'))
		obj.click()
	}


	@Keyword
	public def dating_Pref(List fu) {
		AndroidDriver androidDriver = MobileDriverFactory.getDriver();
		AppiumDriver driver = MobileDriverFactory.getDriver();
		Actions action = new Actions(driver);
		for(a in fu) {
			WebElement obj  = driver.findElement(By.xpath('//*[contains(@text, "'+a+'" )]'))
			obj.click()
		}
	}

	@Keyword
	def edit_prof_data(List Edata) {
		AndroidDriver androidDriver = MobileDriverFactory.getDriver();
		AppiumDriver driver = MobileDriverFactory.getDriver();
		Actions action = new Actions(driver);

		for(a in Edata) {
			WebElement obj  = driver.findElement(By.xpath('//*[contains(@text, "'+a+'" )]'))
			obj.click()
		}
	}

	@Keyword
	def tap_Submit() {

		AppiumDriver driver = MobileDriverFactory.getDriver();
		Actions action = new Actions(driver);

		WebElement obj = driver.findElement(By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Submit' or . = 'Submit')]"))
		obj.click()
	}

	@Keyword
	def tap_Continue() {

		AppiumDriver driver = MobileDriverFactory.getDriver();
		Actions action = new Actions(driver);

		WebElement obj = driver.findElement(By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Continue' or . = 'Continue')]"))
		obj.click()
	}

	@Keyword
	def tap_back() {

		AppiumDriver driver = MobileDriverFactory.getDriver();
		Actions action = new Actions(driver);

		WebElement obj = driver.findElement(By.xpath("//*[@class = 'android.widget.TextView' and (@text = '' or . = '')]"))
		obj.click()
	}

	@Keyword
	def pageScrollUp() {
		AppiumDriver driver = MobileDriverFactory.getDriver();
		Actions builder = new Actions(driver);
		Mobile.delay(2)
		builder.keyUp(Keys.CONTROL).sendKeys(Keys.UP).perform();
		Mobile.delay(2)
	}

	@Keyword
	def pageScrollDown() {
		AppiumDriver driver = MobileDriverFactory.getDriver();
		Actions builder = new Actions(driver);
		Mobile.delay(2)
		builder.keyDown(Keys.CONTROL).sendKeys(Keys.DOWN).perform();
		Mobile.delay(2)
	}


	@Keyword
	def tap_Phone_Numebr() {

		AppiumDriver driver = MobileDriverFactory.getDriver();
		Actions action = new Actions(driver);

		WebElement obj = driver.findElement(By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Continue with Phone Number' or . = 'Continue with Phone Number')]"))
		obj.click()
	}

	@Keyword
	def Verify() {

		AppiumDriver driver = MobileDriverFactory.getDriver();
		Actions action = new Actions(driver);

		WebElement obj = driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[2]"))
		obj.click()
	}



	@Keyword
	def swipe_down() {
		Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)
		Swipe.swipe(SwipeDirection.BOTTOM_TO_TOP)
	}

	@Keyword
	def swipe_left_to_right() {
		Swipe.swipe(SwipeDirection.LEFT_TO_RIGHT)
	}

	@Keyword
	def swipe_right_to_left() {
		Swipe.swipe(SwipeDirection.RIGHT_TO_LEFT)
	}


	@Keyword
	def swipe_up (int device_Height, int device_Width) {

		device_Height = Mobile.getDeviceHeight()

		device_Width = Mobile.getDeviceWidth()


		int startX = device_Width / 2

		int endX = startX

		int startY = device_Height * 0.55

		int endY = device_Height * 0.80

		Mobile.swipe(startX, startY, endX, endY)
		Mobile.swipe(startX, startY, endX, endY)
	}

	@Keyword
	def From_date() {
		WebDriver driver = DriverFactory.getWebDriver()
		TestObject F_month_year = findTestObject('Object Repository/Web portal/Date picker/Page_Spot Love Admin/month')

		String cmonth = WebUI.getText(F_month_year)

		//		System.out.println(cmonth)


		String date1 = "10-April 2024";

		String edate = date1.split("-")[0]

		String emonth = date1.split("-")[1]


		while((!cmonth.equals(emonth))) {
			TestObject btn_next = findTestObject('Object Repository/Web portal/Date picker/Page_Spot Love Admin/btn forword')

			WebUI.click(btn_next)

			cmonth = WebUI.getText(F_month_year)
		}
		List<WebElement> el = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 MuiTypography-colorInherit']"))

		for(WebElement e :el) {
			//			System.out.println(e.getText()+"******")
			if(e.getText().equals(edate)) {
				e.click()
				break;
			}
		}
	}


	@Keyword
	def To_date() {

		WebDriver driver = DriverFactory.getWebDriver()
		TestObject T_month_year = findTestObject('Object Repository/Web portal/Date picker/Page_Spot Love Admin/month')

		String cmonth = WebUI.getText(T_month_year)

		//		System.out.println(cmonth)


		String date1 = "10-May 2024";

		String edate = date1.split("-")[0]

		String emonth = date1.split("-")[1]


		while((!cmonth.equals(emonth))) {
			TestObject btn_next = findTestObject('Object Repository/Web portal/Date picker/Page_Spot Love Admin/To btn next')

			WebUI.click(btn_next)

			cmonth = WebUI.getText(T_month_year)
		}
		List<WebElement> el = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 MuiTypography-colorInherit']"))

		for(WebElement e :el) {
			//			System.out.println(e.getText()+"******")
			if(e.getText().equals(edate)) {
				e.click()
				break;
			}
		}
	}

	@Keyword
	def hours_selector() {

		WebDriver driver = DriverFactory.getWebDriver()
		TestObject time = findTestObject('Object Repository/Calender/2')

		WebUI.click(time)


	}


}








