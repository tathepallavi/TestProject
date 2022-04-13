package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {
	
	WebDriver driver;
	
	@Test
	public void testCase1() throws Exception {
		
		String expectedValidation = "Sorry, we don't recognize this email.";
		
		// setting chrome properties
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sai\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver(opt); // launching chrome browser instance
		driver.manage().window().maximize();// maximize window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/"); // open url
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('login-signin').click()");
		
		Thread.sleep(3000);
		String actualValidation = driver.findElement(By.id("username-error")).getText();
		
		// validation of actual and expected result - both should be equal
		Assert.assertEquals(actualValidation,expectedValidation);
		System.out.println("Equal Assertion Successfully Validated.");
		Thread.sleep(3000);

		// AssertFalse - inside paranthesis condition should be false
		Assert.assertFalse(driver.findElement(By.id("username-error")).isSelected());
		System.out.println("False Assertion Successfully Validated.");
		Thread.sleep(3000);
		
		// AssertTrue - inside paranthesis condition should be True
		Assert.assertTrue(driver.findElement(By.id("username-error")).isDisplayed());
		System.out.println("True Assertion Successfully Validated.");
				
	}
	

}
