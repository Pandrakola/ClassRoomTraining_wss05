package workingWithTestNg;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Groups_3_{
	
	//print is fail 1is not equals to 0
		@Test(priority = 4,groups = "Smoke")
		private void print() {
			System.out.println("print");
			assertEquals(1, 0);
		}
		@Test(priority = 2,description = "example",groups = "Smoke" )
		protected void printName() {
			System.out.println("printName");
			
		}
		//skiped because dependes on print ,print is fail -->when we are useing alwaysrun it will print this method
		@Test(priority = 0,dependsOnMethods ="print",alwaysRun = true )
		void example() {
			System.out.println("example");
		}
		@Test(priority = 1,dependsOnGroups = "Smoke",alwaysRun = true)
		public void test() {
			System.out.println("test");
		}

}
