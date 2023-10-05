package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLoginDetails {

	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://accounts.google.com/");
	
	Thread.sleep(2000);
	
	driver.findElement(By.name("af8ijd")).sendKeys("anitha2010k@gmail.com");
	
	
	driver.findElement(By.name("password")).sendKeys("boddukola");
	
	driver.findElement(By.className("Next")).click();
	
	
	}

}
