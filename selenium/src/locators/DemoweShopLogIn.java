package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoweShopLogIn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	     driver.get("https://demowebshop.tricentis.com/");
	     Thread.sleep(2000);
	    
	    driver.findElement(By.linkText("Log in")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("Email")).sendKeys("anitha2010k@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.id("Password")).sendKeys("tijopaul");
	    Thread.sleep(2000);
	    driver.findElement(By.id("RememberMe")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("Log in")).click();
	}

}
