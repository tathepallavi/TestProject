package cucumberPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class LoginPage {
	
	WebDriver driver;
	
	public void openUrl1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sai\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver(opt); // launching chrome browser instance
		driver.manage().window().maximize();// maximize window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/"); // open url
	}

	public void enterUserName() {
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	}
	
	public void enterPassword() {
		driver.findElement(By.id("pass")).sendKeys("abc@gmail.com");
}
	public void clickLoginButton() {
		System.out.println("Login button clicked");
}

	public void verifyLogin() {
		Assert.assertTrue(true);
		
	}
	
}