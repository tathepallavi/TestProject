package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenURL {
	
	public static void main(String[] args) throws Exception {
		
		// setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");  //chrome binary location specified here
		
		// launching chrome browser instance
		WebDriver driver = new ChromeDriver(opt); 
		
		// manage() method - to maximize the window
				driver.manage().window().maximize();
		
		// open URL of application using get() and navigate() method
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(3000);
		
		// refresh page
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		// navigate to back
		driver.navigate().back();
		Thread.sleep(3000);
		
		// navigate to forward
		driver.navigate().forward();
		Thread.sleep(3000);
		
		// navigate to back again
		driver.navigate().back();
		Thread.sleep(3000);
		
		// get current url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(3000);
		
		// get title of the page
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		// locate web element
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pallavitathe93@yahoo.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123");
		Thread.sleep(3000);
		System.out.println("entered id and password");
		
		//get tagname of specific web element
		String tagname = driver.findElement(By.xpath("//input[@id='email']")).getTagName();
		System.out.println(tagname);
		
		// close current browser instance
		driver.close();
		
		// close all browser instance
		driver.quit();
		
	
	}

}
