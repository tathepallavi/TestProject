package javaPackage;

import java.io.File;
import java.io.FileInputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG10 {
	
	WebDriver driver;
	
	@BeforeClass
	public void setEnv() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sai\\\\eclipse-workspace\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
	}
	
	// To get current date and time
	public String getDateAndTime() {
		DateTimeFormatter currentDateAndTime = DateTimeFormatter.ofPattern("yyyy/mm/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		return currentDateAndTime.format(now);
		
	}
	
	@DataProvider
	public Object[][] dataSet() throws Exception {
		// Specify the properties file location
				File src = new File("C:\\Users\\Sai\\eclipse-workspace\\Java_Training\\Repository\\Object_Repo.properties");
				
				// Create FileInputStream class object to load the file
				FileInputStream fis = new FileInputStream(src);
				
				// Create Properties class object to read properties file
				Properties pro = new Properties();
				pro.load(fis); // to read properties file from Property class
				
				Object arr[][] = new Object[3][2];  //object array
				
				TestNG10 t10 = new TestNG10();
				
				arr[0][0] = pro.getProperty("EmailTestData") + " " + t10.getDateAndTime();
				arr[0][1] =pro.getProperty("PasswordTestData");
				
				arr[1][0] = "Email_2";
				arr[1][1] =	"Password_2";
				
				arr[2][0] = "Email_3";
				arr[2][1] =	"Password_3";
				
				return arr;
		
	}
	
	@Test(dataProvider = "dataSet")
	public void enterCred(String UserName, String Password) throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(UserName);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Password);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
	}
}
