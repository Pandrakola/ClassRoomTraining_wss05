package workingWithTestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ClassMethods {
	
	@BeforeSuite
    public void beforeSuite() {
   	System.out.println("data base connection is Started");
   	System.out.println("Report formtion start");
   }
   @BeforeClass
   public void beforeClass() {
   	System.out.println("open the browser");
   }
   @AfterClass
   public void afterClass() {
   	System.out.println("quit the browser");
    }
   
   @BeforeMethod 
  public void beforMethod() {
	   System.out.println("open the login page");
  }
   @AfterMethod
  public void afterMethod() {
	   System.out.println("next page");
  }
   @BeforeTest
  public void beforetest() {
  	System.out.println("before test");
  	
  }
 @AfterTest
  public void aftertest() {
  	System.out.println("after test");
  }
  
   @AfterSuite
   public void afterSuite() {
   	System.out.println("data base connection is Stoped");
   }
  


}
