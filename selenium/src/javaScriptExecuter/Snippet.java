package javaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snippet {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		     ChromeDriver driver=new ChromeDriver();
		     driver.manage().window().maximize();
		    JavascriptExecutor js=driver;
		    
		    driver.get("https://demowebshop.tricentis.com/search?q=books");
		    
   WebElement searchEle = driver.findElement(By.id("small-searchterms"));
   js.executeScript("arguments[0].value='Books'", searchEle);
   Thread.sleep(3000);
   driver.quit();
}

}