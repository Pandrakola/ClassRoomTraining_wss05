package PageElementsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
    //creating constructor writing inside page class 
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	//creating all elements-rea
	private @FindBy(linkText = "Register")WebElement registerLink;
	
	private @FindBy(linkText = "Log in")WebElement LoginLink;
	
	private @FindBy(linkText = "Shopping cart")WebElement ShoppingcartLink;
	
	
	public WebElement getRegisterLink() {
		return registerLink;
	}

	
	

	public WebElement getLoginLink() {
		return LoginLink;
	}

	public WebElement getShoppingcartLink() {
		return ShoppingcartLink;
	}

	


	
	
	}
	
