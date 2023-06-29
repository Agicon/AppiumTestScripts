package com.AppiumApp;

import java.net.URL;
import java.sql.Driver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Calculator {

	static AppiumDriver driver;
	public static void main(String[] args) throws Exception {
//		new1();
//	}
		// TODO Auto-generated method stub

		
		try {
			OpenCalculator();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}
		new1();

	}
//	
	public static void OpenCalculator() throws Exception {
		
	
DesiredCapabilities cap=new DesiredCapabilities();
cap.setCapability("deviceName", "Android SDK built  for x86");
cap.setCapability("udid", "emulator-5554");
cap.setCapability("platformName", "Android");
cap.setCapability("platformVersion", "8.1.0");
//cap.setCapability("app", "C://Users//my//Downloads//API.apk");
cap.setCapability("appPackage", "com.android.calculator2");
cap.setCapability("appActivity", "com.android.calculator2.Calculator");
URL url = new URL(" http://127.0.0.1:4723/wd/hub");
driver = new AppiumDriver(url,cap);
driver.findElement(By.id("com.android.calculator2:id/digit_8")).click();
System.out.println("1233644636");

	}
	
		public static void new1() {
		driver.findElement(By.id("com.android.calculator2:id/digit_8")).click();
	}
	
	@Test
	public void new2() {
		driver.findElement(By.id("com.android.calculator2:id/digit_8")).click();
	}
	@Test
	public void new3() {
		driver.findElement(By.id("com.android.calculator2:id/digit_8")).click();
	}
	@Test
	public void new4() {
		driver.findElement(By.id("com.android.calculator2:id/digit_8")).click();
	}
	
}
