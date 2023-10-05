package workingWithWebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatingMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://demowebshop.tricentis.com/");
	     driver.get("https://www.zinghr.com");
	     Thread.sleep(5000);
	   driver.navigate().forward();
	   Thread.sleep(3000);
	   
	  // driver.navigate().back();
	   Thread.sleep(3000);
	   driver.navigate().refresh();
	   
	   //driver.quit();
}
}
