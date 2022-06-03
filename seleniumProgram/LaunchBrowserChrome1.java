package seleniumProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserChrome1 {
	
	public static void main(String [] args)
	{
	System.setProperty("webdriver.chrome.driver", "\\D:\\Selenium\\chromedriver.exe\\");
	   WebDriver driver = new ChromeDriver();
	   driver.manage().deleteAllCookies();
	     driver.manage().window().maximize();
	     //4.1.2
	//     driver.manage().window().minimize();
	     driver.get("https://www.zomato.com/");
	     driver.get("https://www.amazon.in/");
	     driver.navigate().back();
	   driver.navigate().forward();
	     driver.navigate().refresh();
	     
	     
	     //  driver.quit();

	}
}
