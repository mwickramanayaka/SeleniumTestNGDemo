package demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//@Ignore
public class TestNGIgnoreDemo {

	@Ignore
	@Test
	public void Test1() {
		System.out.println("I am inside test 1");
		
	}
	
	@Test
	public void Test2() {
		System.out.println("I am inside test 2");
		
	}
}
