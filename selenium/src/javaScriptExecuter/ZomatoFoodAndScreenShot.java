package javaScriptExecuter;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ZomatoFoodAndScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    JavascriptExecutor js = driver;
	    
	    driver.get("https://www.zomato.com/bangalore");
	    for(;;) {
	    	try {
	    		driver.findElement(By.xpath("//h4[text()='EasyBites by Empire']")).click();
	    		break;
	    	}
	    		catch(Exception e){
	    		js.executeScript("window.scrollBy(0,300)");
	    	}	
	    	Thread.sleep(2000);

	    }    
	    File dest = new File("./errorShots/fooddelivary.png");
		File food =driver.getScreenshotAs(OutputType.FILE);
		 FileHandler.copy(food, dest);			
	}
	    
	}
