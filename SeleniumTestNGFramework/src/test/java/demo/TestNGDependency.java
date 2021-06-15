package demo;

import org.testng.annotations.Test;

public class TestNGDependency {
	
	@Test(dependsOnGroups = {"sanity.*"}) //(dependsOnMethods= {"test2", "test3"}, priority = 0)
	public void test1() {
		System.out.println("I am inside test 1 ");
		
	}

	@Test (groups= {"sanity 1"})
	public void test2() {
		System.out.println("I am inside test 2 ");
		
	}
	
	@Test  (groups= {"sanity 2"})
	public void test3() {
		System.out.println("I am inside test 3 ");
		
	}
	
}
