package testScript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Zara_14_ {
	
	@Test(groups = "Brand")
	public void zara() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched",true);
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized",true);
		driver.get("https://www.zara.com/uk/");
		Reporter.log("Open Zara web Browser",true);
		driver.quit();
		Reporter.log("losed the Browser",true);
	}

}
