package ObjectPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePage.BaseClass;

public class customerdetails_object extends BaseClass {

	public customerdetails_object() {
		PageFactory.initElements(driver,this);
	}
@FindBy(id="first_name")
private WebElement firstname;

@FindBy(id="last_name")
private WebElement lastname;

@FindBy(id="address")
private WebElement address;

@FindBy(id="cc_num")
private WebElement cardno;

@FindBy(id="cc_type")
private WebElement cardtype;

@FindBy(id="cc_exp_month")
private WebElement month;

@FindBy(id="cc_exp_year")
private WebElement year;

@FindBy(id="cc_cvv")
private WebElement cvv;

@FindBy(id="book_now")
private WebElement bookbutton;

@FindBy(id="logout")
private WebElement logout;

@FindBy(linkText="Click here to login again")
private WebElement login_again;

public WebElement getfirstname() {
	return firstname;
}

public WebElement getlastname() {
	return lastname;
}

public WebElement getaddress() {
	return address;
}

public WebElement getcardno() {
	return cardno;
}

public WebElement getcardtype() {
	return cardtype;
}

public WebElement getmonth() {
	return month;
}

public WebElement getyear() {
	return year;
}

public WebElement getcvv() {
	return cvv;
}
public WebElement getlogout()
{
	return logout;
}
public WebElement getbook() {
	return bookbutton;
}

public WebElement getloginagain()
{
	return login_again;
}
String Location="order_no";
public void WaiT()
{

ExpliWait(Location);
}

public void Scroll()
{
	ScrollDown(getaddress());
}

}
