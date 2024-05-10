package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFeatureStepDefinition {
	
	@Given("user should be in login page")
	public void user_should_be_in_login_page() {
		System.out.println("inside the step-user should be in login page");
	}

	@When("user enter credentials with valid username and password")
	public void user_enter_credentials_with_valid_username_and_password() {
		System.out.println("inside the step-user enter credentials with valid username and password");

	}

	@And("user clicked on submit button")
	public void user_clicked_on_submit_button() {
		System.out.println("inside the step-user clicked on submit button");

	}

	@Then("user should successfully logged into home screen")
	public void user_should_successfully_logged_into_home_screen() {
		System.out.println("inside the step-user should successfully logged into home screen");

	}

}
