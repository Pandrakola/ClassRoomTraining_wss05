package testScript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Galaxy_9_ {
	
	@Test(groups = "choclatetest")
	public void galaxy() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched",true);
		
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized",true);
		
		driver.get("https://www.galaxychocolate.co.uk/our-chocolate/galaxy-bars");
		Reporter.log("Open galaxy web Browser",true);
		driver.quit();
		Reporter.log("Closed the Browser",true);

}
}