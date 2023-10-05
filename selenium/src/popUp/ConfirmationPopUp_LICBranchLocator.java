package popUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ConfirmationPopUp_LICBranchLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   
	    
	    driver.get("https://licindia.in/branch ");
	    Thread.sleep(3000);
	    
	    Actions action=new Actions(driver);
	    
	  WebElement login = driver.findElement(By.partialLinkText("Login"));
	  action.moveToElement(login).perform();
	  driver.findElement(By.partialLinkText("Agent Portal")).click();
	  Alert conformationPopUp = driver.switchTo().alert();
	  Thread.sleep(4000);
	  //conformationPopUp.accept();
	  conformationPopUp.dismiss();
	  Thread.sleep(4000);
	  driver.quit();
	  
	    

	}

}
