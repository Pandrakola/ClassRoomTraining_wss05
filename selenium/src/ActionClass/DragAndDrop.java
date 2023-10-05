package ActionClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.manage().deleteAllCookies();
    Actions action=new Actions(driver);
    
    driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
         WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
          driver.switchTo().frame(frame);
        Thread.sleep(3000);
             /*WebElement img1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
             WebElement img2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
             WebElement img3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
             WebElement img4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));

             WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
             
            action.dragAndDrop(img1, trash).perform();
            action.dragAndDrop(img2, trash).perform();
            action.clickAndHold(img3).release(trash).perform();
            action.moveToElement(img4).clickAndHold().release(trash).perform();*/
        
      List<WebElement> elements = driver.findElements(By.xpath("//ul[@id='gallery']/li/img"));
      WebElement trash = driver.findElement(By.id("trash"));
      for(WebElement img:elements) {
    	  action.dragAndDrop(img, trash).perform();
      }
        
            
            Thread.sleep(3000);
            driver.quit();


}
}