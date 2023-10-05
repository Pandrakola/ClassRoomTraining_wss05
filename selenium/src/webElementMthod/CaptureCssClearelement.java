package webElementMthod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureCssClearelement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.meesho.com/search?q=watches ");
	     Thread.sleep(200);
	     
  String price = driver.findElement(By.xpath("//p[text()='Smart Watches']/..//h5[text()='349']")).getText();
  System.out.println(price);
 
  driver.quit();
	}

}
