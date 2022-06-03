package seleniumProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "\\D:\\Selenium\\chromedriver.exe\\");
			WebDriver driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/create");
			
			//AJAX--Asynchronous Javascript and xml
			WebElement ele = driver.findElement(By.xpath("(//input[@id = 'email'])[1]"));

			WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
			w.until(ExpectedConditions.visibilityOf(ele));
			ele.sendKeys("James Gosling");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//this is best example runtime polymorphism..
			
			//experts says its not a good practice to use both the waits together,
			//becz it may sometimes give an unpredictable behaviour....
			
			//but if we want to use both the waits, then first use explicit wait and then use implicit wait
		}

	}