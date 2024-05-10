package testschecks;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		String ParentWindow = driver.getWindowHandle();
		
		driver.findElement(By.linkText("Open a popup window")).click();
		driver.findElement(By.linkText("SeleniumTutorial")).click();
		Set<String> winodwIDS = driver.getWindowHandles();
		System.out.println(winodwIDS);
		Iterator<String> itr = winodwIDS.iterator();
		String newWindowPopup= null;

		while (itr.hasNext())
		{
			String windowid = itr.next();
			driver.switchTo().window(windowid);
			if(driver.getTitle().equalsIgnoreCase("New Window"))
			{
				System.out.println("Child POP UP windowid "+windowid);
				System.out.println(driver.getCurrentUrl());
				newWindowPopup=driver.findElement(By.xpath("//h3[text()='New Window']")).getText();	
				driver.close();
			}
			
			else if(driver.getTitle().contains("Selenium143"))
			{
				System.out.println("New tab window "+windowid);
				driver.findElement(By.xpath("//a[text()='What is Selenium?']")).click();
				Thread.sleep(2000);
				driver.close();
			}
		}
		
	System.out.println(newWindowPopup);
	driver.switchTo().window(ParentWindow);
	System.out.println(driver.getCurrentUrl());
   driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Tukaram");
	Thread.sleep(2000);
	
	driver.close();
	}

}
