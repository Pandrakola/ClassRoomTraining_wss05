package popUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopUP {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	   
	    
	    driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
	           Thread.sleep(3000);
	           driver.findElement(By.id("accept-choices")).click();
                driver.switchTo().frame("iframeResult");
                driver.findElement(By.xpath("//button[text()='Try it']")).click();
                
                Alert promptpopup = driver.switchTo().alert();
                promptpopup.sendKeys("anitha");
                promptpopup.accept();
                System.out.println(driver.findElement(By.id("demo")).getText());
                Thread.sleep(3000);
                driver.quit();
	}

}
