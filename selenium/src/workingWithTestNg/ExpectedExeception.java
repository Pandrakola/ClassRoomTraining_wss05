package workingWithTestNg;



import org.testng.Assert;
import org.testng.annotations.Test;

public class ExpectedExeception {

	
	@Test(expectedExceptions = Assert.class,expectedExceptionsMessageRegExp = "TESTING FAILED ")
	private void print() {
		System.out.println("print");
		Assert.assertEquals(1, 0);
	}
	     @Test
	protected void printName() {
		System.out.println("printName");
	
	}
	
	@Test
	void example() {
		System.out.println("example");
	}
	@Test
	public void test() {
		System.out.println("test");
	}

}
