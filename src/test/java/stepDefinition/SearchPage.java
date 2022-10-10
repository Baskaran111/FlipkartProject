package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchPage {
	
	WebDriver driver;
	
	@Given("User is on the google home page")
	public void user_is_on_the_google_home_page() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
	}

	@When("User searches for the {string}")
	public void user_searches_for_the(String mobiles) {
		
		driver.findElement(By.name("q")).sendKeys(mobiles + Keys.ENTER);
		
		
	}

	@Then("User is on the mobile detail pages")
	public void user_is_on_the_mobile_detail_pages() {
		
		System.out.println(driver.getTitle());
		driver.close();
	}

}
