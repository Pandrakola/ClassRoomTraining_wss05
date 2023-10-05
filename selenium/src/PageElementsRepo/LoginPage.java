package PageElementsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	 


	public LoginPage(WebDriver driver) {
		  PageFactory.initElements(driver, this);
		
	}
	
	private @FindBy(id ="Email") WebElement emailTextField;
	
	private @FindBy(id ="Password") WebElement PasswordTextField;
	
	private @FindBy(id ="RememberMe") WebElement RcheckBox;
	
	
	private @FindBy(xpath = "//input[@class='button-1 login-button']")WebElement loginButton;


	public WebElement getEmailTextField() {
		return emailTextField;
	}


	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}


	public WebElement getRcheckBox() {
		return RcheckBox;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}

	

	
}