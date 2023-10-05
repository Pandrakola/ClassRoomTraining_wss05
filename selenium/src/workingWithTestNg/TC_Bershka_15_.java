package workingWithTestNg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Bershka_15_ {
	
	@Test
	public void bershka() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched",true);
		
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized",true);
		driver.get("https://www.bershka.com/es/");
		Reporter.log("Opend Bershka web page",true);
		driver.quit();
		Reporter.log("Closed the Browser ",true);
	}


}
