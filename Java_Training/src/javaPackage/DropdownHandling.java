package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {

	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver(opt); // launching chrome browser instance
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		
		// 1st way - not recommended but mostly industry use the same 
		List<WebElement> birthMonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Total dropdown values = " + birthMonth.size());
		
		birthMonth.get(7).click();
		System.out.println(birthMonth.get(1).isEnabled());  // true
		System.out.println(birthMonth.get(8).isSelected());  // false
		
		
		// 2nd way - using Select class constructor
		
		WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
		// will use select class constructor
		Select month = new Select(bm); // Parameterized constructor
		// select by visiable text
		month.selectByVisibleText("Jan"); // Jan
		// select by value
		month.selectByValue("2"); // Feb
		// select by index
		month.selectByIndex(2); // Mar
		//get current selected value from dropdown
		System.out.println(month.getFirstSelectedOption().getText()); // Mar
		
		
		// 3rd way - storing all dropdown values in a list
		
		List<WebElement> dropdown = month.getOptions();
		System.out.println("Total dropdown values are" +  dropdown.size());
		for(int i = 0; i < dropdown.size(); i++) {
			String dropdownValues = dropdown.get(i).getText();
			if(dropdownValues.equalsIgnoreCase("Apr")) {
				dropdown.get(i).click();
				break;
			}
			
			
			//4th way - checking if dropdown supports multiple selection or not
			System.out.println(month.isMultiple()); // false
			
			//for multiple selection
			//month.selectByVisibleText("May");//may
			//month.selectByValue("6");//june
			//month.selectByIndex(6);//july
			
			//deselect the selected dropdown values
			//month.deselectByVisibleText("May");// deselects may
			//month.deselectByValue("6"); //deselects june
			//month.deselectByIndex(6); // deselects july
			//month.deselectAll(); // deselects all
			
			
			//5th way
			bm.sendKeys("Aug");
			
			
			//6th way
			driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Dec");
			
			
			
			
			
			
			
		}
		
		
		
		
	} 

}
