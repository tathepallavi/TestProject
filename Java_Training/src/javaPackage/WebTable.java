package javaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.financialexpress.com/market/stock-market/nse-top-gainers/");
		
		// create list of all companies
		List<WebElement> allCompanies = driver.findElements(By.xpath("//table[@id='modality']/tbody/tr/td[1]/a"));
		System.out.println("Total companies = " + allCompanies.size());
		
		// list of all current Price (2nd column from table)
		List<WebElement> allCurrentPrice = driver.findElements(By.xpath("//table[@id='modality']/tbody/tr/td[2]"));
		System.out.println("Total Current Price = " + allCurrentPrice.size());
		
		String expectedCompanyName = "Global Education";
		for(int i = 0; i < allCompanies.size(); i++) {
			if(allCompanies.get(i).getText().equalsIgnoreCase(expectedCompanyName)) {
				System.out.println(allCompanies.get(i).getText()  +  " === " + allCurrentPrice.get(i).getText());
				allCompanies.get(i).click();
				break;
				
			}
			
		}
		

	}

}
