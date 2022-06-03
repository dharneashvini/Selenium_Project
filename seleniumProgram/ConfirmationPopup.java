package seleniumProgram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "\\D:\\Selenium\\chromedriver.exe\\");
			WebDriver driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/alerts");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
			Thread.sleep(3000);
			Alert al = driver.switchTo().alert();
			    System.out.println(al.getText());
			    al.accept();
			    Thread.sleep(5000);
			    
			System.out.println("==========");
			
			driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
			
			Alert ale = driver.switchTo().alert();
		    System.out.println(ale.getText());
		    ale.dismiss();
		    Thread.sleep(5000);
			    driver.quit();

	}

}
