package com.spotlove

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions;

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.AndroidDriver;
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil




public class Utility {


	@Keyword
	def random_value(String random) {
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







}













