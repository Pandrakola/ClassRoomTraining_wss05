package workingWithTestNg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Ferrerorocher_7_ {
	
	     @Test
	public void ferrerorocher() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched",true);
		
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized",true);
		
		driver.get("https://www.ferrerorocher.com/us/en/");
		Reporter.log("Open Ferrerorocher Browser",true);
		driver.quit();
		Reporter.log("Closed the Browser ",true);
}
}