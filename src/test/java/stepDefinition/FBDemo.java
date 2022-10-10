package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FBDemo {

	WebDriver driver;

	@Given("User is on the facebook login page")
	public void user_is_on_the_facebook_login_page() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}

	@When("User enters the fb username and password")
	public void user_enters_the_fb_username_and_password(DataTable table) {
		
		Map<Object, Object> asMap = table.asMap(getClass(), getClass());
		
		System.out.println(asMap);
		Object object = asMap.get("username");
		
		System.out.println(object);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys();
	}

	@When("User clicks the fb login button")
	public void user_clicks_the_fb_login_button() {

		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

	@Then("User is on the facebook home page")
	public void user_is_on_the_facebook_home_page() {

		String title = driver.getTitle();

		System.out.println(title);

		driver.close();
	}

}
