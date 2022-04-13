package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class TakeScreenshotOnFailure2 {
	
	// creating object of TakeScreenshotOnFailure1 at class level
	TakeScreenshotOnFailure1 t1 = new TakeScreenshotOnFailure1();
	
	@Test(priority = 1)
	public void doLogin() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sai\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		
		t1.driver = new ChromeDriver(opt); // refer driver reference from TakeScreenshotOnFailure1 program
		t1.driver.manage().window().maximize();
		t1.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		t1.driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		t1.driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abc");
		t1.driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123");
		
		//passing wrong id to make test case fail
		t1.driver.findElement(By.xpath("//*[@id='login_button_test']")).click();
		
			
		}
	
	@Test(priority = 2)
	public void assertionCheck() {
		System.out.println("Assertion check");
	}
	
	@AfterMethod
	public void takeScreenshotOnFailure(ITestResult ssresult) throws Exception {
		t1.captureScreenshot(ssresult);
		
	}
	
	}


