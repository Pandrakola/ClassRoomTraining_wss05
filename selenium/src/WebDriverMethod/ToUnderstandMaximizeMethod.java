package WebDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandMaximizeMethod {

	public static void main(String[] args) {

     System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
     ChromeDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     
     driver.get("https://www.amazon.co.uk/");
     
     
     String title=driver.getTitle();
     System.out.println(title);

	}

}
