package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBox {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver(opt); // launching chrome browser instance
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.myntra.com/women-jackets");
		Thread.sleep(2000);
		
		// 1st way
		driver.findElement(By.xpath("//div[@class='common-checkboxIndicator'][1]")).click();
		Thread.sleep(2000);
		
		// 2nd way
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']")); // creating list of checkbox
		System.out.println("Total no of checkbox = " + checkbox.size() );  // calculating total no of checkbox
		Thread.sleep(2000);
		
		//3rd way
		List<WebElement> checkboxText = driver.findElements(By.xpath("//label[contains(@class,'common')]"));
		String Check = "Campus sutra";
		
		for(int i = 0; i < checkboxText.size(); i++) {
			if(checkboxText.get(i).getText().equalsIgnoreCase(Check)) {
				checkboxText.get(i).click();
				System.out.println(Check + "clicked");
				break;
				
			}
			
		}
		
		

	}

}
