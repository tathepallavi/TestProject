package javaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSuggestionHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sai\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver(opt); // launching chrome browser instance
		driver.manage().window().maximize();// maximize window
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/"); // open url
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("How Stuff Works"); // locate search option and input data into it
		
		// how to handle auto suggestion
		List<WebElement> allSearch = driver.findElements(By.xpath("//ul[@role='listbox']/li")); //take common xpath
		System.out.println("Total auto suggestions displayed = " +  allSearch.size());
		
		for(int i = 0; i < allSearch.size(); i++) {
			String allSearchText = allSearch.get(i).getText();
			String expectedSearchText = "how stuff works play";
			
			if(allSearchText.equalsIgnoreCase(expectedSearchText)) {
				allSearch.get(i).click();
				System.out.println("You have clicked on " + expectedSearchText);
				break;
			}
			
			
		}
		
		

	}

}
