package testngtestcases;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AnnotationChecksClass {
	

	@Test 
	public void FirstTestMethod()
	{
		System.out.println("First Test Method");
		System.out.println();
	}
	

	public void beforeMethodExecute()
	{
		System.out.println("Method execute before FirstTestMethod execute");
	}
	

	public void afterTestMethodExecute()
	{
		System.out.println("After every test methods execute");
	}
   
	@Test
	public void secondTestMethod()
	{
		throw new SkipException("skipped");
	}
	

}
