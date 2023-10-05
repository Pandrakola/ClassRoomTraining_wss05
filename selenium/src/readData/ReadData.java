package readData;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadData {

	@Test
	public static void main(String[] args) throws IOException, InterruptedException {
		//Step 1 : Create FIS object
		FileInputStream fis = new FileInputStream("./resource/config.properties");
		FileInputStream ref = new FileInputStream("./resource/test.xlsx");
		
		//Step 2 : create object of file type
		Properties prop = new Properties();
		Workbook workbook = WorkbookFactory.create(ref);
		
		//Step 3 : call read methods
		prop.load(fis);
	
		System.setProperty(prop.getProperty("chromekey"), prop.getProperty("chromepath"));
		ChromeDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("testurl"));
		driver.findElement(By.xpath("//button[text()='Allow all cookies']")).click();
		driver.findElement(By.id("email")).sendKeys(workbook.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue());
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(workbook.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
				
	}

}


