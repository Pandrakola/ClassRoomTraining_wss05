package testng;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import PageElementsRepo.BasePage;
import PageElementsRepo.HomePage;
import PageElementsRepo.LoginPage;


public class BaseClass_1{
	public ChromeDriver driver;
	public BasePage basePage ;
	public HomePage homePage ;
	
	@BeforeClass
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
		driver = new ChromeDriver(/* options */);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@BeforeMethod
	public void login() {
		basePage = new BasePage(driver);
		basePage.getLoginLink().click();
		LoginPage loginPage  = new LoginPage(driver);
	    loginPage.getEmailTextField().sendKeys("xyzabc12345@gmail.com");
		loginPage.getPasswordTextField().sendKeys("xyz12345");
				
		loginPage.getLoginButton().click();
	}
	
	protected WebElement getLoginLink() {
		// TODO Auto-generated method stub
		return null;
	}

	@AfterMethod
	public void logout() throws InterruptedException {
		Thread.sleep(3000);
		homePage= new HomePage(driver);
		homePage.getLogOutLink().click();
		Thread.sleep(1500);
	}

	@AfterClass
	public void browserTearDown() {
		driver.quit();
	}
}