package seleniumProgram;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitW {
		public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver", "\\D:\\Selenium\\chromedriver.exe\\");
			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();

			driver.get("https://www.facebook.com/create");

			WebElement ele = driver.findElement(By.xpath("(//input[@name = 'email'])[1]"));

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			ele = wait.until(ExpectedConditions.visibilityOf(ele));
			ele.sendKeys("AshviniD");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
	
	}

}
