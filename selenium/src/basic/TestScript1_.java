package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestScript1_ {

	public ChromeDriver driver = null;

	@Parameters("url")
	@Test
	public void readTestData(@Optional("") String url) throws InterruptedException {
		Reporter.log("Chreading data from xml at the runtime", true);

		// if(bName.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();

		/*
		 * }else if(bName.equals("firefox")) {
		 * System.setProperty("webdriver.chrome.driver", "./drivers/geckodriver.exe");
		 * driver = new FireFoxDriver(); }else if(bName.equals("edge")) {
		 * System.setProperty("webdriver.chrome.driver", "./drivers/msedgedriver.exe");
		 * driver = new EdgeDriver(); } else { System.out.println("browser is invalid");
		 * }
		 */

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demowebshop.tricentis.com/");

	}

//	@BeforeMethod
//
//	public void login() {
//		driver.findElement(By.linkText("Log in")).click();
//		driver.findElement(By.id("Email")).sendKeys("sumanth.l@testyantra.com");
//		driver.findElement(By.id("Password")).sendKeys("WebShop");
//		driver.findElement(By.xpath("//input[@value='Log in']")).click();
//	}

//	@AfterMethod
//	public void logout() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("Log out")).click();
//		Thread.sleep(1500);
//	}

	@AfterClass
	public void browserTearDown() {
		driver.quit();
	}

}
