package Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryFailedDemo {
	
	@Test 
	public void test1() {
		System.out.println("I am inside the test1");
		
	}
	
    @Test 
	public void test2() {
	System.out.println("I am inside the test2");
	//int i=1/0;
	}
    
    
	@Test(retryAnalyzer = listeners1.REtryAnalyzer.class) 
	public void test3() {
		System.out.println("I am inside the test3");
		Assert.assertTrue(0>1);
	}

}
