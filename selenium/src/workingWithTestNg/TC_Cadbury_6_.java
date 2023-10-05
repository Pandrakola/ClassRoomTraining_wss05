package workingWithTestNg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Cadbury_6_ {
	
	@Test
	public void cadbury() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched",true);
		
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized",true);
		driver.get("hhttps://www.cadbury.co.uk/");
		Reporter.log("Open Cadbury Browser",true);
		driver.quit();
		Reporter.log("Closed the Browser ",true);

}
}