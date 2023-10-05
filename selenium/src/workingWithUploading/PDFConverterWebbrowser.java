package workingWithUploading;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PDFConverterWebbrowser {

	public static void main(String[] args) throws InterruptedException, AWTException  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	      ChromeDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	      

	       driver.get("https://www.freepdfconvert.com/word-to-pdf");
	    
	       
	       //driver.navigate().refresh();
	       driver.findElement(By.partialLinkText("Choose WORD file")).click();
	       Thread.sleep(4000);
	   //driver.findElement(By.linkText("btn-wrapper upload-btn")).sendKeys("\"C:\\Anitha-Homework\\ClassVideos\\SUMANTH.txt\"SUMANTH");
	    	    driver.findElement(By.xpath("//span[@class='btn-label']")).sendKeys("\"C:\\Users\\mtech\\.node_repl_history\"");

	       //driver.findElement(By.xpath("//input[@class='file-upload-input']")).click();
	       
	       driver.findElement(By.xpath("//button[@type='submit']")).click();
	       Robot robot = new Robot();
	       Thread.sleep(4000);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(4000);
			robot.keyRelease(KeyEvent.VK_TAB);
			
			robot.keyRelease(KeyEvent.VK_ENTER);
			}
	   
	       }


	



