package seleniumProgram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\D:\\Selenium\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);

		
   	driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(3000);
		
	Alert ert  = driver.switchTo().alert();
		System.out.println(ert.getText());
		ert.sendKeys("My Name is Ashvini");
		ert.accept();
		Thread.sleep(3000);
		driver.quit();
	
    }
}