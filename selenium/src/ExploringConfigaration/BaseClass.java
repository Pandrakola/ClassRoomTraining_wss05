package ExploringConfigaration;

import java.awt.AWTException;
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

public class BaseClass {
	
	 ChromeDriver driver = new ChromeDriver();
    @Parameters("browserName")
	  @BeforeClass
	  public void browserLaunch(@Optional("chrome") String browserName) throws InterruptedException, AWTException {
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
	      driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	      driver.get("https://demowebshop.tricentis.com/");

	  }
	       @BeforeMethod
	       public void login() throws InterruptedException {
	    	   driver.findElement(By.linkText("Log in")).click();
	    		Thread.sleep(3000);
	    		
	    		driver.findElement(By.id("Email")).sendKeys("xyzabc12345@gmail.com");
	    		Thread.sleep(3000);
	     		driver.findElement(By.id("Password")).sendKeys("xyz12345");
	     		Thread.sleep(3000);
	     		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	     		
	     		
	       }
	       
	       @AfterMethod
	       public void logOut() throws InterruptedException {
	    	Thread.sleep(2000);
	   		driver.findElement(By.linkText("Log out")).click();
	   		Thread.sleep(3000);
	       }
	       
	       @AfterClass
	       public void browserTermDown() throws InterruptedException  {
	    	   Thread.sleep(2000);
	    	   driver.quit();
	    	  
	     		
	     	 }

}
