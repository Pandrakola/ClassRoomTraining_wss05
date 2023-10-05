package workingWithTestNg;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority = 1)
	 
		public void HomePage(){
			System.out.println("Home page is displayed");
		}
	  @Test(priority = 2)
	    public void homePage(){
			System.out.println("home page is displayed");
		}
	    @Test(priority = 2)
	    public void loginPage(){
			System.out.println("huser is able to login");
		}
	    @Test(priority = 3)
	    public void productAddToCart(){
			System.out.println("user is able to productAddToCart");
			System.out.println("user is able to productAddToCart1");
		}
	    @Test(priority = 4)
	    public void payment(){
			System.out.println("user is able to make a payment");
		}
	    @Test(priority = 5)
	    public void logout(){
			System.out.println("user is able to logout");
		}
	    @Test(priority = 0)
	    public void Indexpriority() {
	    	System.out.println("display the priority Index");
	    }
	     
	}


	
	
	


