package basic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript2 {
	@Test(priority = 1)
	void seUp() {
		Reporter.log("opening browser",true);
	}
	@Test(priority = 3)
	void SearchingCustomer() {
		Reporter.log("SearchingCustomer tset",true);
	}
	@Test(priority = 2)
	void AddCustomer() {
		Reporter.log("Adding new Customer ",true);
	}
	@Test(priority = 4)
	void teardown() {
		Reporter.log("closing browser",true);
	}

}
