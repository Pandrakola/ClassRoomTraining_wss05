package readData;



import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import genericLibrary.ExcelLibrary;

public class Login_1 {
	
	
	@Test(dataProvider = "Login_1")
public void loginWithCread() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(ExcelLibrary.readFromExcel("Login_1", 0, 0));
		driver.findElement(By.id("Password")).sendKeys(ExcelLibrary.readFromExcel("Login_1", 0, 1));
		driver.findElement(By.id("Log in")).click();
	}

}
