package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","\\D:\\Selenium\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
          driver.manage().deleteAllCookies();
          driver.manage().window().maximize();
          driver.get("https://jqueryui.com/droppable/");
                Thread.sleep(3000);
                
         WebElement doubleClick = driver.findElement(By.xpath("(//a[text()='jQuery UI'])[2]"));

        Actions act = new Actions(driver);
        act.doubleClick(doubleClick).perform();
        	Thread.sleep(3000);
        		driver.quit();
	}

}
