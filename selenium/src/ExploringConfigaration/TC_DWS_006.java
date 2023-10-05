package ExploringConfigaration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_DWS_006 extends BaseClass {
	
	@Test
	public void Jewelry() {
		driver.findElement(By.partialLinkText("Jewelry")).click();
	}

}
