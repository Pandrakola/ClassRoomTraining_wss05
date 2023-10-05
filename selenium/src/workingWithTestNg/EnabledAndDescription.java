package workingWithTestNg;

import org.testng.annotations.Test;

public class EnabledAndDescription {
	
	//Skip test case
	@Test(enabled = false)
    public void login(){
		System.out.println("login page is displayed");
	}
	@Test(enabled = true)
    public void register(){
		System.out.println("rehister page is displayed");
	}
	@Test
    public void homePage(){
		System.out.println("home page is displayed");
	}
	//printing description
	@Test(description = "user is log out")
    public void logout(){
		System.out.println("logout page is displayed");
	}

}
