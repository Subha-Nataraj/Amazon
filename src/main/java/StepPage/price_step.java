package StepPage;

import ObjectPage.price_object;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class price_step {
price_object pr;
	@Given("^Launch the web application$")
	public void launch_the_web_application() throws Throwable {
	 pr=new price_object();   
	}

	@When("^click the select button$")
	public void click_the_select_button() throws Throwable {
	   pr.getselect().click();
	}

	@Then("^click the continue button$")
	public void click_the_continue_button() throws Throwable {
	    pr.getcontinue().click();
	}
}
