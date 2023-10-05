package configAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExecutionOrder {
	
	@Test
	public void createAccont() {
		Reporter.log("account created succes fully",true);
	}
		@BeforeClass
		public void browserSetup() {
			Reporter.log("Opening the browser",true);
			}
			
	
			@BeforeMethod
			public void login() {
				Reporter.log("logged in with validcred",true);
					
				}
				
				@AfterMethod
				public void browserTeardown() {
					Reporter.log("logged out   succesfully",true);
				}
				@AfterClass
				public void logoOutOfApp() {
					Reporter.log("browser window closed ",true);
				}
}
