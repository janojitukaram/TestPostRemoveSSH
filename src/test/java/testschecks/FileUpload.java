package testschecks;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.xpath("//img[@class='employee-image']")).click();
		//Runtime.getRuntime().exec("D:\\netxploretesting\\unifytreewebautomation\\src\\test\\java\\executables\\fileupload.exe"+" "+"E:\\images\\profile.JPG");
		 String[] cmd2 = {"C:\\workspace\\MvnProject\\Screenshots\\FileUpload.exe","C:\\workspace\\MvnProject\\Screenshots\\Screenshot2024.png"}; 
		
		Runtime.getRuntime().exec(cmd2);
		

	}

}
