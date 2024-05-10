package ExcelRead;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalingPoiClass {
	WebDriver driver=null;
	private WebElement pas;
	
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	@Test(dataProvider = "testdata1")
	public void testData(String UserName, String Password) throws InterruptedException {
		System.out.println(UserName + " | " + Password);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		Actions action = new Actions(driver);
		user.sendKeys(UserName);
		//action.moveToElement(user).sendKeys(UserName).build().perform();
		//action.moveToElement(pass).sendKeys(Password).build().perform();
		action.sendKeys(Keys.TAB);
		pass.sendKeys(Password);
		Thread.sleep(2000);
	}
	@DataProvider(name = "testdata1")
	public Object[][] testData() {
		String Propath = System.getProperty("user.dir");
		Object[][] data = getData(Propath +"\\Excel\\data.xlsx", "Sheet1");
		return data;
	}
	public Object[][] getData(String ProjectPath, String SheetName) {
		PoiExcelMain excelcall = new PoiExcelMain(ProjectPath, SheetName);
		int rowcnt = PoiExcelMain.rowCount();
		int columnCnt = PoiExcelMain.ColumCount();

		Object[][] obj = new Object[rowcnt-1][columnCnt];
		for (int i = 1; i < rowcnt; i++) {
			for (int j = 0; j < columnCnt; j++) {
				String cellData = excelcall.getStringData(i,j);
				obj[i-1][j] = cellData;
			}
		}

		return obj;

	}

}
