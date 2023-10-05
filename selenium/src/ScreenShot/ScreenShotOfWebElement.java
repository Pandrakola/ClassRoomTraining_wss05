package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotOfWebElement {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   driver.manage().deleteAllCookies();
   Actions action=new Actions(driver);
   
   driver.get("https://wildcraft.com/");
        WebElement imgLogo = driver.findElement(By.xpath("//img[@title='Wildcraft']"));
        File scr = imgLogo.getScreenshotAs(OutputType.FILE);
        File dest = new File("./errorShots/img5.png");
        FileHandler.copy(scr, dest);
        
        driver.quit();
        
         
	}

}
