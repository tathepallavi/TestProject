package javaPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopupHandling1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sai\\\\eclipse-workspace\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://naukri.com/");
		Thread.sleep(2000);
		
		// get alphanumeric id for all popup on web page
		Set<String> PopupId = driver.getWindowHandles();
		System.out.println(PopupId);
		
		
		// display total no of popups on web page
		System.out.println(PopupId.size());
		
		Iterator<String> abc = PopupId.iterator();
		String window1 = abc.next();
		String window2 = abc.next();
		String window3 = abc.next(); // if there are 3 popups
		
		// Print title of Popup window1
		driver.switchTo().window(window1);
		System.out.println(window1); // to get alphanumeric Id of window1
		System.out.println(driver.getTitle()); // to get title of window1
		
		driver.close(); // to close current window
		

	}

}
