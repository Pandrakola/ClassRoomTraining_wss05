package ActionClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class DragAndDropCustomDemo {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     driver.manage().deleteAllCookies();
	     File scr = driver.getScreenshotAs(OutputType.FILE);
		 File dest =new File("./errorShots/img2.png");
	     FileHandler.copy(scr, dest);
	     driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	     Actions action = new Actions(driver);
	   WebElement frame = driver.findElement(By.xpath("//div[@id='mainContainer']"));
	   action.moveToElement(frame).perform();
	 WebElement box3 = driver.findElement(By.id("box3"));
	 action.dragAndDrop(frame, box3).perform();
	 WebElement box103 = driver.findElement(By.id("box103"));
	 action.clickAndHold(box103).dragAndDrop(box3, box103).perform();
	
	 

	}

}
