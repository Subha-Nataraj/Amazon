package ObjectPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePage.BaseClass;

public class searchinghotelroom_object extends BaseClass {

	public searchinghotelroom_object()  {
		PageFactory.initElements(driver,this);
	}

@FindBy(id="location")
private WebElement place;

@FindBy(id="hotels")
private WebElement hotelname;

@FindBy(id="room_type")
private WebElement roomtype;

@FindBy(id="room_nos")
private WebElement room_numbers;

@FindBy(id="datepick_in")
private WebElement checkindate;

@FindBy(id="datepick_out")
private WebElement checkoutdate;

@FindBy(id="adult_room")
private WebElement adults;

@FindBy(id="child_room")
private WebElement childs;

@FindBy(id="Submit")
private WebElement search;


public WebElement location()
{
return place;
}

public WebElement hotels()
{
return hotelname;
}

public WebElement room_type()
{
return roomtype;
}

public WebElement room_no()
{
return room_numbers;
}

public WebElement checkindate()
{
return checkindate;
}

public WebElement checkoutdate()
{
return checkoutdate;
}

public WebElement adults()
{
return roomtype;
}

public WebElement childs()
{
return roomtype;
}

public WebElement search()
{
return search;
}

}
