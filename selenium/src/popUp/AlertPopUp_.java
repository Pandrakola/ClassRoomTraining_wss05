package popUp;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp_ {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	   
	    
	    driver.get("https://netbanking.hdfcbank.com/netbanking/");
	   driver.switchTo().frame("login_page");
	 	   driver.findElement(By.linkText("CONTINUE")).click();
	   Thread.sleep(3000);
	 Alert alertpopup = driver.switchTo().alert();
	 alertpopup.accept();
	 Thread.sleep(3000);
	 driver.quit();
	}

}
