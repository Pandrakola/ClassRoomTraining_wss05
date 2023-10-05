package iFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NextedFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     driver.manage().deleteAllCookies();
	     
	     driver.get("https://demo.automationtesting.in/Frames.html");
	     driver.switchTo().frame(0);
	     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("anitha");
	    
	    driver.switchTo().parentFrame();
	    driver.findElement(By.linkText("Iframe with in an Iframe")).click();
	    
	  WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	  driver.switchTo().frame(frame1);
	WebElement frame2 = driver.findElement(By.xpath("//iframe[normalize-space()='<p>Your browser does not support iframes.</p>']"));
	driver.switchTo().frame(frame2);
     WebElement inspectedElement = driver.findElement(By.xpath("//input[@type='text']"));
     inspectedElement.sendKeys("ANITHA");

	  
	 
           
            
            
	}

}
