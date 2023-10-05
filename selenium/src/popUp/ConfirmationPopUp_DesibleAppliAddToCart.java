package popUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp_DesibleAppliAddToCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();

	    
	    driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
	    Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@ondblclick='addtocart()']")).click();
	  Alert promptPopUp = driver.switchTo().alert();
	  promptPopUp.accept();
	  System.out.println(driver.findElement(By.id("callout")).getText());
			 Thread.sleep(4000);
			 driver.quit();
	  
	}

}
