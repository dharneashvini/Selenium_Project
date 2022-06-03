package seleniumProgram;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotMethod {
	
	public static void main(String [] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","\\D:\\Selenium\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     File f = new File("C:\\Users\\HP\\eclipse-workspace\\SeleniumProject\\src\\seleniumProgram\\GooglePage.png");
     FileHandler.copy(src, f);
     Thread.sleep(3000);
     
     driver.quit();
     
	}

}