package workingWithTestNg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Lebara_2_ {
	
	@Test
	public void lebara() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched",true);
		
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized",true);
		
		driver.get("https://mobile.lebara.com/gb/en/?");
		Reporter.log("Open lebara web  Browser",true);
		driver.quit();
		Reporter.log("Closed the Browser",true);

}
}