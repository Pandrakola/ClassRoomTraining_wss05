package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTheTextJewelry {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://demowebshop.tricentis.com/");
	     Thread.sleep(3000);
	     
	     driver.findElement(By.partialLinkText("Jewelry")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.partialLinkText("Black & White Diamond Heart")).click();
	     Thread.sleep(5000);
	     String text=driver.findElement(By.xpath("//div[contains(@class,'short-description')]")).getText();
	     System.out.println(text);
	     
	     Thread.sleep(3000);
	     driver.quit();
	     
	  
	}

}
