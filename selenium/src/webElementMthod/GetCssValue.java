package webElementMthod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://demo.actitime.com/login.do");
	     driver.findElement(By.id("loginButton")).click();
	     WebElement errormsg = driver.findElement(By.xpath("//span[contains(text(),'invalid')]"));
	     
	System.out.println(errormsg.getCssValue("color"));
	System.out.println(errormsg.getCssValue("font-family"));
	driver.quit();
}

}