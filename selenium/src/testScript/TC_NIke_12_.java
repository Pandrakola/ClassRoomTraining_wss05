package testScript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_NIke_12_ {
	
	    @Test(groups = {"Brand","choclatetest"})
	    public void nike() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched",true);
	    driver.manage().window().maximize();
	    Reporter.log("Browser is maximized",true);
		driver.get("https://www.nike.com/gb/?");
		Reporter.log("Open Nike web Browser ",true);
		driver.quit();
		Reporter.log("Closed web Browser",true);
	}
}
