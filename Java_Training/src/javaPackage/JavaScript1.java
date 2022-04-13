package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScript1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();   // Delete all cookies
		driver.get("https://www.facebook.com/"); // open URL
		
		// Introducing JavascriptExecutor Interface and casting the interfaces
		JavascriptExecutor jse = (JavascriptExecutor) driver; // casting
		
		// Locating Web Element using Javascript
		jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('pass').value='123456'");
		Thread.sleep(2000);
		
		//Scroll down using Javascript
		jse.executeScript("window.scrollBy(0, 300)");
		Thread.sleep(2000);
		
		//Scroll up using Javascript
		jse.executeScript("window.scrollBy(0, -300)");
		

	}

}
