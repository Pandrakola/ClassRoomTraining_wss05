package iFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcFrameLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     driver.manage().deleteAllCookies();
	     
	     driver.get("https://netbanking.hdfcbank.com/netbanking/");
	     driver.switchTo().frame(0);
	     driver.findElement(By.name("fldLoginUserId")).sendKeys("23456");
	     driver.findElement(By.linkText("CONTINUE")).click();
	     
	}

}
