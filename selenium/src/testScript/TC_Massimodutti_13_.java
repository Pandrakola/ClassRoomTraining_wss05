package testScript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Massimodutti_13_ {
	
	@Test(groups = "Brand")
	public void massimodutti() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched",true);
		
		driver.manage().window().maximize();
		Reporter.log("Browser is maximised",true);
		
		driver.get("https://www.massimodutti.com/gb");
		Reporter.log("Open the massimodutti Browser ",true);
		driver.quit();
		Reporter.log("Closed the Browser",true);
	}

}
