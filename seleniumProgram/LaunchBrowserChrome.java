package seleniumProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserChrome {
	
	public static void main(String [] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "\\D:\\Selenium\\chromedriver.exe\\");
	   WebDriver driver = new ChromeDriver();
	   driver.manage().deleteAllCookies();
	   driver.manage().window().maximize();
	     
	     driver.get("https://www.flipkart.com/");
	     Thread.sleep(2000);
	     driver.get("https://www.amazon.in/");
	     driver.navigate().back();
	     Thread.sleep(2000);
	     driver.navigate().forward();
	     Thread.sleep(2000);
	     driver.navigate().refresh();
	     Thread.sleep(2000);
	     
	     String str = driver.getCurrentUrl();
	     System.out.println(str);
	     
	    String title = driver.getTitle();
	    System.out.println(title);
	    Thread.sleep(2000);
	    
	    String source = driver.getPageSource();
	    System.out.println(source);
	   
	    
	     
	     driver.quit();
	       
	     
		
		
	}

}

