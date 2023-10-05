package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DmoWebPageJewelry {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://demowebshop.tricentis.com/");
	     Thread.sleep(3000);
	     
	     driver.findElement(By.partialLinkText("Jewelry")).click();
	     Thread.sleep(3000);
	     System.out.println("Black & White Diamond Heart");

	}

}
