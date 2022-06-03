package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaterex2 {	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "\\D:\\Selenium\\chromedriver.exe\\");
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	driver.findElement(By.linkText("Mobiles")).click();
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Laptops")).click();
	driver.quit();

}

}


