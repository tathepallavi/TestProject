package javaPackage;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeleniumGrid1 {
	
	@DataProvider(parallel = true)
	public Object[][] sendData(){
		
		Object array[][] = new Object[2][2];
		
		//creating a set of data
		array[0][0] = "Email_1";
		array[0][1] = "chrome";
		
		array[1][0] = "Email_2";
		array[1][1] = "chrome";
		
		return array;

	}
	
	@Test(dataProvider = "sendData")
	public void login(String UserName, String BrowserName) throws Exception {
		
		DesiredCapabilities cap = null;
		if(BrowserName.equalsIgnoreCase("chrome")) {
			System.out.println("Using chrome browser to test the application");
			cap = DesiredCapabilities.chrome(); // association with chrome
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
		}
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(UserName);
		
	}
	

}





