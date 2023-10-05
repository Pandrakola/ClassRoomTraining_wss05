package workingWithWebDriverMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetNavigation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	     
	     //driver.get("https://demowebshop.tricentis.com/");
	     
	     driver.navigate().to("https://demowebshop.tricentis.com/");
	     
	}
	

}
