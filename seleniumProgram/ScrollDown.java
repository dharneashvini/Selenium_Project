package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\D:\\Selenium\\chromedriver.exe\\");
		  WebDriver driver = new ChromeDriver();
		     driver.manage().deleteAllCookies();
		     driver.manage().window().maximize();
		     driver.get("https://demoqa.com/select-menu");
		     
		WebElement scr = driver.findElement(By.xpath("//span[text()='Tool Tips']"));   
         Point loc = scr.getLocation();
            System.out.println(loc);
            
         JavascriptExecutor js = ((JavascriptExecutor)driver);
         js.executeScript("scroll(80,1009)");
          Thread.sleep(3000);
          
          JavascriptExecutor jav = ((JavascriptExecutor)driver);
          jav.executeScript("scroll(0, -1000)");
          Thread.sleep(3000);
          driver.quit();
	}

}
