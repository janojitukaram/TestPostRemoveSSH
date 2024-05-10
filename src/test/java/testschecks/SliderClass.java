package testschecks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderClass {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/slider/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


		WebElement sliderframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(sliderframe);
		
		WebElement sliderbutton = driver.findElement(By.xpath("//div[@id='slider']/span"));
		Actions action = new Actions(driver);

		//action.moveToElement(sliderbutton).dragAndDropBy(sliderbutton, 300, 0).build().perform();
		
		action.dragAndDropBy(sliderbutton, 300, 0).build().perform();
		
		driver.switchTo().defaultContent();
		System.out.println(driver.getCurrentUrl());
	}

}
