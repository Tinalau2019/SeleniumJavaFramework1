package Demo;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	
	
	@Test(dependsOnGroups={"sanity.*"})
	public void test1() {
		System.out.println("I am inside the test1");
		
	}
	
    @Test(groups= {"sanity3"})
	public void test2() {
	System.out.println("I am inside the test2");
	
	}
    
    @Test(groups= {"sanity2"})
	public void test3() {
	System.out.println("I am inside the test3");
	
	}
	

}
