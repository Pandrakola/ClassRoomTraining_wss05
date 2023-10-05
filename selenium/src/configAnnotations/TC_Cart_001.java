package configAnnotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_Cart_001 extends Base {
	    
	        @Test
	public void add() throws InterruptedException {
	        	
	        	driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	        	
	        	driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("anitha2010k@gmail.com");


		        driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("Tijo B");
		        
		        driver.findElement(By.id("add-to-cart-button-2")).click();
		        driver.findElement(By.xpath("//p[@class='content']")).click();
		
	        }
	        @Test
	    	public void ClickOn() {
	    		driver.findElement(By.linkText("awesome")).click();
	    	
	    	}
}
		
		
		
		
		
     
	


