package testScript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Vivo_5_ {
	
	@Test(groups ="mobile")
	public void vivo() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched",true);
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized",true);
		driver.get("https://www.vivo.com/uk");
		Reporter.log("OPen vivo web Browser",true);
		driver.quit();
		Reporter.log("Closed the Browser",true);
	}
}
