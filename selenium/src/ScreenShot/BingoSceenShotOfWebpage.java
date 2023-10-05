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

public class BingoSceenShotOfWebpage {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  driver.manage().deleteAllCookies();
  Actions action=new Actions(driver);
  
  driver.get("https://bingosnacks.com/");
  File scr = driver.getScreenshotAs(OutputType.FILE);
  File dest = new File("./errorShots/img4.png");
  FileHandler.copy(scr, dest);
  
       WebElement imgLogo1 = driver.findElement(By.xpath("//img[@title='Bingo!']"));
       File scr1 = imgLogo1.getScreenshotAs(OutputType.FILE);
       File dest1 = new File("./errorShots/img3.png");
       FileHandler.copy(scr1, dest1);
       
       driver.quit();
	}

}
