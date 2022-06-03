package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frame {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "//D://Selenium//chromedriver.exe//");
            WebDriver driver = new ChromeDriver();
             driver.manage().deleteAllCookies();
             driver.manage().window().maximize();
             driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
           
             Thread.sleep(3000);
             driver.switchTo().frame("frame1");
             driver.switchTo().frame("frame3");
             
             driver.findElement(By.xpath("//input[@type='checkbox']")).click();
             Thread.sleep(2000);
             
             driver.switchTo().parentFrame();
             driver.findElement(By.xpath("//input")).sendKeys("Selenuim Frame");
             Thread.sleep(2000);
             driver.switchTo().parentFrame();
             Thread.sleep(2000);
            
             driver.switchTo().frame("frame2");
              
 WebElement abc =  driver.findElement(By.xpath("//select[@class='col-lg-3']"));
        Select w = new Select(abc);
      
         w.selectByVisibleText("Baby Cat");
        	  Thread.sleep(2000);
          w.deselectByValue("Baby Cat");
        	  Thread.sleep(2000);
       //   driver.quit();
        	   
        	  
		
	}

}
