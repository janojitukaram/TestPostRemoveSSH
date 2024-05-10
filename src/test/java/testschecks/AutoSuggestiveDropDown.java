package testschecks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//WebElement FromElement = driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
		//FromElement.sendKeys("Ben");
		
		Actions action = new Actions(driver);
		
		WebElement fromcityElement = driver.findElement(By.id("fromCity"));
		
		action.moveToElement(fromcityElement).click().sendKeys(fromcityElement, "Beng").build().perform();
		
		int i=0;
		
		while (i<4)
		{
			Thread.sleep(3000);
			action.sendKeys(Keys.DOWN).perform();
			i++;
		}
		
		action.sendKeys(Keys.ENTER);
		
		
		
		//CONTROL+A
		
//		action.keyDown(Keys.CONTROL);
//		action.sendKeys("a");
//		action.keyUp(Keys.CONTROL);
//		action.perform();
//		
		
		
		
		
		
		
		

	}

}
