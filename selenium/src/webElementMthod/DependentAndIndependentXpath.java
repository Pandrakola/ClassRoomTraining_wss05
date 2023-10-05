package webElementMthod;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class DependentAndIndependentXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.meesho.com/search?q=watches");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//img[contains(@style,'position')]")).click();
	   String price = driver.findElement(By.xpath("//p[text()='Graceful Sports Watches']/..//h5[text()='150']")).getText();
	   System.out.println(price);
	
	   driver.quit();
	}

}
