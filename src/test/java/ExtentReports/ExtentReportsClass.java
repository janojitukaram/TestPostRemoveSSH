package ExtentReports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsClass {
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		ExtentSparkReporter reporter = new ExtentSparkReporter(projectPath+"\\extentreports1.html");
		ExtentReports extent = new ExtentReports();

		extent.attachReporter(reporter);

		ExtentTest test = extent.createTest("search google functionality", "Validating searching google functionality ");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		test.log(Status.INFO, "Browser maximized");

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");
		test.pass("application opened successfully");
		try {
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Automation");
		test.pass("sent the keys successfully");
		}
		catch(Exception e)
		{
			test.fail("element not found");
		}
		driver.findElement(By.xpath("//input[@class='gNO89b']")).sendKeys(Keys.RETURN);
		test.log(Status.INFO, "clicked on the search successfully");
		
		test.pass("test got completed");
		
		extent.flush();

	}

}