package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageByXPath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumWebDriver4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("(//input[@name ='btnI'])[2]")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name ='q']")).sendKeys("Cars");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@name ='btnK'])[2]")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}

