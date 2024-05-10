package mpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OdbcConnection {

	public static void main(String[] args) throws SQLException, InterruptedException {
		// TODO Auto-generated method stub
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		Statement stmt = conn.createStatement();
		ResultSet result = stmt.executeQuery("select * from LOGINCREDENTIALS");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		driver.manage().window().maximize();
		
		while(result.next())
		{
			driver.findElement(By.id("input-email")).sendKeys(result.getString("USERNAME"));
			Thread.sleep(2000);
			driver.findElement(By.id("input-password")).sendKeys(result.getString("PASSWORD"));
			Thread.sleep(2000);
		}
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		

	}

	
}
