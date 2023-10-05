package workingWithUploading;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	      ChromeDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	      

	       driver.get("https://demowebshop.tricentis.com/");
	       
	       driver.findElement(By.linkText("Log in")).click();
	       Thread.sleep(4000);
	       driver.findElement(By.id("Email")).sendKeys("anitha2010k@gmail.com");
	       Thread.sleep(4000);
	       driver.findElement(By.id("Password")).sendKeys("Boddukola@530");
	       Thread.sleep(4000);
	       driver.findElement(By.xpath("//input[@value='Log in']")).click();
	       

	}

}
