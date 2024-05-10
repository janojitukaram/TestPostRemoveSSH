package listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestCase {

	@Test(priority=1)
	public void testCaseOne() {
		System.out.println("test case one 1st method");

	}

	@Test(priority=2)
	public void testCasehyPen() {
		System.out.println("----------------------------");
	}

	@Test(priority=3)
	public void testCaseTwo() {
		System.out.println("test case two second method");
		Assert.assertTrue(false);
	}

}
