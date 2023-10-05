package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;




public class CrossBrowser {
	
	public ChromeDriver driver;
	
	@Parameters("browserName")
	@BeforeClass
	public void browserLaunch(@Optional("chrome") String browserName) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			FirefoxDriver driver = new FirefoxDriver();
		} else if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			EdgeDriver driver = new EdgeDriver();
		} else {
			System.out.println("Browser is invalid");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
	}

	@BeforeMethod
	public void login() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("sumanth.l@testyantra.com");
		driver.findElement(By.id("Password")).sendKeys("WebShop");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@AfterMethod
	public void logout() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(1500);
	}

	@AfterClass
	public void browserTearDown() {
		driver.quit();
	}


}
