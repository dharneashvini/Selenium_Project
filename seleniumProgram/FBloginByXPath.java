package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBloginByXPath {
	
	public static void main(String []args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "\\D:\\\\Selenium\\\\chromedriver.exe\\");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  
	  driver.findElement(By.xpath("//a[@data-testid ='open-registration-form-button']")).click();
	 Thread.sleep(3000); 
	 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ashvini");
	 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Dharne");
	 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("ashvinisd2298@gmail.com");
	 driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("123456");
	WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	   Select s = new Select(date);
	    s.selectByValue("22");
	  //  s.selectByVisibleText("22");
	   // s.selectByIndex(21);
	WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	Select m = new Select(month);
	 //  m.selectByValue("Feb");
	  //  m.selectByVisibleText("Feb");
	    m.selectByIndex(1);
	  WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	  Select y = new Select(year);
	  y.selectByVisibleText("1998");
	  driver.findElement(By.xpath("(//input[@class='_8esa'][1])")).click();
	  
	  Thread.sleep(5000);
	  
	   driver.quit();
	}
}
