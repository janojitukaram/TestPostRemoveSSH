package testschecks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownClass {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.id("drop1"));
		
		Select select=new Select(dropdown);
		select.selectByIndex(1);
		
//		select.selectByIndex(2);
//		
		select.selectByIndex(3);
		
		
		

	}

}
