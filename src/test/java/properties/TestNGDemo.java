package properties;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDemo {
	WebDriver driver;
	GetSetproperties properties;
	@Test
	public void testOne() throws IOException {
		String ProjectPath = System.getProperty("user.dir")+"\\resources\\data.properties";
		properties = new GetSetproperties(ProjectPath);
		String browserNmae = properties.getProperties();

		if (browserNmae.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

			driver.get("https://omayo.blogspot.com/");

			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Tukaram");

		}
	}
	@AfterTest
	public void tearDown() throws IOException
	{
		driver.close();
		properties.setProperties();
		
	}

}
