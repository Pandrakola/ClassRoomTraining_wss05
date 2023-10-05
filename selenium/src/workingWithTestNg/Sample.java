package workingWithTestNg;

import org.testng.annotations.Test;

public class Sample {
	
	
    @Test
	public void HomePage(){
		System.out.println("Home page is displayed");
	}
    @Test
    public void homePage(){
		System.out.println("home page is displayed");
	}
    @Test
    public void loginPage(){
		System.out.println("huser is able to login");
	}
    @Test
    public void productart(){
		System.out.println("home page is displayed");
	}
    @Test
    public void payment(){
		System.out.println("user is able to make a payment");
	}
    @Test
    public void logout(){
		System.out.println("user is able to logout");
	}
}

