package JenkinsDemo.JenkinsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenUrl {
	
	public static WebDriver driver;
	
	@Test
	public void OpenDriverDemo() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("btnK")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
	}
	

}
