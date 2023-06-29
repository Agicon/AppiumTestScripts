package Tests.java;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;

import io.appium.java_client.AppiumDriver;

public class BaseClass extends ExtentReportsDemo{
	static AppiumDriver driver;

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
	
	public static void GetFailureScreenshot(ITestResult testResult) throws IOException {
		if (testResult.getStatus() == ITestResult.FAILURE) { 
	  		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
	  		FileUtils.copyFile(scrFile, new File("errorScreenshots\\" + testResult.getName() + "-" 
	  				+ Arrays.toString(testResult.getParameters()) +  ".jpg"));
	  	} 
	}
	
}
