package javaPackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ObjectRepository {

	public static void main(String[] args) throws Exception {
		
		// create an object of class
		ObjectRepository objectRepo = new ObjectRepository();  
		
		// Specify the properties file location
		File src = new File("C:\\Users\\Sai\\eclipse-workspace\\Java_Training\\Repository\\Object_Repo.properties");
		
		// Create FileInputStream class object to load the file
		FileInputStream fis = new FileInputStream(src);
		
		// Create Properties class object to read properties file
		Properties pro = new Properties();
		pro.load(fis); // to read properties file from Property class
		
		// Setting the property of chrome driver and passing path
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sai\\\\eclipse-workspace\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		objectRepo.openURL(driver, pro.getProperty("URL1"));
		Thread.sleep(3000);
		objectRepo.openURL(driver, pro.getProperty("URL"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("Email"))).sendKeys(pro.getProperty("EmailTestData"));
		driver.findElement(By.xpath(pro.getProperty("Password"))).sendKeys(pro.getProperty("PasswordTestData"));
		driver.quit();
	}

	// open URL
	public void openURL(WebDriver driver, String url) {
		driver.get(url);
	}
	
	
}
