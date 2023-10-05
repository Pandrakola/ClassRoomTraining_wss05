package selecters.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://demowebshop.tricentis.com/register");
	     WebElement radioButton=driver.findElement(By.id("gender-female"));
	     System.out.println(radioButton.isSelected());//false
	     
	     radioButton.click();
	     System.out.println(radioButton.isSelected());//true
	     
	     if( radioButton.isSelected()) {
	    	 System.out.println(" radioButton is selected");
	     }else {
	    	 System.out.println(" radioButton is not selected");
	     }
	}

}
