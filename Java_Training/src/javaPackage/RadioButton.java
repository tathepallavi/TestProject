package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RadioButton {

	public static void main(String[] args) throws Exception {
		
		// setting the property of chrome browser and passing chromedriver path
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
				
				ChromeOptions opt = new ChromeOptions();
				
				opt.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
				WebDriver driver = new ChromeDriver(opt); // launching chrome browser instance
				driver.manage().window().maximize(); // maximize the window
				Thread.sleep(3000);  // waiting for 3 seconds
				driver.get("https://www.facebook.com/"); // Open URL
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
				Thread.sleep(3000);
				
				// 1st way - creating list of radio buttons - not much recommended
				driver.findElement(By.xpath("//input[@value='1']")).click();  // click on Female radio button
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@value='2']")).click();  // click on Male radio button
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@value='-1']")).click();  // click on Custom radio button
				
				//2nd way - creating list for all radio buttons - not recommended way
				List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']")); //created list of radio buttons
				System.out.println("total radio buttons =" + radios.size());  // to see how many radio buttons are there
				
				System.out.println(radios.get(1).isEnabled()); // to verify if male is enabled or not
				System.out.println(radios.get(0).isDisplayed());  // to verify if Female is displayed or not
				System.out.println(radios.get(2).isSelected());  // to verify if Custom is Selected or not
				Thread.sleep(3000);
				radios.get(1).click();    // to select Male
				Thread.sleep(3000);
				System.out.println(radios.get(2).isSelected());  // to verify if Custom is Selected or not
				
				//3rd way - creating a list of text present for radio buttons - correct way
				List<WebElement> radios1 = driver.findElements(By.xpath("//label[contains(@class,'mt')]")); // created list of text for radio buttons
				String ExpectedResult = "Female"; //declared variable to select female
				
				for(int i = 0; i < radios1.size(); i++) {
					if(radios1.get(i).getText().equalsIgnoreCase(ExpectedResult)) {
						radios1.get(i).click();
						System.out.println(ExpectedResult + " clicked");
						break;
						
						
					}
				}
				
				Thread.sleep(3000);
				driver.close();
				
				
				
			
	}

}
