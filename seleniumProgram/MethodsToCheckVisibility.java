package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsToCheckVisibility {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","\\D:\\Selenium\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
          driver.manage().deleteAllCookies();
          driver.manage().window().maximize();
          driver.get("https://www.facebook.com/r.php?r=101");
	
     WebElement ele = driver.findElement(By.xpath("//input[@name='firstname']"));

  		boolean s = ele.isDisplayed();
  		System.out.println(s);
  		
  		System.out.println(ele.isEnabled());
  		System.out.println(ele.isSelected());

	}

}
