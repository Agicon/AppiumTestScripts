package Tests.java;

import org.testng.annotations.Test;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.annotations.AfterMethod;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.BeforeSuite;

public class NewTest extends BaseClass{

	// **********Page Factory - OR**********//

	@AndroidFindBy(id = "com.android.calculator2:id/digit_9")
	WebElement eightNumber;
//	static AppiumDriver driver;
	public NewTest() {
		PageFactory.initElements(driver, this);
	}

	public static boolean waitForPresence(WebElement mobileElement) {

		try {
//			AppiumDriver wait = new AppiumDriver(driver, 10);
//			wait.until(ExpectedConditions.visibilityOf(mobileElement));
			boolean isElementPresent = mobileElement.isDisplayed();
			return isElementPresent;
		} catch (Exception e) {
			boolean isElementPresent = false;
			System.out.println(e.getMessage());
//			logger.error("Element is not visible: " + mobileElement);
			return isElementPresent;
		}
	}
	@BeforeSuite
  public void f() throws Exception {

	  OpenCalculator();
  }
 
  @Test(priority = 2)
  public void first() throws Exception {
	  driver.findElement(By.id("com.android.calculator2:id/digit_2")).click();

  }
  
  @Test(priority = 1)
  public void second() throws Exception {
	  driver.findElement(By.id("com.android.calculator2:id/digit_1")).click();

  }
  @AfterMethod 
  public void takeScreenShotOnFailure(ITestResult testResult) throws IOException { 
  	GetFailureScreenshot(testResult);
}
}
