package workingWithTestNg;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Apple_1_ {
	
	@Test
	public void demoWeb() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched",true);
	
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized",true);
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		
		driver.get("https://www.apple.com/uk/");
		Reporter.log("Opened Apple web page",true);
		driver.quit();
		Reporter.log("closed the browser",true);
		
		
	}
	

}
