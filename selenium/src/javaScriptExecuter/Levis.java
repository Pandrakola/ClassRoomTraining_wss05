package javaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Levis {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	    JavascriptExecutor js=driver;
	    
	    driver.get("https://www.levi.in/buy-more-save-more?");
	   WebElement addToBag = driver.findElement(By.id("quickviewbutton"));
	   js.executeScript("arguments[0].click()", addToBag);
	   Thread.sleep(4000);
	  
	   driver.quit();
	   
	}

}
