package testschecks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeChecks {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
//		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
//		
//		WebElement outerframe = driver.findElement(By.xpath("//*[@id='Multiple']/iframe"));
//		
//		driver.switchTo().frame(outerframe);
		
//		WebElement innerframe = driver.findElement(By.xpath("//*[@id='singleframe']"));
//		
//		driver.switchTo().frame(innerframe);
		
		driver.switchTo().frame("SingleFrame");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Tukaram");


	}

}
