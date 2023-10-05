package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPage {
	
	ChromeDriver driver;
	
	By RegLink=By.linkText("REGISTER");
	By FistName=By.name("fistname");
	By LastName=By.name("lastname;");
	By Phone=By.name("phone");
	By email=By.name("email");
	By address1=By.name("adderess1");
	By address2=By.name("adderess2");
	By city=By.name("city");
	By state=By.name("state");
	By postalcode=By.name("postalcode");
	By country =By.name("country");
	By username=By.name("username");
	By password=By.name("password");
	By conformpassword=By.name("conformpassword");
	By registerBtn=By.name("register");
	
	
	RegistrationPage(ChromeDriver d) {//constractor -name same as class name it will execute when ever we create obj for this class
		//this.driver=driver;
		driver=d;
		
	}
	
	
	
			
	

}
