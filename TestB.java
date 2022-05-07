package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestB {
	@Test 
	public void Test3() {
		System.out.println("Test3 is running");
	}
		

		@Test (groups= {"Smoke", "Regression"})
	public void Test4() {
		System.out.println("Test4 is running");
	}
	
}
