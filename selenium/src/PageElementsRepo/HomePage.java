package PageElementsRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	public HomePage(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	private @FindBy(xpath = "//a[contains(text(),'Virtual Gift Card')]/../..//input[@value='Add to cart']")
	WebElement virtualGiftCardsAddToCartButton;
	
	private @FindBy(linkText = "Log out")WebElement LogOutLink;
	
	public WebElement getLogOutLink() {
		return LogOutLink;
	}

	public WebElement getVirtualGiftCardsAddToCartButton() {
		return virtualGiftCardsAddToCartButton;
	}

	
	}

	



