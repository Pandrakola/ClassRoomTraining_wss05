package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     driver.manage().deleteAllCookies();
	     Actions action=new Actions(driver);
	     
	     driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
	     
	     driver.findElement(By.id("password")).sendKeys("fgfkhkkjlk");
	    WebElement eyeIcon = driver.findElement(By.xpath("//div[contains(@class,'showPassword ')]"));
        action.clickAndHold(eyeIcon).perform();
	}

}
