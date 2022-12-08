package TestKhanAcdm;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeTestNG {
	@BeforeClass
	public void beforeclass() {
		System.out.println("Test beforeclass");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Test beforeMethod");
	}
	
	@Test
	public void test1 () {
		System.out.println("Test 1 is running");
	}
	@Test
	public void test2 () {
		System.out.println("Test 2 is running");
	}
	@Test
	public void test3 () {
		System.out.println("Test 3 is running");
	}
	@Test
	public void test4 () {
		System.out.println("Test 4 is running");
	}
	@Test
	public void test5 () {
		System.out.println("Test 5 is running");
		

	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("Test aftermethod");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("Test afterClass");

	}

}


