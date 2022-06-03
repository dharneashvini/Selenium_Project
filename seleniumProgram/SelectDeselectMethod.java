package seleniumProgram;

   import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	
	public class SelectDeselectMethod 
	{
		
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","\\D:\\Selenium\\chromedriver.exe\\");
	WebDriver driver = new ChromeDriver();
	         driver.manage().deleteAllCookies();
	          driver.manage().window().maximize();
	         driver.get("https://demoqa.com/select-menu");
	   Thread.sleep(3000);  
	   
	WebElement select = driver.findElement(By.xpath("//select[@id='cars']"));
	
	Select s = new Select(select);
	     s.selectByVisibleText("Volvo");
    Thread.sleep(3000);
	     s.deselectByVisibleText("Volvo");
	Thread.sleep(3000);
	
	   driver.quit();
	} 
	

	}


