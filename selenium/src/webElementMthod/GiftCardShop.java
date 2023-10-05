package webElementMthod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GiftCardShop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://demowebshop.tricentis.com/ ");
	     Thread.sleep(3000);
	     driver.findElement(By.partialLinkText("Gift Cards")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//div[@class='picture']")).click();
	     Thread.sleep(3000);
	     String price  = driver.findElement(By.xpath("//div[@class='short-description']/..//span[@class='price-value-1']")).getText();
	     Thread.sleep(3000);
	     System.out.println(price );
	   WebElement addToCart = driver.findElement(By.id("add-to-cart-button-1"));
	   addToCart.click();
	     
       
       driver.quit();
	}

}
