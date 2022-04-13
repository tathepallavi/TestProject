package javaPackage;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {
		
		//specify the location of Excel file
		File src = new File("C:\\Users\\Sai\\Desktop\\ExcelData\\Demo.xlsx");
		
		//Load the file
		FileInputStream fis = new FileInputStream(src);
		
		//Load workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		// Load the worksheet
		XSSFSheet sh = wb.getSheet("DemoSheet");
		
		// Print the name of loaded sheet
		System.out.println(sh.getSheetName());
		
		//Print Username from Excel sheet
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		
		// Print p2 from Excel sheet
		System.out.println(sh.getRow(2).getCell(1).getStringCellValue());
		
		//Print total no of rows - 1st way
		System.out.println("Total Rows: " + sh.getPhysicalNumberOfRows());
		
		//Print total no of rows - 2nd way
		System.out.println(sh.getLastRowNum()); // here Index will work and output will be 5
		System.out.println(sh.getFirstRowNum());// here Index will work and output will be 0
		int rows = (sh.getLastRowNum() - sh.getFirstRowNum()) + 1 ;
		System.out.println("Total Rows:" + rows);  //6
		
		//Print total no of rows - 3rd way
		System.out.println("Total Rows:" + (sh.getLastRowNum() + 1));
		
		// print total no of column - 1st way
		System.out.println("Total columns: " + sh.getRow(0).getPhysicalNumberOfCells());
		
		// print total no of column - 2nd way
		System.out.println("Total columns: " + sh.getRow(0).getLastCellNum());
		
		// print total no of column - 3rd way
		int columns = sh.getRow(0).getLastCellNum();
		System.out.println("Total columns: " + columns);
		
		// Print all cells of Excel sheet
		for(int i = 0; i< rows; i++) {
			for(int j = 0; j< columns; j++) {
				System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
				
			}
		}

		// Setting the property of chrome browser and passing chrome driver path
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
				
				ChromeOptions opt = new ChromeOptions();
				
				opt.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
				WebDriver driver = new ChromeDriver(opt); // launching chrome browser instance
				driver.manage().window().maximize(); // maximize the window
				Thread.sleep(3000);  // waiting for 3 seconds
				driver.get("https://www.facebook.com/"); // Open URL
				Thread.sleep(3000);
				
				//Enter username using Excel sheet
				
				String a = sh.getRow(0).getCell(0).getStringCellValue();
				driver.findElement(By.id("email")).sendKeys(a);
	}

}
