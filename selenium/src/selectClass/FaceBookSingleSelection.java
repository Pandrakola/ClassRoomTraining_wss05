package selectClass;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.*;
public class FaceBookSingleSelection {



	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     driver.manage().deleteAllCookies();
	     
	     driver.get("https://www.facebook.com/campaign/landing.php");
	     
	     //date drop down
      WebElement dateDropDown = driver.findElement(By.id("day"));
      Select date = new Select(dateDropDown);
     date.selectByIndex(15);
     
     //month drop down
       WebElement monthDropDown = driver.findElement(By.id("month"));
       Select months = new Select(monthDropDown);
       months.selectByValue("2");
       @SuppressWarnings("unused")
	List<WebElement> allOptions = months.getOptions();
       for(WebElement monthlist:allOptions) {
    	   System.out.println(monthlist.getText());
       }
       
       //year drop down
     WebElement yearDropDown = driver.findElement(By.id("year"));
     Select years = new Select(yearDropDown) ; 
      years.selectByVisibleText("2023");
      
      
	System.out.println(date.getFirstSelectedOption().getText());
	System.out.println(months.getFirstSelectedOption().getText());
	System.out.println(years.getFirstSelectedOption().getText());
  
  driver.quit();
       

	
   

	}

}
