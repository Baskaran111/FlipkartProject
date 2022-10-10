package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage {

	@Given("User is now on the home page")
	public void user_is_now_on_the_home_page() {
		
		System.out.println("webdriver launched");
	}

	@When("User enters the username and password")
	public void user_enters_the_username_and_password() {
		
		System.out.println("user enters the credentials");
	}

	@Then("User is on the search page")
	public void user_is_on_the_search_page() {
		
		System.out.println("user is on the search page");
	}

	@Given("User is on the search bar")
	public void user_is_on_the_search_bar() {
		
		System.out.println("user clicks the textbox");
	}

	@When("User searches for the mobile")
	public void user_searches_for_the_mobile() {
		
		System.out.println("user entes the mobile details");
	}

	@Then("User is on th product detail page")
	public void user_is_on_th_product_detail_page() {
		
		System.out.println("user is on the mobile detail page");
	}

	@Given("User is on the cart page")
	public void user_is_on_the_cart_page() {
		
		System.out.println("user is on the cart page");
	}

	@When("User adds the item to the cart")
	public void user_adds_the_item_to_the_cart() {
		
		System.out.println("user adds the item to the cart");
	}

	@Then("User is on the payment page")
	public void user_is_on_the_payment_page() {
		
		System.out.println("user is on the payment page");
	}
}
