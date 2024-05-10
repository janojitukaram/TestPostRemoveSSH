package Parameterconcept;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class GroupingClass {
	
	@Test
	public void test1()
	{
		System.out.println("test1 method running");
	}
	
	@Test(groups = {"regression","sanity"})
	public void test2()
	{
		System.out.println("test2 method running");
	}
	
	@Test(groups={"sanity"})
	public void test3()
	{
		System.out.println("test3 method running");
	}

}
