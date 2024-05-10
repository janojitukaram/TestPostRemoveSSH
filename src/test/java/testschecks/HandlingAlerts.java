package testschecks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("alert1")).click();
		
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		String AlertMessage = alert.getText();
		System.out.println(AlertMessage);
		alert.accept();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Tukaram");
		Thread.sleep(2000);
		
		driver.close();
	}

}
