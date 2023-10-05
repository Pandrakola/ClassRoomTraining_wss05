package workingWithTestNg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Oppo_4_ {
	
	@Test
	public void oppo() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched",true);
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized",true);
		driver.get("https://www.oppo.com/en/");
		Reporter.log("Open Oppo web Browser",true);
		driver.quit();
		Reporter.log("Closed the Browser",true);
	}
}
