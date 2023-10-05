package javaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleWebSiteScrollBy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	    JavascriptExecutor js=driver;
	    
	    driver.get("https://www.google.com/doodles");
	    for(;;) {
	    	try {
	    		driver.findElement(By.linkText("Israel Independence Day 2022")).click();
	    		break;
	    	}catch(Exception e){
	    
	    js.executeScript("window.scrollBy(0,150)");
	}

	    }
	}
}
