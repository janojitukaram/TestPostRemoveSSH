package testschecks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakesScreenshotFull {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//full screenshot
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File srcFile=ts.getScreenshotAs(OutputType.FILE);
//		
//		File targetFile = new File(".\\Screenshots\\homepage.png");
//		
//		FileUtils.copyFile(srcFile, targetFile);
		
		/*Taking screenshot for Particular section of the webpage
		WebElement sectionFeature = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		
		File ScreenShotFile = sectionFeature.getScreenshotAs(OutputType.FILE);
		
		File destinationPlacingFile=new File(".\\Screenshots\\section1.png");
		
		FileUtils.copyFile(ScreenShotFile, destinationPlacingFile);
		*/
		
		/*Taking screenshot for the single webelement
		WebElement logoElement = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		
		File CapturedFile = logoElement.getScreenshotAs(OutputType.FILE);
		
		File targetPath=new File(".\\Screenshots\\logo.png");
		
		FileUtils.copyFile(CapturedFile, targetPath);
		
		driver.close();
		*/

	}
	

}
