package workingWithTestNg;

import org.testng.annotations.Test;

public class AlwayesRun {
	@Test(enabled = false)
    public void homePage(){
		System.out.println("home page is displayed");
	}
	@Test
    public void addToCart(){
		System.out.println("addToCart page is displayed");
		int i=8/2;
	}
		@Test(enabled = true,alwaysRun = true,dependsOnMethods = "addToCart")
		public void payment(){
			System.out.println("payment page is displayed");
		}
		
	}
	


