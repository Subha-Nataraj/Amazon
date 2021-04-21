package StepPage;

import ObjectPage.Adactinloginpage_object;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Adactinloginpage_steps {
Adactinloginpage_object obj;

@Given("^Launch the Web Applications\\.$")
public void launch_the_Web_Applications() throws Throwable {
   obj=new Adactinloginpage_object();
}

@When("^Enter the username \"([^\"]*)\" and password \"([^\"]*)\"$")
public void enter_the_username_and_password(String arg1, String arg2) throws Throwable {
 obj.textbox(obj.getuser(), arg1);
 obj.textbox(obj.getpass(), arg2);
}

@When("^Click the login button$")
public void click_the_login_button() throws Throwable {
  obj.clicklogin().click();
}

@Then("^Get the next page title$")
public void get_the_next_page_title() throws Throwable {
   obj.gettitle(); 
}



}
