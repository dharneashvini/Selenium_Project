package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWristWatches {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "\\D:\\\\Selenium\\\\chromedriver.exe\\");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().deleteAllCookies();
		  driver.manage().window().maximize();
		  driver.get("https://amazon.in/");
		  
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Wrist Watches");
		  driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		  
		  JavascriptExecutor js = ((JavascriptExecutor)driver);
	         js.executeScript("scroll(800,900)");
	          Thread.sleep(2000);
	          
		  driver.findElement(By.xpath("//i[@xpath='1']")).click();
		  
		  
		  

	}

}
