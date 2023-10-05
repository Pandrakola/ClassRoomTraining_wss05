package ExploringConfigaration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_DWS_005 extends BaseClass{
	
	@Test
	public void Digital_downloads() {
		driver.findElement(By.partialLinkText("Digital downloads")).click();
	}

}
