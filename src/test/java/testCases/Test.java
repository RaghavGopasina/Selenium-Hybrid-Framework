package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver;
		
		driver = new EdgeDriver();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title = 'My Account']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text() = 'Register']")).click();
		
		
	}
}
