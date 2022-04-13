package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sai\\\\eclipse-workspace\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/mobile-phones-store?fm=neo%2Fmerchandising&iid=M_416e998b-6cd4-42a5-9872-6e4c0407f536_2_372UD5BXDFYS_MC.ZRQ4DKH28K8J&otracker=hp_rich_navigation_3_2.navigationCard.RICH_NAVIGATION_Mobiles_ZRQ4DKH28K8J&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_3_L0_view-all&cid=ZRQ4DKH28K8J");
		Thread.sleep(2000);
		
		// creating web element reference
		WebElement Women = driver.findElement(By.xpath("//*[text()='Women']"));
		
		// Mouse simulation using Actions class
		Actions act = new Actions(driver);
		
		// Mouse hover for Women element
		act.moveToElement(Women).build().perform();
		Thread.sleep(2000);
		
		// Right click on web element
		act.contextClick(Women).build().perform();
		Thread.sleep(2000);
		
		// Release control from web element
		act.release(Women).build().perform();
		Thread.sleep(2000);
		
		// perform key events
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		// press enter key for Electronics element
		WebElement Electronics = driver.findElement(By.xpath("//*[text()='Electronics']"));
		Thread.sleep(2000);
		act.moveToElement(Electronics).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Electronics, Keys.ENTER).build().perform();
		System.out.println("Clicked on Electronics");
		
		Thread.sleep(2000);
		driver.close();
		
		

		
		
		
		
	}

}
