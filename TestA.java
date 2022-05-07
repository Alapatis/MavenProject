package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestA {
	

	@Test 
public void Test1() {
	System.out.println("Test1 is running");
}
	

	@Test (groups= {"Smoke", "Regression"})
public void Test2() {
	System.out.println("Test2 is running");
}

}
