package selectClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterMobileNumber {

	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     driver.manage().deleteAllCookies();
	     
	     driver.get("https://www.dream11.com/");
	     driver.switchTo().frame("send-sms-iframe");
	 driver.findElement(By.id("regEmail")).sendKeys("987654321");
	 
	     

	}

}
