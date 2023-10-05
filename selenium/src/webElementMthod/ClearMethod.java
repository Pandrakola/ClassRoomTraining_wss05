package webElementMthod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://demo.vtiger.com/vtigercrm/");
	     Thread.sleep(200);
	   WebElement username=  driver.findElement(By.id("username"));
	     username.clear();
	     username.sendKeys("Anitha");

	     WebElement password = driver.findElement(By.id("password"));
	     password.clear();
	     password.sendKeys("boddukola");
	     
	     driver.findElement(By.name("Sign in")).click();
	     
	}

}
