package popUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleChildWindowPopUP_ {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     
	     driver.get("https://demo.actitime.com/login.do");
	     //get one window Id
	     driver.findElement(By.linkText("actiTIME Inc.")).click();
	     //get all windows id
	    Set<String> allwindowId = driver.getWindowHandles();
      for(String wid:allwindowId) {
    	  //System.out.println(wid);
    	  driver.switchTo().window(wid);
    	  if(driver.getTitle().contains("Time Tracking Software")) {
    		  driver.findElement(By.linkText("Try Free")).click();
    	  }
      }

	}

}
