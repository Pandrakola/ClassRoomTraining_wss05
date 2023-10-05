package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChocolateCakeaction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     driver.manage().deleteAllCookies();
	     Actions action=new Actions(driver);
	     
	     driver.get("https://www.winni.in/cake/chocolate-cake ");
	   WebElement chocolateCake = driver.findElement(By.partialLinkText("CAKES"));//mouseover to cake
	   //action.moveToElement(chocolateCake).build().perform();
	   Thread.sleep(3000);
	 WebElement cake = driver.findElement(By.linkText("Chocolate Cakes"));//mpuseover to Chocolate Cakes
	 
	// action.moveToElement(cake).click().build().perform();
	 Thread.sleep(3000);
	 //driver.findElement(By.xpath("//img[@title='Death By Chocolate Cake']")).click();//mouseover to Death By Chocolate Cake and click 
WebElement selectedCake = driver.findElement(By.xpath("//img[@title='Death By Chocolate Cake']"));
     action.moveToElement(cake).moveToElement(chocolateCake).moveToElement(selectedCake).click().build().perform();
    
	 
	}

}
