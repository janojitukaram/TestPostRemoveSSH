package testschecks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDropCheck {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	
	driver.manage().window().maximize();
	
	WebElement srcElement = driver.findElement(By.xpath("//div[@id='box1']"));
	
	WebElement targetElement = driver.findElement(By.xpath("//div[@id='box103']"));
	
	Actions action = new Actions(driver);
	
	//action.clickAndHold(srcElement).dragAndDrop(srcElement, targetElement).release(targetElement).build().perform();
	
	action.clickAndHold(srcElement).moveToElement(targetElement).release(targetElement).build().perform();
	}

}
