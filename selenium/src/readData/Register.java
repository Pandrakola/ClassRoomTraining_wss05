package readData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Register {

	//@DataProvider(parallel = true)
	//public String[][] registerData() throws IOException {  
		
		
		
//		int numOfRows = ref.getSheet("DemoWebShop").getPhysicalNumberOfRows();
//		int numOfCells = ref.getSheet("DemoWebShop").getRow(0).getPhysicalNumberOfCells();
//		String[][] data = new String[numOfRows][numOfCells];
//		
//		for(int i=0; i<numOfRows; i++) {
//			for(int j=0; j<numOfCells; j++) {
//				data[i][j] = ref.getSheet("DemoWebShop").getRow(i).getCell(j).toString();
//			}
//		}
//		return data;
//	}
//	
	@Test
	public void registerUser() throws Exception, IOException   {
		FileInputStream fis = new FileInputStream("./resource/test.xlsx");
		Workbook ref = WorkbookFactory.create(fis);
		Row dataRow = ref.getSheet("DemoWebShop").getRow(0);
		String gender = dataRow.getCell(0).toString();
		String fistName = dataRow.getCell(1).toString();
		String lastName = dataRow.getCell(2).toString();
		String emailId = dataRow.getCell(3).toString();
		String pass = dataRow.getCell(4).toString();
		String confpass = dataRow.getCell(5).toString();
		
//		System.out.println(gender);
//		System.out.println(fistName);
//		System.out.println(lastName);
//		System.out.println(pass);
//		System.out.println(confpass);
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    	ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/register");
		if(gender.equalsIgnoreCase("male")){
			driver.findElement(By.id("gender-male")).click();
		}else {
			driver.findElement(By.id("gender-female")).click();
	}		
		driver.findElement(By.id("FirstName")).sendKeys(gender);
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys(fistName);
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys(lastName);
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confpass);
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();	
		driver.close();
	}
}
