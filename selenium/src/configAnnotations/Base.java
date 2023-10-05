package configAnnotations;

import java.awt.AWTException;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class Base {
	
	
		
	public ChromeDriver driver;
       
	  @BeforeClass
	  public void browserLaunch() throws InterruptedException, AWTException {
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	       driver = new ChromeDriver();
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
