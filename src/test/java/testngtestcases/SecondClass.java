package testngtestcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SecondClass {

	@Test(groups="xyz",priority=1)
	public void secondClassFirstMethod() {
		System.out.println("second class first method");
	}
    
	@Parameters("URL")
	@Test
	public void secondClassSecondmethod(String url2) {
		System.out.println("second class second method");
		System.out.println(url2);
	}

	@BeforeTest
	public void callingTestAnnotationBefore() {
		System.out.println("calling test module annotations before running all test methods");
	}

	@AfterTest
	public void callingTestAnnotationAfter() {
		System.out.println("calling test module annotations after running all test methods");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before running class");
	}

}
