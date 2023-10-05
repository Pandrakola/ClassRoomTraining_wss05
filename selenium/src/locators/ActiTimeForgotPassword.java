package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeForgotPassword {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://demo.actitime.com/login.do");
	     Thread.sleep(200);
	     driver.findElement(By.id("username")).sendKeys("xyz");
	     Thread.sleep(200);
	     driver.findElement(By.name("pwd")).sendKeys("abcdef");
	     Thread.sleep(200);
	     driver.findElement(By.id("keepLoggedInCheckBox")).click();
	     Thread.sleep(200);
	     //driver.findElement(By.linkText("Login ")).click();
	     //Thread.sleep(200);
	     driver.findElement(By.linkText("Forgot your password?")).click();
	     Thread.sleep(200);
	    // driver.findElement(By.id("forgetPasswordEmailOrUsername")).sendKeys("anitha2010k@gmail.com");
	     //Thread.sleep(200);
	     driver.findElement(By.id("forgetPasswordEmailOrUsername")).sendKeys("adminz");
	     Thread.sleep(200);
	     driver.findElement(By.linkText("Request Login Info")).click();

	}

}
