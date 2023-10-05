package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopeRegisterForm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	       
	     
	     driver.get("https://demowebshop.tricentis.com/");
	     Thread.sleep(2000);
	     
	     driver.findElement(By.linkText("Register")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.id("gender-female")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.id("FirstName")).sendKeys("anitha");
	     Thread.sleep(2000);
	     driver.findElement(By.id("LastName")).sendKeys("glory");
	     Thread.sleep(2000);
	     driver.findElement(By.name("Email")).sendKeys("anitha2010k@gmail.com");
	     Thread.sleep(2000);
	     driver.findElement(By.name("Password")).sendKeys("tijoPaul");
	     Thread.sleep(2000);
	     driver.findElement(By.name("ConfirmPassword")).sendKeys("tijoPaul");
	     Thread.sleep(2000);
	     driver.findElement(By.name("register-button")).click();
	     
	     
	     
	     		
	}

}
