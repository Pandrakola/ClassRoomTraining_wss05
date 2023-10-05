package ExploringConfigaration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_DWS_007 extends BaseClass {
	
	@Test
	public void Gift_Cards() {
		
		driver.findElement(By.partialLinkText("Gift Cards")).click();
	}

}
