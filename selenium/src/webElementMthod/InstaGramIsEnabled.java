package webElementMthod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaGramIsEnabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.instagram.com/");
	     Thread.sleep(3000);
	     //driver.findElement(By.xpath("///button[text()='Decline optional cookies']")).click();
	     Thread.sleep(3000);
	     WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
	     Thread.sleep(3000);
	     driver.findElement(By.name("username")).sendKeys("weyteu");
	     driver.findElement(By.name("password")).sendKeys("gdwfjhfjhtui");
	    System.out.println(loginButton.isEnabled());
	    Thread.sleep(3000);
	     driver.quit();
	     
	}

}
