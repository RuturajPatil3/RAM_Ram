package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1   //xpathBytext   // xpathBycontaintext() //By.linktext
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\all selenium setup files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		Thread.sleep(5000);
		//click on LOGIN button
		//driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[1]")).click();
		driver.findElement(By.linkText("LOGIN")).click();
		Thread.sleep(5000);
		//UN input
		driver.findElement(By.xpath("//input[@placeholder=\"User Name\"]")).sendKeys("tsuranse");
		
		
		
	}

}
