package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep 
{
	WebDriver driver;
	@Given("I am in the login page of saucedemo")
	public void i_am_in_the_login_page_of_saucedemo() {
		System.out.println("opening the SauceDemo page");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}

	@When("I enter the username and password")
	public void i_enter_the_username_and_password() 
	{
		System.out.println("Entering username and password");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		
	}

	@When("click the login button")
	public void click_the_login_button() 
	{
		driver.findElement(By.id("login-button")).click();
		System.out.println("clicking login");
	    
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() 
	{
		System.out.println("Should be in the login page");
		
		driver.close();
	}
}

