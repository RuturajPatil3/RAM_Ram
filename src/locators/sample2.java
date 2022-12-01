package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\all selenium setup files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti _4jy6')]")).click();
		//driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.partialLinkText("Create New")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Tushar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Suranse");
		
		
	}

}
