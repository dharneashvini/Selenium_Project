package seleniumProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagLocator {

			public static void main(String[] args) {
				
				System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe\\");
				WebDriver driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
				
				//findElement and findElements
				List<WebElement> lis = driver.findElements(By.tagName("a"));
				System.out.println(lis.size());
				
				for(int i=0; i<lis.size(); i++)
				{
					System.out.println(lis.get(i).getText());
				}
				
				driver.quit();
			}

		

	}


