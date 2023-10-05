package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotOfWebpage {

	

	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.regatta.com/row/");
	
	
	File src =driver.getScreenshotAs(OutputType.FILE);

    File dest = new File("./errorShots/img1.png");
	 FileHandler.copy(src, dest);


	}

}
