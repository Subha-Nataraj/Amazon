package StepPage;

import ObjectPage.customerdetails_object;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class customerdetails_step {
customerdetails_object booking;

@Given("^Launch the payment page$")
public void launch_the_payment_page() throws Throwable {
    booking=new customerdetails_object();
}

@When("^Enter the firstname as \"([^\"]*)\" lastname as \"([^\"]*)\" address as \"([^\"]*)\" creditcardno as \"([^\"]*)\"$")
public void enter_the_firstname_as_lastname_as_address_as_creditcardno_as(String arg1, String arg2, String arg3, String arg4) throws Throwable {
booking.textbox(booking.getfirstname(), arg1);
booking.textbox(booking.getlastname(), arg2);
booking.textbox(booking.getaddress(), arg3);
booking.textbox(booking.getcardno(), arg4);
}

@When("^Enter the credit card  type$")
public void enter_the_credit_card_type() throws Throwable {
    booking.dropdown1(booking.getcardtype(), 2);
   booking.dropdown1(booking.getmonth(),6);
   booking.dropdown1(booking.getyear(),4);
}

@When("^Enter the CVV number as \"([^\"]*)\"$")
public void enter_the_CVV_number_as(String arg1) throws Throwable {
  booking.textbox(booking.getcvv(), arg1); 
}

@Then("^click booknow button$")
public void click_booknow_button() throws Throwable {
   booking.getbook().click();
   booking.WaiT();
   booking.Scroll();
   booking.Screenshot("Subha");
   booking.getlogout().click();
   booking.getloginagain().click();
   Thread.sleep(3000);
}


}

