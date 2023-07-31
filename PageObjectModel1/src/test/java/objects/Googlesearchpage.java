package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Googlesearchpage 
{
	WebDriver driver;
	public Googlesearchpage(WebDriver driver) {
		this.driver=driver;
	}

	By searchbox = By.name("q");
	public  void searchgoogle(String Searchinput) throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(searchbox).sendKeys(Searchinput);
	}

}

