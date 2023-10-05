package workingWithTestNg;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test
	public void login()
	{
		System.out.println("log in for Whats App");
	}
	
	@Test
	public void otp()
	{
		System.out.println("otp for Whats App");
	}
	
	@Test(dependsOnMethods = "otp",invocationCount = 3)
	public void msg()
	{
		System.out.println("good evening");
	}
}
