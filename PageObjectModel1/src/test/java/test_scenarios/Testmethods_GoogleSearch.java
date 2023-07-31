package test_scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import objects.Googlesearchpage;
public class Testmethods_GoogleSearch 
{
	WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void SearchOpearation() throws InterruptedException
	{
		Googlesearchpage page=new Googlesearchpage(driver);
	page.searchgoogle("facebook");
	
	Thread.sleep(5000);
	
	}

	@AfterTest
	public void aftertest()
	{
		driver.quit();
	}

}


