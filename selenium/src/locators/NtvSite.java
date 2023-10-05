package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NtvSite {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./chromedriver/drivers.exe");
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/");
	
	
        
	
	   driver.findElement(By.id("player_2068292279_ima-controls-div")).click();

	}

}
