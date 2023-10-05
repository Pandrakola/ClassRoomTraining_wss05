package testScript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class  TC_Lyca_3_ {
	
	@Test(groups ="mobile")
	public void Lyca() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched",true);
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized",true);
		driver.get("https://www.lycamobile.co.uk/");
		Reporter.log("Open Browser ",true);
		driver.quit();
		Reporter.log("Closed the Browser",true);
	}
}
