package workingWithUploading;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariFileUpload2 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	      ChromeDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	      

	       driver.get("https://www.naukri.com/");
	    
	        driver.findElement(By.id("register_Layer")).click();
	       driver.navigate().refresh();
	       driver.findElement(By.xpath("//span[text()='Send me important updates on']")).click();
	       Thread.sleep(4000);
	    driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\mtech\\Downloads\\Java PDF 1 (1).pdf\\Java PDF 1 (1)");
	       //driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
	       Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_A);
		
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_A);
		
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_ENTER);
		}

	}


