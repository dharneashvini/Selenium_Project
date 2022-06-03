package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByXPath {
	
	public static void main(String []args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "\\D:\\\\Selenium\\\\chromedriver.exe\\");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.get("https://www.flipkart.com/");
	// driver.navigate().refresh();
	  
	  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@type ='text']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@name ='q']")).sendKeys("Grocery");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//span[@class='_2I9KP_'][5])")).click();
	  Thread.sleep(3000);
	  
	  driver.quit();
	  
	}

}
