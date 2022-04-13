package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation3 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sai\\\\eclipse-workspace\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		
		// Switch to frame
		List<WebElement> allFrames = driver.findElements(By.tagName("ifeame"));
		System.out.println("Total no of frames = " + allFrames.size());
		driver.switchTo().frame(0);
		
		// find draggable element
		WebElement draggableElement = driver.findElement(By.id("draggable"));
		Thread.sleep(2000);
		
		// Dragging element from one coordinate to other coordinate using Actions class
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(draggableElement, 30, 20).build().perform();
		Thread.sleep(2000);
		
		//Drag the element and click and hold using coordinates
		act.clickAndHold(draggableElement).dragAndDropBy(draggableElement, 60, 60).build().perform();
		

	}

}
