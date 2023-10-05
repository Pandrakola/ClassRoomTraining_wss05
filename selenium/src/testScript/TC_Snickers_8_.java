package testScript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Snickers_8_ {
	
	@Test(groups = {"choclatetest","mobile"})
	public void snickers() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched",true);
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized",true);
		driver.get("https://www.snickers.com/");
		Reporter.log("Open snickers web Browser ",true);
		driver.quit();
		Reporter.log("Closed the Browser ",true);

}
}