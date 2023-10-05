package selectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDdropDown {

	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     //driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     
	     driver.get("https://demoapp.skillrary.com/");
	 WebElement ListBox = driver.findElement(By.id("cars"));
     Select slectoption = new Select(ListBox);
	 System.out.println(slectoption.isMultiple());
	 
	 //select ByIndex
	 slectoption.selectByIndex(2);
	 //SelectByValue
	 slectoption.selectByValue("99");
	 //selectByVisibleText
	 slectoption.selectByVisibleText("INR 200 - INR 299 ( 3 )");
	 
	 //capture all the selected option
List<WebElement> selectedOption = slectoption.getAllSelectedOptions();
			 for(WebElement ele:selectedOption) {
				 System.out.println(ele.getText());
			 }
	 
       driver.quit();
}
}