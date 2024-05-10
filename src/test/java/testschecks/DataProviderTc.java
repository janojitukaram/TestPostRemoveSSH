package testschecks;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTc {
	
	@Test (dataProvider="getdata")
	public void dataProviderTestCase(String username,int Password)
	{
		System.out.println("Details"+" "+username+"  "+Password);
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] obj=new Object[3][2];
		
		obj[0][0]="Tukaram1@gmail.com";
		obj[0][1]=1;
		
		obj[1][0]="Tukaram2@gmail.com";
		obj[1][1]=2;
		
		obj[2][0]="Tukaram3@gmail.com";
		obj[2][1]=3;
		
		return obj;
	}
	
	@Test
	public void checkingTakingScreenshots()
	{
		int a=1, b=5, c=6;
		
		if(a==2)
		{
			Assert.assertTrue(b<c);
		}
		
		else if(a==1)
		{
			Assert.assertTrue(b<6);
		}
		
		else if(a==3)
		{
			throw new SkipException("Test skipped");
		}
	}

}
