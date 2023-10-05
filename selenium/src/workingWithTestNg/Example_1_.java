package workingWithTestNg;




import org.testng.annotations.Test;

public class Example_1_ {
	@Test(priority = 4)
	private void print() {
		System.out.println("print");
	}
	@Test(priority = 2,description = "example" )
	protected void printName() {
		System.out.println("printName");
		
	}
	@Test(priority = 0,dependsOnMethods ="print" )
	void example() {
		System.out.println("example");
	}
	@Test(priority = 1)
	public void test() {
		System.out.println("test");
	}
}
