package workingWithTestNg;

import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test
	public void HomePage(){
		System.out.println("Home page is displayed");
	}
	 @Test
	    public void register(){
			System.out.println("user is able to register");
		}
    @Test
    public void loginPage(){
		System.out.println("user is able to login");
	}
    @Test(dependsOnMethods = "loginPage")
    public void productAtCart(){
		System.out.println("user is add to cart");
	}
    @Test
    public void payment(){
		System.out.println("user is able to make a payment");
	}


    @Test(priority = 2,dependsOnMethods = "productAtCart")
    public void logout(){
		System.out.println("user is able to logout");
	}
}




