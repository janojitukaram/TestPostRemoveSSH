package testschecks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleKeyBoardKeys {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://text-compare.com/");

		WebElement FirstInputArea = driver.findElement(By.id("inputText1"));
		WebElement SecondTextArea = driver.findElement(By.id("inputText2"));
		
		FirstInputArea.sendKeys("Welcome to Selenium");
		
		Actions action = new Actions(driver);
		//CNTRL+A
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.perform();
		
		//CNTRL+C
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.perform();
		
		action.sendKeys(Keys.TAB).perform();
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.perform();
		
		if(FirstInputArea.getText().equalsIgnoreCase(SecondTextArea.getText()))
		{
			System.out.println("text area copied");
		}
		
		else
		{
			System.out.println("text area is not copied");
		}
		
		
		

	}

}
