package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginPage {

	WebDriver driver;

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}

	@When("User enters the valid username and password")
	public void user_enters_the_valid_username_and_password() {

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {

		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}

	@Then("User is on the home page")
	public void user_is_on_the_home_page() {

		String exepcted = "Log in to Facebook";
		
		System.out.println(driver.getTitle());
		

	}
	
	@When("User enters the invalid username and invalid password")
	public void user_enters_the_invalid_username_and_invalid_password() {
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc2gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456%%");
	}

	@When("User enters the valid invalid username and valid password")
	public void user_enters_the_valid_invalid_username_and_valid_password() {
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("a11@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
	}

	@When("User enters the valid valid username and invalid password")
	public void user_enters_the_valid_valid_username_and_invalid_password() {
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("#$@");
	}
	
	

}
