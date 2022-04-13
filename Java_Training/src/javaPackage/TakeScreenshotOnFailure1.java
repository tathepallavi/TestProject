package javaPackage;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeScreenshotOnFailure1 {
	
	WebDriver driver;
	
	public void captureScreenshot(ITestResult ssresult) throws Exception {
		
		if(ITestResult.FAILURE == ssresult.getStatus()) {
			
			//create reference of TakesScreenshot interface and type casting
			TakesScreenshot ts = (TakesScreenshot)driver; // Type casting of 2 interfaces
			
			// use getScreenshotAs() method to capture ss in file format
			// getScreenshotAs() method return type is file
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			// copy file to specific location
			FileUtils.copyFile(source, new File ("./screenshot/" + ssresult.getName() + ".png"));
			System.out.println(ssresult.getName() + "method() screenshot captured");
			
		}
	
	}
	
	

}
