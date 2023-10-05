package popUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUP_ {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//syntex for notification popup by chrome driver
		ChromeOptions settings=new ChromeOptions();
		settings.addArguments("-disable_notifications");
		
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     driver.manage().deleteAllCookies();
	     
	     driver.get("https://www.kalkifashion.com/");

	}

}
