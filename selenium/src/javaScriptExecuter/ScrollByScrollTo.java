package javaScriptExecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByScrollTo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	    JavascriptExecutor js=driver;
	    
	    driver.get("https://wildcraft.com/");
	    js.executeScript("window.scrollBy(0,100)");
	    Thread.sleep(2000);
	    js.executeScript("window.scrollBy(0,100)");
	    Thread.sleep(2000);
	    js.executeScript("window.scrollBy(0,100)");
	    Thread.sleep(2000);
	    js.executeAsyncScript("window.scrollTo(0,900)");
	    Thread.sleep(2000);
	    js.executeAsyncScript("window.scrollTo(0,900)");

	}

}
