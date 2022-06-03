package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaterex1 {
	
  public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "\\D:\\Selenium\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.name("email")).sendKeys("ashvinidharne2@gmail.com");
		Thread.sleep(5000);
		driver.quit();

	}

}


