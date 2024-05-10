package testschecks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResizableMouseEvent {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resizable/");
		
		driver.manage().window().maximize();
		
		WebElement iframeElement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(iframeElement);
		
		WebElement ResizableElement = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		
		Actions action=new Actions(driver);
		
		Thread.sleep(3000);
		action.dragAndDropBy(ResizableElement, 60, 70).build().perform();
		
		

	}

}
