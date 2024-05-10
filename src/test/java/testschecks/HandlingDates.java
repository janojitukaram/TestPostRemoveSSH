package testschecks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDates {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.path2usa.com/travel-companion/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		WebElement clickDateField = driver.findElement(By.id("form-field-travel_comp_date"));

		Actions action = new Actions(driver);
		Thread.sleep(2000);

		action.moveToElement(clickDateField).click().build().perform();
		Thread.sleep(3000);
		
		
		
		
		
		 String curYear = driver.findElement(By.xpath("/html/body/div[11]/div[1]/div/div/input")).getAttribute("min");
		
		System.out.println(curYear);
		
		String ExpectedMonth="June";
		String ExpectedYear="2024";
		String expectedDate="29";
		
		while(true)
		{  
			String Month = driver.findElement(By.xpath("//div[@class='flatpickr-current-month']")).getText();
		
			if(Month.equalsIgnoreCase(ExpectedMonth))
			{
				break;
			}
			else
			{
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/div[11]/div[1]/span[2]")).click();
			}
		}
		
		Thread.sleep(2000);
		
		 List<WebElement> Days = driver.findElements(By.xpath("//div[@class='dayContainer']//span"));
		 
		 System.out.println(Days.size());
		
		for(int i=1;i<=Days.size();i++)
		{
			
			  WebElement element = driver.findElement(By.xpath("//div[@class='dayContainer']//span["+i+"]"));
			  
			String AllMonths = element.getAttribute("class");
			
			if(AllMonths.contains("prevMonthDay")|| AllMonths.contains("nextMonthDay"))
			{
				continue;
			}
			
			String currDay = element.getText();
			
			//System.out.println(currDay+"  "+i);
			
			if(currDay.equals(expectedDate))
			{
			
				System.out.println(currDay+"  "+i);
				Thread.sleep(4000);
				element.click();
			}
			
			
		}
		Thread.sleep(3000);
		driver.close();
	}
}
