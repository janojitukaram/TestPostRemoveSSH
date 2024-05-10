package Parameterconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGParameterClass {

	@Parameters("URL")
	@Test
	public void setupParameter(@Optional("Tukaram") String URL)
	{
		System.out.println("name is :"+ URL);
		//WebDriverManager.chromedriver().setup();
		
		//WebDriver driver=new ChromeDriver();
		
//		driver.get(URL);
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		try {
//		driver.findElement(By.xpath("//a[@title='My Account']")).click();
//		} catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		System.out.println(driver.getTitle());
	}

}
