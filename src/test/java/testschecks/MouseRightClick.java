package testschecks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseRightClick {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		driver.manage().window().maximize();
		WebElement RightClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions action = new Actions (driver);
		
		action.contextClick(RightClickMe).build().perform();
		
		WebElement copyelement = driver.findElement(By.xpath("/html/body/ul/li[3]/span"));
		
		action.moveToElement(copyelement).click().build().perform();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();
	}

}
