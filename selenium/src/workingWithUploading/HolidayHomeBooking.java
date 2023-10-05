package workingWithUploading;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HolidayHomeBooking {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	      ChromeDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	      

	       driver.get("https://www.airbnb.co.in/");
	       
	       
	       driver.findElement(By.xpath("//button[@type='button']")).click();
	       driver.findElement(By.xpath("//div[@class='f1den9qh dir dir-ltr']")).click();
	       driver.findElement(By.xpath("//body[@class='with-new-header']")).click();
	       driver.findElement(By.id("country")).sendKeys("Indian");
	       driver.findElement(By.id("phoneInputphoneNumber")).sendKeys("987654321");

	}

}
