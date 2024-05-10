package testschecks;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebFormFilling {

	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tukaram");

		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Janoji");

		driver.findElement(By.id("sex-0")).click();

		driver.findElement(By.id("exp-3")).click();

		driver.findElement(By.id("datepicker")).sendKeys("18-04-2024");
		Thread.sleep(5000);
		WebElement professional = driver.findElement(By.id("profession-1"));

		Actions action = new Actions(driver);

		action.moveToElement(professional).click().build().perform();

		WebElement firstTool = driver.findElement(By.id("tool-0"));
		WebElement secondElement = driver.findElement(By.id("tool-2"));
		Thread.sleep(2000);
		action.moveToElement(firstTool).click().build().perform();
		Thread.sleep(2000);
		action.moveToElement(secondElement).click().build().perform();

		WebElement Continents = driver.findElement(By.id("continents"));

		Select select = new Select(Continents);

		select.selectByIndex(1);

		WebElement multiOption = driver.findElement(By.id("selenium_commands"));

		Select multi = new Select(multiOption);
		multi.selectByIndex(0);
		multi.selectByIndex(1);
		multi.selectByIndex(2);
		String ParentWindowId = driver.getWindowHandle();
		WebElement downloadlink = driver.findElement(By.linkText("Click here to Download File"));
		action.moveToElement(downloadlink).click().build().perform();
		Set<String> windowids = driver.getWindowHandles();
		Iterator<String> itr = windowids.iterator();
		// String WindowTitle =
		// driver.findElement(By.xpath("//title[text()='behave-rest/features/conf.yaml
		// at master · stanfy/behave-rest']")).getText();
		while (itr.hasNext()) {
			String winowid = itr.next();

			driver.switchTo().window(winowid);
			if (driver.getTitle().contains("behave-rest")) {
				System.out.println("entered new window");
				driver.findElement(By.xpath("//span[text()='behave_rest']")).click();
			}

		}
		System.out.println(driver.getCurrentUrl());

		driver.switchTo().window(ParentWindowId);
		System.out.println(driver.getCurrentUrl());

		Thread.sleep(3000);

		driver.close();

	}
}
