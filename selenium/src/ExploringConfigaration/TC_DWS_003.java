package ExploringConfigaration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_DWS_003 extends BaseClass {
	
	@Test
	public void Electronics() {
		
		driver.findElement(By.partialLinkText("Electronics")).click();
	}

}
