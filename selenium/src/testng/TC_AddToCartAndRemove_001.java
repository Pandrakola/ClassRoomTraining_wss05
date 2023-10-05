package testng;

import org.testng.annotations.Test;

import PageElementsRepo.HomePage;
import PageElementsRepo.ShoppingCartPage;
import PageElementsRepo.VirtualGiftCardsPage;

public class TC_AddToCartAndRemove_001 extends BaseClass_1 {

	
	@Test
	public void removeProd() {
		homePage = new HomePage(driver);
		homePage.getVirtualGiftCardsAddToCartButton().click();
		VirtualGiftCardsPage virtualGiftCartPage = new VirtualGiftCardsPage(driver);
		virtualGiftCartPage.getRecipientsNameTextField().sendKeys("Tijo");
		virtualGiftCartPage.getRecipientsEmailTextField().sendKeys("tijo@gmail.com");
		virtualGiftCartPage.getAddToCartButton().click();
		basePage.getShoppingcartLink().click();
		ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
		shoppingCartPage.getRemoveFromCartCheckBox().click();
		shoppingCartPage.getUpdateCartButton().click();		
	}
}
