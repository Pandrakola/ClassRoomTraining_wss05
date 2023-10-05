package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MeeshoIndependentXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.meesho.com/search?q=watches");
	    String price = driver.findElement(By.xpath("//p[text()='Fashionate Sports Watches']/..//h5")).getText();
         System.out.println(price);
         driver.quit();
}
}