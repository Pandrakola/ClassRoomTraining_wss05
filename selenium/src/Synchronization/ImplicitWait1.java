package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait1 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     
	     driver.get("https://www.instagram.com/");
	     
	     //driver.findElement(By.xpath("///button[text()='Decline optional cookies']")).click();


	     WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));


	     driver.findElement(By.name("username")).sendKeys("weyteu");
	     driver.findElement(By.name("password")).sendKeys("gdwfjhfjhtui");
	    System.out.println(loginButton.isEnabled());


	     driver.quit();
	     
	}



	}


