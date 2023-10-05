
package configAnnotations;




import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_AddProductToCart extends BaseClass {  //what ever base class every thing to be inheritane here
	@Test
	public void add() {
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	

	}
	@Test
	public void ClickOn() {
		driver.findElement(By.linkText("awesome")).click();
	
	}

}
