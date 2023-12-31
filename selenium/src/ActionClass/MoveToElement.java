package ActionClass;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     driver.manage().deleteAllCookies();
	     Actions action=new Actions(driver);
	     
	     driver.get("https://www.meesho.com/");
	   WebElement home = driver.findElement(By.xpath("//span[text()='Home & Kitchen']"));
	   action.moveToElement(home).perform();
	 
	 Thread.sleep(4000);
	
	
	WebElement kitchen = driver.findElement(By.xpath("//p[text()='Kitchen Storage']"));
	action.doubleClick(kitchen).click();
	
	
	}

}
