package javaPackage;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Log4J {

	public static void main(String[] args) {
		
		// We need to create logger instance so we need to pass class name for which we want to create log file
		org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger("Log4J");
		
		// Configure Log4J.properties file
		PropertyConfigurator.configure("C:\\Users\\Sai\\eclipse-workspace\\Java_Training\\log4j.properties");
		
		// open chrome browser instance
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver(opt); // launching chrome browser instance
		logger.info("Chrome driver instance open");
		
		// maximize window
		driver.manage().window().maximize();
		logger.info("window maximised");
		
		// set implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("implicit wait given");
		
		// open url
		driver.get("https://www.facebook.com/");
		logger.info("application launched");
		
		
	}
	

}
