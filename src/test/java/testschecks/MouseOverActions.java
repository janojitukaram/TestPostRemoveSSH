package testschecks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverActions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.browserstack.com/guide/action-class-in-selenium");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		WebElement ProductElement = driver.findElement(By.id("products-dd-toggle"));
		WebElement liveApp = driver.findElement(By.xpath("(//span[@class='item-text']/following-sibling::div)[3]"));
		
		Actions action = new Actions(driver);
		
		/*action.moveToElement(ProductElement).build().perform();
		
		action.moveToElement(liveApp).click().build().perform();
		*/
		
		action.moveToElement(ProductElement).moveToElement(liveApp).click().build().perform();
		
		WebElement features = driver.findElement(By.xpath("//a[@title='Features']"));
		
		WebElement RealDeviceCloud = driver.findElement(By.xpath("//span[text()='Real Device Cloud']"));
		
		WebElement windowsMac = driver.findElement(By.xpath("//span[text()='Windows and macOS']"));
		
		action.moveToElement(features).moveToElement(RealDeviceCloud).moveToElement(windowsMac).click().build().perform();
		
	

	}

}
