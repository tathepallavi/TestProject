package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation2 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sai\\\\eclipse-workspace\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		
		//Switching frame
		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total no of frames =  "  + allFrames.size()); // total no of frames
		
		
		// Selecting specific frame, in case of multiple frames on web page
		for(int i = 0; i < allFrames.size(); i++) {
			driver.switchTo().frame(i);
			if(driver.findElement(By.id("draggable")).isDisplayed() && driver.findElement(By.id("droppable")).isDisplayed()) {
				Thread.sleep(2000);
				
				Actions act = new Actions(driver);
				act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
				System.out.println("Element is found in "+ (i + 1) +"st frame");
				
				
			}
			
			
			
			
		}

	}

}
