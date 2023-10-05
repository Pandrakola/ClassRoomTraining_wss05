package ExploringConfigaration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_DWS_002 extends BaseClass {
	
	@Test
	public void Computers() {
		driver.findElement(By.partialLinkText("Computers")).click();
	}

}
