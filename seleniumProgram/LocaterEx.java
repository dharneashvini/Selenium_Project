package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocaterEx {
	 
	public static void main(String []args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "\\D:\\Selenium\\chromedriver.exe\\");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	   driver.get("https://accounts.google.com");
	   driver.navigate().refresh();
	   
	   driver.findElement(By.id("identifierId")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.name("identifier")).sendKeys("ashvinisd2298@gmail.com");
	   Thread.sleep(3000);
	   driver.findElement(By.className("VfPpkd-vQzf8d")).click();
	   Thread.sleep(9000);
	   driver.quit();
	   
	  
	 
	}
}