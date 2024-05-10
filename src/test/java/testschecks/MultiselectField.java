package testschecks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiselectField {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		WebElement element = driver.findElement(By.id("multiselect1"));
		
		Select select = new Select(element);
		
		select.selectByIndex(0);
		
		select.selectByIndex(1);
		
		select.selectByIndex(2);
		
		select.deselectByIndex(0);
		
		select.selectByValue("volvox");
		
		driver.close();
		
		

	}

}
