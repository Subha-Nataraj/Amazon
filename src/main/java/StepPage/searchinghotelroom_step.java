package StepPage;


import ObjectPage.Adactinloginpage_object;
import ObjectPage.searchinghotelroom_object;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class searchinghotelroom_step {
searchinghotelroom_object obj;

@Given("^Launch second page Application\\.$")
public void launch_second_page_Application() throws Throwable {
    obj=new searchinghotelroom_object();
}

@When("^select the location hotel roomtype numberofrooms$")
public void select_the_location_hotel_roomtype_numberofrooms() throws Throwable {
   obj.dropdown1(obj.location(),1);
   obj.dropdown1(obj.hotels(),2);
   obj.dropdown3(obj.room_type(),"Double");
   obj.dropdown1(obj.room_no(),2);
}


@When("^enter the checkindate \"([^\"]*)\" and  checkoutdate \"([^\"]*)\"$")
public void enter_the_checkindate_and_checkoutdate(String arg1, String arg2) throws Throwable {
  obj.textbox(obj.checkindate(),arg1);
  obj.textbox(obj.checkoutdate(), arg2);
}

@When("^selecting the numberofpersons$")
public void selecting_the_numberofpersons() throws Throwable {
   obj.dropdown1(obj.adults(),3);
   obj.dropdown1(obj.childs(),2);
}

@Then("^click the search button$")
public void click_the_search_button() throws Throwable {
    obj.search().click();
}



}
