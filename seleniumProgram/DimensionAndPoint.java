package seleniumProgram;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionAndPoint {
	
	public static void main (String []args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "\\D:\\Selenium\\chromedriver.exe\\");
		 WebDriver driver = new ChromeDriver();
		  driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.get("https://meesho.com/");
		 
		 Dimension d = new Dimension(500,500);
		 driver.manage().window().setSize(d);
		 Thread.sleep(2000);
		 
		 Point p = new Point(100, 200);
		 driver.manage().window().setPosition(p);
		  Thread.sleep(2000);
		  driver.quit();
		 
	}

}
