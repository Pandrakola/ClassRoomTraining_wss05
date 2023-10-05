package Synchronization;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropDown {

	     public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     
	     driver.get("https://www.amazon.in/");
	     
	     WebElement Searchbox = driver.findElement(By.id("searchDropdownBox"));
	    Select Dpb = new Select(Searchbox);
	    Dpb.selectByVisibleText("Books");
	    String book = driver.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']")).getText();
	    System.out.println(book);
         driver.quit();
	}

}
