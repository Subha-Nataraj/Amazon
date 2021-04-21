package ObjectPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePage.BaseClass;

public class Adactinloginpage_object extends BaseClass {

	public Adactinloginpage_object() {
		PageFactory.initElements(driver,this);
	}
@FindBy(id="username")
private WebElement User;

@FindBy(id="password")
private WebElement Password;

@FindBy(id="login")
private WebElement login;

public WebElement getuser()
{
	return User;
}

public WebElement getpass()
{
	return Password;
}
public WebElement clicklogin() {
	return login;
}

}
