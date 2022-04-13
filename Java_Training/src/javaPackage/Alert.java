package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Alert {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sai\\\\eclipse-workspace\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='confirmButton']")).click();
		Thread.sleep(2000);
		
		//verify alert text
		String alert = driver.switchTo().alert().getText();
		System.out.println(alert);
		String expectedResult = "Do you confirm action?";
		Assert.assertEquals(driver.switchTo().alert().getText(), expectedResult);
		System.out.println("Alert text verified");
		Thread.sleep(2000);
		
		//accepting alert
		driver.switchTo().alert().accept();
		System.out.println("Alert accepted");
		Thread.sleep(2000);
		
		// dismissing alert
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='confirmButton']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		System.out.println("Alert dismissed");
		Thread.sleep(2000);
	
		driver.close();
	}

}
