package testNgGroup;

import org.testng.annotations.Test;

public class BaseClass {
	

	@Test
	public void test1() {
		System.out.println("Class Test1:method:test1--thread Id:" + Thread.currentThread().getId());
		
	}
	
	public void test2() {
		System.out.println("Class Test1:method:test1--thread Id:" + Thread.currentThread().getId());
	}
	public void test3() {
		System.out.println("Class Test1:method:test1--thread Id:" + Thread.currentThread().getId());
}
}