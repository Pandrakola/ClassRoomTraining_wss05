package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeIdName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://demo.actitime.com/login.do");
	     Thread.sleep(200);
	     
	     driver.findElement(By.id("username")).sendKeys("trainee");
	     Thread.sleep(200);
	    
	     driver.findElement(By.name("pwd")).sendKeys("trainee");
	     Thread.sleep(200);
	     
	     driver.findElement(By.id("loginButton")).click();
	     
	     
	}

}
