package WebDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandCloseQuiteMthod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://restaurants.kfc.co.in/");
	     
	     Thread.sleep(5000);
	     driver.quit();
	     

	     

	}

}
