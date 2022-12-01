package TryExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\all selenium setup files\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//input[@class=\"_3704LK\"]"));
		search.sendKeys("samsung");
		
		
		Thread.sleep(2000);
		List<WebElement> alllist = driver
				.findElements(By.xpath("//ul/li/div"));
		Thread.sleep(2000);
		String acttext = "samsung s22";
		for (WebElement list : alllist) {
			String expttext = list.getText();
			if (expttext.contains(acttext)) {
				Thread.sleep(2000);
				list.click();
				break;
			}

		}

	}

}
