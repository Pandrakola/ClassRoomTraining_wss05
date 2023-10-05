package javaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BataShoeScelecter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	    JavascriptExecutor js=driver;
	    
	    driver.get("https://www.bata.in/new/");
	   WebElement imgshoe = driver.findElement(By.partialLinkText("BUBBLEGUMMERS"));
         js.executeScript("arguments[0].click",imgshoe);
         //Thread.sleep(3000);
        // driver.quit();
	}

}
