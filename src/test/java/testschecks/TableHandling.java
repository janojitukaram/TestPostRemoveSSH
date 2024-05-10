package testschecks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableHandling {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		List<WebElement> thead = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr"));
		System.out.println(thead.size());

		for (int i = 1; i <= thead.size(); i++)

		{

			List<WebElement> theadTd = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr["+i+"]/td"));
            for (int j=0;j<theadTd.size();j++)
            {
            	System.out.print(theadTd.get(j).getText());
            	
            }
            System.out.println("------------------------------");
			

			

		}

	}
}
